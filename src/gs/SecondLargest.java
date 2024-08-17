package gs;

public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {6,4,10,23,3,1};
        System.out.println(secondLargest(arr));
    }

    private static int secondLargest(int[] arr) {
        int min = Integer.MAX_VALUE;
        for(int x :arr){
            if(x<min){
                min =x;
            }
        }
        int secondMin = Integer.MAX_VALUE;

        for(int x : arr){
            if(x<secondMin && x!=min){
                secondMin = x;
            }
        }
        return  secondMin;
    }
}
