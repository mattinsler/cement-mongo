package com.mattinsler.cement.mongo.model;


// Generated file!!!  DO NOT EDIT THIS!!!

/**
 *
 */
public abstract class ExceptionEntity implements com.mattinsler.guiceymongo.data.IsData {
    public static final String ThrowableKey = "throwable";
    public static com.mattinsler.guiceymongo.data.DataWrapper<ExceptionEntity> DataWrapper =
        new com.mattinsler.guiceymongo.data.DataWrapper<ExceptionEntity>() {
            public ExceptionEntity.Wrapper wrap(com.mongodb.DBObject backing) {
                return ExceptionEntity.wrap(backing);
            }
        };

    /**
     *
     */
    public abstract int getThrowableCount();

    /**
     *
     */
    public abstract java.util.List<ExceptionEntity.Throwable> getThrowableList();

    /**
     *
     */
    public abstract ExceptionEntity.Throwable getThrowable(int index);

    public static ExceptionEntity.Wrapper wrap(com.mongodb.DBObject backing) {
        if (backing == null) {
            return null;
        }

        return new ExceptionEntity.Wrapper(backing);
    }

    public static ExceptionEntity.Wrapper convertFrom(
        com.mattinsler.guiceymongo.data.IsWrapper<?> wrapped) {
        if (wrapped == null) {
            return null;
        }

        return new ExceptionEntity.Wrapper(wrapped.getDBObject());
    }

