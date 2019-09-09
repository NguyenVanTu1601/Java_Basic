package Other;

import java.util.Random;

public class Math_Radom {
    public static void main(String[] args) {
        int x = (int) (Math.random() * 100);
        char y = (char) ((Math.random() * (122-97+1)) + 97);
        System.out.println(x);
        System.out.println(y);
        Random random = new Random();
        char z = (char) (random.nextInt(122-97+1) + 97);
        System.out.println(z);
    }
}
