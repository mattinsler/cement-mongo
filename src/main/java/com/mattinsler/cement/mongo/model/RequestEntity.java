package com.mattinsler.cement.mongo.model;


// Generated file!!!  DO NOT EDIT THIS!!!

/**
 *
 */
public abstract class RequestEntity implements com.mattinsler.guiceymongo.data.IsData {
    public static final String RequestIdKey = "request_id";
    public static final String ServerHostnameKey = "server_hostname";
    public static final String RequestTimestampKey = "request_timestamp";
    public static final String ResponseTimestampKey = "response_timestamp";
    public static final String LogCountKey = "log_count";
    public static final String SourceAddressKey = "source_address";
    public static final String RequestMethodKey = "request_method";
    public static final String RequestUrlKey = "request_url";
    public static final String RequestAddressKey = "request_address";
    public static final String RequestPathKey = "request_path";
    public static final String RequestQueryKey = "request_query";
    public static final String HeaderKey = "header";
    public static final String ParameterKey = "parameter";
    public static com.mattinsler.guiceymongo.data.DataWrapper<RequestEntity> DataWrapper =
        new com.mattinsler.guiceymongo.data.DataWrapper<RequestEntity>() {
            public RequestEntity.Wrapper wrap(com.mongodb.DBObject backing) {
                return RequestEntity.wrap(backing);
            }
        };

    /**
     *
     */
    public abstract boolean hasRequestId();

    /**
     *
     */
    public abstract String getRequestId();

    /**
     *
     */
    public abstract boolean hasServerHostname();

    /**
     *
     */
    public abstract String getServerHostname();

    /**
     *
     */
    public abstract boolean hasRequestTimestamp();

    /**
     *
     */
    public abstract java.util.Date getRequestTimestamp();

    /**
     *
     */
    public abstract boolean hasResponseTimestamp();

    /**
     *
     */
    public abstract java.util.Date getResponseTimestamp();

    /**
     *
     */
    public abstract boolean hasLogCount();

    /**
     *
     */
    public abstract int getLogCount();

    /**
     *
     */
    public abstract boolean hasSourceAddress();

    /**
     *
     */
    public abstract RequestEntity.Address getSourceAddress();

    /**
     *
     */
    public abstract boolean hasRequestMethod();

    /**
     *
     */
    public abstract String getRequestMethod();

    /**
     *
     */
    public abstract boolean hasRequestUrl();

    /**
     *
     */
    public abstract String getRequestUrl();

    /**
     *
     */
    public abstract boolean hasRequestAddress();

    /**
     *
     */
    public abstract RequestEntity.Address getRequestAddress();

    /**
     *
     */
    public abstract boolean hasRequestPath();

    /**
     *
     */
    public abstract String getRequestPath();

    /**
     *
     */
    public abstract boolean hasRequestQuery();

    /**
     *
     */
    public abstract String getRequestQuery();

    /**
     *
     */
    public abstract java.util.Map<String, String> getHeaderMap();

    /**
     *
     */
    public abstract boolean containsHeader(String key);

    /**
     *
     */
    public abstract int getHeaderCount();

    /**
     *
     */
    public abstract String getHeader(String key);

    /**
     *
     */
    public abstract java.util.Set<String> getHeaderKeys();

    /**
     *
     */
    public abstract java.util.Map<String, String> getParameterMap();

    /**
     *
     */
    public abstract boolean containsParameter(String key);

    /**
     *
     */
    public abstract int getParameterCount();

    /**
     *
     */
    public abstract String getParameter(String key);

    /**
     *
     */
    public abstract java.util.Set<String> getParameterKeys();

    public static RequestEntity.Wrapper wrap(com.mongodb.DBObject backing) {
        if (backing == null) {
            return null;
        }

        return new RequestEntity.Wrapper(backing);
    }

