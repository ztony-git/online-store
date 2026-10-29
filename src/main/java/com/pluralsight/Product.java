package com.pluralsight;

public class Product {
    private String id;
    private String productName;
    private double price;
    private String department;

    public Product(String id, String productName, double price, String department) {
        this.id = id;
        this.productName = productName;
        this.price = price;
        this.department = department;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
