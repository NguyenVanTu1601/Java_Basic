package Regular_Expressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Nhằm kiểm tra quá trình nhập mail / SĐT / .... có đúng không hay còn gọi là khớp mẫu
 * Đồng thời cũng dùng để quản lý dữ liệu kiểu text
 * Pattern : Truyền vào mẫu để so khớp _Pattern parttern = Patttern.compile(Định dạng chuẩn)
 * Matcher : Truyền vào biểu thức so khớp _ matcher = pattenr.matcher(Xâu cần kiểm tra)
 * ^ : Đánh dấu bắt đầu 1 dòng(Khớp ở đầu)
 * $ : Tìm ở cuối dòng(Khớp ở cuối)
 * . : Tìm bất kì 1 kí tự nào (trừ dòng mới)
 * [....] : Tìm 1 kí tự xuất hiện trong [] (Khớp trong đoạn)
 * [^...] : Tìm kí tự không khớp với kí tự nào trong []
 * * : Tìm có 0 hoặc nhiều giá trị xuất hiện <=>{0,}
 * + : Tìm sự xuất hiện của 1 hoặc nhiều giá trị mới thỏa mãn  <=>{1,}
 * ? : Tìm 0 hoặc 1 <=>{0,1}
 * {n} : Tìm chính xác n kí tự
 * {n,} : Tìm chính xác n kí tự trở lên
 * {n,m}: Tìm tối thiểu n, tối đa m
 * a|b : Tìm a hoặc b
 * (re) : Gộp điều kiện
 * \w : <=> [a-zA-Z_0-9]
 * \W : Không phải kí tự tạo 1 từ
 * \s : So khớp khoảng trắng \t,\n,\r,\f
 * \S : Không phải khoảng trắng
 * \d : Tìm 1 kí tự số
 * \D : Tìm không phải kí tự số
 * \b : <=>[a-zA-Z0-9_]
 *  *? : Tìm kiếm khớp nhỏ nhất
 * \.[{(*+?^$| : Là các kí tự đặc biệt ,muôn hiểu phải thêm \ VD : hiểu dấu . sẽ là \\.
 * */


public class RegularExpressions {
    public static void main(String[] args) {
        String [] fullname = {"Trieu Van Than","Nguyen Thi Hoa","To Trong Phu",
                "Ngo Van Tai","Le Duc Anh", "Do Viet Hung", "Tran Thuy Ha","(036)-588-2920"};

        // Tim gần đúng
        //String regex = "(.*Than.*)|(.*Vi.*)"; // . là có 1 kí tự , * là 0 hoăc nhiều => .* nhiều kí tự => Tim ng co Than hoac Vi
        String regex = "^Trieu";
        // Tim nguoi co ho Trần : ^Tran.*
        // Tim nguoi co tên kết thúc bằng n : .*n$
        // Tìm tên có khoảng trắng : .*\\s.*
        // Tìm tên có chứa số : .*\\d.*
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher;
        for (int i = 0; i < fullname.length; i++) {
            matcher = pattern.matcher(fullname[i]);
            if(matcher.find()){
                System.out.println(fullname[i]);
            }

        }
        // Thay the
        /*
        matcher.replaceAll() : Thay thế toàn bộ
        matcher.find() : Tìm kiếm
        find(int) : Tìm từ vị trí int
        matcher.replaceFirst() :  Thay the vi tri đầu
        matcher.start() / end() : Vi tri bat dau / ket thuc
        matcher.lookingAt() : So khớp phần đầu giống là được
        matcher.matches() : So khớp toàn bộ
        appepReplocation :
        appendTail

         */
        String input  = "     hello     tu  nguyen    ! Goodmorning ";
        String regax = "[\\s]+"; // tim 1 hay nhieu dau cach
        Pattern pattern1 = Pattern.compile(regax);
        Matcher matcher1 = pattern1.matcher(input);
        if(matcher1.find()){
            System.out.println(matcher1.replaceAll(" "));
        }
    }

}
