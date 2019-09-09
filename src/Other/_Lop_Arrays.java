package Other;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class _Lop_Arrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[]{1,5,15,23,8,6,4,12,8,9,27,13};
        // In danh sach phan tu dang String
        String res = Arrays.toString(arr);
        System.out.println(res);
        String [] name = new String[]{"Tu", "Tung" , "Trung" , "Viet", "Nam"};

        //Sap xep tang dung cho ca int + String ...
        Arrays.sort(arr);
        for(int i : arr){
            System.out.printf(i + " ");
        }
        System.out.printf("\n");

        // Sap xep giam chi dung cho lop String
        Arrays.sort(name, Collections.reverseOrder());
        for(String i : name){
            System.out.printf(i + " ");
        }
        System.out.printf("\n");

        // Sap xep giam cho int
        //Khai bao
        Integer [] array = new Integer[] {1,5,15,23,8,6,4,12,8,9,27,13};
        Arrays.sort(array, Collections.reverseOrder());
        for(int i : array){
            System.out.printf(i + " ");
        }
        System.out.printf("\n");

        //Tìm kiếm
        // Tim toan bo
        int index = Arrays.binarySearch(arr,27); // >= 0 la vi tri , < 0 la ko ton tai
        System.out.println(index);
        // Tim tu 1 vi tri nao do
        int vt = Arrays.binarySearch(arr,4,arr.length, 15);
        System.out.println(vt);

        // Coppy
        String [] name2 = Arrays.copyOf(name,name.length); // (name , 2) _ coppy 2 vị tri
        System.out.printf("name2 = " + Arrays.toString(name2));
        System.out.println();

        // So sanh
        System.out.println("name2 co bang name hay khong? " + Arrays.equals(name,name2));

        // Điền tất cả mảng = 1 số
        int [] myArray = new int[10];
        Arrays.fill(myArray, 5);
        for(int i = 0; i < 3; i++) System.out.printf(myArray[i] + " ");
    }
}