    public static ExceptionEntity.Wrapper convertFrom(
        com.mattinsler.guiceymongo.data.IsData data) {
        if ((data == null) ||
                !(data instanceof com.mattinsler.guiceymongo.data.IsWrapper<?>)) {
            return null;
        }

        return new ExceptionEntity.Wrapper(((com.mattinsler.guiceymongo.data.IsWrapper<?>) data).getDBObject());
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static Builder newBuilder(ExceptionEntity value) {
        Builder builder = new Builder();

        if (value.getThrowableCount() > 0) {
            for (ExceptionEntity.Throwable item : value.getThrowableList())
                builder.addThrowable(ExceptionEntity.Throwable.Builder.newBuilder(
                        item));
        }

        return builder;
    }

    @Override
    public boolean equals(Object obj) {
        if ((obj == null) || !(obj instanceof ExceptionEntity)) {
            return false;
        }

        ExceptionEntity other = (ExceptionEntity) obj;

        if (this.getThrowableCount() != other.getThrowableCount()) {
            return false;
        }

        for (int index = 0; index < this.getThrowableCount(); ++index) {
            if (!this.getThrowable(index).equals(other.getThrowable(index))) {
                return false;
            }
        }

        return true;
    }

    public static class Wrapper extends ExceptionEntity implements com.mattinsler.guiceymongo.data.IsWrapper<ExceptionEntity> {
        private com.mongodb.DBObject _backing;

        /**
         *
         */
        protected java.util.List<ExceptionEntity.Throwable> _throwableList = null;

        private Wrapper(com.mongodb.DBObject backing) {
            _backing = backing;
        }

        /**
         *
         */
        @Override
        public int getThrowableCount() {
            java.util.List<ExceptionEntity.Throwable> list = getThrowableList();

            return (list == null) ? 0 : list.size();
        }

        /**
         *
         */
        @SuppressWarnings("unchecked")
        @Override
        public java.util.List<ExceptionEntity.Throwable> getThrowableList() {
            if (_throwableList == null) {
                Object value = _backing.get(ThrowableKey);

                if ((value != null) && value instanceof java.util.List<?>) {
                    java.util.List<ExceptionEntity.Throwable> list = new java.util.ArrayList<ExceptionEntity.Throwable>();

                    for (com.mongodb.DBObject o : (java.util.List<com.mongodb.DBObject>) value)
                        list.add(ExceptionEntity.Throwable.wrap(o));

                    _throwableList = java.util.Collections.unmodifiableList(list);
                }
            }

            return _throwableList;
        }

        /**
         *
         */
        @Override
        public ExceptionEntity.Throwable getThrowable(int index) {
            java.util.List<ExceptionEntity.Throwable> list = getThrowableList();

            if (list == null) {
                throw new IndexOutOfBoundsException();
            }

            return list.get(index);
        }

        public com.mongodb.DBObject getDBObject() {
            return _backing;
        }
    }

    public static class Builder extends ExceptionEntity implements com.mattinsler.guiceymongo.data.IsBuilder<ExceptionEntity> {
        /**
         *
         */
        protected java.util.List<ExceptionEntity.Throwable> _throwableList = null;

        private Builder() {
        }

        /**
         *
         */
        @Override
        public int getThrowableCount() {
            return (_throwableList == null) ? 0 : _throwableList.size();
        }

        /**
         *
         */
        @Override
        public java.util.List<ExceptionEntity.Throwable> getThrowableList() {
            return java.util.Collections.unmodifiableList(_throwableList);
        }

        /**
         *
         */
        @Override
        public ExceptionEntity.Throwable.Builder getThrowable(int index) {
            return (_throwableList == null) ? null
                                            : (ExceptionEntity.Throwable.Builder) _throwableList.get(index);
        }

        /**
         *
         */
        public Builder addThrowable(ExceptionEntity.Throwable.Builder value) {
            if (_throwableList == null) {
                _throwableList = new java.util.ArrayList<ExceptionEntity.Throwable>();
            }

            _throwableList.add(value);

            return this;
        }

        /**
         *
         */
        public Builder addAllThrowable(
            Iterable<?extends ExceptionEntity.Throwable.Builder> value) {
            if (_throwableList == null) {
                _throwableList = new java.util.ArrayList<ExceptionEntity.Throwable>();
            }

            for (ExceptionEntity.Throwable.Builder item : value)
                _throwableList.add(item);

            return this;
        }

        /**
         *
         */
        public Builder clearThrowable() {
            _throwableList = null;

            return this;
        }

        public com.mongodb.DBObject build() {
            com.mongodb.DBObject dbObject = new com.mongodb.BasicDBObject();

            if (_throwableList != null) {
                java.util.List<com.mongodb.DBObject> list = new java.util.ArrayList<com.mongodb.DBObject>();

                for (ExceptionEntity.Throwable value : _throwableList)
                    list.add(((ExceptionEntity.Throwable.Builder) value).build());

                dbObject.put(ThrowableKey, list);
            }

            return dbObject;
        }
    }

    /**
     *
     */
    public static abstract class Throwable implements com.mattinsler.guiceymongo.data.IsData {
        public static final String MessageKey = "message";
        public static final String FullClassNameKey = "full_class_name";
        public static final String StackElementKey = "stack_element";
        public static com.mattinsler.guiceymongo.data.DataWrapper<ExceptionEntity.Throwable> DataWrapper =
            new com.mattinsler.guiceymongo.data.DataWrapper<ExceptionEntity.Throwable>() {
                public ExceptionEntity.Throwable.Wrapper wrap(
                    com.mongodb.DBObject backing) {
                    return ExceptionEntity.Throwable.wrap(backing);
                }
            };

        /**
         *
         */
        public abstract boolean hasMessage();

        /**
         *
         */
        public abstract String getMessage();

        /**
         *
         */
        public abstract boolean hasFullClassName();

        /**
         *
         */
        public abstract String getFullClassName();

        /**
         *
         */
        public abstract int getStackElementCount();

        /**
         *
         */
        public abstract java.util.List<ExceptionEntity.StackElement> getStackElementList();

        /**
         *
         */
        public abstract ExceptionEntity.StackElement getStackElement(int index);

        public static ExceptionEntity.Throwable.Wrapper wrap(
            com.mongodb.DBObject backing) {
            if (backing == null) {
                return null;
            }

            return new ExceptionEntity.Throwable.Wrapper(backing);
        }

        public static ExceptionEntity.Throwable.Wrapper convertFrom(
            com.mattinsler.guiceymongo.data.IsWrapper<?> wrapped) {
            if (wrapped == null) {
                return null;
            }

            return new ExceptionEntity.Throwable.Wrapper(wrapped.getDBObject());
        }

        public static ExceptionEntity.Throwable.Wrapper convertFrom(
            com.mattinsler.guiceymongo.data.IsData data) {
            if ((data == null) ||
                    !(data instanceof com.mattinsler.guiceymongo.data.IsWrapper<?>)) {
                return null;
            }

            return new ExceptionEntity.Throwable.Wrapper(((com.mattinsler.guiceymongo.data.IsWrapper<?>) data).getDBObject());
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        public static Builder newBuilder(ExceptionEntity.Throwable value) {
            Builder builder = new Builder();

            if (value.hasMessage()) {
                builder.setMessage(value.getMessage());
            }

            if (value.hasFullClassName()) {
                builder.setFullClassName(value.getFullClassName());
            }

            if (value.getStackElementCount() > 0) {
                for (ExceptionEntity.StackElement item : value.getStackElementList())
                    builder.addStackElement(ExceptionEntity.StackElement.Builder.newBuilder(
                            item));
            }

            return builder;
        }

        @Override
        public boolean equals(Object obj) {
            if ((obj == null) || !(obj instanceof Throwable)) {
                return false;
            }

            Throwable other = (Throwable) obj;

            if ((this.hasMessage() != other.hasMessage()) ||
                    (this.hasMessage() &&
                    !this.getMessage().equals(other.getMessage()))) {
                return false;
            }

            if ((this.hasFullClassName() != other.hasFullClassName()) ||
                    (this.hasFullClassName() &&
                    !this.getFullClassName().equals(other.getFullClassName()))) {
                return false;
            }

            if (this.getStackElementCount() != other.getStackElementCount()) {
                return false;
            }

            for (int index = 0; index < this.getStackElementCount(); ++index) {
                if (!this.getStackElement(index)
                             .equals(other.getStackElement(index))) {
                    return false;
                }
            }

            return true;
        }

        public static class Wrapper extends Throwable implements com.mattinsler.guiceymongo.data.IsWrapper<Throwable> {
            private com.mongodb.DBObject _backing;

            /**
             *
             */
            protected java.util.List<ExceptionEntity.StackElement> _stackElementList =
                null;

            private Wrapper(com.mongodb.DBObject backing) {
                _backing = backing;
            }

            /**
             *
             */
            @Override
            public boolean hasMessage() {
                return _backing.containsField(MessageKey);
            }

            /**
             *
             */
            @Override
            public String getMessage() {
                return (String) _backing.get(MessageKey);
            }

            /**
             *
             */
            @Override
            public boolean hasFullClassName() {
                return _backing.containsField(FullClassNameKey);
            }

            /**
             *
             */
            @Override
            public String getFullClassName() {
                return (String) _backing.get(FullClassNameKey);
            }

            /**
             *
             */
            @Override
            public int getStackElementCount() {
                java.util.List<ExceptionEntity.StackElement> list = getStackElementList();

                return (list == null) ? 0 : list.size();
            }

            /**
             *
             */
            @SuppressWarnings("unchecked")
            @Override
            public java.util.List<ExceptionEntity.StackElement> getStackElementList() {
                if (_stackElementList == null) {
                    Object value = _backing.get(StackElementKey);

                    if ((value != null) && value instanceof java.util.List<?>) {
                        java.util.List<ExceptionEntity.StackElement> list = new java.util.ArrayList<ExceptionEntity.StackElement>();

                        for (com.mongodb.DBObject o : (java.util.List<com.mongodb.DBObject>) value)
                            list.add(ExceptionEntity.StackElement.wrap(o));

                        _stackElementList = java.util.Collections.unmodifiableList(list);
                    }
                }

                return _stackElementList;
            }

            /**
             *
             */
            @Override
            public ExceptionEntity.StackElement getStackElement(int index) {
                java.util.List<ExceptionEntity.StackElement> list = getStackElementList();

                if (list == null) {
                    throw new IndexOutOfBoundsException();
                }

                return list.get(index);
            }

            public com.mongodb.DBObject getDBObject() {
                return _backing;
            }
        }

        public static class Builder extends Throwable implements com.mattinsler.guiceymongo.data.IsBuilder<Throwable> {
            /**
             *
             */
            protected String _message = null;

            /**
             *
             */
            protected String _fullClassName = null;

            /**
             *
             */
            protected java.util.List<ExceptionEntity.StackElement> _stackElementList =
                null;

            private Builder() {
            }

            /**
             *
             */
            @Override
            public boolean hasMessage() {
                return _message != null;
            }

            /**
             *
             */
            @Override
            public String getMessage() {
                return _message;
            }

            /**
             *
             */
            public Builder setMessage(String value) {
                _message = value;

                return this;
            }

            /**
             *
             */
            public Builder clearMessage() {
                _message = null;

                return this;
            }

            /**
             *
             */
            @Override
            public boolean hasFullClassName() {
                return _fullClassName != null;
            }

            /**
             *
             */
            @Override
            public String getFullClassName() {
                return _fullClassName;
            }

            /**
             *
             */
            public Builder setFullClassName(String value) {
                _fullClassName = value;

                return this;
            }

            /**
             *
             */
            public Builder clearFullClassName() {
                _fullClassName = null;

                return this;
            }

            /**
             *
             */
            @Override
            public int getStackElementCount() {
                return (_stackElementList == null) ? 0 : _stackElementList.size();
            }

            /**
             *
             */
            @Override
            public java.util.List<ExceptionEntity.StackElement> getStackElementList() {
                return java.util.Collections.unmodifiableList(_stackElementList);
            }

            /**
             *
             */
            @Override
            public ExceptionEntity.StackElement.Builder getStackElement(
                int index) {
                return (_stackElementList == null) ? null
                                                   : (ExceptionEntity.StackElement.Builder) _stackElementList.get(index);
            }

            /**
             *
             */
            public Builder addStackElement(
                ExceptionEntity.StackElement.Builder value) {
                if (_stackElementList == null) {
                    _stackElementList = new java.util.ArrayList<ExceptionEntity.StackElement>();
                }

                _stackElementList.add(value);

                return this;
            }

            /**
             *
             */
            public Builder addAllStackElement(
                Iterable<?extends ExceptionEntity.StackElement.Builder> value) {
                if (_stackElementList == null) {
                    _stackElementList = new java.util.ArrayList<ExceptionEntity.StackElement>();
                }

                for (ExceptionEntity.StackElement.Builder item : value)
                    _stackElementList.add(item);

                return this;
            }

            /**
             *
             */
            public Builder clearStackElement() {
                _stackElementList = null;

                return this;
            }

            public com.mongodb.DBObject build() {
                com.mongodb.DBObject dbObject = new com.mongodb.BasicDBObject();

                if (_message != null) {
                    dbObject.put(MessageKey, _message);
                }

                if (_fullClassName != null) {
                    dbObject.put(FullClassNameKey, _fullClassName);
                }

                if (_stackElementList != null) {
                    java.util.List<com.mongodb.DBObject> list = new java.util.ArrayList<com.mongodb.DBObject>();

                    for (ExceptionEntity.StackElement value : _stackElementList)
                        list.add(((ExceptionEntity.StackElement.Builder) value).build());

                    dbObject.put(StackElementKey, list);
                }

                return dbObject;
            }
        }
    }

    /**
     *
     */
    public static abstract class StackElement implements com.mattinsler.guiceymongo.data.IsData {
        public static final String FilenameKey = "filename";
        public static final String MethodKey = "method";
        public static final String LineKey = "line";
        public static final String FullClassNameKey = "full_class_name";
        public static com.mattinsler.guiceymongo.data.DataWrapper<ExceptionEntity.StackElement> DataWrapper =
            new com.mattinsler.guiceymongo.data.DataWrapper<ExceptionEntity.StackElement>() {
                public ExceptionEntity.StackElement.Wrapper wrap(
                    com.mongodb.DBObject backing) {
                    return ExceptionEntity.StackElement.wrap(backing);
                }
            };

        /**
         *
         */
        public abstract boolean hasFilename();

        /**
         *
         */
        public abstract String getFilename();

        /**
         *
         */
        public abstract boolean hasMethod();

        /**
         *
         */
        public abstract String getMethod();

        /**
         *
         */
        public abstract boolean hasLine();

        /**
         *
         */
        public abstract int getLine();

        /**
         *
         */
        public abstract boolean hasFullClassName();

        /**
         *
         */
        public abstract String getFullClassName();

        public static ExceptionEntity.StackElement.Wrapper wrap(
            com.mongodb.DBObject backing) {
            if (backing == null) {
                return null;
            }

            return new ExceptionEntity.StackElement.Wrapper(backing);
        }

        public static ExceptionEntity.StackElement.Wrapper convertFrom(
            com.mattinsler.guiceymongo.data.IsWrapper<?> wrapped) {
            if (wrapped == null) {
                return null;
            }

            return new ExceptionEntity.StackElement.Wrapper(wrapped.getDBObject());
        }

        public static ExceptionEntity.StackElement.Wrapper convertFrom(
            com.mattinsler.guiceymongo.data.IsData data) {
            if ((data == null) ||
                    !(data instanceof com.mattinsler.guiceymongo.data.IsWrapper<?>)) {
                return null;
            }

            return new ExceptionEntity.StackElement.Wrapper(((com.mattinsler.guiceymongo.data.IsWrapper<?>) data).getDBObject());
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        public static Builder newBuilder(ExceptionEntity.StackElement value) {
            Builder builder = new Builder();

            if (value.hasFilename()) {
                builder.setFilename(value.getFilename());
            }

            if (value.hasMethod()) {
                builder.setMethod(value.getMethod());
            }

            if (value.hasLine()) {
                builder.setLine(value.getLine());
            }

            if (value.hasFullClassName()) {
                builder.setFullClassName(value.getFullClassName());
            }

            return builder;
        }

        @Override
        public boolean equals(Object obj) {
            if ((obj == null) || !(obj instanceof StackElement)) {
                return false;
            }

            StackElement other = (StackElement) obj;

            if ((this.hasFilename() != other.hasFilename()) ||
                    (this.hasFilename() &&
                    !this.getFilename().equals(other.getFilename()))) {
                return false;
            }

            if ((this.hasMethod() != other.hasMethod()) ||
                    (this.hasMethod() &&
                    !this.getMethod().equals(other.getMethod()))) {
                return false;
            }

            if ((this.hasLine() != other.hasLine()) ||
                    (this.hasLine() && (this.getLine() != other.getLine()))) {
                return false;
            }

            if ((this.hasFullClassName() != other.hasFullClassName()) ||
                    (this.hasFullClassName() &&
                    !this.getFullClassName().equals(other.getFullClassName()))) {
                return false;
            }

            return true;
        }

        public static class Wrapper extends StackElement implements com.mattinsler.guiceymongo.data.IsWrapper<StackElement> {
            private com.mongodb.DBObject _backing;

            private Wrapper(com.mongodb.DBObject backing) {
                _backing = backing;
            }

            /**
             *
             */
            @Override
            public boolean hasFilename() {
                return _backing.containsField(FilenameKey);
            }

            /**
             *
             */
            @Override
            public String getFilename() {
                return (String) _backing.get(FilenameKey);
            }

            /**
             *
             */
            @Override
            public boolean hasMethod() {
                return _backing.containsField(MethodKey);
            }

            /**
             *
             */
            @Override
            public String getMethod() {
                return (String) _backing.get(MethodKey);
            }

            /**
             *
             */
            @Override
            public boolean hasLine() {
                return _backing.containsField(LineKey);
            }

            /**
             *
             */
            @Override
            public int getLine() {
                Object value = _backing.get(LineKey);

                if (value instanceof Double) {
                    return ((Double) value).intValue();
                }

                return (Integer) value;
            }

            /**
             *
             */
            @Override
            public boolean hasFullClassName() {
                return _backing.containsField(FullClassNameKey);
            }

            /**
             *
             */
            @Override
            public String getFullClassName() {
                return (String) _backing.get(FullClassNameKey);
            }

            public com.mongodb.DBObject getDBObject() {
                return _backing;
            }
        }

        public static class Builder extends StackElement implements com.mattinsler.guiceymongo.data.IsBuilder<StackElement> {
            /**
             *
             */
            protected String _filename = null;

            /**
             *
             */
            protected String _method = null;

            /**
             *
             */
            protected Integer _line = null;

            /**
             *
             */
            protected String _fullClassName = null;

            private Builder() {
            }

            /**
             *
             */
            @Override
            public boolean hasFilename() {
                return _filename != null;
            }

            /**
             *
             */
            @Override
            public String getFilename() {
                return _filename;
            }

            /**
             *
             */
            public Builder setFilename(String value) {
                _filename = value;

                return this;
            }

            /**
             *
             */
            public Builder clearFilename() {
                _filename = null;

                return this;
            }

            /**
             *
             */
            @Override
            public boolean hasMethod() {
                return _method != null;
            }

            /**
             *
             */
            @Override
            public String getMethod() {
                return _method;
            }

            /**
             *
             */
            public Builder setMethod(String value) {
                _method = value;

                return this;
            }

            /**
             *
             */
            public Builder clearMethod() {
                _method = null;

                return this;
            }

            /**
             *
             */
            @Override
            public boolean hasLine() {
                return _line != null;
            }

            /**
             *
             */
            @Override
            public int getLine() {
                return _line;
            }

            /**
             *
             */
            public Builder setLine(int value) {
                _line = value;

                return this;
            }

            /**
             *
             */
            public Builder clearLine() {
                _line = null;

                return this;
            }

            /**
             *
             */
            @Override
            public boolean hasFullClassName() {
                return _fullClassName != null;
            }

            /**
             *
             */
            @Override
            public String getFullClassName() {
                return _fullClassName;
            }

            /**
             *
             */
            public Builder setFullClassName(String value) {
                _fullClassName = value;

                return this;
            }

            /**
             *
             */
            public Builder clearFullClassName() {
                _fullClassName = null;

                return this;
            }

            public com.mongodb.DBObject build() {
                com.mongodb.DBObject dbObject = new com.mongodb.BasicDBObject();

                if (_filename != null) {
                    dbObject.put(FilenameKey, _filename);
                }

                if (_method != null) {
                    dbObject.put(MethodKey, _method);
                }

                if (_line != null) {
                    dbObject.put(LineKey, _line);
                }

                if (_fullClassName != null) {
                    dbObject.put(FullClassNameKey, _fullClassName);
                }

                return dbObject;
            }
        }
    }
}
