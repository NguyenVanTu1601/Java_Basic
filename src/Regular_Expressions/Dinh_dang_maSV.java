package Regular_Expressions;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Dinh_dang_maSV {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String regex ="^(B|b)\\d{2}[a-zA-Z]{4}[0-9]{3}$";
        System.out.printf("Nhap chuoi can kiem tra dinh dang : ");
        String input = scanner.nextLine();
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        if(matcher.find()){
            System.out.println("Ma sinh vien dung");
        }
        else System.out.println("Kiem tra lai ma sinh vien !");
    }
}
