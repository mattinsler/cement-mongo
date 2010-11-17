package com.mattinsler.cement.mongo.model;


// Generated file!!!  DO NOT EDIT THIS!!!
public abstract class LogEntity implements com.lowereast.guiceymongo.data.IsData {
    public static final String RequestIdKey = "request_id";
    public static final String ServerHostnameKey = "server_hostname";
    public static final String TimestampKey = "timestamp";
    public static final String LevelKey = "level";
    public static final String MessageKey = "message";
    public static final String ExceptionKey = "exception";
    public static com.lowereast.guiceymongo.data.DataWrapper<LogEntity> DataWrapper =
        new com.lowereast.guiceymongo.data.DataWrapper<LogEntity>() {
            public LogEntity.Wrapper wrap(com.mongodb.DBObject backing) {
                return LogEntity.wrap(backing);
            }
        };

    public abstract boolean hasRequestId();

    public abstract String getRequestId();

    public abstract boolean hasServerHostname();

    public abstract String getServerHostname();

    public abstract boolean hasTimestamp();

    public abstract java.util.Date getTimestamp();

    public abstract boolean hasLevel();

    public abstract LogEntity.Level getLevel();

    public abstract boolean hasMessage();

    public abstract String getMessage();

    public abstract boolean hasException();

    public abstract ExceptionEntity getException();

    public static LogEntity.Wrapper wrap(com.mongodb.DBObject backing) {
        if (backing == null) {
            return null;
        }

        return new LogEntity.Wrapper(backing);
    }

    public static LogEntity.Wrapper convertFrom(
        com.lowereast.guiceymongo.data.IsWrapper<?> wrapped) {
        if (wrapped == null) {
            return null;
        }

        return new LogEntity.Wrapper(wrapped.getDBObject());
    }

