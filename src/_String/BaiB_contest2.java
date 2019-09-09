package _String;

import java.util.Arrays;
import java.util.Scanner;

public class BaiB_contest2{
    public  int nt(String S) {
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) != '2' && S.charAt(i) != '3' && S.charAt(i) != '5' && S.charAt(i) != '7') return 0;
        }
        return 1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();
        String[] temp = S.split(" ");
        int dem = 1;
        int k = 0;
        BaiB_contest2 bp = new BaiB_contest2();

        String[] arr = new String[temp.length];
        for (int i = 0; i < temp.length; i++) {
            if (bp.nt(temp[i]) == 1) {
                arr[k] = temp[i];
                k++;
            }
        }

        int[] check = new int [k];
        Arrays.fill(check,0);
        for(int i = 0; i < k - 1; i++){
            for(int j = i + 1; j < k; j++){
                if(check[i] == 0 && arr[i].equals(arr[j]) == true){
                    check[j] = 1;
                    dem++;
                }
            }
            if(check[i] == 0){
                System.out.println(arr[i] + " " + dem);
            }
            dem = 1;
        }
        if(check[k-1] == 0) System.out.println(arr[k-1] + " " + "1");

    }
}