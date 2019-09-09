package Contest3;

import java.math.BigInteger;
import java.util.PriorityQueue;
import java.util.Scanner;

public class BaiD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        BigInteger x;
        PriorityQueue<BigInteger> qQueue = new PriorityQueue<BigInteger>();
        for(int i = 0; i < n; i++){
            x = scanner.nextBigInteger();
            qQueue.add(x);
        }

        BigInteger sum = BigInteger.valueOf(0);
        while(qQueue.size() > 1){
            BigInteger a = qQueue.poll();
            BigInteger b = qQueue.poll();
            BigInteger c = a.add(b);
            qQueue.add(c);
            sum = sum.add(c);
        }
        System.out.println(sum.mod(BigInteger.valueOf(1000000007)));
    }
}
