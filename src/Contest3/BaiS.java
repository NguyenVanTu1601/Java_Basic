package Contest3;

import java.math.BigInteger;
import java.util.Scanner;

// C(k,n)
public class BaiS{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(0!=t--){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int x = a-b;
            if(x<b)
            {
                int temp=x; x=b; b=temp;
            }
            BigInteger result = BigInteger.valueOf(a); // chuyển đổi dữ liệu từ int => BigInteger
            for(int i=x+1; i<a; i++){
                result=result.multiply(BigInteger.valueOf(i));
            }
            for (int i=2; i<=b; i++)
            {
                result=result.divide(BigInteger.valueOf(i));
            }
            System.out.println(result.mod(BigInteger.valueOf(1000000007)));
        }
    }
}