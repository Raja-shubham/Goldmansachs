package gs;

public class DotProduct {
    public static void main(String[] args) {
        double[] arr1 = {1,3};
        double[] arr2 = {3,2};
        double res = dotProduct(arr1, arr2);

        System.out.println(res);
    }

    private static double dotProduct(double[] arr1, double[] arr2) {
        double multi = 0;
        if(arr1.length!=arr2.length)
            System.out.print("not possible as length is not same");
        for(int i=0;i<arr1.length;i++){
            multi = multi+ arr1[i]*arr2[i];
        }
        return multi;
    }
}
