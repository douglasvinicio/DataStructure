package Recursion;

public class ChangePi {

    public static void main(String[] args) {

        String str = "xpiijksgjpidkgjpidspipipis";

        System.out.println(changePi(str));

        System.out.println(str.charAt(0));
        System.out.println(str.substring(1));
    }

    public static String changePi(String str){
        if (str.length() <= 1)
            return str;

        if (str.substring(0,2).equals("pi")){
            return "3.14" + changePi(str.substring(2));
        }

        return str.charAt(0) + changePi(str.substring(1));
    }

}
//    Given a string, compute recursively (no loops) a new string where all appearances of "pi" have been replaced by "3.14".
//
//
//    changePi("xpix") → "x3.14x"
//    changePi("pipi") → "3.143.14"
//    changePi("pip") → "3.14p"