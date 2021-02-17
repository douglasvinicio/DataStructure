package Lambda;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {

        List<Animal> animalList = new ArrayList<>();

        animalList.add(new Animal("Fish", false, true));
        animalList.add(new Animal("Kangaroo", true, false));
        animalList.add(new Animal("Rabbit", true, false));

        //print(animalList,new checkIfHopper());


        //print(animalList,new checkIfSwim());

        print(animalList, a -> a.canHop());
        print(animalList, a -> a.canSwim());


    }


    private static void print(List<Animal> animals, checkTrait checker){
        for (Animal animal : animals){
            if (checker.test(animal)){
                System.out.println(animal + " ");
            }
        }
    }
}
