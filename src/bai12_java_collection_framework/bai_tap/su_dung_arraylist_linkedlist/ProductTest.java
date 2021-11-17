package bai12_java_collection_framework.bai_tap.su_dung_arraylist_linkedlist;

import java.util.ArrayList;

public class ProductTest {

    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();
        Product product1 = new Product(1,"RK G68",870000);
        Product product2 = new Product(2,"FL680",1450000);
        Product product3 = new Product(3,"FK68",900000);
        productManager.addProduct(product1);
        productManager.addProduct(product2);
        productManager.addProduct(product3);

        Product product4 = new Product(3,"NJ68",2550000);
        productManager.updateProduct(product4);



        productManager.displayProduct();

        productManager.editProduct();

        productManager.displayProduct();

        productManager.removeProduct();

        productManager.displayProduct();

        productManager.findProduct();

        productManager.sortProductName();
    }

}
