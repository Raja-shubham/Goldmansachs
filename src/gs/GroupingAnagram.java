package gs;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class GroupingAnagram {
    public static void main(String[] args) {
        List<String> anagrams = Arrays.asList("eat", "tea", "tan", "ate", "nat", "bat");

        var x=anagrams.stream().collect(Collectors.groupingBy(GroupingAnagram::sort));
        System.out.println(x);
    }

    private static String sort(String t) {
        char[] ch = t.toCharArray();
        Arrays.sort(ch);
        return new String(ch);
    }
}
