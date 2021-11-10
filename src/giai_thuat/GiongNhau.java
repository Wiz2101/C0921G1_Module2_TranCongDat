package giai_thuat;

public class GiongNhau {
    int findArrayInArray(int[] parent, int[] child) {

        int size = parent.length;
        for (int i = 0; i < child.length; i++) {
            int count = 0;
            for (int j = 0; j < parent.length; j++) {
                if (child[i] == parent[j]) {
                    count++;
                }
            }
            if (count < size){
                size = count;
            }
        }
        return size;
    }

    public static void main(String[] args) {
        int[] parent ={1,4,5,2,3,2,3,6};
        int[] child = {1,2,3};
        GiongNhau giongNhau = new GiongNhau();
        System.out.println(giongNhau.findArrayInArray(parent, child));

    }

}
