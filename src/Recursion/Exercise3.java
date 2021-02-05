package Recursion;

public class Exercise3 {

    // Math.pow (2,3);

    public static void main(String[] args) {

        int x = 4;
        int y = 5;

        System.out.println(pow(x, y));
    }

    public static int pow(int base, int n){
        // The stop condition must be when base reaches the number of n
        if (n == 0) return 1;
        return base * pow(base, n - 1);
    }
}
// Write a method to calculate pow(base, n)