package com.mattinsler.cement.mongo.logging;

import com.google.inject.Inject;
import com.mattinsler.guiceymongo.GuiceyCollection;
import com.mattinsler.cement.logging.AbstractCementLogger;
import com.mattinsler.cement.mongo.guice.CementMongoCollection;
import com.mattinsler.cement.mongo.model.ExceptionEntity;
import com.mattinsler.cement.mongo.model.LogEntity;
import com.mattinsler.cement.mongo.model.RequestEntity;
import com.mattinsler.cement.util.ServerUtil;
import com.mattinsler.guiceymongo.guice.annotation.MongoCollection;
import com.mongodb.BasicDBObject;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 * User: mattinsler
 * Date: Sep 26, 2010
 * Time: 10:55:26 PM
 * To change this template use File | Settings | File Templates.
 */
public class MongoCementLogger extends AbstractCementLogger {
    private final GuiceyCollection<LogEntity> _logCollection;
    private final GuiceyCollection<RequestEntity> _requestCollection;
    private final Map<Level, LogEntity.Level> _levelMap = new HashMap<Level, LogEntity.Level>();

    @Inject
    MongoCementLogger(@MongoCollection(CementMongoCollection.Log) GuiceyCollection<LogEntity> logCollection,
                      @MongoCollection(CementMongoCollection.Request) GuiceyCollection<RequestEntity> requestCollection) {
        _logCollection = logCollection;
        _requestCollection = requestCollection;

        _levelMap.put(Level.Debug, LogEntity.Level.Debug);
        _levelMap.put(Level.Info, LogEntity.Level.Info);
        _levelMap.put(Level.Warn, LogEntity.Level.Warn);
        _levelMap.put(Level.Error, LogEntity.Level.Error);
        _levelMap.put(Level.Fatal, LogEntity.Level.Fatal);
    }

    private static ExceptionEntity.Throwable.Builder createThrowable(Throwable throwable) {
        ExceptionEntity.Throwable.Builder builder = ExceptionEntity.Throwable.newBuilder()
                .setMessage(throwable.getMessage())
                .setFullClassName(throwable.getClass().getCanonicalName());
        for (StackTraceElement element : throwable.getStackTrace()) {
            builder.addStackElement(ExceptionEntity.StackElement.newBuilder()
                    .setFilename(element.getFileName())
                    .setLine(element.getLineNumber())
                    .setMethod(element.getMethodName())
                    .setFullClassName(element.getClassName())
            );
        }
        return builder;
    }

    private static ExceptionEntity.Builder createExceptionEntity(Throwable throwable) {
        ExceptionEntity.Builder exceptionBuilder = ExceptionEntity.newBuilder();
        while (throwable != null) {
            exceptionBuilder.addThrowable(createThrowable(throwable));
            throwable = throwable.getCause();
        }
        return exceptionBuilder;
    }

    @Override
    protected void writeLog(String requestId, Date timestamp, Level level, String message, Throwable throwable) {
        LogEntity.Builder builder = LogEntity.newBuilder()
                .setRequestId(requestId)
                .setServerHostname(ServerUtil.getHostname())
                .setTimestamp(timestamp)
                .setLevel(_levelMap.get(level));
        if (message != null) {
            builder.setMessage(message);
        }

        if (throwable != null) {
            ExceptionEntity.Builder exceptionBuilder = createExceptionEntity(throwable);
            if (exceptionBuilder.getThrowableCount() > 0) {
                builder.setException(exceptionBuilder);
            }
        }

        _logCollection.save(builder);
        _requestCollection.update(
                new BasicDBObject(RequestEntity.RequestIdKey, requestId),
                new BasicDBObject("$inc",
                        new BasicDBObject(RequestEntity.LogCountKey, 1)
                )
        );
    }
}
