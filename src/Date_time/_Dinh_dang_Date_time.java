package Date_time;

import java.util.Date;

/**
 * c : Mon May 04 09:51:52 CDT 2019      m: tháng (2 số vd 09)
 * F : năm/tháng/ngày                    d : ngày ( 2 số)
 * D : tháng / ngày /năm                 e :
 * T : 24h _ 21 : 55: 30                 A : thứ (đầy đủ)
 * r : 12h _ 09:55:30 pm                 a : thứ viết tắt
 * R : 24h (ko có giây)                   M : phut
 * Y : năm                               S : giay
 * y : năm (2 số cuối)                   H , k : gio
 * C : 2 số đầu của năm                 Z : múi giờ
 * B : tên tháng đủ                      L : 3 số của mili giây
 * b : tên tháng viết tắt
 * vân vân xem thêm trên https://www.tutorialspoint.com/java/java_date_time.htm
 */
public class _Dinh_dang_Date_time {
    public static void main(String[] args) {
        Date now = new Date();
        // %t + ki tu
        System.out.printf("%tT " ,now);
        // %<t + kitu
        System.out.printf("%tA %<td/%<tm/%<tY ", now); // tru thang dau tien tat ca them %<t....

    }
}
