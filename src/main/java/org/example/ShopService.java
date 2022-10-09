package org.example;

import java.util.HashMap;

public class ShopService {
    private ProductRepo productRepo;
    private OrderRepo orderRepo;

    public ShopService(ProductRepo productRepo, OrderRepo orderRepo) {
        this.productRepo = productRepo;
        this.orderRepo = orderRepo;
    }

    public Product getProduct(int id){
       return productRepo.getProductById(id);
    }

    public Order getOrder(int id) {
        return orderRepo.getOrderById(id);
    }

    public HashMap<Integer, Product> listProducts() {
        return productRepo.getProductlist();
    }

    public HashMap<Integer, Order> listOrders() {
        return orderRepo.getOrderList();
    }

    public void addOrder(Integer id, Order order) {
       orderRepo.addOrderToOrderRepo(id, order);
    }
}