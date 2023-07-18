package com.daniel.oopsconceptquiz;

public class Product {
    private String name;
    private String description;
    private int quantity;
    private double price;

    public Product(String name, String description, int quantity, double price) {
        this.name = name;
        this.description = description;
        this.quantity = quantity;
        this.price = price;
    }

    public void showProductDetails() {
        System.out.println("Product Name: " + getName());
        System.out.println("Product Description: " + getDescription());
        System.out.println("Product Quantity: " + getQuantity() + " units");
        System.out.println("Product Price: " + "$" +getPrice() + " per unit");
        checkLowInventory();
    }


    public void checkLowInventory() {
        if(getQuantity() <= 2) {
            System.out.println("Almost out of stock");
        }
        else if(getQuantity() == 0) {
            System.out.println("Out of stock");
        }
        else {
            System.out.println("Enough inventory in stock");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
