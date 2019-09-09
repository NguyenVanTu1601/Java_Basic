package CTDL;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sort_inList {
    public static void main(String[] args) {
        List<String> array = new ArrayList<>();
        array.add("Tu");
        array.add("Nam");
        array.add("Tung");
        array.add("Trung");
        array.add("Anh");
        array.add("Dung");
        array.add("Viet");
        Collections.sort(array);
        for (String s : array) {
            System.out.println(s);
        }
    }
}
