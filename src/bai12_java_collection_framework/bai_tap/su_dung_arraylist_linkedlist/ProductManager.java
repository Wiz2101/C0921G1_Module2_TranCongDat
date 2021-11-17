package bai12_java_collection_framework.bai_tap.su_dung_arraylist_linkedlist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ProductManager {
    Scanner scanner = new Scanner(System.in);
    private List<Product> productList;

    public ProductManager() {
        productList = new ArrayList<>(); //Khởi tạo đối tượng ~ List<Product> productList = new ArrayList<>()
    }

    public ProductManager(List<Product> productList) {
        this.productList = productList;
    }

    public void addProduct(Product product){
        productList.add(product);
    }

    public void updateProduct(Product product){
        int index = productList.indexOf(product); //Gán vị trí đối tượng

        if (index == -1){
            //Nếu index = -1 thì product không tồn tại trong collection
            //Thông báo lỗi về người dùng
            //Hoặc chuyển qua chế độ thêm mới
            addProduct(product);
        } else {
            //Update
            productList.set(index,product);
        }
    }





    public void editProduct(){
        System.out.println("Nhập id sản phẩm muốn edit");
        int id = scanner.nextInt();
        for (int i = 0; i < productList.size() ; i++) {
            if(productList.get(i).getId() == id){
                System.out.println("Nhập tên cần chỉnh sửa: ");
                scanner.skip("\\R");
                String name = scanner.nextLine();
                productList.get(i).setName(name);
                System.out.println("Nhập giá cần chỉnh sửa: ");
                int price = Integer.parseInt(scanner.nextLine());
                productList.get(i).setPrice(price);
            }
        }
    }

    public void removeProduct(){
        System.out.println("Nhập id sản phẩm muốn xóa");
        int id = scanner.nextInt();
        for (int i = 0; i < productList.size() ; i++) {
            if(productList.get(i).getId() == id){
                productList.remove(i);
            }
        }
    }

    public void displayProduct(){
        System.out.println("Danh sách sản phẩm: ");
        for (Product product:productList) {
            System.out.println(product);
        }
    }

    public void findProduct(){
        System.out.println("Nhập id sản phẩm cần tìm kiếm");
        int id = scanner.nextInt();
        for (int i = 0; i < productList.size(); i++) {
            if(productList.get(i).getId() == id){
                System.out.println(productList.get(i));
            }
        }
    }

    public void sortProductName(){
        Collections.sort(productList);
        System.out.println("Danh sách sản phẩm sắp xếp theo tên: ");
        for (Product product:productList) {
            System.out.println(product);
        }
    }
}
