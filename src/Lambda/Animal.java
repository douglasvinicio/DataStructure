package Lambda;

public class Animal {
    private String name;
    private boolean canHop;
    private boolean canSwim;

    public boolean canHop(){
        return canHop;
    }

    public boolean canSwim(){
        return canSwim;
    }

    public Animal(String name, boolean canHop, boolean canSwim) {
        this.name = name;
        this.canHop = canHop;
        this.canSwim = canSwim;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", canHop=" + canHop +
                ", canSwim=" + canSwim +
                '}';
    }
}

interface checkTrait{
    boolean test(Animal a);
}

class checkIfSwim implements checkTrait{

    @Override
    public boolean test(Animal a) {
        return a.canSwim();
    }
}

class checkIfHopper implements checkTrait{

    @Override
    public boolean test(Animal a) {
        return a.canHop();
    }
}

