package gs;

public class RainWaterTrapping {
    public static void main(String[] args) {
        int[] height1 = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        System.out.println(trap(height1)); // Output: 6

        int[] height2 = {4, 2, 0, 3, 2, 5};
        System.out.println(trap(height2)); // Output: 9
    }

    private static int trap(int[] height) {
        int left[] = new int[height.length];
        int right[] = new int[height.length];
        int res =0;
        left[0]=height[0];
        for(int i=1;i<height.length;i++){
            left[i]= Math.max(height[i],left[i-1]);
        }
        right[height.length-1]=height[height.length-1];
        for(int i = height.length-2;i>=0;i--){
            right[i] = Math.max(height[i], right[i+1]);
        }

        for(int i=0;i< height.length;i++){
            res = res + Math.min(left[i], right[i]) - height[i];
        }
         return res;
    }
}
