package _Vong_lap;

import java.util.Scanner;

public class Switch_case {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so x :");
        int x = scanner.nextInt();
        switch (x){
            case 1 :
            {
                System.out.println("x = 1");
                break;
            }
            case 2 :
            {
                System.out.println("x = 2");
                break;

            }
            case 3:
            {
                System.out.println("x = 3");
                break;
            }
            default:
            {
                System.out.println("Khong ton tai x");
                break;
            }
        }
    }
}
