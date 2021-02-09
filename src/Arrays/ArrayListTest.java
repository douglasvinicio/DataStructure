package Arrays;

import java.util.ArrayList;

class Person{

    private int age;
    private String name;


    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
public class ArrayListTest {

    public static void main(String[] args) {
        ArrayList<Person> personArray = new ArrayList<>();

        personArray.add(new Person(18, "Joan"));
        personArray.add(new Person(38, "John"));
        personArray.add(new Person(68, "Doe"));

        for (Person p : personArray){
            System.out.println(p);
        }
    }


}
