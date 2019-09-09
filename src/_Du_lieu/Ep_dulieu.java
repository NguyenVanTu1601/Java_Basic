package _Du_lieu;

public class Ep_dulieu {
    public static void main(String[] args) {
        // Ep tu so sang string
        int num = 100;
        String snum = Integer.toString(num);
        // ép String sang số
        String ss = "123";
        int bnum = Integer.parseInt(ss);
        //Tính tổng số của 1 string
        int sum = 0;
        for(int i = 0; i < ss.length(); i++){
            sum += ss.charAt(i) - '0';
        }
        System.out.println("Interger Number = " + ss);
        System.out.println("String num = " + snum);
        System.out.println("Sum = " + sum);
    }
}
