package Other;

import java.util.Random;

public class _Random {
    public static void main(String[] args) {
        Random random = new Random();
        for(int i = 0; i < 5; i++){
            int x = random.nextInt(100); // lay so nguyen < 100;
            System.out.println(x);
        }
        // Random vs long / double
        for(int i = 0; i < 5; i++){
            long y = random.nextLong();
            System.out.println(y);
        }
        // Sinh gia tri trong khoang [a,b];_ 10->80
        for(int i = 0; i < 5; i++){
            int z = random.nextInt((80-10+1)) + 10;
            System.out.println(z);
        }
    }
}
