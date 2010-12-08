package com.mattinsler.cement.mongo;

import com.google.inject.Inject;
import com.mattinsler.cement.CementRequestLogWriter;
import com.mattinsler.cement.mongo.guice.CementMongoCollection;
import com.mattinsler.cement.mongo.model.RequestEntity;
import com.mattinsler.cement.util.ServerUtil;
import com.mattinsler.guiceymongo.GuiceyCollection;
import com.mattinsler.guiceymongo.guice.annotation.MongoCollection;
import com.mongodb.BasicDBObject;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.Enumeration;
import java.util.Map;
import java.util.Set;

/**
 * Created by IntelliJ IDEA.
 * User: mattinsler
 * Date: Sep 26, 2010
 * Time: 10:30:21 PM
 * To change this template use File | Settings | File Templates.
 */
public class MongoCementRequestLogWriter implements CementRequestLogWriter {
    private final GuiceyCollection<RequestEntity> _requestCollection;

    @Inject
    MongoCementRequestLogWriter(@MongoCollection(CementMongoCollection.Request) GuiceyCollection<RequestEntity> requestCollection) {
        _requestCollection = requestCollection;
    }
    
    @Override
    public void writeRequestLog(HttpServletRequest request, String requestIdentity, Date requestTime) {
        RequestEntity.Builder builder = RequestEntity.newBuilder()
                .setRequestId(requestIdentity)
                .setServerHostname(ServerUtil.getHostname())
                .setRequestTimestamp(requestTime)
                .setSourceAddress(RequestEntity.Address.newBuilder()
                        .setAddress(request.getRemoteAddr())
                        .setPort(request.getRemotePort())
                )
                .setRequestMethod(request.getMethod())
                .setRequestUrl(request.getRequestURL().toString())
                .setRequestAddress(RequestEntity.Address.newBuilder()
                        .setAddress(request.getServerName())
                        .setPort(request.getServerPort())
                )
                .setRequestPath(request.getRequestURI())
                .setRequestQuery(request.getQueryString());

        Enumeration<String> headerNames = request.getHeaderNames();
        while (headerNames.hasMoreElements()) {
            String name = headerNames.nextElement();
            builder.putHeader(name, request.getHeader(name));
        }

        for (Map.Entry<String, String[]> e : (Set<Map.Entry<String, String[]>>)request.getParameterMap().entrySet()) {
            builder.putParameter(e.getKey(), e.getValue()[0]);
        }

        _requestCollection.save(builder);
    }

    @Override
    public void writeResponseTime(HttpServletRequest request, String requestIdentity, Date responseTime) {
        _requestCollection.update(
                new BasicDBObject(RequestEntity.RequestIdKey, requestIdentity),
                new BasicDBObject("$set",
                        new BasicDBObject(RequestEntity.ResponseTimestampKey, responseTime)
                )
        );
    }
}
