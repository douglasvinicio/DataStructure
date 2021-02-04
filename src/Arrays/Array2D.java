package Arrays;

public class Array2D {

    public static void main(String[] args) {

        // Initializing Multidimensional arrays
        int [][] int2DArray = new int[3][5];

        int2DArray[2][4] = 10;
        int2DArray[0][3] = 15;

        int[][] arr = {{1,2}, {3,4} ,{5,6,7}, {8,9,10,11,12}};

        System.out.println("The size of rows is: " + arr.length);
        // How to navigate through all the elements you need two loops

        for (int i = 0; i < arr.length; i++){
            //System.out.println("The size of the columns are: " + arr[i].length);
            for (int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
