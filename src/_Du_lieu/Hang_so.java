package _Du_lieu;

public class Hang_so {
    public static final float PI = 3.141592f;  // Neu de float thi phai ep kieu f o sau giong nhu int * int > int
    // phai them l(L)ep thanh long moi cho ket qua dung
    //final double  = 3.1415926;
    // Neu ko co public static thi PI ko goi duoc trong bat cu class nao
    public  static final double G = 9.18;

    public static void main(String[] args) {
        final int K = 273; // chi dung trong phuong thuc main nay
        System.out.println("Pi = " +PI);
        showGValue();
        System.out.println("K = " + K ); // 1K = 273 0C
        showMValue();
    }
    public static void showGValue(){
        System.out.println("G = " + G );
    }
    public static void showMValue(){
        final int M = 100;
        System.out.println("M = " + M); // 1M = 100 cm
    }

}
