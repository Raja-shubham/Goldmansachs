package gs;

public class LongestUniformSubstring {

    public static int[] longestUniformSubstring(String input) {
        if (input == null || input.isEmpty()) {
            return new int[]{-1, 0}; // Return -1, 0 for empty input
        }

        int maxLen = 1; // Initialize max length of uniform substring
        int maxStart = 0; // Initialize starting index of the max uniform substring
        int left = 0;// Start of the current uniform substring
        int right = 0;
        while(right<input.length()){
            if(input.charAt(right)!=input.charAt(left)){
                left = right;
            }
            int currLen = right-left+1;
            if(currLen>maxLen){
                maxLen = currLen;
                maxStart = left;
            }
            right++;
        }

        return new int[]{maxStart, maxLen};
    }

    public static void main(String[] args) {
        // Test cases
        String input1 = "aabbbbbCdAA";
        int[] result1 = longestUniformSubstring(input1);
        System.out.println("[" + result1[0] + ", " + result1[1] + "]"); // Expected output: [2, 5]

        String input2 = "abbbccda";
        int[] result2 = longestUniformSubstring(input2);
        System.out.println("[" + result2[0] + ", " + result2[1] + "]"); // Expected output: [1, 3]
    }
}
