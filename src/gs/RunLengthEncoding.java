package gs;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class RunLengthEncoding {
    public static void main(String[] args) {
        String str = "aabbbaa";
        List<Character> ch = str.chars().mapToObj(c->(char)(c)).collect(Collectors.toList());
        List<String> res = new ArrayList<>();
        IntStream.range(0,ch.size())
                .forEach(i->{
                    if(i==0 || !ch.get(i).equals(ch.get(i-1))){
                        int count = 1;
                        while(i+count<ch.size() && ch.get(i+count).equals(ch.get(i))){
                            count++;
                        }
                        res.add(ch.get(i)+""+count);
                    }

                });
        res.forEach(System.out::print);
    }
}
