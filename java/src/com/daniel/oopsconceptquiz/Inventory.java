package com.daniel.oopsconceptquiz;

import java.util.ArrayList;

public class Inventory {
    ArrayList<Product> productList;

    public Inventory() {
        this.productList = new ArrayList<Product>();
    }

    public void addProduct(Product p){
        productList.add(p);
    }

    public void removeProduct(Product p){
        productList.remove(p);
    }

    public void showDetails(Product p){
       p.showProductDetails();
    }


}
