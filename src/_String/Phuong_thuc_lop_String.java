package _String;

public class Phuong_thuc_lop_String {
    public static void main(String[] args) {
        //Tham khảo bài P ,Q khá hay
        /*
        String myName = "Nguyen Van Tu";
        myName.charAt(int); // Trả về kí tự tại vị trí
        myName.length(); // Lấy độ dài
        myName.equals(String); // So sanh có phân biệt hoa thường trả về true / false
        myName.equalsIgnoreCase(String); // So sánh không phân biệt hoa thường
        myName.substring(); // Lay chuỗi con
        myName.compareTo(String); // giống equals trả về 1/0/-1
        myName.compareToIgnoreCase(String); // giống equalsIgnoreCase
        myName.contains(char); // Kiểm tra trong chuỗi có kí tự cần hay ko
        myName.indexOf(char); // Lấy chỉ số của kì tự
        myName.isEmpty(); // Kiểm tra chuỗi rỗng hay không ( khác chuỗi null)
        myName.replace() // thay thế
        myName.toUpperCase() // chuyển sang chữ hoa hết
        myName.toLowerCase()// chuyển sang chữ thường hết
        myName.toCharArray()// chuyển sang mảng kí tự
        myName.trim() // chuẩn hóa đầu cuối
        myName.replaceAll("\\s+", " "); chuẩn hóa giữa;
        //Ngoài ra :
        // Tao mang string moi de them : String[] arr = new String[1000];
        //String res[] = myName.split(" ") // tách các từ khi gặp dấu space cho vao mang string
        //for(String s : res) System.out.println(s);
        */
        String myName = "Nguyen Van Tu";
        String res[] = myName.split(" ");
        for(String s : res) System.out.println(s);
        System.out.println(myName.startsWith("Nguyen")); // kiểm tra string có bắt đầu bằng chuỗi nào đó hay không ?
        System.out.println(myName.endsWith("u"));
    }
}
