package bai17_io_binary_file_and_serialization.bai_tap.quan_li_san_pham_luu_file_nhi_phan;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ProductService productService = new ProductService();
        Scanner scanner = new Scanner(System.in);
        int choice;
        do{
            System.out.println("=======PRODUCT MANAGEMENT=======");
            System.out.println("1. Create a Product\n" +
                    "2. Display All Products\n" +
                    "3. Search the Product\n" +
                    "4. Write file Binary\n" +
                    "5. Write file CSV\n" +
                    "6. Read file Binary\n" +
                    "7. Exit");
            System.out.println("Please enter your choice: ");
            choice = scanner.nextInt();
            switch (choice){
                case 1:
                    productService.addProduct();
                    break;
                case 2:
                    productService.displayProduct();
                    break;
                case 3:
                    productService.searchProduct();
                    break;
                case 4:
                    productService.writeFile();
                    break;
                case 5:
                    productService.writeFileCSV();
                    break;
                case 6:
                    try {
                        productService.readFile();
                    }catch (FileNotFoundException e){
                        e.printStackTrace();
                    }
                    break;
                case 7:
                    break;
                default:
                    System.out.println("Please choose the number from 1-5");
            }
        }while (choice != 7);
    }
}
