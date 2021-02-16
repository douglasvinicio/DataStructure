package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] numbers = new int[n];
        // populate the array
        for(int i = 0; i<n;i++){
            numbers[i] = scan.nextInt();
        }

        int total = 0;
        int sum;
        // For each starting position
        for(int i = 0; i < n; i++){
            sum = 0;
            for(int j = i; j<n; j++){
                sum += numbers[j];
                if(sum < 0){
                    total++;
                }
            }
        }
        System.out.println(total);



    }
}
