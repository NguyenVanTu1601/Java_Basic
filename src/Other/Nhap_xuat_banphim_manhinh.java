package Other;

import java.util.Scanner;

public class Nhap_xuat_banphim_manhinh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //  Nhập số nguyên
        System.out.println("Nhap so nguyen a : ");
        int a = scanner.nextInt();
        System.out.println("a = " +a);

        //Nhập kí tự :
        System.out.println("Nhap mot ki tu : ");
        char c = scanner.next().charAt(0);
        System.out.println("Ki tu = " +c);

        //Nhập một từ:
        System.out.println("Nhap 1 tu : ");
        String word = scanner.next();
        System.out.println("Tu vua nhap : " + word);

        //Nhập một câu :

        String ss = scanner.nextLine(); // dùng xóa bộ đệm
        System.out.println("Nhap 1 cau : ");
        String line = scanner.nextLine();
        System.out.println("Cau vua nhap : " + line);
    }
}
