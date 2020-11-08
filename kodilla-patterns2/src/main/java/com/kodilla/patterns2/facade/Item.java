package com.kodilla.patterns2.facade;

public class Item {
    private final Long productId;
    private final double qtt;

    public Item(Long productId, double qtt) {
        this.productId = productId;
        this.qtt = qtt;
    }

    public Long getProductId() {
        return productId;
    }

    public double getQtt() {
        return qtt;
    }

}
