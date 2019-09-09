package Other;

public class Enum {
    enum HocLuc{YEU,TB,KHA,GIOI,XUATSAC};
    public static void main(String[] args) {
        HocLuc x = HocLuc.GIOI;
        if(x == HocLuc.KHA) System.out.println("Hoc luc Kha !");
        else System.out.println("Khong xac dinh");
    }
}
