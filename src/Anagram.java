import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Anagram {
    public static void main(String[] args) {
        List<String> anagrams = Arrays.asList("eat", "tea", "tan", "ate", "nat", "bat");
        var x = anagrams.stream()
                .collect(Collectors.groupingBy(Anagram::sortString));
        List<List<String>> res = new ArrayList<>(x.values());
        System.out.println(res);
    }
    public static String sortString(String input){
        char[] ch = input.toCharArray();
        Arrays.sort(ch);
        return new String(ch);
    }


}
