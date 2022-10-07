package org.example;

import java.util.HashMap;
import java.util.Map;

public class ProductRepo {
//    private List<Product> products;
    private HashMap<String, Product> products;

    public ProductRepo(HashMap<String, Product> products) {
        this.products = products;
    }

    public void getProductlist(HashMap<String, Product> products){
        for (Map.Entry<String, Product> entry : products.entrySet()) {
            System.out.println("List of products: " + entry.getKey() + " " + entry.getValue());
        }
    }

    public Product getProductById(int id){
        for (Map.Entry<String, Product> entry : products.entrySet()) {
            int productId = entry.getValue().getId();
            if (id == productId) {
                return entry.getValue();
            }
        }
        throw new RuntimeException("Produkt mit id: " + id + " wurde nicht gefunden");
    }

}
