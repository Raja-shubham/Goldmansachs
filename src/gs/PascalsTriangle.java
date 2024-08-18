package gs;

public class PascalsTriangle {
    public static void main(String[] args) {
        int row = 5;
        int column = 3;

        System.out.println(pascle(row-1,column-1));
    }

    private static int pascle(int row, int column) {
        int ans=1;
        for(int i=0;i<row;i++){
            ans*= (row-i);
            ans = (ans/column+i);
        }
        return ans;
    }
}
