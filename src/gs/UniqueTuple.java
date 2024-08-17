package gs;

import java.util.HashSet;
import java.util.Set;

public class UniqueTuple {
    public static void main(String[] args) {
        int len =2;
        String str = "abbccde";
        Set<String> set = new HashSet<>();
        for(int i =0; i<str.length()-len;i++){
            String tem = str.substring(i, i+len);
            set.add(tem);
        }
    }
}
