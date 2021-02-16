package Tree;

public class App {

    public static void main(String[] args) {
        Tree intTree = new Tree();

        intTree.insert(25);
        intTree.insert(19);
        intTree.insert(30);
        intTree.insert(27);
        intTree.insert(69);
        intTree.insert(40);
        intTree.insert(12);
        intTree.insert(10);
        intTree.insert(14);
        intTree.insert(22);

        System.out.println("The minimum is " + intTree.min());
        System.out.println("The maximum is " + intTree.max());

        System.out.println("Traversing");

        intTree.traverseOrder();

        System.out.println("Get the value " + intTree.get(30));
    }
}
