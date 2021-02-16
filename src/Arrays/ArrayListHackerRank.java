package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListHackerRank {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter how many lines you want :");
        int size = input.nextInt();

        ArrayList[] array = new ArrayList[size];

        for(int i = 0; i < size; i++){
            System.out.println("How many integers on this line? ");
            int numOfInt = input.nextInt();
            array[i] = new ArrayList();

            for(int j = 0; j < numOfInt; j++){
                System.out.println("Enter the " + (j + 1) + "st number:" );
                array[i].add(input.nextInt());
            }
        }

        for (int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].size(); j++){
                System.out.printf("%s%d", j==0 ? "" :  ",",array[i].get(j));
            }
            System.out.println();
        }

        System.out.println("Now enter how many positions you want to fetch : ");
        int queries = input.nextInt();

        for(int i = 0; i < queries; i++){
            System.out.println("Enter the row : ");
            int x = input.nextInt();
            System.out.println("Enter the column :");
            int y = input.nextInt();

            try{
                System.out.println(array[x - 1].get(y - 1));
            }
            catch(Exception e){
                System.out.println("ERROR!");
            }
        }
    }
}
