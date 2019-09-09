package _Du_lieu;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;
// Ngoài ra có thể suwrw dụng decimalformat < Lam_tron_so>
public class Format_Number {
    public static void main(String[] args) {
        long l = 12345678911L;
        double k = 123454.2436;
        Locale locale = new Locale("Vi", "VN"); // Chọn quốc gia định dạng
        NumberFormat format = NumberFormat.getInstance(locale);
        format.setMaximumFractionDigits(2); // Max bao nhieu kí tự sau dáu ,
        format.setMinimumFractionDigits(0); //  Min bao nhiêu kí tự sau dấu ,
        //format.setMaximumIntegerDigits(3); // So kt trước dấu ,
        format.setRoundingMode(RoundingMode.HALF_UP);// làm tròn lên
        System.out.println(format.format(l));
        System.out.println(format.format(k));
        /*

        DecimalFormat decimalFormat = (DecimalFormat) DecimalFormat.getInstance(locale);
        decimalFormat.setMaximumFractionDigits(1);
        DecimalFormatSymbols decimalFormatSymbols  = new DecimalFormatSymbols();
        decimalFormatSymbols.setGroupingSeparator('-'); // chuyển . thành  -
        decimalFormatSymbols.setDecimalSeparator(',');
        decimalFormat.setDecimalFormatSymbols(decimalFormatSymbols);
        decimalFormat.setGroupingSize(4); // nhóm 4 số
        */

    }
}
