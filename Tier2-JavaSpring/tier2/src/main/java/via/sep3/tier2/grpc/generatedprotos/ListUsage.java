// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: definitions.proto

/**
 * Protobuf type {@code ListUsage}
 */
public final class ListUsage extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:ListUsage)
    ListUsageOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListUsage.newBuilder() to construct.
  private ListUsage(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListUsage() {
    water_ = java.util.Collections.emptyList();
    electricity_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListUsage();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ListUsage(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
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
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              water_ = new java.util.ArrayList<WaterUsage>();
              mutable_bitField0_ |= 0x00000001;
            }
            water_.add(
                input.readMessage(WaterUsage.parser(), extensionRegistry));
            break;
          }
          case 18: {
            if (!((mutable_bitField0_ & 0x00000002) != 0)) {
              electricity_ = new java.util.ArrayList<ElectricityUsage>();
              mutable_bitField0_ |= 0x00000002;
            }
            electricity_.add(
                input.readMessage(ElectricityUsage.parser(), extensionRegistry));
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
    } catch (com.google.protobuf.UninitializedMessageException e) {
      throw e.asInvalidProtocolBufferException().setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        water_ = java.util.Collections.unmodifiableList(water_);
      }
      if (((mutable_bitField0_ & 0x00000002) != 0)) {
        electricity_ = java.util.Collections.unmodifiableList(electricity_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return Definitions.internal_static_ListUsage_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return Definitions.internal_static_ListUsage_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ListUsage.class, ListUsage.Builder.class);
  }

  public static final int WATER_FIELD_NUMBER = 1;
  private java.util.List<WaterUsage> water_;
  /**
   * <code>repeated .WaterUsage water = 1;</code>
   */
  @java.lang.Override
  public java.util.List<WaterUsage> getWaterList() {
    return water_;
  }
  /**
   * <code>repeated .WaterUsage water = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends WaterUsageOrBuilder> 
      getWaterOrBuilderList() {
    return water_;
  }
  /**
   * <code>repeated .WaterUsage water = 1;</code>
   */
  @java.lang.Override
  public int getWaterCount() {
    return water_.size();
  }
  /**
   * <code>repeated .WaterUsage water = 1;</code>
   */
  @java.lang.Override
  public WaterUsage getWater(int index) {
    return water_.get(index);
  }
  /**
   * <code>repeated .WaterUsage water = 1;</code>
   */
  @java.lang.Override
  public WaterUsageOrBuilder getWaterOrBuilder(
      int index) {
    return water_.get(index);
  }

  public static final int ELECTRICITY_FIELD_NUMBER = 2;
  private java.util.List<ElectricityUsage> electricity_;
  /**
   * <code>repeated .ElectricityUsage electricity = 2;</code>
   */
  @java.lang.Override
  public java.util.List<ElectricityUsage> getElectricityList() {
    return electricity_;
  }
  /**
   * <code>repeated .ElectricityUsage electricity = 2;</code>
   */
  @java.lang.Override
  public java.util.List<? extends ElectricityUsageOrBuilder> 
      getElectricityOrBuilderList() {
    return electricity_;
  }
  /**
   * <code>repeated .ElectricityUsage electricity = 2;</code>
   */
  @java.lang.Override
  public int getElectricityCount() {
    return electricity_.size();
  }
  /**
   * <code>repeated .ElectricityUsage electricity = 2;</code>
   */
  @java.lang.Override
  public ElectricityUsage getElectricity(int index) {
    return electricity_.get(index);
  }
  /**
   * <code>repeated .ElectricityUsage electricity = 2;</code>
   */
  @java.lang.Override
  public ElectricityUsageOrBuilder getElectricityOrBuilder(
      int index) {
    return electricity_.get(index);
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
    for (int i = 0; i < water_.size(); i++) {
      output.writeMessage(1, water_.get(i));
    }
    for (int i = 0; i < electricity_.size(); i++) {
      output.writeMessage(2, electricity_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < water_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, water_.get(i));
    }
    for (int i = 0; i < electricity_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, electricity_.get(i));
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
    if (!(obj instanceof ListUsage)) {
      return super.equals(obj);
    }
    ListUsage other = (ListUsage) obj;

    if (!getWaterList()
        .equals(other.getWaterList())) return false;
    if (!getElectricityList()
        .equals(other.getElectricityList())) return false;
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
    if (getWaterCount() > 0) {
      hash = (37 * hash) + WATER_FIELD_NUMBER;
      hash = (53 * hash) + getWaterList().hashCode();
    }
    if (getElectricityCount() > 0) {
      hash = (37 * hash) + ELECTRICITY_FIELD_NUMBER;
      hash = (53 * hash) + getElectricityList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ListUsage parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ListUsage parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ListUsage parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ListUsage parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ListUsage parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ListUsage parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ListUsage parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ListUsage parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static ListUsage parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static ListUsage parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ListUsage parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ListUsage parseFrom(
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
  public static Builder newBuilder(ListUsage prototype) {
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
   * Protobuf type {@code ListUsage}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ListUsage)
      ListUsageOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return Definitions.internal_static_ListUsage_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return Definitions.internal_static_ListUsage_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ListUsage.class, ListUsage.Builder.class);
    }

    // Construct using ListUsage.newBuilder()
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
        getWaterFieldBuilder();
        getElectricityFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (waterBuilder_ == null) {
        water_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        waterBuilder_.clear();
      }
      if (electricityBuilder_ == null) {
        electricity_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
      } else {
        electricityBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return Definitions.internal_static_ListUsage_descriptor;
    }

    @java.lang.Override
    public ListUsage getDefaultInstanceForType() {
      return ListUsage.getDefaultInstance();
    }

    @java.lang.Override
    public ListUsage build() {
      ListUsage result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public ListUsage buildPartial() {
      ListUsage result = new ListUsage(this);
      int from_bitField0_ = bitField0_;
      if (waterBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          water_ = java.util.Collections.unmodifiableList(water_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.water_ = water_;
      } else {
        result.water_ = waterBuilder_.build();
      }
      if (electricityBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)) {
          electricity_ = java.util.Collections.unmodifiableList(electricity_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.electricity_ = electricity_;
      } else {
        result.electricity_ = electricityBuilder_.build();
      }
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
      if (other instanceof ListUsage) {
        return mergeFrom((ListUsage)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ListUsage other) {
      if (other == ListUsage.getDefaultInstance()) return this;
      if (waterBuilder_ == null) {
        if (!other.water_.isEmpty()) {
          if (water_.isEmpty()) {
            water_ = other.water_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureWaterIsMutable();
            water_.addAll(other.water_);
          }
          onChanged();
        }
      } else {
        if (!other.water_.isEmpty()) {
          if (waterBuilder_.isEmpty()) {
            waterBuilder_.dispose();
            waterBuilder_ = null;
            water_ = other.water_;
            bitField0_ = (bitField0_ & ~0x00000001);
            waterBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getWaterFieldBuilder() : null;
          } else {
            waterBuilder_.addAllMessages(other.water_);
          }
        }
      }
      if (electricityBuilder_ == null) {
        if (!other.electricity_.isEmpty()) {
          if (electricity_.isEmpty()) {
            electricity_ = other.electricity_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureElectricityIsMutable();
            electricity_.addAll(other.electricity_);
          }
          onChanged();
        }
      } else {
        if (!other.electricity_.isEmpty()) {
          if (electricityBuilder_.isEmpty()) {
            electricityBuilder_.dispose();
            electricityBuilder_ = null;
            electricity_ = other.electricity_;
            bitField0_ = (bitField0_ & ~0x00000002);
            electricityBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getElectricityFieldBuilder() : null;
          } else {
            electricityBuilder_.addAllMessages(other.electricity_);
          }
        }
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
      ListUsage parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (ListUsage) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<WaterUsage> water_ =
      java.util.Collections.emptyList();
    private void ensureWaterIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        water_ = new java.util.ArrayList<WaterUsage>(water_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        WaterUsage, WaterUsage.Builder, WaterUsageOrBuilder> waterBuilder_;

    /**
     * <code>repeated .WaterUsage water = 1;</code>
     */
    public java.util.List<WaterUsage> getWaterList() {
      if (waterBuilder_ == null) {
        return java.util.Collections.unmodifiableList(water_);
      } else {
        return waterBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .WaterUsage water = 1;</code>
     */
    public int getWaterCount() {
      if (waterBuilder_ == null) {
        return water_.size();
      } else {
        return waterBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .WaterUsage water = 1;</code>
     */
    public WaterUsage getWater(int index) {
      if (waterBuilder_ == null) {
        return water_.get(index);
      } else {
        return waterBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .WaterUsage water = 1;</code>
     */
    public Builder setWater(
        int index, WaterUsage value) {
      if (waterBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureWaterIsMutable();
        water_.set(index, value);
        onChanged();
      } else {
        waterBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .WaterUsage water = 1;</code>
     */
    public Builder setWater(
        int index, WaterUsage.Builder builderForValue) {
      if (waterBuilder_ == null) {
        ensureWaterIsMutable();
        water_.set(index, builderForValue.build());
        onChanged();
      } else {
        waterBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .WaterUsage water = 1;</code>
     */
    public Builder addWater(WaterUsage value) {
      if (waterBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureWaterIsMutable();
        water_.add(value);
        onChanged();
      } else {
        waterBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .WaterUsage water = 1;</code>
     */
    public Builder addWater(
        int index, WaterUsage value) {
      if (waterBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureWaterIsMutable();
        water_.add(index, value);
        onChanged();
      } else {
        waterBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .WaterUsage water = 1;</code>
     */
    public Builder addWater(
        WaterUsage.Builder builderForValue) {
      if (waterBuilder_ == null) {
        ensureWaterIsMutable();
        water_.add(builderForValue.build());
        onChanged();
      } else {
        waterBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .WaterUsage water = 1;</code>
     */
    public Builder addWater(
        int index, WaterUsage.Builder builderForValue) {
      if (waterBuilder_ == null) {
        ensureWaterIsMutable();
        water_.add(index, builderForValue.build());
        onChanged();
      } else {
        waterBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .WaterUsage water = 1;</code>
     */
    public Builder addAllWater(
        java.lang.Iterable<? extends WaterUsage> values) {
      if (waterBuilder_ == null) {
        ensureWaterIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, water_);
        onChanged();
      } else {
        waterBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .WaterUsage water = 1;</code>
     */
    public Builder clearWater() {
      if (waterBuilder_ == null) {
        water_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        waterBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .WaterUsage water = 1;</code>
     */
    public Builder removeWater(int index) {
      if (waterBuilder_ == null) {
        ensureWaterIsMutable();
        water_.remove(index);
        onChanged();
      } else {
        waterBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .WaterUsage water = 1;</code>
     */
    public WaterUsage.Builder getWaterBuilder(
        int index) {
      return getWaterFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .WaterUsage water = 1;</code>
     */
    public WaterUsageOrBuilder getWaterOrBuilder(
        int index) {
      if (waterBuilder_ == null) {
        return water_.get(index);  } else {
        return waterBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .WaterUsage water = 1;</code>
     */
    public java.util.List<? extends WaterUsageOrBuilder> 
         getWaterOrBuilderList() {
      if (waterBuilder_ != null) {
        return waterBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(water_);
      }
    }
    /**
     * <code>repeated .WaterUsage water = 1;</code>
     */
    public WaterUsage.Builder addWaterBuilder() {
      return getWaterFieldBuilder().addBuilder(
          WaterUsage.getDefaultInstance());
    }
    /**
     * <code>repeated .WaterUsage water = 1;</code>
     */
    public WaterUsage.Builder addWaterBuilder(
        int index) {
      return getWaterFieldBuilder().addBuilder(
          index, WaterUsage.getDefaultInstance());
    }
    /**
     * <code>repeated .WaterUsage water = 1;</code>
     */
    public java.util.List<WaterUsage.Builder> 
         getWaterBuilderList() {
      return getWaterFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        WaterUsage, WaterUsage.Builder, WaterUsageOrBuilder> 
        getWaterFieldBuilder() {
      if (waterBuilder_ == null) {
        waterBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            WaterUsage, WaterUsage.Builder, WaterUsageOrBuilder>(
                water_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        water_ = null;
      }
      return waterBuilder_;
    }

    private java.util.List<ElectricityUsage> electricity_ =
      java.util.Collections.emptyList();
    private void ensureElectricityIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        electricity_ = new java.util.ArrayList<ElectricityUsage>(electricity_);
        bitField0_ |= 0x00000002;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        ElectricityUsage, ElectricityUsage.Builder, ElectricityUsageOrBuilder> electricityBuilder_;

    /**
     * <code>repeated .ElectricityUsage electricity = 2;</code>
     */
    public java.util.List<ElectricityUsage> getElectricityList() {
      if (electricityBuilder_ == null) {
        return java.util.Collections.unmodifiableList(electricity_);
      } else {
        return electricityBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .ElectricityUsage electricity = 2;</code>
     */
    public int getElectricityCount() {
      if (electricityBuilder_ == null) {
        return electricity_.size();
      } else {
        return electricityBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .ElectricityUsage electricity = 2;</code>
     */
    public ElectricityUsage getElectricity(int index) {
      if (electricityBuilder_ == null) {
        return electricity_.get(index);
      } else {
        return electricityBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .ElectricityUsage electricity = 2;</code>
     */
    public Builder setElectricity(
        int index, ElectricityUsage value) {
      if (electricityBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureElectricityIsMutable();
        electricity_.set(index, value);
        onChanged();
      } else {
        electricityBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .ElectricityUsage electricity = 2;</code>
     */
    public Builder setElectricity(
        int index, ElectricityUsage.Builder builderForValue) {
      if (electricityBuilder_ == null) {
        ensureElectricityIsMutable();
        electricity_.set(index, builderForValue.build());
        onChanged();
      } else {
        electricityBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .ElectricityUsage electricity = 2;</code>
     */
    public Builder addElectricity(ElectricityUsage value) {
      if (electricityBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureElectricityIsMutable();
        electricity_.add(value);
        onChanged();
      } else {
        electricityBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .ElectricityUsage electricity = 2;</code>
     */
    public Builder addElectricity(
        int index, ElectricityUsage value) {
      if (electricityBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureElectricityIsMutable();
        electricity_.add(index, value);
        onChanged();
      } else {
        electricityBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .ElectricityUsage electricity = 2;</code>
     */
    public Builder addElectricity(
        ElectricityUsage.Builder builderForValue) {
      if (electricityBuilder_ == null) {
        ensureElectricityIsMutable();
        electricity_.add(builderForValue.build());
        onChanged();
      } else {
        electricityBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .ElectricityUsage electricity = 2;</code>
     */
    public Builder addElectricity(
        int index, ElectricityUsage.Builder builderForValue) {
      if (electricityBuilder_ == null) {
        ensureElectricityIsMutable();
        electricity_.add(index, builderForValue.build());
        onChanged();
      } else {
        electricityBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .ElectricityUsage electricity = 2;</code>
     */
    public Builder addAllElectricity(
        java.lang.Iterable<? extends ElectricityUsage> values) {
      if (electricityBuilder_ == null) {
        ensureElectricityIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, electricity_);
        onChanged();
      } else {
        electricityBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .ElectricityUsage electricity = 2;</code>
     */
    public Builder clearElectricity() {
      if (electricityBuilder_ == null) {
        electricity_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        electricityBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .ElectricityUsage electricity = 2;</code>
     */
    public Builder removeElectricity(int index) {
      if (electricityBuilder_ == null) {
        ensureElectricityIsMutable();
        electricity_.remove(index);
        onChanged();
      } else {
        electricityBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .ElectricityUsage electricity = 2;</code>
     */
    public ElectricityUsage.Builder getElectricityBuilder(
        int index) {
      return getElectricityFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .ElectricityUsage electricity = 2;</code>
     */
    public ElectricityUsageOrBuilder getElectricityOrBuilder(
        int index) {
      if (electricityBuilder_ == null) {
        return electricity_.get(index);  } else {
        return electricityBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .ElectricityUsage electricity = 2;</code>
     */
    public java.util.List<? extends ElectricityUsageOrBuilder> 
         getElectricityOrBuilderList() {
      if (electricityBuilder_ != null) {
        return electricityBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(electricity_);
      }
    }
    /**
     * <code>repeated .ElectricityUsage electricity = 2;</code>
     */
    public ElectricityUsage.Builder addElectricityBuilder() {
      return getElectricityFieldBuilder().addBuilder(
          ElectricityUsage.getDefaultInstance());
    }
    /**
     * <code>repeated .ElectricityUsage electricity = 2;</code>
     */
    public ElectricityUsage.Builder addElectricityBuilder(
        int index) {
      return getElectricityFieldBuilder().addBuilder(
          index, ElectricityUsage.getDefaultInstance());
    }
    /**
     * <code>repeated .ElectricityUsage electricity = 2;</code>
     */
    public java.util.List<ElectricityUsage.Builder> 
         getElectricityBuilderList() {
      return getElectricityFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        ElectricityUsage, ElectricityUsage.Builder, ElectricityUsageOrBuilder> 
        getElectricityFieldBuilder() {
      if (electricityBuilder_ == null) {
        electricityBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            ElectricityUsage, ElectricityUsage.Builder, ElectricityUsageOrBuilder>(
                electricity_,
                ((bitField0_ & 0x00000002) != 0),
                getParentForChildren(),
                isClean());
        electricity_ = null;
      }
      return electricityBuilder_;
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


    // @@protoc_insertion_point(builder_scope:ListUsage)
  }

  // @@protoc_insertion_point(class_scope:ListUsage)
  private static final ListUsage DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ListUsage();
  }

  public static ListUsage getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListUsage>
      PARSER = new com.google.protobuf.AbstractParser<ListUsage>() {
    @java.lang.Override
    public ListUsage parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ListUsage(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ListUsage> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListUsage> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public ListUsage getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

