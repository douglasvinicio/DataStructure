package Tasks;

public class CustomArrayOfInts {


    public static void main(String[] args) {

        CustomArray array = new CustomArray();

        int x = 1;

        array.add(x++);
        array.add(x++);
        array.add(x++);
        array.add(x++);
        array.add(x++);
        array.add(x++);

        array.deleteByIndex(0);

        System.out.println(array);

        System.out.println(array.deleteByValue(9));

        array.insertValueAtIndex(10, 0);

        System.out.println(array);

        int[] slice = array.getSlice(1,3);
        System.out.println(java.util.Arrays.toString(slice));

    }
}

