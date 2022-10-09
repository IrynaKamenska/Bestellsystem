package org.example;

import java.util.HashMap;

public class ProductRepo {
    private HashMap<Integer, Product> products;

    public ProductRepo(HashMap<Integer, Product> products) {
        this.products = products;
    }

    public HashMap<Integer, Product> getProductlist() {
        return products;
    }

    public Product getProductById(int id) {
        Product found = this.products.get(id);
        if (found == null) {
            throw new RuntimeException("Produkt mit id: " + id + " wurde nicht gefunden");
        }
        return found;

//        for (Map.Entry<String, Product> entry : products.entrySet()) {
//            int productId = entry.getValue().getId();
//            if (id == productId) {
//                return entry.getValue();
//            }
//        }
//
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Product product : products.values()) {
            sb.append(product.toString() + "\n");
        }
        return sb.toString();
    }
}
