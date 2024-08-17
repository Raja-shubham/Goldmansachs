package gs;

import java.util.ArrayList;

public class PrimeFactor {
    public static void main(String[] args) {
        int z= 24;
        ArrayList<Integer> primeFactors = new ArrayList<>();

        for (int i = 2; i <= z / 2; i++) {
            // While i divides x, add i and divide x
            while (z % i == 0) {
                primeFactors.add(i);
                z /= i;  // Update x
            }
        }

        // If x is still greater than 1, it must be a prime number
        if (z > 1) {
            primeFactors.add(z);
        }
        System.out.println(primeFactors);
    }
}
