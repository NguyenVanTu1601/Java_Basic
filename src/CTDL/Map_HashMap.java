package CTDL;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Map_HashMap {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        String s = "abbcabb";
        map.put("Tu", 1);
        map.put("Tung",2);
        map.put("Trung",3);
        Map<Character,Integer> mp = new HashMap<>();
        //System.out.println(map.get("Tu")); : Tim value theo key
        // Xoa theo key , remove(key)
        for(int i = 0; i < s.length(); i++){
            if(mp.get(s.charAt(i)) == null){
                mp.put(s.charAt(i), 0);
            }
            int x = mp.get(s.charAt(i));
            mp.put(s.charAt(i), ++x);
        }
/*       Lấy thông tin :
         Set<String> keySet = map.keySet();
         for (String key : keySet) {
             System.out.println(map.get(key));
         }

*/
         for(Map.Entry<Character, Integer> key : mp.entrySet()){
            System.out.printf(key.getKey() + " " + key.getValue() + "\n");
         }

    }
}
