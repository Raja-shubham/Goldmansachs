package revisionGS;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AverageCalculate {
    public static void main(String[] args) {
        String[][] scores = {
                { "Bobby", "87" },
                { "Charles", "100" },
                { "Eric", "64" },
                { "Charles", "22" }
        };

        System.out.println(bestAverageGrade(scores));
    }

    private static long bestAverageGrade(String[][] scores) {
        Map<String, List<Integer>> scoreMap = new HashMap<>();
        long ans = 0l;
        for(String[] s : scores){
            String name = s[0];
            int score = Integer.parseInt(s[1]);
            scoreMap.computeIfAbsent(name , k->new ArrayList<>()).add(score);
        }
        int bestAverage =Integer.MIN_VALUE;
        for(Map.Entry<String, List<Integer>> map: scoreMap.entrySet()){
            List<Integer> temp = map.getValue();
            int sum =0;
            for(int x : temp){
                sum+=x;
            }
            sum = sum/temp.size();
            bestAverage = Math.max(bestAverage,sum);
        }
        return bestAverage;
    }
}
