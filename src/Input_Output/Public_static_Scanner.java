package Input_Output;

import java.util.Scanner;

public class Public_static_Scanner {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int x = scanner.nextInt();
        System.out.println("X = " + x);
        scanner.close(); // Đóng scanner -> ko nhập tiếp nêu bên dưới gọi hàm nhập scanner
    }

}
