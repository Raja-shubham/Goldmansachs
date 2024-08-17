package revisionGS;

import java.util.HashMap;
import java.util.Map;

public class DecimalConversion {
    public static void main(String[] args) {
        long num = 9l;
        long den = 4l;

        System.out.println(convertDecimal(num,den));
    }

    private static String convertDecimal(long num, long den) {
        StringBuffer ans = new StringBuffer();
        Map<Long,Integer> map = new HashMap<>();
        long integer = num / den;
        ans.append(integer);
        long remainder = num % den;
        if (remainder == 0)
            return ans.toString();
        ans.append(".");
        while(remainder!=0){
            if(map.containsKey(remainder)){
                int tem = map.get(remainder);
                ans.insert(tem,"(");
                ans.append(")");
            }
            map.put(remainder, ans.length());
            remainder = remainder*10;
            long fraction = remainder/den;
            ans.append(fraction);
            remainder= remainder%den;
        }
            return ans.toString();
    }
}
