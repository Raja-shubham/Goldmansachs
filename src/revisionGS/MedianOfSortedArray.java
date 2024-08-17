package revisionGS;

public class MedianOfSortedArray {
    public static void main(String[] args) {
        int[] arr1 = {1,3};
        int[] arr2 = {2,4};

        System.out.println(median(arr1,arr2));
    }

    private static double median(int[] arr1, int[] arr2) {
        int[] res = new int[arr2.length+arr1.length];
        int i=0, j=0, k =0;
        double ans =0.0;
        while(i<arr1.length && j<arr2.length){
            if(arr1[i]<=arr2[j]){
                res[k++] = arr1[i++];
            }
            else if(arr1[i]>arr2[j]){
                res[k++] = arr2[j++];
            }
        }
        while(i<arr1.length){
            res[k++]= arr1[i++];
        }
        while(j<arr2.length){
            res[k++]= arr2[j++];
        }
        if(res.length%2==1)
            return res[res.length/2];
        else{
            int mid1 = res.length/2;
            int mid2 = mid1-1;
            ans = (res[mid1]+res[mid2]);
        }
        return ans/2;
    }
}
