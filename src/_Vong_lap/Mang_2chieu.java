package _Vong_lap;

import java.util.Scanner;

public class Mang_2chieu {
    public static void main(String[] args) {
        // Tao mang

        int[][] array = new int[4][3];
        int [][] array2 = {
                {1,2,3},
                {4,5,6},
                {8,9,10}
        };
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < array2.length; i++){
            for(int j = 0; j < array2[0].length; j++){
                System.out.printf(array2[i][j] + " ");
            }
            System.out.println();
        }
        // tạo for nhanh : fori+tab

        // Vong lap for each
        for(int [] x : array2){  // tao mang 1 chieu chua cac hang cua array
            for(int y : x){      // truy cap cac mang 1 chieu x trong array
                System.out.printf(y + " ");
            }
            System.out.println();
        }

        // Mang ziczac số phần tử các hàng khác nhau
        int[][] arr = new int [10][];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new int [i+1]; // gán mỗi hang i là 1 mảng 1 chiều có i + 1 phần tử
            for(int j= 0; j < arr[i].length; j++){ // Chay vong j toi do dai cua vong do
                arr[i][j] = 5;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++){
                System.out.printf(arr[i][j] + " ");
            }
            System.out.println();
        }


    }
}
