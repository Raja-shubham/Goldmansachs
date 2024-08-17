package revisionGS;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeating {
    public static void main(String[] args) {
        String str = "qqqqwwerttyui";
        System.out.println(nonRepeating(str));
    }

    private static String nonRepeating(String str) {
        Map<Character, Integer> map = new LinkedHashMap<>();
        String res = "";
        for(char ch : str.toCharArray()){
            map.put(ch, map.getOrDefault(ch,0)+1);
        }
        for(Map.Entry<Character, Integer>entry : map.entrySet()){
            if(entry.getValue()==1){
                res+=entry.getKey();
                break;
            }
        }
        return res;
    }
}
