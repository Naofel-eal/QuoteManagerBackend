package com.quotemanager.api.enumeration;

public enum ClientType {
    Mr("Mr"),
    Mrs("Mrs"),
    Company("Company");

    private final String clientType;

    ClientType(String clientType) {
        this.clientType = clientType;
    }

    public String getClientType() {
        return this.clientType;
    }
}
