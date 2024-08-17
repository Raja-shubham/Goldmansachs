package gs;

public class Power10 {
    public static void main(String[] args) {
        double x = 300000000;
        System.out.println(isPowerOf10(x));
    }
   static boolean isPowerOf10(double x){
        while(x%10==0){
            x=x/10;
        }
        if(x==1)
            return true;

        return false;
    }
}
