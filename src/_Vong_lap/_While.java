package _Vong_lap;

import java.util.Scanner;

public class _While {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        while (i < 10) {
            System.out.println("i = " + i);
            i++;
        }
        // i = 10;
        do {
            // luôn in ra 1 lần trước r mới ktra điều kiện while
            System.out.println("Hello");
            i--;
        } while (i != 0);
    }
}
