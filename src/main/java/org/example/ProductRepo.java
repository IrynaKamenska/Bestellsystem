package org.example;

import java.util.HashMap;
import java.util.Map;

public class ProductRepo {
//    private List<Product> products;
    private HashMap<String, Product> products;

    public ProductRepo(HashMap<String, Product> products) {
        this.products = products;
    }

    public HashMap<String, Product> getProductlist(){
        return products;
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

//    @Override
//    public String toString() {
//        return "ProductRepo{" +
//                "products=" + products +
//                '}';
//    }
@Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Product product : products.values()) {
            sb.append(product.toString() + "\n");
        }
        return sb.toString();
    }
}
