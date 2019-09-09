package Regular_Expressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Dinh_dang_SDT {
    public static void main(String[] args) {
        String regex = "^\\(\\d{3}\\).\\d{3}.\\d{4}$";
        String input = "(036).588.2920";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        if(matcher.find()) System.out.println("So DT dung");
        else System.out.println("Vui long kiem tra lai");
    }
}
