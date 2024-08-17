package revisionGS;

import java.util.*;

public class FrequentIpAddress {
    public static void main(String[] args) {
        String lines1[] = new String[]{
                "10.0.0.1 - frank [10/Dec/2000:12:34:56 -0500] \"GET /a.gif HTTP/1.0\" 200 234",
                "10.0.0.1 - frank [10/Dec/2000:12:34:57 -0500] \"GET /b.gif HTTP/1.0\" 200 234",
                "10.0.0.2 - nancy [10/Dec/2000:12:34:58 -0500] \"GET /c.gif HTTP/1.0\" 200 234"
        };

        String lines2[] = new String[]{
                "10.0.0.1 - frank [10/Dec/2000:12:34:56 -0500] \"GET /a.gif HTTP/1.0\" 200 234",
                "10.0.0.1 - frank [10/Dec/2000:12:34:57 -0500] \"GET /b.gif HTTP/1.0\" 200 234",
                "10.0.0.2 - nancy [10/Dec/2000:12:34:58 -0500] \"GET /c.gif HTTP/1.0\" 200 234",
                "10.0.0.2 - nancy [10/Dec/2000:12:34:59 -0500] \"GET /c.gif HTTP/1.0\" 200 234",
                "10.0.0.3 - logan [10/Dec/2000:12:34:59 -0500] \"GET /d.gif HTTP/1.0\" 200 234"
        };

        System.out.println(findTopIpaddress(lines1));
        System.out.println(findTopIpaddress(lines2));
    }

    private static List<String> findTopIpaddress(String[] lines1) {
        Map<String,Integer> map = new HashMap<>();
        List<String> res = new ArrayList<>();
        for(String s :lines1){
            String temp = s.split(" ")[0];
            map.put(temp, map.getOrDefault(temp,0)+1);
        }

        int maxi = Collections.max(map.values());
        for(Map.Entry<String,Integer> entry: map.entrySet()){
            int tem = entry.getValue();
            if(tem==maxi){
                res.add(entry.getKey());
            }
        }
        return res;
    }
}
