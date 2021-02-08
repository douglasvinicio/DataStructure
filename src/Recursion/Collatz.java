package Recursion;

// Calculate how many steps it takes to get back to one
// If n is 1, stop - > Base case
// If n is even -> n / 2
// If n is odd -> 3n + 1

import java.util.Scanner;

public class Collatz {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number to check how many steps it will take to get back to one: ");
        int number = input.nextInt();

        System.out.printf("It took %d steps to get back to 1.",collatz(number));
    }

    public static int collatz(int n){
        if (n == 1)
            return 0;
        //Checking if is even
        else if ((n % 2) == 0){
            return 1 +  collatz(n / 2);
        }
        // Else for odd
        else{
            return 1 + collatz(n * 3 + 1);
        }
    }
}
