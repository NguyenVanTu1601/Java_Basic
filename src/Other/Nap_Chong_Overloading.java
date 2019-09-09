package Other;

public class Nap_Chong_Overloading {
    /*
    Mot phuong thuc cung ten nhung khac tham so, khac kieu tra ve.....
     */
    public static int Show (int a){
        return a;
    }
    public static int Show(int a, int b){
        return a + b;
    }
    public static void main(String[] args) {
        System.out.println(Show(5));
        System.out.println(Show(5,7));
    }
}
