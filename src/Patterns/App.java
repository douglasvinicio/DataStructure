package Patterns;

public class App {
    public static void main(String[] args) {
        Singleton s = Singleton.getInstance();
        s.showMessage();

        Singleton s1 = Singleton.getInstance();
        s1.showMessage();

        Singleton s2 = Singleton.getInstance();
        s2.showMessage();
    }
}
