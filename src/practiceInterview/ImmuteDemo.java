package practiceInterview;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Map.Entry.comparingByValue;

public final class ImmuteDemo {

    private final String classes;
    private final int roll;
    private final Immute immute;

    public ImmuteDemo(String classes, int roll, Immute immutes) {
        this.classes = classes;
        this.roll = roll;
        this.immute = new Immute(immutes.getName(),new ArrayList<>(immutes.getGf()));
    }

    public String getClasses() {
        return classes;
    }

    public int getRoll() {
        return roll;
    }
    public Immute getImmute() {
        return new Immute(immute.getName(), immute.getGf());
    }

    public static void main(String[] args) {
        Immute im = new Immute("shubham", List.of(1,2,3));
        ImmuteDemo imd = new ImmuteDemo("JAVA",21,im);
        im.getGf().add(21);
        imd.getImmute().getGf().add(34);
        System.out.println(im.getGf());
        System.out.println(imd.getImmute().getGf());
        String str = "Hello world this is Java interview Hello world";
        String[] s = str.split(" ");
        var x= Stream.of(s).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        x.entrySet().stream().sorted((e1,e2)->e2.getValue().compareTo(e1.getValue())).forEach(entry->System.out.print(entry.getKey() + " " + entry.getValue()));
        x.entrySet().stream().sorted(Map.Entry.<String,Long>comparingByValue().reversed()).forEach(entry->System.out.print(entry.getKey() + " " + entry.getValue()));
    }
}
