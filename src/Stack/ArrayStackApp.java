package Stack;

public class ArrayStackApp {

    public static void main(String[] args) {

        ArrayStack stack = new ArrayStack(10);

        stack.push(new Employee("A", "A", 1));
        stack.push(new Employee("A", "A", 2));
        stack.push(new Employee("A", "A", 3));
        stack.push(new Employee("A", "A", 4));
        stack.push(new Employee("A", "A", 5));
        stack.push(new Employee("A", "A", 6));
        stack.push(new Employee("A", "A", 7));
        stack.push(new Employee("A", "A", 8));
        stack.push(new Employee("A", "A", 9));
        stack.push(new Employee("A", "A", 10));
        stack.push(new Employee("A", "A", 11));


        System.out.println("Stack size is " + stack.size());
        stack.printStack();
        System.out.println();
    }
}
