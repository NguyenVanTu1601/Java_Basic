package Date_time;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Các chữ chỉ định ngĩa cho 1 kí tự
 * G : AD _ sau công nguyên              k : định dạng 24h(0->24)
 * y : năm (1 kí tự của năm)             K : định dạng giờ (0->11)
 * M : tháng (july / 07)                 z : timezone (múi giờ)
 * d : Ngày trong tháng (10)             ' :
 * h : giờ (1->12)                       " :
 * H : giờ(0->23)
 * m : phút của giờ(0->59)
 * s : giây
 * S : mili giây
 * E : ngày trong tuần
 * D : ngày bao nhiêu của năm
 * F : ngày của tuần của tháng
 * w : tuần bao nhiêu của năm
 * W : tuần bao nhiêu của tháng
 * a : định dạng A.M / P.M
 *
 */
public class _SimpleDateFormat {
    //Định dạng thời gian theo ý muốn sử dụng printf()
    public static void main(String[] args) {
        // Định dang thời gian
        Date now = new Date();
        SimpleDateFormat simpleDateFormat =
                new SimpleDateFormat("E dd/MM/yyyy  hh:mm:ss a z G");
        String myTime = simpleDateFormat.format(now); //  Định dạng giờ hiện tại theo dạng bên trên
        System.out.println("MY time " + myTime);

        //Chuyển string thành thời gian theo định dạng
        Date date;
        SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("dd/MM/yyyy");
        String input = "28/01/2019";
        //date = simpleDateFormat1.parse(input); // kích bóng đèn đỏ chon try/catch
        try {
            date = simpleDateFormat1.parse(input);
            System.out.println("Date " + simpleDateFormat1.format(date));
        } catch (ParseException e) {
            e.printStackTrace();
        }

        // Ngoài ra để hiển thị thời điểm hiện tai
        Date date1 = new Date();
        String str = String.format("Thoi gian hien tai : %tc", date1);
        System.out.println(str);
        System.out.printf("%1$s %2$tB %2$td, %2$tY", "Due date:", date1);
        // tìm hiểu thêm phần SimpleDateFormat trong tutorialspoint
    }
}
