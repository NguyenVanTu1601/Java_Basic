package Other;

import java.util.ArrayList;

public class _Lop_bao_autoboxing_unboxed {
    /*
    -Lớp wrapper, autoboxing và unboxed
    -Mục đich sử dụng :
         + Dùng để chuyển 1 xâu số -> số
         + Chuyển đổi các dữ liệu nguyên thủy và lớp đóng gói(lớp bao)
         VD lớp bao của int là Interger , bao của float là Float....
         autoboxing : Interger x = 10 ( 10 là int)
         unboxed : int x = Interger xx;
     */
    public static void main(String[] args) {

        // Autoboxing and unboxed
        /*
        int x = 10;
        Integer xx = x; // autoboxing
        x = xx; // unboxed
         */
        int x = 10;
        Integer xx = Integer.valueOf(x);
        System.out.println(xx.toString());
        System.out.println(xx.equals(10));
        ArrayList <Integer> list = new ArrayList<>();
        list.add(10);
        // <=> list.add(Interger.valueOf(10));

        //Chuyển đổi
        String str = "1010";
        int strNum = Integer.parseInt(str,2); // hệ 2 -> hệ 10;
        System.out.println(strNum);

    }
}
