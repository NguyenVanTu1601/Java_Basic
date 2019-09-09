package _Vong_lap;

import java.util.Scanner;

public class Mang_1chieu {
    public static void main(String[] args) {
        //int arr[] = {1,2,3,4};
        //for(int i = 0; i < arr.length; i++) System.out.println(arr[i]);

        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[10]; // 10 la kich thuoc mang
        int[] b = arr;
        for (int i = 0; i < 5; i++) {
            arr[i] = scanner.nextInt();
        }
        for (int i = 0; i < 5; i++) {
            System.out.printf("%d ", b[i]);
        }
        System.out.printf("\n");

        // Vong for each :
        // for( kieu tenphantu(tuy y) : ten mang ){
        //      Do thing with tenphantu
        // }
        for(int array : arr){
            System.out.print(array + " ");
        }

        // For each with String
        String Names = "Nguyen Van Tu";
        String[] name = Names.split(" ");
        for(String mname : name){
            System.out.println(mname);
        }

    }
}
