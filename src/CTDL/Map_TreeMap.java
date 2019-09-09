package CTDL;

import java.util.Map;
import java.util.TreeMap;

public class Map_TreeMap {
    public static void main(String[] args) {
        Map<Character, Integer> map = new TreeMap<>();
        /*
        Các phần tử sắp xếp tăng dần theo key
        Con HashMap sắp xếp linh tinh
         */
        String s = "nguyenvantu";
        for(int i = 0; i < s.length(); i++){
            if(map.get(s.charAt(i)) == null){
                map.put(s.charAt(i), 0);
            }
            int x = map.get(s.charAt(i));
            map.put(s.charAt(i), ++x);
        }
        for(Map.Entry<Character, Integer> key : map.entrySet()){
            System.out.println(key.getKey() + " - " + key.getValue());
        }
    }
}
