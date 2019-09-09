package Date_time;

import java.util.Date;

public class _Lop_Date {
    public static void main(String[] args) {
        Date now = new Date();
        // Lay thoi gian
        System.out.println("now = " +now);

        // Lay thoi gian theo ms (mini giay)
        // ten.getTime -> lay theo minigiay
        // Cach 1 :
        long timems = now.getTime();
        System.out.println("Time ms = " +timems);
        //Cach 2:
        long timems2 = System.currentTimeMillis();
        System.out.println("Time ms2 = " +timems2);

        //Thoi gian hom sau, truoc
        Date tomorrow = new Date(timems + (24*60*60*1000)); // thời điểm ngày mai
        Date afterday = new Date(timems2 -(24*60*60*1000)); // thời điểm hôm trc
        Date after1000day = new Date(timems2 - (24*60*60*1000)*1000L); // 1000L vi timems2 la long , tim hiểu bài nhân int
        System.out.println("Tomorrow : " + tomorrow);
        System.out.println("Afterday : " +afterday);
        System.out.println("1000 ngay truoc : " + after1000day);

        // So sánh thời gian
        boolean check = now.after(afterday); // So sánh hiện tại với thời điểm sau afterday
        System.out.println(check);
        System.out.println(now.compareTo(now));
    }
}
