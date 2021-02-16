package LinkedListArray;

public class DoublyLinkedList<T> {

    // Node Constructor
    private class Node{
        T value;
        Node next;
        Node previous;
    }

    private Node first, last;
    private int size = 0;

    public void add(T value){
        Node node = new Node();
        node.value = value;

        if (size == 0){
            first = node;
            last = node;
            first.previous = null;
            last.next = null;
            size++;
        } else{
            last.next = node;
            node.previous = last;
            last = node;
            size++;
        }
    }

//    public T[] toArray() {
//        T[] result = new T[size];
//        Node currentNode = first;
//        int position = 0;
//
//        while (currentNode != null){
//            result[position++] = currentNode.value;
//            currentNode = currentNode.next;
//        }
//        return result;
//    }
//
//    public int getSize(){
//        return size;
//    }




}
