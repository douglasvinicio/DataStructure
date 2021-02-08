package Tasks;

public class CustomArrayOfInts {

    private static int [] data = new int[1];

    static int items = 0;

    public static void main(String[] args) {

        //Testing methods
        System.out.println(size());
        int x = 1;
        add(x++);
        add(x++);
        add(x++);
        add(x++);
        add(x++);
        add(x++);
        add(x++);
        add(x++);
        add(x++);




        deleteByIndex(4);

        for (int i = 0; i < data.length; i++){
            System.out.print(data[i]);
        }
        System.out.println();

        System.out.println(deleteByValue(9));



        insertValueAtIndex(10,0);

        System.out.println();

        for (int i = 0; i < data.length; i++){
            System.out.print(data[i] + " ");
        }

        System.out.println();
        System.out.println(getSlice(0,3).toString());

    }

    // Gets array size
    public static int size() {
        int size = data.length;
        return size;
    }

    // Add int to array, creates a new one double of the size if out of bounds
    public static void add(int value) {
        if(data.length == items ){
            int[] newData = new int[data.length * 2];
            for (int i = 0; i < data.length; i++){
                newData[i] = data[i];
            }
            data = newData;
        }
        data[items] = value;
        items++;
    }

    public static void deleteByIndex(int index) {
        int[] newData = new int[data.length - 1];
        for (int i = 0, j = 0; i < newData.length; i++){
            if (i == index)
                continue;
            newData[j++] = data[i];
        }
        data = newData;
    }

    // delete first value matching, true if value found, false otherwise
    public static boolean deleteByValue(int value) {
        for (int i = 0; i < data.length; i++){
            if (data[i] == value){
                deleteByIndex(i);
                return true;
            }
        }
        return false;
    }

    public static void insertValueAtIndex(int value, int index) {

        if (index > data.length){
            throw new IndexOutOfBoundsException("The array does not have this index.");
        }
        else {
            int[] newData = new int[data.length];

            for (int i = 0; i < data.length; i++) {
                if (i == index)
                    newData[i] = value;
                else
                    newData[i] = data[i];
            }
            data = newData;
        }
    }

    // may throw IndexOutOfBoundsException
    public static int get(int index) {
        int value = 0;
        // Throws exception if index is not valid
        if (index > data.length)
            throw new IndexOutOfBoundsException();

        value = data[index];
        return value;
    }

    // may throw IndexOutOfBoundsException
    public static int[] getSlice(int startIdx, int length) {
        int[] sliceArray = new int[startIdx + length];

        for (int i = startIdx; i < length; i++){
            sliceArray[i] = data[i];
        }
        return sliceArray;
    }

    public static void clear() {
        items = 0;
    }

    @Override
    public String toString() {
        // returns String similar to: [3, 5, 6, -23]
        StringBuilder sb = new StringBuilder();

        sb.append('[');
        for (int i = 0; i < data.length; i++) {
            sb.append(data[i]);
            if (i == data.length - 1)
                return sb.append(']').toString();
            sb.append(", ");
        }
        return sb.toString();
    }
}
//        You are NOT allowed to use any advanced data structures like ArrayLists, HashMaps, Arrays class, System.arraycopy(), etc.
//
//        You are NOT allowed to add or remove any methods or fields in the above code.
//
//        Special permission: You may add private helper methods if you wish and a public constructor.
//
//        Methods may throw ArrayIndexOutOfBoundsException if parameters (indexes) are invalid.
//
//        ADD UNIT TESTS
//
//        Create at least 10 unit tests for your implementation.
//        20 tests will likely be necessary to fully test your implementation.
//
//        How to test for expected exceptions (for JUnit 4):
//        https://www.baeldung.com/junit-assert-exception#junit-4
