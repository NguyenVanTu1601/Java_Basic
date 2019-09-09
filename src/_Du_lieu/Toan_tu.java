package _Du_lieu;

public class Toan_tu {
    public static void main(String[] args) {
        int a = 15;
        int b = 47;
        int c = a + b;
        float res = a*1.0f / b;
        System.out.println("c = " +c);
        System.out.println("res = " + res);
        int d = a % b;
        System.out.println("d = " +d);
        System.out.println((a>b)?a:b); // toan tu 3 ngoi kt a > b neu dung thi tra ve a nguoc lai tra ve b
        System.out.println(a<b && a!= b); // kq = true
        System.out.println(a > b || a == b);
        String kq = "";
        kq = (a < b)? "a < b" : "a >= b";
        System.out.println(kq);
    }
}
