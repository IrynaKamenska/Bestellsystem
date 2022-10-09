package org.example;

import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class OrderRepoTest {
    HashMap<Integer, Product> productList = new HashMap<>();


    public OrderRepoTest() {
        Product product1 = new Product(1, "Mehl");
        Product product2 = new Product(2, "Zucker");
        Product product3 = new Product(3, "Salz");
        Product product4 = new Product(4, "Wasser");

        this.productList.put(product1.getId(), product1);
        this.productList.put(product2.getId(), product2);
        this.productList.put(product3.getId(), product3);
        this.productList.put(product4.getId(), product4);
    }

    @Test
    void getOrderListTest() {
        //given
        HashMap<Integer, Order> orderList = new HashMap<>();
        Order order1 = new Order(1, productList);
        orderList.put(order1.getId(), order1);
        OrderRepo orderRepo = new OrderRepo(orderList);

        //when
        HashMap<Integer, Order> actual = orderRepo.getOrderList();
        HashMap<Integer, Order> expected = orderList;

        //then
        assertEquals(expected, actual);
    }

    @Test
    void getOrderByIdTest() {
        //given
        HashMap<Integer, Order> orderList = new HashMap<>();
        Order order1 = new Order(1, productList);
        orderList.put(order1.getId(), order1);
        OrderRepo orderRepo = new OrderRepo(orderList);

        //when
        HashMap<Integer, Order> actual = orderRepo.getOrderList();
        HashMap<Integer, Order> expected = orderList;

        //then
        assertEquals(expected, actual);
    }

    @Test
    void addOrderToOrderRepoTest() {
        Order order = new Order(10, productList);

        HashMap<Integer, Order> orderList = new HashMap<>();
        OrderRepo orderRepo = new OrderRepo(orderList);

        orderRepo.addOrderToOrderRepo(order.getId(), order);

        Order returned = orderRepo.getOrderById(10);
        assertEquals(returned, order);
    }

    @Test
    void testToString() {
        //given
        Order order = new Order(1, productList);
        HashMap<Integer, Order> orderList = new HashMap<>();
        OrderRepo orderRepo = new OrderRepo(orderList);
        orderRepo.addOrderToOrderRepo(order.getId(), order);

        //when
        String actual = orderRepo.toString();
        String expected = "Order{id=1, products=Product{id=1, product='Mehl'},Product{id=2, product='Zucker'},Product{id=3, product='Salz'},Product{id=4, product='Wasser'}}\n";

        //then
        assertEquals(expected, actual);
    }
}