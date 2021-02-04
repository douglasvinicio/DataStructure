package Arrays;

public class Array2D {

    public static void main(String[] args) {

        // Initializing Multidimensional arrays
        int [][] int2DArray = new int[3][5];

        int2DArray[2][4] = 10;
        int2DArray[0][3] = 15;

        int[][] arr = {{2,2}, {6,4} ,{6,6}};

        System.out.println("The size of rows is: " + arr.length);

        // How to navigate through all the elements you need two loops
        int[] sumArray = new int[3];
        int counter = 0;

        for (int i = 0; i < arr.length; i++){

            System.out.println("The size of the columns are: " + arr[i].length);
            for (int j = 0; j < arr[i].length; j++){
                //System.out.print(arr[i][j] + " ");

                counter += arr[i][j];
                System.out.println(counter);
            }
            sumArray[i] = counter;
            counter = 0;
        }

        System.out.println("R");
        for (int r = 0; r < sumArray.length; r++){
            System.out.println(sumArray[r]);
        }


    }
}
