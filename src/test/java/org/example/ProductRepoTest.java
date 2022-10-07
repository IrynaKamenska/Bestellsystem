package org.example;

import org.junit.jupiter.api.Test;

import java.util.HashMap;

class ProductRepoTest {

    @Test
    void getProductlistTest() {
        //given
        Product product1 = new Product(1, "mehl");
        Product product2 = new Product(2, "zucker");

        HashMap<String, Product> map = new HashMap<>();
        map.put("001A", product1);
        map.put("002B", product2);

        //when
        ProductRepo productRepo = new ProductRepo(map);


        //then
    }

    @Test
    void getProductById() {

    }
}