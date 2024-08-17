package gs;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeating {
    public static void main(String[] args) {
        String str = "qqqqwwerttyui";
        System.out.println(nonRepeating(str));
    }

    private static String nonRepeating(String str) {

        char[] ch = str.toCharArray();
        Map<Character, Integer> map = new LinkedHashMap<>();
        for(char c :ch){
            map.put(c, map.getOrDefault(c,0)+1);
        }
        for(Map.Entry<Character, Integer> c : map.entrySet()){
            if(c.getValue()==1){
                return Character.toString(c.getKey());
            }
        }
        return "";
    }
}
