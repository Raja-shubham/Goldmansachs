package gs;

public class MedianSortedArray {
    public static void main(String[] args) {
        int[] arr1 = {1,3};
        int[] arr2 = {2,4};
        int[] res = new int[arr2.length+arr1.length];
        int i=0,j=0,k=0;
        while(i< arr1.length && j<arr2.length){
            if(arr1[i]<arr2[j]){
                res[k]=arr1[i];
                i++;
                k++;
            }
            else if(arr1[i]>=arr2[j]){
                res[k]=arr2[j];
                k++;
                j++;
            }
        }
        while(i<arr1.length){
            res[k++] = arr1[i++];
        }
        while(j<arr2.length){
            res[k++] = arr2[j++];
        }
        if(res.length%2==1)
            System.out.println(res[res.length/2]);
        else{
            int mid1 = res.length/2;
            int mid2 = mid1 -1;

            double ans = res[mid1]+ res[mid2];
            System.out.println(ans/2);
        }
    }
}
