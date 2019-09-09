package _String;

import java.util.Scanner;

public class BaiQ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        String s1;
        String s2;
        String s = scanner.nextLine();
        int z = 1;
        while(t != 0){
            s1 = scanner.nextLine();
            s2 = scanner.nextLine();
            String str ="";
            String temp[] = s1.split(" ");
            for(int i = 0; i < temp.length; i++) {
                if (temp[i].equalsIgnoreCase(s2) == false) str += String.valueOf(temp[i] + " ");
            }
            str = str.trim();
            System.out.println("Test " +z + ": " +str);
            z++;
            //System.out.println(str);
            t--;
        }
    }
}
