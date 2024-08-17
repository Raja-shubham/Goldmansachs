package practiceInterview;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamApiQuestions {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1,2,5,6,7,9,10,220,2,220,6,7,9);
        // 2nd highest no.
        var xx = integers.stream().distinct().sorted((e1,e2)->e2.compareTo(e1)).skip(1).findFirst().get();
        System.out.println("highest no "+ xx);
        var resu = integers.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(resu + " try");
         List<String> stringList = Arrays.asList("eat", "tea", "tan", "ate", "nat", "bat");
         List<List<Integer>> integerList = Arrays.asList(Arrays.asList(1,2,3),Arrays.asList(4,5,6),Arrays.asList(7,8,9));
        List<Employee> employees = Arrays.asList(
                new Employee("John", "Doe", 30, 50000),
                new Employee("Jane", null, 25, 60000),
                new Employee("John", "xu", 25, 1250),
                new Employee("John", null, 30, 7000),
                new Employee("Jane", "Doe", 30, 550)
        );

        // square of even no.
        System.out.println(integers.stream().filter(integer->integer%2==0).map(x->x*x).collect(Collectors.toList()));
        // upper case
        System.out.println(stringList.stream().map(String::toUpperCase).collect(Collectors.toList()));
        // average of list of integers
        System.out.println(integers.stream().mapToInt(x->x).average().getAsDouble());
        // sort the list of string into reverse order
        System.out.println(stringList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()));
        // collect distinct element from list of integer
        System.out.println(integers.stream().distinct().collect(Collectors.toList()));
        // max value from list
        System.out.println(integers.stream().mapToInt(x->x).max().getAsInt());
        // group list of string by their first character
        System.out.println(stringList.stream().collect(Collectors.groupingBy(x->x.charAt(0))));
        // Flatten a list of lists of integers into a single list of integers
        System.out.println(integerList.stream().flatMap(x->x.stream()).collect(Collectors.toList()));
       //  count the strings
        System.out.println(stringList.stream().count());
        // sort it with lastName
        System.out.println(employees.stream().filter(x->x.getLastname()!=null).sorted(Comparator.comparing(Employee::getLastname)).collect(Collectors.toList()));
        // Use a lambda expression to iterate over a list and print each element
        integers.stream().map(x->x).collect(Collectors.toList());
        // Create a custom functional interface and use it with a lambda expression.
        int temp = 6;
        Double d = (x)->x*x;
        int res = d.twice(temp);
        System.out.println(res);
        // Implement a method reference for a static method
        List<String> in = Arrays.asList("a", "e", "k");
        System.out.println(in.stream().map(Double::vowels).collect(Collectors.toList()));
        List<String> stringList1 = Arrays.asList("eat", "tea", "tan", "ate", "nat", "bat", null);
        var cc = Optional.of(stringList1);
        List<String> processedList = cc.map(list -> list.stream()
                        .map(str -> Optional.ofNullable(str)
                                .map(String::toUpperCase)
                                .orElse("NULL VALUE"))
                        .collect(Collectors.toList()))
                .orElseGet(() -> Arrays.asList("not"));
        System.out.println(processedList);
        // count the frequency of words in a string
        String text = "This is a test. This test is only a test.";
        String str[]  = text.split(" ");
        var z=Stream.of(str).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(z);
        // sort the map on the value in reversed order
        z.entrySet().stream().sorted(Map.Entry.<String,Long>comparingByValue().reversed())
                .limit(3)
                .collect(Collectors.toMap(Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1, e2) -> e1,LinkedHashMap::new));
        var di =z.entrySet().stream().sorted(Comparator.comparing(Map.Entry<String,Long>::getValue).reversed()).collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,(e1,e2)->e1,LinkedHashMap::new));
        System.out.println(di+ " test ");
        // find the length of longest word
        String input = "The quick brown fox jumps over the lazy dog aeiou";
        var t=Arrays.stream(input.split(" ")).map(x->x.length()).sorted(Comparator.reverseOrder()).findFirst().orElse(-1);
        System.out.println(t);
        // given a string find the word with max no of vowel
//        Arrays.stream(input.split(" ")).map(x->x.charAt())
//       Given a sentence find the word that has the highest length
        String s = "I am interested123455 to grow in my organization";
        var t1=Arrays.stream(s.split(" ")).filter(word -> !word.matches(".*\\d.*")).map(x->x.length()).sorted(Comparator.reverseOrder()).findFirst().orElse(-1);
        System.out.println(t1+ "test2");
        //Remove duplicates from string and return in same order
        String str1 = "dabfcadef";
        System.out.println( str1.chars().mapToObj(c->(char)c).collect(Collectors.toSet()).stream().map(String::valueOf).collect(Collectors.joining()));

        String tem = "aaabbcaaddeee";
        String str3 = "aaabbcaabbddd";
        List<String> result = countConsecutiveCharacters(str3);
        result.forEach(System.out::println);
        // tamojit question
        List<Integer> test = Arrays.asList(2, 34, 54, 23, 33, 20, 59, 11, 19, 37 );
        var c=test.stream().collect(Collectors.groupingBy(n->n/10 * 10));
        System.out.println(c+"checking results");
    }

    public static List<String> countConsecutiveCharacters(String str) {
        // Convert the string into a list of characters
        List<Character> characters = str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.toList());
        // "aaabbcaabbddd";
        // Initialize an empty list to store the result
        List<String> result = new ArrayList<>();

        // Use IntStream to iterate over the character list
        IntStream.range(0, characters.size())
                .forEach(i -> {
                    // If it's the first character or different from the previous one, start counting
                    if (i == 0 || !characters.get(i).equals(characters.get(i - 1))) {
                        // Initialize the count
                        int count = 1;
                        // Count the consecutive identical characters
                        while (i + count < characters.size() && characters.get(i + count).equals(characters.get(i))) {
                            count++;
                        }
                        // Add the result to the list
                        result.add(characters.get(i) + "=" + count);
                    }
                });

        return result;
    }
    @FunctionalInterface
    interface Double{
        int twice(int x);

         static String vowels(String st){
            List<String> temp = Arrays.asList("a", "e","i", "o", "u");
            if(temp.contains(st))
                return st;
            else
                return "";
        }
    }

    public static Optional<String> calculate(List<String> strings){
        List<String> st = strings.stream()
                .filter(x->x.length()>=5).collect(Collectors.toList());
        if(!st.isEmpty()){
            return Optional.of("true");
        }
        else
            return Optional.of("false");
    }
}
