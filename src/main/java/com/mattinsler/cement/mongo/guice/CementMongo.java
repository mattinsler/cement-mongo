package com.mattinsler.cement.mongo.guice;

import com.google.inject.Binder;
import com.google.inject.Module;
import com.mattinsler.cement.mongo.model.LogEntity;
import com.mattinsler.cement.mongo.model.RequestEntity;
import com.mattinsler.guiceymongo.guice.GuiceyMongo;

/**
 * Created by IntelliJ IDEA.
 * User: mattinsler
 * Date: Sep 24, 2010
 * Time: 1:02:07 AM
 * To change this template use File | Settings | File Templates.
 */
public final class CementMongo {
    public interface CementBinder extends Module {
        CementIntoBinder mapLogCollection(String collection);
        CementIntoBinder mapRequestCollection(String collection);
    }

    public interface CementIntoBinder {
        CementBinder into(String database);
    }

    private static class CementBinderImpl implements CementBinder, CementIntoBinder {
        private static final int Log = 0;
        private static final int Request = 1;

        private int _currentIndex;
        private String[] _database = new String[2];
        private String[] _collection = new String[2];

        private final String _configuration;

        CementBinderImpl(String configuration) {
            _configuration = configuration;
        }

        private void setCollection(int index, String collection) {
            _currentIndex = index;
            _collection[_currentIndex] = collection;
        }

        public CementIntoBinder mapLogCollection(String collection) {
            setCollection(Log, collection);
            return this;
        }

        public CementIntoBinder mapRequestCollection(String collection) {
            setCollection(Request, collection);
            return this;
        }

        public CementBinder into(String database) {
            _database[_currentIndex] = database;
            return this;
        }

        public void configure(Binder binder) {
            binder.install(GuiceyMongo.configure(_configuration)
                    .mapCollection(CementMongoCollection.Log).ofType(LogEntity.class).to(_collection[Log]).inDatabase(_database[Log])
                    .mapCollection(CementMongoCollection.Request).ofType(RequestEntity.class).to(_collection[Request]).inDatabase(_database[Request])
            );
        }
    }

    public static CementBinder configure(String configuration) {
        return new CementBinderImpl(configuration);
    }
}
