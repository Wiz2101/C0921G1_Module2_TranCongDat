package bai3_mang_va_phuong_thuc.bai_tap;


public class TinhTongDuongCheoMatrix {
    public static void main(String[] args) {
        int [][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        for (int i=0; i<matrix.length; i++){
            for (int j=0; j<matrix[i].length; j++){
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
        int sum = 0;
        for (int i=0; i<matrix.length; i++){
            for (int j=0; j<matrix.length; j++){
                if (i == j){
                    sum += matrix [i][j];
                }
            }
        }
        System.out.print("Tổng các phần thử hàng chéo từ trái sang phải: " + sum);

//        int sum1 = 0;
//        for (int i=0; i<matrix.length; i++){
//            for (int j=2; j>=0;j--){
//                sum1 += matrix[i][j];
//                break;
//            }
//        }
//        System.out.println();
//        System.out.print("Tổng các phần thử hàng chéo từ phải sang trái: " + sum1);
    }
}
