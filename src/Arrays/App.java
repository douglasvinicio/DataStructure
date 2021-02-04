package Arrays;

public class App {

    public static void main(String[] args) {

        int[] intArray = new int[10];
        int x = intArray.length;

        intArray[0] = 12;


        int[] myIntArray;
        myIntArray = new int[2];

        // or in just one line
        int[] mySecondArray = new int[2];

        //Array Literal
        int[] arrayLiteral = new int[]{1,2,4,60};

        // Complexity => O(n) it needs n to navigate to each element. We always count the worst case.
        // If I want to print 60, how many steps I need to jump, until I print 60?
        for (int i = 0; i < arrayLiteral.length; i++){
            System.out.println(arrayLiteral[i] + " ");
        }
    }

}
