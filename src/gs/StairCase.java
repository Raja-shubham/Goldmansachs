package gs;

public class StairCase {
    public static void main(String[] args) {
        int noOfStairs = 3;

        int res = uniqueCombinationRecursion(noOfStairs);
        System.out.println(res);
        int out = uniqueCombinationDP(noOfStairs);
        System.out.println(out+"from dp");
    }

    private static int uniqueCombinationDP(int noOfStairs) {

        if ( noOfStairs < 0) {
            return 0;
        }
        if (noOfStairs == 0) {
            return 1; // Only one way to stay at the bottom (doing nothing)
        }
        if (noOfStairs == 1) {
            return 1; // One way to reach the first step
        }
        if (noOfStairs == 2) {
            return 2; // Two ways: (1+1) or (2)
        }

        int[] dp = new int[noOfStairs+1];
        dp[0] = 1;
        dp[1] = 1;
        dp[2] = 2;

        for(int i =3;i<=noOfStairs;i++){
            dp[i] = dp[i-1]+dp[i-2]+dp[i-3];
        }
        return dp[noOfStairs];
    }

    private static int uniqueCombinationRecursion(int n) {

        if(n<0)
            return 0;
        if(n==0)
            return 1;

        return uniqueCombinationRecursion(n-3)+ uniqueCombinationRecursion(n-2)+ uniqueCombinationRecursion(n-1);
    }
}
