package revisionGS;

public class SmallestRotatedArray {
    public static void main(String[] args) {
        int[] array1 = {3, 4, 5, 6, 1, 2};
        System.out.println(FindMin(array1)); // Output: 1

        int[] array2 = {2, 1};
        System.out.println(FindMin(array2)); // Output: 1

        int[] array3 = {4, 5, 6, 7, 0, 1, 2};
        System.out.println(FindMin(array3)); // Output: 0

        int[] array4 = {11, 13, 15, 17};
        System.out.println(FindMin(array4)); // Output: 11
    }

    private static int FindMin(int[] array1) {
        int left = 0;
        int right = array1.length-1;
        while(left<right){
            int mid = (right+left)/2;
            if(array1[mid]>array1[right]){
                left = mid+1;
            }
            else{
                right = mid;
            }
        }
        return array1[left];
    }
}
