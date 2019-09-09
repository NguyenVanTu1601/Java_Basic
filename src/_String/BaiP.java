package _String;

import java.util.Scanner;

public class BaiP {
    public static String chuanHoa(String str) {
        str = str.trim();
        str = str.replaceAll("\\s+", " ");
        return str;
    }

    public static String Suachua(String str) {
        //_String.BaiP chx = new _String.BaiP();
        //str = chx.chuanHoa(str);
        str = chuanHoa(str);
        str = str.toLowerCase();
        String temp[] = str.split(" ");
        str = ""; // ? ^-^
        str += String.valueOf(temp[temp.length-1].toLowerCase());
        for (int i = 0; i <  temp.length - 1; i++) {
            //if(i == temp.length - 1) str += String.valueOf(temp[i].toLowerCase());
            str +=  temp[i].charAt(0);
        }
        //str += "@ptit.edu.vn";
        return str;
    }

    public static void main(String[] sgr) {
        Scanner scanner = new Scanner(System.in);
        int t;
        t = scanner.nextInt();
        String str;
        String s;
        s = scanner.nextLine();
        String[] arr = new String[t];
        int k = 0;
        while(t != 0) {
            int dem = 1;
            str = scanner.nextLine();
            //BaiP chx = new BaiP();
            str = /*chx.*/Suachua(str);
            arr[k] = str;
            for(int i = 0; i < k; i++){
                if(arr[i].equalsIgnoreCase(str) == true) dem++;
            }
            if(dem == 1 )System.out.println(str + "@ptit.edu.vn");
            else System.out.println(str + dem + "@ptit.edu.vn");
            t--;
            k++;

        }
    }
}
