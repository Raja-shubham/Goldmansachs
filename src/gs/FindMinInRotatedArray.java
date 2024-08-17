package gs;

public class FindMinInRotatedArray {

    public static int FindMin(int[] a) {
        if (a == null || a.length == 0) {
            throw new IllegalArgumentException("Input array must not be null or empty");
        }

        int left = 0;
        int right = a.length - 1;

        while (left < right) {
            int mid = (left + right) / 2;

            if (a[mid] > a[right]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        return a[left];
    }

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
}
