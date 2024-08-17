package gs;

public class ConvertStringToInteger {
    public static void main(String[] args) {
        String str1 = "-1234";
        String str2 = "234";
        System.out.println(atoi(str1));
        System.out.println(atoi(str2));

    }

    private static int atoi(String str2) {
        int res = 0, i=0;
        int sign = 1;

        str2 = str2.trim();
        if(str2.charAt(0)<'0'){
            sign = -1;
            i++;
        }

        while(i<str2.length()){
            char ch = str2.charAt(i);
            int tem = ch-'0';
            res = res*10 + tem;
            i++;
        }
        return res*sign;
    }
}
