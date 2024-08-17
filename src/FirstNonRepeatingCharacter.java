import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {
          String s = "AAnish";
          var z= s.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()));
          System.out.println(z.entrySet().stream().filter(x->x.getValue()==1).findFirst());
//          System.out.println(z);
//        String result = findFirstNonRepeatingCharacter(s);
//        if (result!=null) {
//            System.out.println("The first non-repeating character is: " + result);
//        } else {
//            System.out.println("There is no non-repeating character in the string.");
//        }
        String str = "Hello World this is Java interview Hello world";
        System.out.println( Stream.of(str).collect(Collectors.groupingBy(Function.identity(),Collectors.counting())));;
        String str3 = "aaabbcaabbddd";
       List<String> result = countConsecutiveCharacters(str3);
       result.forEach(System.out::println);
    }

    private static List<String> countConsecutiveCharacters(String str3) {
        List<Character> chars = str3.chars().mapToObj(c->(char)c).collect(Collectors.toList());

        List<String> res = new ArrayList<>();

        IntStream.range(0, chars.size())
                .forEach(i->{
                    if(i==0 || !chars.get(i).equals(chars.get(i-1))){
                        int count =1;
                        while(i+count<chars.size() && chars.get(i+count).equals(chars.get(i))) {
                            count++;
                        }
                        res.add(chars.get(i)+" = "+count);
                    }
                });
        return res;
    }

//    public static String findFirstNonRepeatingCharacter(String s) {
//        Map<Character, Integer> charCountMap = new LinkedHashMap<>();
//
//        // Populate the LinkedHashMap with character counts
//        for (char c : s.toCharArray()) {
//            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
//        }
//
//        // Find the first character with a count of 1
//        StringBuffer sb = new StringBuffer();
//        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
//            if (entry.getValue() == 1) {
//                sb.append(entry.getKey());
//               // sb.append("");
//            }
//        }
//
//        // If no non-repeating character is found
//        return sb.toString();
//    }
}
