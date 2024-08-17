package gs;

public class AddFraction {
    public static void main(String[] args) {
        double[] arr1 = {2,3};
        double[] arr2 = {3,2};
        double res = addFractions(arr1, arr2);

        System.out.println(res);
    }
   static double addFractions ( double[] fraction1, double[] fraction2 ){
        double a = fraction1[0]/fraction1[1];
        double b = fraction2[0]/fraction2[1];
        double sum = a+b;
        return sum;
    }
}
