// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: AuthUsuario.proto

package sd.ufc.reserva.model;

public final class ObjectAuthUsuario {
  private ObjectAuthUsuario() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface AuthUsuarioOrBuilder extends
      // @@protoc_insertion_point(interface_extends:model.AuthUsuario)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>string usuario = 1;</code>
     * @return The usuario.
     */
    java.lang.String getUsuario();
    /**
     * <code>string usuario = 1;</code>
     * @return The bytes for usuario.
     */
    com.google.protobuf.ByteString
        getUsuarioBytes();

    /**
     * <code>string senha = 2;</code>
     * @return The senha.
     */
    java.lang.String getSenha();
    /**
     * <code>string senha = 2;</code>
     * @return The bytes for senha.
     */
    com.google.protobuf.ByteString
        getSenhaBytes();
  }
  /**
   * Protobuf type {@code model.AuthUsuario}
   */
  public  static final class AuthUsuario extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:model.AuthUsuario)
      AuthUsuarioOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use AuthUsuario.newBuilder() to construct.
    private AuthUsuario(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private AuthUsuario() {
      usuario_ = "";
      senha_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new AuthUsuario();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private AuthUsuario(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              java.lang.String s = input.readStringRequireUtf8();

              usuario_ = s;
              break;
            }
            case 18: {
              java.lang.String s = input.readStringRequireUtf8();

              senha_ = s;
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return sd.ufc.reserva.model.ObjectAuthUsuario.internal_static_model_AuthUsuario_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return sd.ufc.reserva.model.ObjectAuthUsuario.internal_static_model_AuthUsuario_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              sd.ufc.reserva.model.ObjectAuthUsuario.AuthUsuario.class, sd.ufc.reserva.model.ObjectAuthUsuario.AuthUsuario.Builder.class);
    }

    public static final int USUARIO_FIELD_NUMBER = 1;
    private volatile java.lang.Object usuario_;
    /**
     * <code>string usuario = 1;</code>
     * @return The usuario.
     */
    public java.lang.String getUsuario() {
      java.lang.Object ref = usuario_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        usuario_ = s;
        return s;
      }
    }
    /**
     * <code>string usuario = 1;</code>
     * @return The bytes for usuario.
     */
    public com.google.protobuf.ByteString
        getUsuarioBytes() {
      java.lang.Object ref = usuario_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        usuario_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int SENHA_FIELD_NUMBER = 2;
    private volatile java.lang.Object senha_;
    /**
     * <code>string senha = 2;</code>
     * @return The senha.
     */
    public java.lang.String getSenha() {
      java.lang.Object ref = senha_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        senha_ = s;
        return s;
      }
    }
    /**
     * <code>string senha = 2;</code>
     * @return The bytes for senha.
     */
    public com.google.protobuf.ByteString
        getSenhaBytes() {
      java.lang.Object ref = senha_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        senha_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (!getUsuarioBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, usuario_);
      }
      if (!getSenhaBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, senha_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!getUsuarioBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, usuario_);
      }
      if (!getSenhaBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, senha_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof sd.ufc.reserva.model.ObjectAuthUsuario.AuthUsuario)) {
        return super.equals(obj);
      }
      sd.ufc.reserva.model.ObjectAuthUsuario.AuthUsuario other = (sd.ufc.reserva.model.ObjectAuthUsuario.AuthUsuario) obj;

      if (!getUsuario()
          .equals(other.getUsuario())) return false;
      if (!getSenha()
          .equals(other.getSenha())) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + USUARIO_FIELD_NUMBER;
      hash = (53 * hash) + getUsuario().hashCode();
      hash = (37 * hash) + SENHA_FIELD_NUMBER;
      hash = (53 * hash) + getSenha().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static sd.ufc.reserva.model.ObjectAuthUsuario.AuthUsuario parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static sd.ufc.reserva.model.ObjectAuthUsuario.AuthUsuario parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static sd.ufc.reserva.model.ObjectAuthUsuario.AuthUsuario parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static sd.ufc.reserva.model.ObjectAuthUsuario.AuthUsuario parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static sd.ufc.reserva.model.ObjectAuthUsuario.AuthUsuario parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static sd.ufc.reserva.model.ObjectAuthUsuario.AuthUsuario parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static sd.ufc.reserva.model.ObjectAuthUsuario.AuthUsuario parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static sd.ufc.reserva.model.ObjectAuthUsuario.AuthUsuario parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static sd.ufc.reserva.model.ObjectAuthUsuario.AuthUsuario parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static sd.ufc.reserva.model.ObjectAuthUsuario.AuthUsuario parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static sd.ufc.reserva.model.ObjectAuthUsuario.AuthUsuario parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static sd.ufc.reserva.model.ObjectAuthUsuario.AuthUsuario parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(sd.ufc.reserva.model.ObjectAuthUsuario.AuthUsuario prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code model.AuthUsuario}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:model.AuthUsuario)
        sd.ufc.reserva.model.ObjectAuthUsuario.AuthUsuarioOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return sd.ufc.reserva.model.ObjectAuthUsuario.internal_static_model_AuthUsuario_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return sd.ufc.reserva.model.ObjectAuthUsuario.internal_static_model_AuthUsuario_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                sd.ufc.reserva.model.ObjectAuthUsuario.AuthUsuario.class, sd.ufc.reserva.model.ObjectAuthUsuario.AuthUsuario.Builder.class);
      }

      // Construct using sd.ufc.reserva.model.ObjectAuthUsuario.AuthUsuario.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        usuario_ = "";

        senha_ = "";

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return sd.ufc.reserva.model.ObjectAuthUsuario.internal_static_model_AuthUsuario_descriptor;
      }

      @java.lang.Override
      public sd.ufc.reserva.model.ObjectAuthUsuario.AuthUsuario getDefaultInstanceForType() {
        return sd.ufc.reserva.model.ObjectAuthUsuario.AuthUsuario.getDefaultInstance();
      }

      @java.lang.Override
      public sd.ufc.reserva.model.ObjectAuthUsuario.AuthUsuario build() {
        sd.ufc.reserva.model.ObjectAuthUsuario.AuthUsuario result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public sd.ufc.reserva.model.ObjectAuthUsuario.AuthUsuario buildPartial() {
        sd.ufc.reserva.model.ObjectAuthUsuario.AuthUsuario result = new sd.ufc.reserva.model.ObjectAuthUsuario.AuthUsuario(this);
        result.usuario_ = usuario_;
        result.senha_ = senha_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof sd.ufc.reserva.model.ObjectAuthUsuario.AuthUsuario) {
          return mergeFrom((sd.ufc.reserva.model.ObjectAuthUsuario.AuthUsuario)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(sd.ufc.reserva.model.ObjectAuthUsuario.AuthUsuario other) {
        if (other == sd.ufc.reserva.model.ObjectAuthUsuario.AuthUsuario.getDefaultInstance()) return this;
        if (!other.getUsuario().isEmpty()) {
          usuario_ = other.usuario_;
          onChanged();
        }
        if (!other.getSenha().isEmpty()) {
          senha_ = other.senha_;
          onChanged();
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        sd.ufc.reserva.model.ObjectAuthUsuario.AuthUsuario parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (sd.ufc.reserva.model.ObjectAuthUsuario.AuthUsuario) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private java.lang.Object usuario_ = "";
      /**
       * <code>string usuario = 1;</code>
       * @return The usuario.
       */
      public java.lang.String getUsuario() {
        java.lang.Object ref = usuario_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          usuario_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string usuario = 1;</code>
       * @return The bytes for usuario.
       */
      public com.google.protobuf.ByteString
          getUsuarioBytes() {
        java.lang.Object ref = usuario_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          usuario_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string usuario = 1;</code>
       * @param value The usuario to set.
       * @return This builder for chaining.
       */
      public Builder setUsuario(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        usuario_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string usuario = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearUsuario() {
        
        usuario_ = getDefaultInstance().getUsuario();
        onChanged();
        return this;
      }
      /**
       * <code>string usuario = 1;</code>
       * @param value The bytes for usuario to set.
       * @return This builder for chaining.
       */
      public Builder setUsuarioBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        usuario_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object senha_ = "";
      /**
       * <code>string senha = 2;</code>
       * @return The senha.
       */
      public java.lang.String getSenha() {
        java.lang.Object ref = senha_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          senha_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string senha = 2;</code>
       * @return The bytes for senha.
       */
      public com.google.protobuf.ByteString
          getSenhaBytes() {
        java.lang.Object ref = senha_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          senha_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string senha = 2;</code>
       * @param value The senha to set.
       * @return This builder for chaining.
       */
      public Builder setSenha(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        senha_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string senha = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearSenha() {
        
        senha_ = getDefaultInstance().getSenha();
        onChanged();
        return this;
      }
      /**
       * <code>string senha = 2;</code>
       * @param value The bytes for senha to set.
       * @return This builder for chaining.
       */
      public Builder setSenhaBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        senha_ = value;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:model.AuthUsuario)
    }

    // @@protoc_insertion_point(class_scope:model.AuthUsuario)
    private static final sd.ufc.reserva.model.ObjectAuthUsuario.AuthUsuario DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new sd.ufc.reserva.model.ObjectAuthUsuario.AuthUsuario();
    }

    public static sd.ufc.reserva.model.ObjectAuthUsuario.AuthUsuario getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<AuthUsuario>
        PARSER = new com.google.protobuf.AbstractParser<AuthUsuario>() {
      @java.lang.Override
      public AuthUsuario parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new AuthUsuario(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<AuthUsuario> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<AuthUsuario> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public sd.ufc.reserva.model.ObjectAuthUsuario.AuthUsuario getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_model_AuthUsuario_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_model_AuthUsuario_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021AuthUsuario.proto\022\005model\"-\n\013AuthUsuari" +
      "o\022\017\n\007usuario\030\001 \001(\t\022\r\n\005senha\030\002 \001(\tB)\n\024sd." +
      "ufc.reserva.modelB\021ObjectAuthUsuariob\006pr" +
      "oto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_model_AuthUsuario_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_model_AuthUsuario_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_model_AuthUsuario_descriptor,
        new java.lang.String[] { "Usuario", "Senha", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
