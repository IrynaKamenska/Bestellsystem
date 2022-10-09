package org.example;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // HashMap to store all the products with id and name
        HashMap<Integer, Product> productList = new HashMap<>();

        // Create new products
        Product product1 = new Product(1, "Mehl");
        Product product2 = new Product(2, "Zucker");
        Product product3 = new Product(3, "Salz");
        Product product4 = new Product(4, "Wasser");

        // Add products to the product list
        productList.put(product1.getId(), product1);
        productList.put(product2.getId(), product2);
        productList.put(product3.getId(), product3);
        productList.put(product4.getId(), product4);

        // Create product repo and print the product list
        ProductRepo productRepo = new ProductRepo(productList);
        System.out.println("ProductRepo:\n" + productRepo);

        //Create orders
        Order order1 = new Order(1, productList);
        Order order2 = new Order(2, productList);
        Order order5 = new Order(5, productList);
        HashMap<Integer, Order> ordersMap = new HashMap<>();
        ordersMap.put(order1.getId(), order1);
        ordersMap.put(order2.getId(), order2);

        // Create order Repo
        OrderRepo orderRepo = new OrderRepo(ordersMap);
        System.out.println("OrderRepo:\n" + orderRepo.toString());

        // Create Service shop
        ShopService service = new ShopService(productRepo, orderRepo);

        System.out.println("Serviceaufruf - Produkt 2 ist:\n" + service.getProduct(2).toString()+ "\n");
        System.out.println("Serviceaufruf - Produkt Liste ist:\n" + service.listProducts() + "\n");
        System.out.println("Bestellung 1 ist:\n" + service.getOrder(1).toString()+ "\n");
        System.out.println("Serviceaufruf - Bestellungsliste updated:\n" + service.listOrders()+ "\n");

        service.addOrder(order5.getId(), order5);

        System.out.println(service.getOrder(5).toString());
        System.out.println("Serviceaufruf - Bestellungsliste updated:\n" + service.listOrders()+ "\n");
    }
}