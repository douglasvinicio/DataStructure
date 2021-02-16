package Patterns;

public class Singleton {

    private static Singleton instance = new Singleton();
    int counter = 0;

    private Singleton(){
        counter++;
    }

    public static Singleton getInstance(){
        return instance;
    }

    public void showMessage(){
        System.out.println("Hello World from singleton!");
        System.out.println("Number of instances " + counter);
    }
}
