package gs;

import java.util.HashMap;
import java.util.Map;

public class DecimalConversion {
    public static void main(String[] args) {
        Long num =9l;
        Long den = 4l;
        System.out.println(vulgarToDecimal(num,den));
    }
    public static String vulgarToDecimal(Long numerator, Long denominator) {
        if (numerator == 0) {
            return "0";
        }

        StringBuilder result = new StringBuilder();

        // Determine the sign of the result
        if ((numerator < 0) ^ (denominator < 0)) {
            result.append("-");
        }

        // Work with absolute values to avoid dealing with negative numbers
        numerator = Math.abs(numerator);
        denominator = Math.abs(denominator);

        // Integer part
        long integerPart = numerator / denominator;
        result.append(integerPart);

        // Remainder part (initially numerator % denominator)
        long remainder = numerator % denominator;
        if (remainder == 0) {
            return result.toString(); // No fractional part
        }

        result.append(".");

        // Map to store remainders and their corresponding indices in the result
        Map<Long, Integer> remainderMap = new HashMap<>();

        while (remainder != 0) {
            if (remainderMap.containsKey(remainder)) {
                // Repeating remainder found
                int repeatIndex = remainderMap.get(remainder);
                System.out.println(repeatIndex+"index test");
                result.insert(repeatIndex, "(");
                result.append(")");
                break;
            }

            // Store the index of the first occurrence of this remainder
            remainderMap.put(remainder, result.length());
            System.out.println(result.length()+"test");

            remainder *= 10;
            long fractionalPart = remainder / denominator;
            result.append(fractionalPart);
            remainder %= denominator;
        }

        return result.toString();
    }
}
