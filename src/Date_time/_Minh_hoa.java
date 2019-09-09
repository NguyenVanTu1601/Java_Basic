package Date_time;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class _Minh_hoa {
    public static void main(String[] args) {
        // Đếm số ngày giữa 2 khoảng thời gian
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ngay thang theo dinh dang : dd/MM/yyyy");
        //String regex = "^[0-3]{1}[0-9]{1}/[0-1]{1}[0-9]{1}/[0-9]{4}";
        //Pattern pattern = Pattern.compile(regex);
        System.out.println("Nhap thoi gian bat dau :");
        String startInput = scanner.nextLine();
        System.out.println("Nhap thoi gian ket thuc");
        String endInput = scanner.nextLine();
        Date startDate;
        Date endDate;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        try {
            startDate = simpleDateFormat.parse(startInput);
            endDate = simpleDateFormat.parse(endInput);
            long startTime = startDate.getTime();
            long endTime = endDate.getTime();
            long subTime = Math.abs(startTime - endTime);
            System.out.println(subTime / (24*60*60*1000));
        }
        catch (ParseException e) {
            e.printStackTrace();
        }



    }


}
