package gs;

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

    private static List<String> findTopIpaddress(String[] lines) {
        Map<String, Integer> ipMap = new HashMap<>();
        List<String> res = new ArrayList<>();
        for(String line : lines){
            String ip = findIp(line);
            ipMap.put(ip, ipMap.getOrDefault(ip,0)+1);
        }

        int max= Collections.max(ipMap.values());
        for(Map.Entry<String, Integer> entry : ipMap.entrySet()){
            if(entry.getValue()==max){
                res.add(entry.getKey());
            }
        }
        return  res;
    }

    private static String findIp(String line) {
        return line.split(" ")[0];
    }
}
