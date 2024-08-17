package revisionGS;

public class LongestUniformSubstring {
    public static void main(String[] args) {
        String input1 = "aabbbbbCdAA";
        int[] result1 = longestUniformSubstring(input1);
        System.out.println("[" + result1[0] + ", " + result1[1] + "]"); // Expected output: [2, 5]

        String input2 = "abbbccda";
        int[] result2 = longestUniformSubstring(input2);
        System.out.println("[" + result2[0] + ", " + result2[1] + "]"); // Expected output: [1, 3]
    }

    private static int[] longestUniformSubstring(String input) {
        int left =0, right =0;
        int maxLength = 0, maxStart =0, len =0;

        while(right<input.length()){
            if(input.charAt(left)!=input.charAt(right)){
                left=right;
            }
            int currLen = right-left+1;
                if(currLen>maxLength){
                    maxLength = currLen;
                    maxStart = left;
                }
                right++;
            }
        return new int[]{maxStart,maxLength};
        }

}
