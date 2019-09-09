package Date_time;

import java.time.LocalDate;

public class _LocalDate {
    public static void main(String[] args) {
        //Lấy thời điểm hiện tại
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);

        //Tạo Date cho bản thân
        LocalDate myDate = LocalDate.of(1999,01,16);
        System.out.println("Birthday : " + myDate);

        /*
        myDate.plusDays(int a) : tăng ngày lên a
        myDate.getYear : lấy năm
        myDate.getMonthValue : trả về tháng dạng số nguyên
        myDate.getDayOfMonth : trả về ngày thứ bao nhiêu của tháng
        myDate.isLeapYear : Kiểm tra năm nhuận
        myDate.lengthOfYear : số ngày của năm
        myDate.minusDay : cộng thêm ngày
         */
    }
}
