package com.kodilla.good.patterns.food2Door;

public class OrderRequest {
    private String provider;
    private int quantity;
    private String productType;

    public OrderRequest(String provider, int quantity, String productType) {
        this.provider = provider;
        this.quantity = quantity;
        this.productType = productType;
    }

    public String getProvider() {
        return provider;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getProductType() {
        return productType;
    }
}
