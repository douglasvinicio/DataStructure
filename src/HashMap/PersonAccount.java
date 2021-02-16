package HashMap;

import java.util.HashMap;

class Person {
    String name;
    int age;
}

class Account{
    int accNum;
    double balance;
}

public class PersonAccount {
    public static void main(String[] args) {
        HashMap<Person, Account> hash = new HashMap();
    }
}
