package bai12_java_collection_framework.bai_tap.su_dung_arraylist_linkedlist;

import java.util.ArrayList;

public class ProductTest {
    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();
        productManager.addProduct(new Product(1,"RK G68",870000));
        productManager.addProduct(new Product(2,"FL680",1450000));
        productManager.addProduct(new Product(3,"FK68",900000));

        productManager.displayProduct();

        productManager.editProduct();

        productManager.displayProduct();

        productManager.removeProduct();

        productManager.displayProduct();

        productManager.findProduct();

        productManager.sortProductName();
    }
}
