import java.util.Scanner;

public class _Ham_Con {
    public static int nt(int n){
        if(n < 2) return 0;
        if(n == 2) return 1;
        else{
            for(int i = 2; i < Math.sqrt(n); i++){
                if(n % i == 0) return 0;
            }
            return 1;
        }
    }
    public  int Csnt(int n){
        //_Ham_Con hc = new _Ham_Con();

        while(n != 0){
            int i = n % 10;
            if(nt(i) == 0) return 0;
            n = n / 10;
        }
        return 1;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        _Ham_Con hc = new _Ham_Con();
        if(nt(n)==1 && hc.Csnt(n) == 1) System.out.println("So nguyen to");
        // Ko can hc.nt() boi nt co static r , main là static nen cac ham pha de static
        else System.out.println("Khong la so nguyen to");
    }
}
