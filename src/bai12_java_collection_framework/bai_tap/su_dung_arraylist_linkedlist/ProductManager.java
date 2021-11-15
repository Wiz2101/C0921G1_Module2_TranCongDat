package bai12_java_collection_framework.bai_tap.su_dung_arraylist_linkedlist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ProductManager {
    Scanner scanner = new Scanner(System.in);
    ArrayList<Product> productArrayList = new ArrayList<>();

    public void addProduct(Product product){
        productArrayList.add(product);
    }

    public void editProduct(){
        System.out.println("Nhập id sản phẩm muốn edit");
        int id = scanner.nextInt();
        for (int i = 0; i < productArrayList.size() ; i++) {
            if(productArrayList.get(i).getId() == id){
                System.out.println("Nhập tên cần chỉnh sửa: ");
                scanner.skip("\\R");
                String name = scanner.nextLine();
                productArrayList.get(i).setName(name);
                System.out.println("Nhập giá cần chỉnh sửa: ");
                int price = Integer.parseInt(scanner.nextLine());
                productArrayList.get(i).setPrice(price);
            }
        }
    }

    public void removeProduct(){
        System.out.println("Nhập id sản phẩm muốn xóa");
        int id = scanner.nextInt();
        for (int i = 0; i < productArrayList.size() ; i++) {
            if(productArrayList.get(i).getId() == id){
                productArrayList.remove(i);
            }
        }
    }

    public void displayProduct(){
        System.out.println("Danh sách sản phẩm: ");
        for (Product product:productArrayList) {
            System.out.println(product);
        }
    }

    public void findProduct(){
        System.out.println("Nhập id sản phẩm cần tìm kiếm");
        int id = scanner.nextInt();
        for (int i = 0; i < productArrayList.size(); i++) {
            if(productArrayList.get(i).getId() == id){
                System.out.println(productArrayList.get(i));
            }
        }
    }

    public void sortProductName(){
        Collections.sort(productArrayList);
        System.out.println("Danh sách sản phẩm sắp xếp theo tên: ");
        for (Product product:productArrayList) {
            System.out.println(product);
        }
    }
}
