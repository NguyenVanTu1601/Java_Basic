package Other;

import java.math.BigInteger;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main86 {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int t = scanner.nextInt();
        BigInteger n;
        while (t > 0){
            n = scanner.nextBigInteger();
            Queue<BigInteger> queue = new LinkedList<>();
            BigInteger x = BigInteger.valueOf(1);
            ((LinkedList<BigInteger>) queue).push(x);
            int dem = 0;
            while(queue.isEmpty() == false){
                x = ((LinkedList<BigInteger>) queue).peekFirst();
                ((LinkedList<BigInteger>) queue).pop();
                //BigInteger a = x.mod(n);
                dem++;
                System.out.println(x);
                if(dem == 50) break;
                for(int j = 1; j <= 2; j++){
                    BigInteger sum;
                    if(j == 1){
                        sum = (x.multiply(BigInteger.valueOf(10))).add(BigInteger.valueOf(1));
                        ((LinkedList<BigInteger>) queue).push(sum);
                    }
                    else {
                        sum = (x.multiply(BigInteger.valueOf(10)));
                        ((LinkedList<BigInteger>) queue).push(sum);
                    }
                }
            }
            t--;
        }
    }
}
