package com.example.kafkaorderservice.DTO;

public class OrderEvent {

    private String orderId;
    private String product;
    private double price;

    // Default constructor (REQUIRED for deserialization)
    public OrderEvent() {
    }

    // Parameterized constructor (optional but useful)
    public OrderEvent(String orderId, String product, double price) {
        this.orderId = orderId;
        this.product = product;
        this.price = price;
    }

    // Getters and Setters
    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
