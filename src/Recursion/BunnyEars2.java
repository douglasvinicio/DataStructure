package Recursion;

// Odd bunnies count 2 ears , Even count 3 ears

public class BunnyEars2 {
    public static void main(String[] args) {
        System.out.println(bunnyEars2(2));
    }

    public static int bunnyEars2(int n){
        if (n == 0)
            return 0;
        if (n % 2 == 0)
            return 3 + bunnyEars2(n - 1);
        else return 2 + bunnyEars2(n - 1);
    }
}
