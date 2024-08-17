import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        String str = "Hello World this is Java interview Hello world";
        System.out.println( Stream.of(str).collect(Collectors.groupingBy(Function.identity(),Collectors.counting())));;

    }
}
