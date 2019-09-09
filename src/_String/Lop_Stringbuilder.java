package _String;

public class Lop_Stringbuilder {
    public static void main(String[] args) {
        /*
        Tốc độ nhanh
        StringBuilder str = new StringBuilder();
        str.append(String) // thêm vào cuối
        str.toString() // biến stringbuilder thành string
        str.insert(int,String) // thêm String vào string Str từ vị trí int
        str.reverse() // đảo ngược string
        str.delete() // xóa
        str.replace() //thay thế
        */

        //Thực hiện mọi thứ trên Stringbuilder sau đó mới gán thành string
        //Stringbuilder sử dụng khi có nhu cầu chỉnh sửa mọi thứ trên string
        StringBuilder str = new StringBuilder();
        str.append("Nguyen ");
        str.append("Van Tu");
        str.replace(0,6,"NGUYEN");
        String name = str.toString();
        System.out.println(name);
    }
}
