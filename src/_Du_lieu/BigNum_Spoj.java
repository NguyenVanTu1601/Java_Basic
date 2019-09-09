package _Du_lieu;

import java.math.BigInteger;
import java.util.Scanner;

public class BigNum_Spoj {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigInteger a = scanner.nextBigInteger();
        BigInteger b = scanner.nextBigInteger();
        BigInteger sum = a.add(b);
        BigInteger sub = a.subtract(b);
        BigInteger mul = a.multiply(b);
        System.out.println(sum);
        System.out.println(sub);
        System.out.println(mul);
    }
}
