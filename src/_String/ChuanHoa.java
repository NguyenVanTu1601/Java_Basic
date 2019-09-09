package _String;

import java.util.Scanner;

public class ChuanHoa {
    public String chuanHoa(String str) {
        str = str.trim();
        str = str.replaceAll("\\s+", " ");
        return str;
    }

    public String chuanHoaDanhTuRieng(String str) {
        str = chuanHoa(str);
        str = str.toLowerCase();
        String temp[] = str.split(" ");
        str = ""; // ? ^-^
        for (int i = 1; i < temp.length; i++) { // Chuan hoa dung dang thi giu nguyen i = 0
            str += String.valueOf(temp[i].charAt(0)).toUpperCase() + temp[i].substring(1);
            if (i < temp.length - 1) // ? ^-^
                str += " ";
        }
        str += ","; //
        str += " ";
        str += String.valueOf(temp[0].toUpperCase());
        return str;
    }

    public static void main(String[] sgr) {
        Scanner scanner = new Scanner(System.in);
        int t;
        t = scanner.nextInt();
        String str;
        String s;
        s = scanner.nextLine();
        while(t != 0) {
            str = scanner.nextLine();
            //String str = "    nguyen     van     quan   7826    ";
            ChuanHoa chx = new ChuanHoa();
            str = chx.chuanHoaDanhTuRieng(str);
            System.out.println(str);
            t--;
        }
    }
}
