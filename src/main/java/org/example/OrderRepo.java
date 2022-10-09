package org.example;

import java.util.HashMap;

public class OrderRepo {

    private HashMap<Integer, Order> orders;

    public OrderRepo(HashMap<Integer, Order> orders) {
        this.orders = orders;
    }

    public HashMap<Integer, Order> getOrderList() {
        return orders;
    }

    public Order getOrderById(int id) {
        Order found = this.orders.get(id);
        if (found == null) {
            throw new RuntimeException("Order mit id: " + id + " wurde nicht gefunden");
        }
        return found;

//        for (Map.Entry<Integer, Order> entry : orders.entrySet()) {
//            int orderId = entry.getValue().getId();
//            if (id == orderId) {
//                return entry.getValue();
//            }
//        }
//
    }

    public boolean addOrderToOrderRepo(Integer id, Order order) {
        orders.put(id, order);
        return true;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Order order : orders.values()) {
            sb.append(order.toString() + "\n");
        }
        return sb.toString();
    }
}
