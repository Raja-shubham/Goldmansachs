package gs;

public class LengthOfCycle {
    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4};
        int startIndex =0, count =1;
        int slow = arr[startIndex];
        int fast = arr[arr[startIndex]];

        while(slow!=fast){
            slow = arr[slow];
            count++;
            fast = arr[arr[fast]];
        }
        System.out.println(count);
    }
}
