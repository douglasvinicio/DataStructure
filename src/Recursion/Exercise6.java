package Recursion;

public class Exercise6 {

    public static void main(String[] args) {

        int[][] data2D = {
                {1, 3, 6, 8},
                {7, 1, 2, 3},
                {8, 3, 2, 1},
                {1, 7, 1, 9}};

        int row = data2D.length;
        int col = data2D[0].length;

        System.out.println(getIfExists(data2D,2,0));

    }

        static int sumOfCross(int[][] data, int row, int col) {
        // return sum of the element at row/col
            int num = data[row][col];

            for (int i = 0; i < data.length; i++){
                for (int j = 0; j < data[i].length; j++){

                }
            }
        // plus (if they exist) element above, below, to the left and right of it
        return 0;
    }

        static int getIfExists(int[][] data, int row, int col) {
        // If exists, return the element, otherwise return 0
            for (int i = 0; i < data.length; i++){
                for (int j = 0; j < data[i].length; j++){
                    if (data[i][j] == data[row][col]){
                        return data[row][col];
                    }
                }
            }
            return 0;
    }
}
//    // useful helper for debugging
//    static void print2D(int[][] data) {
//
//    }
//
//    // duplicate a jagged array
//    static int[][] duplicateEmptyArray2D(int[][] orig2d) {
//        return orig2d;
//    }
