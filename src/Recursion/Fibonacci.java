package Recursion;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fibonacci(10));
        System.out.println(fibonacci(11));
        System.out.println(fibonacci(12));
        System.out.println(fibonacci(13));
    }

    public static int fibonacci(int n){
        if (n <= 1)
            return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
