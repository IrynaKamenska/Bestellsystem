package org.example;

import java.util.HashMap;

public class Order {
    private int id;
    private HashMap<Integer, Product> products;

    public Order(int id, HashMap<Integer, Product> products) {
        this.id = id;
        this.products = products;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public HashMap<Integer, Product> getProducts() {
        return products;
    }

    public void setProducts(HashMap<Integer, Product> products) {
        this.products = products;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        String delimiter = "";
        for (Product product : this.products.values()) {
            sb.append(delimiter);
            delimiter = ",";
            sb.append(product.toString());
        }


        return "Order{" +
                "id=" + id +
                ", products=" + sb +
                '}';
    }
}

