package Contest3;

import java.util.Scanner;

public class BaiM {
    public static Scanner scanner = new Scanner(System.in);
    public static String[] strings = new String[11];
    public static int n;
    public static int [] arr = new int [11];
    public  static int [] check = new int [11];
    public static int min = 500;

    public static int Dem(String a, String b){
        int dem = 0;
        for(int i = 0; i < a.length(); i++){
            for(int j = 0 ; j < b.length(); j++ ){
                if(a.charAt(i) == b.charAt(j)) dem++;
            }
        }
        return dem;
    }


    public static void Try(int i){
        for(int j = 1; j <= n; j++){
            if(check[j] == 1){
                arr[i] = j;
                check[j] = 0;
                if(i == n){
                    int dem = 0;
                    for(int k = 1; k < n; k++) {
                        dem += Dem(strings[arr[k]], strings[arr[k + 1]]);

                    }
                    if(dem < min) min = dem;
                }
                else Try(i+1);
                check[j] = 1;
            }

        }
    }
    public static void main(String[] args) {

        n = scanner.nextInt();
        for(int i = 1; i <= n; i++){
            strings[i] = scanner.next();
        }
        for(int i = 1; i <= n; i++){
            check[i] = 1;
        }

        Try(1);
        System.out.println(min);

    }
}
