package gs;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {1,2,3,6,8,4,9};
        int target = 9;
        Map<Integer, Integer> map = new HashMap<>();

        int sum =0;
        for(int i=0;i<arr.length;i++){
            sum = target- arr[i];
            if(map.containsKey(sum)){
                System.out.println("the pair is : "+ arr[i]+" " +sum);
            }
            map.put(arr[i], map.getOrDefault(arr[i],0)+1);
        }
    }
}