    public static LogEntity.Wrapper convertFrom(
        com.lowereast.guiceymongo.data.IsData data) {
        if ((data == null) ||
                !(data instanceof com.lowereast.guiceymongo.data.IsWrapper<?>)) {
            return null;
        }

        return new LogEntity.Wrapper(((com.lowereast.guiceymongo.data.IsWrapper<?>) data).getDBObject());
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static Builder newBuilder(LogEntity value) {
        Builder builder = new Builder();

        if (value.hasRequestId()) {
            builder.setRequestId(value.getRequestId());
        }

        if (value.hasServerHostname()) {
            builder.setServerHostname(value.getServerHostname());
        }

        if (value.hasTimestamp()) {
            builder.setTimestamp(value.getTimestamp());
        }

        if (value.hasLevel()) {
            builder.setLevel(value.getLevel());
        }

        if (value.hasMessage()) {
            builder.setMessage(value.getMessage());
        }

        if (value.hasException()) {
            builder.setException(ExceptionEntity.newBuilder(
                    value.getException()));
        }

        return builder;
    }

    @Override
    public boolean equals(Object obj) {
        if ((obj == null) || !(obj instanceof LogEntity)) {
            return false;
        }

        LogEntity other = (LogEntity) obj;

        if ((this.hasRequestId() != other.hasRequestId()) ||
                (this.hasRequestId() &&
                !this.getRequestId().equals(other.getRequestId()))) {
            return false;
        }

        if ((this.hasServerHostname() != other.hasServerHostname()) ||
                (this.hasServerHostname() &&
                !this.getServerHostname().equals(other.getServerHostname()))) {
            return false;
        }

        if ((this.hasTimestamp() != other.hasTimestamp()) ||
                (this.hasTimestamp() &&
                !this.getTimestamp().equals(other.getTimestamp()))) {
            return false;
        }

        if ((this.hasLevel() != other.hasLevel()) ||
                (this.hasLevel() && (this.getLevel() != other.getLevel()))) {
            return false;
        }

        if ((this.hasMessage() != other.hasMessage()) ||
                (this.hasMessage() &&
                !this.getMessage().equals(other.getMessage()))) {
            return false;
        }

        if ((this.hasException() != other.hasException()) ||
                (this.hasException() &&
                !this.getException().equals(other.getException()))) {
            return false;
        }

        return true;
    }

    public static class Wrapper extends LogEntity implements com.lowereast.guiceymongo.data.IsWrapper<LogEntity> {
        private com.mongodb.DBObject _backing;
        protected LogEntity.Level _level = null;
        protected ExceptionEntity.Wrapper _exception = null;

        private Wrapper(com.mongodb.DBObject backing) {
            _backing = backing;
        }

        @Override
        public boolean hasRequestId() {
            return _backing.containsField(RequestIdKey);
        }

        @Override
        public String getRequestId() {
            return (String) _backing.get(RequestIdKey);
        }

        @Override
        public boolean hasServerHostname() {
            return _backing.containsField(ServerHostnameKey);
        }

        @Override
        public String getServerHostname() {
            return (String) _backing.get(ServerHostnameKey);
        }

        @Override
        public boolean hasTimestamp() {
            return _backing.containsField(TimestampKey);
        }

        @Override
        public java.util.Date getTimestamp() {
            return (java.util.Date) _backing.get(TimestampKey);
        }

        @Override
        public boolean hasLevel() {
            return _backing.containsField(LevelKey);
        }

        @Override
        public LogEntity.Level getLevel() {
            if (_level == null) {
                String value = (String) _backing.get(LevelKey);

                if (value != null) {
                    try {
                        _level = LogEntity.Level.valueOf(value);
                    } catch (Exception e) {
                    }
                }
            }

            return _level;
        }

        @Override
        public boolean hasMessage() {
            return _backing.containsField(MessageKey);
        }

        @Override
        public String getMessage() {
            return (String) _backing.get(MessageKey);
        }

        @Override
        public boolean hasException() {
            return _backing.containsField(ExceptionKey);
        }

        @Override
        public ExceptionEntity.Wrapper getException() {
            if (_exception == null) {
                Object value = _backing.get(ExceptionKey);

                if ((value != null) && value instanceof com.mongodb.DBObject) {
                    _exception = ExceptionEntity.wrap((com.mongodb.DBObject) value);
                }
            }

            return _exception;
        }

        public com.mongodb.DBObject getDBObject() {
            return _backing;
        }
    }

    public static class Builder extends LogEntity implements com.lowereast.guiceymongo.data.IsBuilder<LogEntity> {
        protected String _requestId = null;
        protected String _serverHostname = null;
        protected java.util.Date _timestamp = null;
        protected LogEntity.Level _level = null;
        protected String _message = null;
        protected ExceptionEntity.Builder _exception = null;

        private Builder() {
        }

        @Override
        public boolean hasRequestId() {
            return _requestId != null;
        }

        @Override
        public String getRequestId() {
            return _requestId;
        }

        public Builder setRequestId(String value) {
            _requestId = value;

            return this;
        }

        public Builder clearRequestId() {
            _requestId = null;

            return this;
        }

        @Override
        public boolean hasServerHostname() {
            return _serverHostname != null;
        }

        @Override
        public String getServerHostname() {
            return _serverHostname;
        }

        public Builder setServerHostname(String value) {
            _serverHostname = value;

            return this;
        }

        public Builder clearServerHostname() {
            _serverHostname = null;

            return this;
        }

        @Override
        public boolean hasTimestamp() {
            return _timestamp != null;
        }

        @Override
        public java.util.Date getTimestamp() {
            return _timestamp;
        }

        public Builder setTimestamp(java.util.Date value) {
            _timestamp = value;

            return this;
        }

        public Builder clearTimestamp() {
            _timestamp = null;

            return this;
        }

        @Override
        public boolean hasLevel() {
            return _level != null;
        }

        @Override
        public LogEntity.Level getLevel() {
            return _level;
        }

        public Builder setLevel(LogEntity.Level value) {
            _level = value;

            return this;
        }

        public Builder clearLevel() {
            _level = null;

            return this;
        }

        @Override
        public boolean hasMessage() {
            return _message != null;
        }

        @Override
        public String getMessage() {
            return _message;
        }

        public Builder setMessage(String value) {
            _message = value;

            return this;
        }

        public Builder clearMessage() {
            _message = null;

            return this;
        }

        @Override
        public boolean hasException() {
            return _exception != null;
        }

        @Override
        public ExceptionEntity.Builder getException() {
            return _exception;
        }

        public ExceptionEntity.Builder getOrCreateException() {
            if (_exception == null) {
                _exception = ExceptionEntity.newBuilder();
            }

            return _exception;
        }

        public Builder setException(ExceptionEntity.Builder value) {
            _exception = value;

            return this;
        }

        public Builder clearException() {
            _exception = null;

            return this;
        }

        public com.mongodb.DBObject build() {
            com.mongodb.DBObject dbObject = new com.mongodb.BasicDBObject();

            if (_requestId != null) {
                dbObject.put(RequestIdKey, _requestId);
            }

            if (_serverHostname != null) {
                dbObject.put(ServerHostnameKey, _serverHostname);
            }

            if (_timestamp != null) {
                dbObject.put(TimestampKey, _timestamp);
            }

            if (_level != null) {
                dbObject.put(LevelKey, _level.name());
            }

            if (_message != null) {
                dbObject.put(MessageKey, _message);
            }

            if (_exception != null) {
                dbObject.put(ExceptionKey, _exception.build());
            }

            return dbObject;
        }
    }
    public static enum Level {Fatal,
        Info,
        Debug,
        Error,
        Warn;
    }
}
