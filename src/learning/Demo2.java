package learning;

import java.util.Arrays;

public class Demo2 {
    public static void main(String[] args) {
        String s = "Shintu";
        System.out.println(reverseString(s));
    }

    public static String reverseString(String str) {
        char[] chars = str.toCharArray();
        int length = chars.length;
        char[] reverseArray = new char[chars.length];
        for (int i = 0; i < chars.length; i++) {
            reverseArray[i] = chars[length - 1];
            length = length - 1; // 5 4

        }
        //return Arrays.toString(reverseArray); returns the array in [u,t,n,i,h,s] format. but we need it as utnihs.
        return String.valueOf(reverseArray); // will give the desired output.


    }
}