    public static RequestEntity.Wrapper convertFrom(
        com.mattinsler.guiceymongo.data.IsWrapper<?> wrapped) {
        if (wrapped == null) {
            return null;
        }

        return new RequestEntity.Wrapper(wrapped.getDBObject());
    }

    public static RequestEntity.Wrapper convertFrom(
        com.mattinsler.guiceymongo.data.IsData data) {
        if ((data == null) ||
                !(data instanceof com.mattinsler.guiceymongo.data.IsWrapper<?>)) {
            return null;
        }

        return new RequestEntity.Wrapper(((com.mattinsler.guiceymongo.data.IsWrapper<?>) data).getDBObject());
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static Builder newBuilder(RequestEntity value) {
        Builder builder = new Builder();

        if (value.hasRequestId()) {
            builder.setRequestId(value.getRequestId());
        }

        if (value.hasServerHostname()) {
            builder.setServerHostname(value.getServerHostname());
        }

        if (value.hasRequestTimestamp()) {
            builder.setRequestTimestamp(value.getRequestTimestamp());
        }

        if (value.hasResponseTimestamp()) {
            builder.setResponseTimestamp(value.getResponseTimestamp());
        }

        if (value.hasLogCount()) {
            builder.setLogCount(value.getLogCount());
        }

        if (value.hasSourceAddress()) {
            builder.setSourceAddress(RequestEntity.Address.newBuilder(
                    value.getSourceAddress()));
        }

        if (value.hasRequestMethod()) {
            builder.setRequestMethod(value.getRequestMethod());
        }

        if (value.hasRequestUrl()) {
            builder.setRequestUrl(value.getRequestUrl());
        }

        if (value.hasRequestAddress()) {
            builder.setRequestAddress(RequestEntity.Address.newBuilder(
                    value.getRequestAddress()));
        }

        if (value.hasRequestPath()) {
            builder.setRequestPath(value.getRequestPath());
        }

        if (value.hasRequestQuery()) {
            builder.setRequestQuery(value.getRequestQuery());
        }

        if (value.getHeaderCount() > 0) {
            for (String key : value.getHeaderKeys())
                builder.putHeader(key, value.getHeader(key));
        }

        if (value.getParameterCount() > 0) {
            for (String key : value.getParameterKeys())
                builder.putParameter(key, value.getParameter(key));
        }

        return builder;
    }

    @Override
    public boolean equals(Object obj) {
        if ((obj == null) || !(obj instanceof RequestEntity)) {
            return false;
        }

        RequestEntity other = (RequestEntity) obj;

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

        if ((this.hasRequestTimestamp() != other.hasRequestTimestamp()) ||
                (this.hasRequestTimestamp() &&
                !this.getRequestTimestamp().equals(other.getRequestTimestamp()))) {
            return false;
        }

        if ((this.hasResponseTimestamp() != other.hasResponseTimestamp()) ||
                (this.hasResponseTimestamp() &&
                !this.getResponseTimestamp().equals(other.getResponseTimestamp()))) {
            return false;
        }

        if ((this.hasLogCount() != other.hasLogCount()) ||
                (this.hasLogCount() &&
                (this.getLogCount() != other.getLogCount()))) {
            return false;
        }

        if ((this.hasSourceAddress() != other.hasSourceAddress()) ||
                (this.hasSourceAddress() &&
                !this.getSourceAddress().equals(other.getSourceAddress()))) {
            return false;
        }

        if ((this.hasRequestMethod() != other.hasRequestMethod()) ||
                (this.hasRequestMethod() &&
                !this.getRequestMethod().equals(other.getRequestMethod()))) {
            return false;
        }

        if ((this.hasRequestUrl() != other.hasRequestUrl()) ||
                (this.hasRequestUrl() &&
                !this.getRequestUrl().equals(other.getRequestUrl()))) {
            return false;
        }

        if ((this.hasRequestAddress() != other.hasRequestAddress()) ||
                (this.hasRequestAddress() &&
                !this.getRequestAddress().equals(other.getRequestAddress()))) {
            return false;
        }

        if ((this.hasRequestPath() != other.hasRequestPath()) ||
                (this.hasRequestPath() &&
                !this.getRequestPath().equals(other.getRequestPath()))) {
            return false;
        }

        if ((this.hasRequestQuery() != other.hasRequestQuery()) ||
                (this.hasRequestQuery() &&
                !this.getRequestQuery().equals(other.getRequestQuery()))) {
            return false;
        }

        if (this.getHeaderCount() != other.getHeaderCount()) {
            return false;
        }

        if (this.getHeaderCount() > 0) {
            for (String key : this.getHeaderKeys()) {
                if (!other.containsHeader(key)) {
                    return false;
                }

                if (!this.getHeader(key).equals(other.getHeader(key))) {
                    return false;
                }
            }
        }

        if (this.getParameterCount() != other.getParameterCount()) {
            return false;
        }

        if (this.getParameterCount() > 0) {
            for (String key : this.getParameterKeys()) {
                if (!other.containsParameter(key)) {
                    return false;
                }

                if (!this.getParameter(key).equals(other.getParameter(key))) {
                    return false;
                }
            }
        }

        return true;
    }

    public static class Wrapper extends RequestEntity implements com.mattinsler.guiceymongo.data.IsWrapper<RequestEntity> {
        private com.mongodb.DBObject _backing;

        /**
         *
         */
        protected RequestEntity.Address.Wrapper _sourceAddress = null;

        /**
         *
         */
        protected RequestEntity.Address.Wrapper _requestAddress = null;

        /**
         *
         */
        protected java.util.Map<String, String> _headerMap = null;

        /**
         *
         */
        protected java.util.Map<String, String> _parameterMap = null;

        private Wrapper(com.mongodb.DBObject backing) {
            _backing = backing;
        }

        /**
         *
         */
        @Override
        public boolean hasRequestId() {
            return _backing.containsField(RequestIdKey);
        }

        /**
         *
         */
        @Override
        public String getRequestId() {
            return (String) _backing.get(RequestIdKey);
        }

        /**
         *
         */
        @Override
        public boolean hasServerHostname() {
            return _backing.containsField(ServerHostnameKey);
        }

        /**
         *
         */
        @Override
        public String getServerHostname() {
            return (String) _backing.get(ServerHostnameKey);
        }

        /**
         *
         */
        @Override
        public boolean hasRequestTimestamp() {
            return _backing.containsField(RequestTimestampKey);
        }

        /**
         *
         */
        @Override
        public java.util.Date getRequestTimestamp() {
            return (java.util.Date) _backing.get(RequestTimestampKey);
        }

        /**
         *
         */
        @Override
        public boolean hasResponseTimestamp() {
            return _backing.containsField(ResponseTimestampKey);
        }

        /**
         *
         */
        @Override
        public java.util.Date getResponseTimestamp() {
            return (java.util.Date) _backing.get(ResponseTimestampKey);
        }

        /**
         *
         */
        @Override
        public boolean hasLogCount() {
            return _backing.containsField(LogCountKey);
        }

        /**
         *
         */
        @Override
        public int getLogCount() {
            Object value = _backing.get(LogCountKey);

            if (value instanceof Double) {
                return ((Double) value).intValue();
            }

            return (Integer) value;
        }

        /**
         *
         */
        @Override
        public boolean hasSourceAddress() {
            return _backing.containsField(SourceAddressKey);
        }

        /**
         *
         */
        @Override
        public RequestEntity.Address.Wrapper getSourceAddress() {
            if (_sourceAddress == null) {
                Object value = _backing.get(SourceAddressKey);

                if ((value != null) && value instanceof com.mongodb.DBObject) {
                    _sourceAddress = RequestEntity.Address.wrap((com.mongodb.DBObject) value);
                }
            }

            return _sourceAddress;
        }

        /**
         *
         */
        @Override
        public boolean hasRequestMethod() {
            return _backing.containsField(RequestMethodKey);
        }

        /**
         *
         */
        @Override
        public String getRequestMethod() {
            return (String) _backing.get(RequestMethodKey);
        }

        /**
         *
         */
        @Override
        public boolean hasRequestUrl() {
            return _backing.containsField(RequestUrlKey);
        }

        /**
         *
         */
        @Override
        public String getRequestUrl() {
            return (String) _backing.get(RequestUrlKey);
        }

        /**
         *
         */
        @Override
        public boolean hasRequestAddress() {
            return _backing.containsField(RequestAddressKey);
        }

        /**
         *
         */
        @Override
        public RequestEntity.Address.Wrapper getRequestAddress() {
            if (_requestAddress == null) {
                Object value = _backing.get(RequestAddressKey);

                if ((value != null) && value instanceof com.mongodb.DBObject) {
                    _requestAddress = RequestEntity.Address.wrap((com.mongodb.DBObject) value);
                }
            }

            return _requestAddress;
        }

        /**
         *
         */
        @Override
        public boolean hasRequestPath() {
            return _backing.containsField(RequestPathKey);
        }

        /**
         *
         */
        @Override
        public String getRequestPath() {
            return (String) _backing.get(RequestPathKey);
        }

        /**
         *
         */
        @Override
        public boolean hasRequestQuery() {
            return _backing.containsField(RequestQueryKey);
        }

        /**
         *
         */
        @Override
        public String getRequestQuery() {
            return (String) _backing.get(RequestQueryKey);
        }

        /**
         *
         */
        public java.util.Map<String, String> getHeaderMap() {
            if (_headerMap == null) {
                Object value = _backing.get(HeaderKey);

                if ((value != null) && value instanceof com.mongodb.DBObject) {
                    java.util.Map<String, String> map = new java.util.HashMap<String, String>();
                    com.mongodb.DBObject obj = (com.mongodb.DBObject) value;

                    for (String key : obj.keySet()) {
                        map.put(com.mattinsler.guiceymongo.util.DBObjectUtil.decodeKey(
                                key), (String) obj.get(key));
                    }

                    _headerMap = java.util.Collections.unmodifiableMap(map);
                }
            }

            return _headerMap;
        }

        /**
         *
         */
        @Override
        public boolean containsHeader(String key) {
            java.util.Map<String, String> map = getHeaderMap();

            return (map == null) ? false : map.containsKey(key);
        }

        /**
         *
         */
        @Override
        public int getHeaderCount() {
            java.util.Map<String, String> map = getHeaderMap();

            return (map == null) ? 0 : map.size();
        }

        /**
         *
         */
        @Override
        public String getHeader(String key) {
            java.util.Map<String, String> map = getHeaderMap();

            return (map == null) ? null : map.get(key);
        }

        /**
         *
         */
        @Override
        public java.util.Set<String> getHeaderKeys() {
            java.util.Map<String, String> map = getHeaderMap();

            return (map == null) ? null : map.keySet();
        }

        /**
         *
         */
        public java.util.Map<String, String> getParameterMap() {
            if (_parameterMap == null) {
                Object value = _backing.get(ParameterKey);

                if ((value != null) && value instanceof com.mongodb.DBObject) {
                    java.util.Map<String, String> map = new java.util.HashMap<String, String>();
                    com.mongodb.DBObject obj = (com.mongodb.DBObject) value;

                    for (String key : obj.keySet()) {
                        map.put(com.mattinsler.guiceymongo.util.DBObjectUtil.decodeKey(
                                key), (String) obj.get(key));
                    }

                    _parameterMap = java.util.Collections.unmodifiableMap(map);
                }
            }

            return _parameterMap;
        }

        /**
         *
         */
        @Override
        public boolean containsParameter(String key) {
            java.util.Map<String, String> map = getParameterMap();

            return (map == null) ? false : map.containsKey(key);
        }

        /**
         *
         */
        @Override
        public int getParameterCount() {
            java.util.Map<String, String> map = getParameterMap();

            return (map == null) ? 0 : map.size();
        }

        /**
         *
         */
        @Override
        public String getParameter(String key) {
            java.util.Map<String, String> map = getParameterMap();

            return (map == null) ? null : map.get(key);
        }

        /**
         *
         */
        @Override
        public java.util.Set<String> getParameterKeys() {
            java.util.Map<String, String> map = getParameterMap();

            return (map == null) ? null : map.keySet();
        }

        public com.mongodb.DBObject getDBObject() {
            return _backing;
        }
    }

    public static class Builder extends RequestEntity implements com.mattinsler.guiceymongo.data.IsBuilder<RequestEntity> {
        /**
         *
         */
        protected String _requestId = null;

        /**
         *
         */
        protected String _serverHostname = null;

        /**
         *
         */
        protected java.util.Date _requestTimestamp = null;

        /**
         *
         */
        protected java.util.Date _responseTimestamp = null;

        /**
         *
         */
        protected Integer _logCount = null;

        /**
         *
         */
        protected RequestEntity.Address.Builder _sourceAddress = null;

        /**
         *
         */
        protected String _requestMethod = null;

        /**
         *
         */
        protected String _requestUrl = null;

        /**
         *
         */
        protected RequestEntity.Address.Builder _requestAddress = null;

        /**
         *
         */
        protected String _requestPath = null;

        /**
         *
         */
        protected String _requestQuery = null;

        /**
         *
         */
        protected java.util.Map<String, String> _headerMap = null;

        /**
         *
         */

        /**
         *
         */
        protected java.util.Map<String, String> _parameterMap = null;

        private Builder() {
        }

        /**
         *
         */
        @Override
        public boolean hasRequestId() {
            return _requestId != null;
        }

        /**
         *
         */
        @Override
        public String getRequestId() {
            return _requestId;
        }

        /**
         *
         */
        public Builder setRequestId(String value) {
            _requestId = value;

            return this;
        }

        /**
         *
         */
        public Builder clearRequestId() {
            _requestId = null;

            return this;
        }

        /**
         *
         */
        @Override
        public boolean hasServerHostname() {
            return _serverHostname != null;
        }

        /**
         *
         */
        @Override
        public String getServerHostname() {
            return _serverHostname;
        }

        /**
         *
         */
        public Builder setServerHostname(String value) {
            _serverHostname = value;

            return this;
        }

        /**
         *
         */
        public Builder clearServerHostname() {
            _serverHostname = null;

            return this;
        }

        /**
         *
         */
        @Override
        public boolean hasRequestTimestamp() {
            return _requestTimestamp != null;
        }

        /**
         *
         */
        @Override
        public java.util.Date getRequestTimestamp() {
            return _requestTimestamp;
        }

        /**
         *
         */
        public Builder setRequestTimestamp(java.util.Date value) {
            _requestTimestamp = value;

            return this;
        }

        /**
         *
         */
        public Builder clearRequestTimestamp() {
            _requestTimestamp = null;

            return this;
        }

        /**
         *
         */
        @Override
        public boolean hasResponseTimestamp() {
            return _responseTimestamp != null;
        }

        /**
         *
         */
        @Override
        public java.util.Date getResponseTimestamp() {
            return _responseTimestamp;
        }

        /**
         *
         */
        public Builder setResponseTimestamp(java.util.Date value) {
            _responseTimestamp = value;

            return this;
        }

        /**
         *
         */
        public Builder clearResponseTimestamp() {
            _responseTimestamp = null;

            return this;
        }

        /**
         *
         */
        @Override
        public boolean hasLogCount() {
            return _logCount != null;
        }

        /**
         *
         */
        @Override
        public int getLogCount() {
            return _logCount;
        }

        /**
         *
         */
        public Builder setLogCount(int value) {
            _logCount = value;

            return this;
        }

        /**
         *
         */
        public Builder clearLogCount() {
            _logCount = null;

            return this;
        }

        /**
         *
         */
        @Override
        public boolean hasSourceAddress() {
            return _sourceAddress != null;
        }

        /**
         *
         */
        @Override
        public RequestEntity.Address.Builder getSourceAddress() {
            return _sourceAddress;
        }

        /**
         *
         */
        public RequestEntity.Address.Builder getOrCreateSourceAddress() {
            if (_sourceAddress == null) {
                _sourceAddress = RequestEntity.Address.newBuilder();
            }

            return _sourceAddress;
        }

        /**
         *
         */
        public Builder setSourceAddress(RequestEntity.Address.Builder value) {
            _sourceAddress = value;

            return this;
        }

        /**
         *
         */
        public Builder clearSourceAddress() {
            _sourceAddress = null;

            return this;
        }

        /**
         *
         */
        @Override
        public boolean hasRequestMethod() {
            return _requestMethod != null;
        }

        /**
         *
         */
        @Override
        public String getRequestMethod() {
            return _requestMethod;
        }

        /**
         *
         */
        public Builder setRequestMethod(String value) {
            _requestMethod = value;

            return this;
        }

        /**
         *
         */
        public Builder clearRequestMethod() {
            _requestMethod = null;

            return this;
        }

        /**
         *
         */
        @Override
        public boolean hasRequestUrl() {
            return _requestUrl != null;
        }

        /**
         *
         */
        @Override
        public String getRequestUrl() {
            return _requestUrl;
        }

        /**
         *
         */
        public Builder setRequestUrl(String value) {
            _requestUrl = value;

            return this;
        }

        /**
         *
         */
        public Builder clearRequestUrl() {
            _requestUrl = null;

            return this;
        }

        /**
         *
         */
        @Override
        public boolean hasRequestAddress() {
            return _requestAddress != null;
        }

        /**
         *
         */
        @Override
        public RequestEntity.Address.Builder getRequestAddress() {
            return _requestAddress;
        }

        /**
         *
         */
        public RequestEntity.Address.Builder getOrCreateRequestAddress() {
            if (_requestAddress == null) {
                _requestAddress = RequestEntity.Address.newBuilder();
            }

            return _requestAddress;
        }

        /**
         *
         */
        public Builder setRequestAddress(RequestEntity.Address.Builder value) {
            _requestAddress = value;

            return this;
        }

        /**
         *
         */
        public Builder clearRequestAddress() {
            _requestAddress = null;

            return this;
        }

        /**
         *
         */
        @Override
        public boolean hasRequestPath() {
            return _requestPath != null;
        }

        /**
         *
         */
        @Override
        public String getRequestPath() {
            return _requestPath;
        }

        /**
         *
         */
        public Builder setRequestPath(String value) {
            _requestPath = value;

            return this;
        }

        /**
         *
         */
        public Builder clearRequestPath() {
            _requestPath = null;

            return this;
        }

        /**
         *
         */
        @Override
        public boolean hasRequestQuery() {
            return _requestQuery != null;
        }

        /**
         *
         */
        @Override
        public String getRequestQuery() {
            return _requestQuery;
        }

        /**
         *
         */
        public Builder setRequestQuery(String value) {
            _requestQuery = value;

            return this;
        }

        /**
         *
         */
        public Builder clearRequestQuery() {
            _requestQuery = null;

            return this;
        }

        /**
         *
         */
        public java.util.Map<String, String> getHeaderMap() {
            if (_headerMap == null) {
                _headerMap = new java.util.HashMap<String, String>();
            }

            return _headerMap;
        }

        /**
         *
         */
        @Override
        public boolean containsHeader(String key) {
            return (_headerMap == null) ? false : _headerMap.containsKey(key);
        }

        /**
         *
         */
        @Override
        public String getHeader(String key) {
            return (_headerMap == null) ? null : (String) _headerMap.get(key);
        }

        /**
         *
         */
        @Override
        public int getHeaderCount() {
            return (_headerMap == null) ? 0 : _headerMap.size();
        }

        /**
         *
         */
        @Override
        public java.util.Set<String> getHeaderKeys() {
            return (_headerMap == null) ? null : _headerMap.keySet();
        }

        /**
         *
         */
        public Builder putHeader(String key, String value) {
            getHeaderMap().put(key, value);

            return this;
        }

        /**
         *
         */
        public Builder clearHeader() {
            _headerMap = null;

            return this;
        }

        /**
         *
         */
        public java.util.Map<String, String> getParameterMap() {
            if (_parameterMap == null) {
                _parameterMap = new java.util.HashMap<String, String>();
            }

            return _parameterMap;
        }

        /**
         *
         */
        @Override
        public boolean containsParameter(String key) {
            return (_parameterMap == null) ? false
                                           : _parameterMap.containsKey(key);
        }

        /**
         *
         */
        @Override
        public String getParameter(String key) {
            return (_parameterMap == null) ? null
                                           : (String) _parameterMap.get(key);
        }

        /**
         *
         */
        @Override
        public int getParameterCount() {
            return (_parameterMap == null) ? 0 : _parameterMap.size();
        }

        /**
         *
         */
        @Override
        public java.util.Set<String> getParameterKeys() {
            return (_parameterMap == null) ? null : _parameterMap.keySet();
        }

        /**
         *
         */
        public Builder putParameter(String key, String value) {
            getParameterMap().put(key, value);

            return this;
        }

        /**
         *
         */
        public Builder clearParameter() {
            _parameterMap = null;

            return this;
        }

        /**
         *
         */
        public com.mongodb.DBObject build() {
            com.mongodb.DBObject dbObject = new com.mongodb.BasicDBObject();

            if (_requestId != null) {
                dbObject.put(RequestIdKey, _requestId);
            }

            if (_serverHostname != null) {
                dbObject.put(ServerHostnameKey, _serverHostname);
            }

            if (_requestTimestamp != null) {
                dbObject.put(RequestTimestampKey, _requestTimestamp);
            }

            if (_responseTimestamp != null) {
                dbObject.put(ResponseTimestampKey, _responseTimestamp);
            }

            if (_logCount != null) {
                dbObject.put(LogCountKey, _logCount);
            }

            if (_sourceAddress != null) {
                dbObject.put(SourceAddressKey, _sourceAddress.build());
            }

            if (_requestMethod != null) {
                dbObject.put(RequestMethodKey, _requestMethod);
            }

            if (_requestUrl != null) {
                dbObject.put(RequestUrlKey, _requestUrl);
            }

            if (_requestAddress != null) {
                dbObject.put(RequestAddressKey, _requestAddress.build());
            }

            if (_requestPath != null) {
                dbObject.put(RequestPathKey, _requestPath);
            }

            if (_requestQuery != null) {
                dbObject.put(RequestQueryKey, _requestQuery);
            }

            if (_headerMap != null) {
                dbObject.put(HeaderKey, _headerMap);
            }

            if (_parameterMap != null) {
                dbObject.put(ParameterKey, _parameterMap);
            }

            return dbObject;
        }
    }

    /**
     *
     */
    public static abstract class Address implements com.mattinsler.guiceymongo.data.IsData {
        public static final String AddressKey = "address";
        public static final String PortKey = "port";
        public static com.mattinsler.guiceymongo.data.DataWrapper<RequestEntity.Address> DataWrapper =
            new com.mattinsler.guiceymongo.data.DataWrapper<RequestEntity.Address>() {
                public RequestEntity.Address.Wrapper wrap(
                    com.mongodb.DBObject backing) {
                    return RequestEntity.Address.wrap(backing);
                }
            };

        /**
         *
         */
        public abstract boolean hasAddress();

        /**
         *
         */
        public abstract String getAddress();

        /**
         *
         */
        public abstract boolean hasPort();

        /**
         *
         */
        public abstract int getPort();

        public static RequestEntity.Address.Wrapper wrap(
            com.mongodb.DBObject backing) {
            if (backing == null) {
                return null;
            }

            return new RequestEntity.Address.Wrapper(backing);
        }

        public static RequestEntity.Address.Wrapper convertFrom(
            com.mattinsler.guiceymongo.data.IsWrapper<?> wrapped) {
            if (wrapped == null) {
                return null;
            }

            return new RequestEntity.Address.Wrapper(wrapped.getDBObject());
        }

        public static RequestEntity.Address.Wrapper convertFrom(
            com.mattinsler.guiceymongo.data.IsData data) {
            if ((data == null) ||
                    !(data instanceof com.mattinsler.guiceymongo.data.IsWrapper<?>)) {
                return null;
            }

            return new RequestEntity.Address.Wrapper(((com.mattinsler.guiceymongo.data.IsWrapper<?>) data).getDBObject());
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        public static Builder newBuilder(RequestEntity.Address value) {
            Builder builder = new Builder();

            if (value.hasAddress()) {
                builder.setAddress(value.getAddress());
            }

            if (value.hasPort()) {
                builder.setPort(value.getPort());
            }

            return builder;
        }

        @Override
        public boolean equals(Object obj) {
            if ((obj == null) || !(obj instanceof Address)) {
                return false;
            }

            Address other = (Address) obj;

            if ((this.hasAddress() != other.hasAddress()) ||
                    (this.hasAddress() &&
                    !this.getAddress().equals(other.getAddress()))) {
                return false;
            }

            if ((this.hasPort() != other.hasPort()) ||
                    (this.hasPort() && (this.getPort() != other.getPort()))) {
                return false;
            }

            return true;
        }

        public static class Wrapper extends Address implements com.mattinsler.guiceymongo.data.IsWrapper<Address> {
            private com.mongodb.DBObject _backing;

            private Wrapper(com.mongodb.DBObject backing) {
                _backing = backing;
            }

            /**
             *
             */
            @Override
            public boolean hasAddress() {
                return _backing.containsField(AddressKey);
            }

            /**
             *
             */
            @Override
            public String getAddress() {
                return (String) _backing.get(AddressKey);
            }

            /**
             *
             */
            @Override
            public boolean hasPort() {
                return _backing.containsField(PortKey);
            }

            /**
             *
             */
            @Override
            public int getPort() {
                Object value = _backing.get(PortKey);

                if (value instanceof Double) {
                    return ((Double) value).intValue();
                }

                return (Integer) value;
            }

            public com.mongodb.DBObject getDBObject() {
                return _backing;
            }
        }

        public static class Builder extends Address implements com.mattinsler.guiceymongo.data.IsBuilder<Address> {
            /**
             *
             */
            protected String _address = null;

            /**
             *
             */
            protected Integer _port = null;

            private Builder() {
            }

            /**
             *
             */
            @Override
            public boolean hasAddress() {
                return _address != null;
            }

            /**
             *
             */
            @Override
            public String getAddress() {
                return _address;
            }

            /**
             *
             */
            public Builder setAddress(String value) {
                _address = value;

                return this;
            }

            /**
             *
             */
            public Builder clearAddress() {
                _address = null;

                return this;
            }

            /**
             *
             */
            @Override
            public boolean hasPort() {
                return _port != null;
            }

            /**
             *
             */
            @Override
            public int getPort() {
                return _port;
            }

            /**
             *
             */
            public Builder setPort(int value) {
                _port = value;

                return this;
            }

            /**
             *
             */
            public Builder clearPort() {
                _port = null;

                return this;
            }

            public com.mongodb.DBObject build() {
                com.mongodb.DBObject dbObject = new com.mongodb.BasicDBObject();

                if (_address != null) {
                    dbObject.put(AddressKey, _address);
                }

                if (_port != null) {
                    dbObject.put(PortKey, _port);
                }

                return dbObject;
            }
        }
    }
}
