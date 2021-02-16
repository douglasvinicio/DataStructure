package LinkedListArray;

public class LinkedListArrayOfString {

    private class Container{
        String value;
        Container next;
    }

    private Container start,end;
    private int size = 0;

    public void add(String value){
            addToEnd(value);
    }

    private void addToEnd(String value){
        Container node  = new Container();
        node.value = value;

        // What if there is no node?
        if (size == 0){
            start = node;
            end = node;
            size++;
        } else{
            end.next = node;
            end = node;
            size++;
        }
    }

    private void addToFront(String value){
        Container node = new Container();

        node.value = value;

        if (size == 0){
            start = node;
            end = node;
            size++;
        } else {
            node.next = start;
            start = node;
            size++;
        }

    }

    public String[] toArray(){
        String[] resultArray = new String[size];
        Container currentContainer = start;
        int position = 0;

        while (currentContainer != null){
            resultArray[position++] = currentContainer.value;
            currentContainer = currentContainer.next;
        }
        return resultArray;
    }

    public int getSize(){
        return size;
    }

    public String get(int index){
        if (index < 0 || index >= size){
            throw new IndexOutOfBoundsException();
        }
        // If at the end of the Linked List
        if (index == size -1){
            return end.value;
        }
        if (index == 0){
            return start.value;
        }
        int counter= 0;
        Container currentContainer = start;
        while (currentContainer != null){
            if (counter == index){
                return currentContainer.value;
            }
            counter++;
            currentContainer = currentContainer.next;
        }
        throw new RuntimeException("Internal Error");
    }

    public void insertValueAtIndex(int index, String value){ // Complexity is O(1)
        if (index < 0 || index >= size){
            throw new IndexOutOfBoundsException();
        }
        if (size == 0 || index == size){ // either at the beginning or at the end
            addToFront(value);
        }
        if ( index == 0){
            addToFront(value);
            return;
        }
        // common case
        // find the container just before the position we are going to insert
        Container before = start;
        for (int i = 0; i < index - 1; i++){
            before = before.next;
        }

        Container newNode = new Container();
        newNode.value = value;
        //Important to be the same step
        newNode.next = before.next;
        before.next = newNode;
        size++;
    }

    public void deleteByIndex(int index){
        if (index < 0 || index >= size){
            throw new IndexOutOfBoundsException();
        }

        if (index == 0){
            start = start.next;
            size--;
            return;
        }

        Container before = start;
        for (int i = 0; i < index - 1; i++){
            before = before.next;
        }

        if (index == size - 1){
            end  = before;
        }
        before.next = before.next.next; // Remove the pointer and point to the second next
        size--;
    }

    public boolean deleteByValue(String value){
        int position = 0;
        Container currentContainer = start;
        while (currentContainer != null){
            if (currentContainer.value.equals(value)){
                deleteByIndex(position);
                size--;
                return true;
            }
            position++;
            currentContainer = currentContainer.next;
        }
        return false;
    }

    @Override
    public String toString() {
        Container container = start;
        StringBuilder builder = new StringBuilder();

        builder.append("[");

        while (container != null){
            builder.append(container == start ? "" : ",");
            builder.append(container.value);
            container = container.next;
        }

        builder.append("]");
        return builder.toString();
    }
}
