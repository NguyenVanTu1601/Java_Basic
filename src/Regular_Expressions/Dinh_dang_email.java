package Regular_Expressions;
// Mail co dang : (a->z)(0->9).....@xmail.com
// VD nguyentu99@gmail.com

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Dinh_dang_email {
    public static void main(String[] args) {
        String regex = "^[a-zA-Z]+[a-z0-9]*@{1}[a-z]+mail.com$";
        String input = "Banggia1601@gmail.com";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        if(matcher.find()){
            System.out.println("Day la mot email");
        }
        else System.out.println("Vui long kiem tra lai");
    }
}
