package learning;

public class ReverseofString {
    public static void main(String[] args) {
        String str="Shintu";
        String str1="Bichu";
        System.out.println("the reverse of"+str+" is "+reverseString(str));
        System.out.println("the reverse of "+str1+" is "+reverseString(str1));

    }
    public static String reverseString(String rev){
        int length=rev.length();
        String reverse="";
        for (int i=length-1;i>=0;i--){
            reverse=reverse+rev.charAt(i);
        }
        return reverse;
    }
}
