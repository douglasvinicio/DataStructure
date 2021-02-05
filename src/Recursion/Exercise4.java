package Recursion;
// Count the number of lowercase "hi" appears in the string with recursive.
public class Exercise4 {
    public static void main(String[] args) {

        String str = "hihihihKKhiLfbhiFhdghi";

        System.out.println(countOfHi(str));

    }

    private static int countOfHi(String str){
        // Exit condition
        if (str.length() < 2){
            return 0;
        }
        if (str.substring(0, 2).equals("hi")){
            return 1 + countOfHi(str.substring(2));
        }
        return countOfHi(str.substring((1)));
    }

    // My essay to solve this =(
//    public static int countHi(String str){
//        int counter = 0;
//
//        if (str.contentEquals("hi")) {
//            counter++;
//            str.replaceFirst("hi", "");
//            return countHi(str);
//        }
//         else {
//             return counter;
//        }
//    }
}
