package org.example;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product(1, "mehl");
        Product product2= new Product(2, "zucker");

        HashMap<String, Product> map = new HashMap<>();
        map.put("001A", product1);
        map.put("002B", product2);
        ProductRepo productRepo = new ProductRepo(map);
        productRepo.getProductlist(map);
        System.out.println(productRepo.getProductById(2));

    }
}