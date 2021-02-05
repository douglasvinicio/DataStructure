package Recursion;
// Given a string like x = "cccccctttYYYYxTx", replace all lower case "x" into lower case "y".
// Method ChangeXY(String x);
public class Exercise5 {

    public static void main(String[] args) {
        String x = "cccccctttYYYYxTx";

        System.out.println(changeXY(x));
    }

    public static String changeXY(String str){
        // Exit condition
        if (str.length() == 0){
            return str;
        }
        if (str.charAt(0) == 'x'){
            return 'y' + changeXY(str.substring(1));
        }
        return str.charAt(0) + changeXY(str.substring(1));
    }

    // My essay
//    public static String changeXY(String str){
//        // Exit condition
//        if (!str.contains("x")){
//            return "It does not contain x : " + str;
//        }
//        if (str.charAt(0) == 'x'){
//            str.replaceFirst("x", "y");
//            return changeXY(str.substring(1));
//        }
//        return "It has x " + str;
//    }
}
