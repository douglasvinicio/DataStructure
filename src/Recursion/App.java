package Recursion;

public class App {
    public static void main(String[] args) {

        int n = 20;

        System.out.printf("The fibo of %d is %d\n", n , fibo(n));

        // Factorial -> 5! = 5 * 4 * 3 * 2 * 1 => 5 * 4!

        System.out.printf("The factorial of %d is %d" , n , fact(n));
    }
    public static int fibo(int n ){
        // Exit condition
        if (n == 1) return 1;
        if (n == 0) return 0;
        return fibo(n-1) + fibo(n -2);
    }

    private static int fact(int n){
        // If less than 1 throw IllegalArgument
        if (n == 1 || n == 0) return 1;
        return n * fact( n- 1);
    }
}
