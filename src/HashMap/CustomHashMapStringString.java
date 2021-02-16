package HashMap;

import java.util.Arrays;

//Custom Exception - Calls the super constructor
class KeyNotFoundException extends Exception{
    public KeyNotFoundException(String message) {
        super(message);
    }
}

public class CustomHashMapStringString {
    // HashMap, key is String, value is String
    private class Container {
        Container next;
        String key;
        String value;
    }

    private int arraySize = 5;

    // Constructor is optional
    // size must be a prime number always
    private Container[] hashTable = new Container[arraySize];
    private int totalItems;

    void putValue(String key, String value) {

        // First we need to find which index of hashtable is proper to add the value
        int hashValue = computeHashValue(key);
        int index  = hashValue % hashTable.length; // The formula to find the index of the hashtable

        Container current = hashTable[index];
        // Create a new container and play with the pointer
        // 1 - Container is not null - Existent we need to navigation / Looping because we need to check if the value exists in there or not
        while (current != null){
            if (current.key.equals(key)){
                current.value = value;
                return;
            }
            current = current.next;
        }
        // 2 - Is empty
        Container newNode = new Container();
        newNode.value = value;
        newNode.key = key;

        // Insert the node at the beginning of the hashtable selected index
        newNode.next = hashTable[index];
        hashTable[index] = newNode;
        totalItems++;

        // To check the size of the hashtable
        if (totalItems > 2 *(hashTable.length)){
            resizeHashTable();
        }
    }
    // LATER: expand hashTable by about *2 when totalItems > 2*hashTable.length


    // throw custom unchecked KeyNotFoundException
    String getValue(String key) throws KeyNotFoundException {
        int hashValue = computeHashValue(key);
        int index  = hashValue % hashTable.length; // The formula to find the index of the hashtable

        Container current = hashTable[index];
        while (current != null){
            if (current.key.equals(key)){
                return current.value;
            }
            current = current.next;
        }
        throw new KeyNotFoundException("Key was not found!");
    }

    boolean hasKey(String key) {
        int hashValue = computeHashValue(key);
        int index  = hashValue % hashTable.length; // The formula to find the index of the hashtable

        Container current = hashTable[index];
        while (current != null){
            if (current.key.equals(key)){
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public String[] getAllKeys() {
        int index = 0;
        String[] result = new String[totalItems];

        for (int i = 0; i < hashTable.length; i++){
            Container current = hashTable[i];
            while (current != null){
                result[index] = current.key;
                current = current.next;
                index++;
            }
        }
        return result;
    }

    // throw custom unchecked KeyNotFoundException
    void deleteByKey(String key) throws KeyNotFoundException {
        int hashValue = computeHashValue(key);
        int index  = hashValue % hashTable.length; // The formula to find the index of the hashtable

        Container current = hashTable[index];
        Container previous = null;
        while (current != null){
            if (current.key.equals(key)){
               break;
            }
            previous = current;
            current = current.next;
        }
        // Current is only null when I don't arrive to the upper loop
        // Or after the loop finishes I couldn't find it
        if (current == null){
            throw new KeyNotFoundException("The key was not found!");
        }
        if (previous == null){
            hashTable[index] = current.next;
        } else {
            previous.next = current.next;
        }
        arraySize--;
        // BDD (Cucumber) - TDD (Unit Test , JUnit, Mockito) - > Business Driven Development -> Test Driven Development
    }

    int getSize() {
       return arraySize;
    }

    public void printDebug() {
        for (int i = 0; i < hashTable.length; i++){
            System.out.printf("Entry %d : \n", i);
            Container curr = hashTable[i];
        }
    } // print hashTable content, see example below

    @Override
    public String toString() {
        String[] keysArray = getAllKeys();
        Arrays.sort(keysArray);
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < keysArray.length; i++){
            try {
                String key = keysArray[i];
                String val = getValue(key);
            } catch (KeyNotFoundException e) {
                e.printStackTrace();
            }
            sb.append(i == 0 );
        }
        return "";
    }
    // comma-separated values->key pair list
    // to be able to use this as validation in Unit tests keys must be sorted
    // e.g. [ Key1 => Val1, Key2 => Val2, ... ]

    // Helper method to check if is prime
    private boolean IsPrime(int number) {
        for (int i = 2; i < number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    private int computeHashValue(String key) {
        int hash = 0;
        for (int i = 0; i < key.length(); i++) {
            hash <<= 1;  // same as: hash *= 2
            char c = key.charAt(i);
            hash += c;
        }
        return hash;
    }

    private void resizeHashTable(){
        // The size needs to be a prime number
        arraySize = getNextPrime(arraySize);
        Container[] newHasTable = new Container[arraySize];

        for (int i = 0; i < hashTable.length; i++){
            newHasTable[i] = hashTable[i];
        }
        hashTable = newHasTable;
    }

    private int getNextPrime(int number){
        int num = number * 2;
        while (true){
            if (IsPrime(num)){
                return num;
            }
            num++;
        }
    }

}
