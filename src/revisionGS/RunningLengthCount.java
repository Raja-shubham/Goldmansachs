package revisionGS;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class RunningLengthCount {
    public static void main(String[] args) {
        String str = "aabbbaa";
        List<String> ans = new ArrayList<>();
        var ch =str.chars().mapToObj(c->(char)c).collect(Collectors.toList());

        IntStream.range(0, ch.size())
                .forEach(i->{
                    if(i==0 || !ch.get(i).equals(ch.get(i-1))){
                        int count =1;
                        while(i+count<ch.size() && ch.get(i+count).equals(ch.get(i))){
                            count++;
                        }
                        ans.add(ch.get(i)+" "+count);
                    }
                });
        System.out.println(ans);
    }
}
