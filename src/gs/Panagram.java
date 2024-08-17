package gs;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

public class Panagram {
    public static void main(String[] args) {
        String str = "piuytrewsdfghjlkmnbvcx";
        Set<Character> st = new HashSet<>();
        List<Character> res = new ArrayList<>();
        for(char ch :str.toCharArray()){
            st.add(ch);
        }
    //    List<String> res = new ArrayList<>();
        for(char ch ='a';ch<='z';ch++){
            if(!st.contains(ch)){
            res.add(ch);
            }
        }
        System.out.println(res);
    }
}
