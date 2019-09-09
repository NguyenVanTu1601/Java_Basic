package CTDL;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Iterator;
public class _Iterator {
    public static void main(String[] args) {
        List<String> array = new ArrayList<String>();
        array.add("Tu");
        array.add("Nam");
        array.add("Tung");
        array.add("Trung");
        array.add("Anh");
        array.add("Dung");
        array.add("Viet");
        Iterator<String> itr = array.iterator();
        while(itr.hasNext()){
            String s = (String) itr.next();
            System.out.println(s);
        }
        /* Iterator tuong tu foreach
        tuy nhiên foreach không thể xóa phần thử còn iterator thì có thể
        while(itr.hasNext()){
            String s = (String) itr.next();
            if(s.equal("Tu") itr.remove();
            System.out.println(s);
        }
         */
    }
}
