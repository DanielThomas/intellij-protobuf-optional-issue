package com.github.danielthomas.protobuftest;

import com.google.protobuf.Message;

public class FakeMessage extends com.google.protobuf.GeneratedMessageV3 {
    public Object getNullable() {
        // the 'null' here will report "'null' is returned by the method declared as @NotNull"
        return null;
    }

    @Override
    protected FieldAccessorTable internalGetFieldAccessorTable() {
        return null;
    }

    @Override
    protected Message.Builder newBuilderForType(BuilderParent builderParent) {
        return null;
    }

    @Override
    public Message.Builder newBuilderForType() {
        return null;
    }

    @Override
    public Message.Builder toBuilder() {
        return null;
    }

    @Override
    public Message getDefaultInstanceForType() {
        return new FakeMessage();
    }
}