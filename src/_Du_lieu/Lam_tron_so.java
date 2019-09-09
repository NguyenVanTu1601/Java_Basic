package _Du_lieu;

import java.text.DecimalFormat;

public class Lam_tron_so {
    public static void main(String[] args) {
        DecimalFormat dcf = new DecimalFormat("#.####");
        double x = 0.125457;
        System.out.println(dcf.format(x));
    }

}
