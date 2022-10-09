package org.example;

import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

class ProductRepoTest {

    @Test
    void getProductlistTest() {
        //given
        Product product1 = new Product(1, "mehl");
        Product product2 = new Product(2, "zucker");
        HashMap<Integer, Product> productList = new HashMap<>();
        productList.put(product1.getId(), product1);
        productList.put(product2.getId(), product2);

        ProductRepo productRepo = new ProductRepo(productList);

        //when
        HashMap<Integer, Product> actual = productRepo.getProductlist();
        HashMap<Integer, Product> expected = productList;

        //then
        assertEquals(expected, actual);
    }

    @Test
    void getProductById() {
        //given
        Product product1 = new Product(1, "mehl");
        Product product2 = new Product(2, "zucker");
        HashMap<Integer, Product> productList = new HashMap<>();
        productList.put(product1.getId(), product1);
        productList.put(product2.getId(), product2);

        ProductRepo productRepo = new ProductRepo(productList);

        //when
        Product actual = productRepo.getProductById(1);
        Product expected = product1;

        //then
        assertEquals(expected, actual);
      }

    @Test
    void getProductByNonExistedID() {
        //given
        Product product1 = new Product(1, "mehl");
        Product product2 = new Product(2, "zucker");
        HashMap<Integer, Product> productList = new HashMap<>();
        productList.put(product1.getId(), product1);
        productList.put(product2.getId(), product2);

        ProductRepo productRepo = new ProductRepo(productList);

        //then
        try {
            productRepo.getProductById(0);
            fail("Exception ist nicht aufgetreten");
        } catch (Exception e) {
            System.out.println("Exception ist aufgetreten");
        }
    }

    @Test
    void getAllProductsString() {
        Product product1 = new Product(1, "mehl");
        Product product2 = new Product(2, "zucker");
        HashMap<Integer, Product> productList = new HashMap<>();
        productList.put(product1.getId(), product1);
        productList.put(product2.getId(), product2);

        ProductRepo productRepo = new ProductRepo(productList);

        //when
        String actual = productRepo.toString();
        String expected = "Product{id=1, product='mehl'}\nProduct{id=2, product='zucker'}\n";

        //then
        assertEquals(expected, actual);
    }

}