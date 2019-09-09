package _Du_lieu;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class _Biginterger_BigDecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // BigInterger
        BigInteger a = new BigInteger("1234454564562131348");
        BigInteger b = new BigInteger( "145671313544664878");
        BigInteger sum = a.add(b); // cộng
        BigInteger sub = a.subtract(b); // trừ
        BigInteger mul = a.multiply(b); // nhân
        BigInteger div = a.divide(b); // chia
        System.out.println("Sum = " +sum);
        System.out.println("Sub = " + sub);
        System.out.println("Mul = " + mul);
        System.out.println("Div = " + div);

        // So ngoai Double
        BigDecimal x = new BigDecimal("1.12322435464767454");
        BigDecimal y = new BigDecimal("122.333464543654611");
        BigDecimal zSum = x.add(y);
        System.out.println("zSum = " +zSum);


    }

}
