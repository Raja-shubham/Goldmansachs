package gs;

import java.util.Arrays;

public class GS {

//    Given 2 ascending sorted arrays, merge the arrays into a single array
//            num1 = {1,2,3,5,6,9} num2 = {7,8}
    public static void main(String[] args) {
        int[] num1 = {1,2,3,5,6,9} ;
        int[] num2 = {7,8};
        int[] mergeOut = mergeSortArray(num1,num2);

        String str = "qwerty";
        StringBuilder sb = new StringBuilder();
        for(int i =str.length()-1;i>=0;i--){
            sb.append(str.charAt(i));
        }

        System.out.println(sb+" reverse");

        for(int num : mergeOut){
            System.out.println(num + " ");
        }

    }

    private static int[] mergeSortArray(int[] num1, int[] num2) {
        int[] res = new int[num1.length+num2.length];
        System.arraycopy(num1, 0, res,0, num1.length);
        System.arraycopy(num2, 0, res, num1.length, num2.length);
        Arrays.sort(res);
        return res;
    }
}
