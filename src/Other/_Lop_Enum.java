package Other;

import java.util.Arrays;

public class _Lop_Enum {
    //La lop static
    // Tao ra gia tri dai dien cho 1 khoảng
    /*
    VD 6
    6.5-8 : Khá
    8-9 : Gioi
    9-10 : xuất sắc
    => Khá , Gioi, Xuất sắc là các giá trị đại diện
    Khai bao ngoai main
     */
    enum HocLuc{
        Kha("K"), Gioi("G"), Xuatsac("XS");
        // Dinh nghia lai cac doi tuong trong lop enum
        private String abb;
        private HocLuc(String abb){
            this.abb = abb;
        }
        public String getAbb(){
            return abb;
        }

    }
    public static void main(String[] args) {
        HocLuc hocLuc = HocLuc.Gioi;
        System.out.println(hocLuc.toString()); // in ra đầy đủ
        System.out.println(hocLuc.getAbb()); // in ra kí hiệu đại diện do đã khởi tạo

        HocLuc[] hocLuc1 = HocLuc.values();
        System.out.println(Arrays.toString(hocLuc1));
    }
}
