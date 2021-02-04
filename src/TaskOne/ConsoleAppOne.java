package TaskOne;

import java.util.Random;
import java.util.Scanner;

public class ConsoleAppOne {

    static Scanner input = new Scanner(System.in);
    int counter = 0;

    public static void main(String[] args) {

        int arraySize;

        // User input validator
        do {
            System.out.println("Please enter the size of the array.\n" +
                    "** Remember ** It must be 1 or greater.");
            while (!input.hasNextInt()){
                String userInput = input.next();
                System.out.println("The value you entered is not a valid array size. Please try again.");
                System.exit(0);
            }
            arraySize = input.nextInt();

            if (arraySize < 0){
                System.out.println("Please enter a positive value. Re-run the program and try again");
                System.exit(0);
            } else if (arraySize > 100){
                System.out.println("Please select a value lower than 100.");
                System.exit(0);
            }
        }
        while (arraySize < 0);

        // If user input is valid -> Assign size entered by user to new array of int
        int[] myArray = new int[arraySize];

        // Generate random number from 1 to 100
        Random rand = new Random();
        int upperbound = 100;

        // Assign random numbers to the array
        for (int i = 0; i < myArray.length; i++){
            myArray[i] = rand.nextInt(upperbound);
        }

        int counter = 0;

        System.out.println("The array lenght is " + arraySize + "\nThose are the values inside the array :");

        // Displaying all items of the array on the same line
        for(int i=0; i < myArray.length ; i++) {
            System.out.printf("%s%d", i == 0 ? "" : "," , myArray[i]);
        }

        System.out.println();
        System.out.println("Those are the prime numbers: ");
        boolean isFirst = true;

        for(int i=0; i < myArray.length ; i++) {
            if (checkPrime(myArray[i])){
                System.out.printf("%s%d", isFirst ? "" : "," , myArray[i]);
                isFirst = false;
            }
        }
    }

    private static boolean checkPrime(int n){
        int i, m = 0, flag = 0;

        m = n / 2;

        boolean isPrime = true;

        if(n == 0 || n == 1){
            isPrime = false;
        }
        else {
            for(i=2;i<=m;i++){
                if(n%i==0){
                    isPrime = false;
                    flag=1;
                    break;
                }
            }
            if(flag==0){
                isPrime = true;
            }
        }
        return isPrime;
    }
    private static boolean isPrime(int number){
        for (int i = 2; i <= number ; i++){
            if (number % i == 0 ){
                return false;
            }
        }
        return true;
    }
}
