package Tasks;

import java.util.Random;
import java.util.Scanner;

public class ExerciseTwo {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        // Declaring two dimensional array
        int [][] twoDimArray;

        // Try and catch to handle user input. Must be integer and positive
        try{
            // Read user input
            System.out.println("Enter the height size of the array: ");
            int rowSize = input.nextInt();
            System.out.println("Enter the width size of the array: ");
            int columnSize = input.nextInt();

            if (rowSize < 1 || columnSize < 1){
                throw new IllegalArgumentException("User input error. \nNumber must be greater than 1. Please correct the values and try again.");
            }

            // Defining array size accordingly to user input
            twoDimArray = new int[rowSize][columnSize];

            // Generate random number from 1 to 100
            Random rand = new Random();

            System.out.printf("The 2D array has %d rows and %d columns.\nThose are the values inside the array: \n", rowSize,columnSize);

            for (int row = 0; row < twoDimArray.length; row++){
                for (int column = 0; column < twoDimArray[row].length; column++){
                    twoDimArray[row][column] = rand.ints(-99, 99).findFirst().getAsInt();
                    System.out.printf("%s%4d", column==0 ? "" :  ",",twoDimArray[row][column]);
                }
                System.out.println();
            }

            // 1 - Sum of all numbers in the array
            int totalSum = 0;
            for (int row = 0; row < twoDimArray.length; row++){
                for (int column = 0; column < twoDimArray[row].length; column++){
                    totalSum += twoDimArray[row][column];
                }
            }
            System.out.println("The sum of all the numbers in the array is => " + totalSum);

            // 2 - Sum of each row of the array
            System.out.println("2 - Sum of each row of the array");
            int[] eachRowTotal = new int[rowSize];
            for (int row = 0; row < twoDimArray.length; row++){
                for (int column = 0; column < twoDimArray[row].length; column++){
                    eachRowTotal[row] += twoDimArray[row][column];
                }
                System.out.printf("The sum of row %d is : %d\n" , row, eachRowTotal[row]);
            }

            // 3 - Sum of each of the column of the array
            System.out.println();
            System.out.println("3 - Sum of each of the column of the array");
            int[] eachColumnTotal = new int[columnSize];

            for (int i = 0; i < twoDimArray[0].length; i++){
                for (int j = 0; j < twoDimArray.length; j++){
                    eachColumnTotal[i] += twoDimArray[j][i];
                }
                System.out.printf("The sum of column %d is : %d\n" , i, eachColumnTotal[i]);
            }
            System.out.println();

            //4) Standard deviation of all numbers in the array
            // First find the mean / average
            // this formula DOES NOT work with Jagged Array
            double mean = totalSum / (rowSize * columnSize);
            System.out.println("The average is " + mean);

            double standardDeviation = 0.0;

            // Square all the numbers
            for (int i = 0; i < twoDimArray.length; i++){
                for (int j = 0; j < twoDimArray[i].length; j++){
                    standardDeviation += Math.pow(twoDimArray[i][j] - mean, 2);
                }
            }

            standardDeviation = Math.sqrt(standardDeviation/(rowSize * columnSize));

            System.out.println("The standard deviation is " + standardDeviation);

            //5) Find pairs of numbers in the array whose sum is a prime number and display those pairs and their sum.
            //(assume that negative number is not a prime number)
            findPrimeNumbers(twoDimArray);
        }
        catch (IllegalArgumentException exc){
            System.out.println(exc.getMessage());
        }
    }

    public static boolean isPrime(int number){
        for (int i = 2; i <= number ; i++){
            if (number % i == 0 ){
                return false;
            }
        }
        return true;
    }

    public static void findPrimeNumbers(int[][] array){
        for (int row = 0; row < array.length; row++){
            for (int col = 0; col < array[row].length; col++ ){

                for (int row2 = row; row2 < array.length; row2++){
                    for (int col2 = col; col2 < array[row2].length; col2++){
                        if (row2 == row && col2 <= col){
                            continue;
                        }
                        int val = array[row][col] + array[row2][col2];
                        if (isPrime(val)){
                            System.out.printf("Prime sum %d of [%d,%d] + [%d,%d]\n" ,val,row,col,row2,col2);
                        }
                    }
                }
            }
        }
    }
}

/* Exercise Description:
Ask user for width and height of an array.
Values must be numerical, 1 or greater.
If not display an error message and end the program.

Allocate two-dimensional array of integers of given width and height.

Generate random values from -99 to 99 and assign to each cell of the array.

Display the array to the user in a user-friendly manner, where columns have all the same width (commas align). Example:

-99, 2 , 22
15, -71, 5

Compute and display:
1) Sum of all numbers in the array
2) Sum of each of the row of the array
3) Sum of each of the column of the array
4) Standard deviation of all numbers in the array (google it !!!)
5) Find pairs of numbers in the array whose sum is a prime number and display those pairs and their sum.
(assume that negative number is not a prime number)
 */