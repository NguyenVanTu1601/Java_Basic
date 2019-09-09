package _Vong_lap;

public class if_else {
    public static void main(String[] args) {
        int a = 5;
        if(a % 2 == 0) System.out.println("So chan");
        else System.out.println("So le");
        float Mark = 5.3f;
        if(Mark >= 9.0) System.out.println("Xuat Sac");
        else if(Mark >= 8.0 && Mark < 9.0) System.out.println("Gioi");
        else if(Mark >= 6.5 && Mark < 8.0) System.out.println("Kha");
        else System.out.println("Trung binh _ Yeu");
    }
}