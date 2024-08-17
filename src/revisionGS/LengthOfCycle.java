package revisionGS;

public class LengthOfCycle {
    public static void main(String[] args) {
        int[] arr1 = {0,1,2,3,4};
        int startIndex1 = 0;
        int[] arr2 = {1,0,3,4,2};
        int startIndex2 = 2;
        System.out.println(lengthOfCycle(arr2,startIndex2));

        System.out.println(lengthOfCycle(arr1, startIndex1));
    }

    private static int lengthOfCycle(int[] arr, int startIndex) {
        int slow = arr[startIndex];
        int fast = arr[arr[startIndex]];
        int count =1;
        if (arr == null || arr.length == 0)
            return -1;
        while (slow!=fast){
            if (fast >= arr.length)
                return -1;
            slow = arr[slow];
            fast = arr[arr[fast]];
            count++;
        }

        return count;
    }
}
