package Recursion;

public class Exercise6 {

    public static void main(String[] args) {

        int[][] data2D = {
                {1, 3, 6, 8},
                {7, 1, 2, 3},
                {8, 3, 2, 1,0,7},
                {1, 7, 1, 9}};

        int min = sumOfCross(data2D, 0 , 0);
        int minCol = 0;
        int minRow = 0;

        for (int row = 0; row < data2D.length; row ++){
            for (int col = 0 ; col < data2D[row].length; col++){
                int sum = sumOfCross(data2D, row, col);
                if (sum < min){
                    min = sum;
                    minCol = col;
                    minRow = row;
                }
            }
        }

    }
        // useful helper for debugging
    static void print2D(int[][] data) {
        for (int row = 0; row < data.length; row++){
            for (int col = 0; col < data[row].length; col++){
                System.out.printf("%s%d", col == 0 ? "" : "," , data[row][col]);
            }
            System.out.println();
        }
    }

        static int sumOfCross(int[][] data, int row, int col) {
        // return sum of the element at row/col
            return getIfExists(data,row,col) +
                    getIfExists(data, row -1, col ) +
                    getIfExists(data, row , col-1) +
                    getIfExists(data, row + 1, col)+
                    getIfExists(data, row, col + 1);
    }

        static int getIfExists(int[][] data, int row, int col) {
        // If exists, return the element, otherwise return 0
            try{
                return data[row][col];
            }catch (ArrayIndexOutOfBoundsException exc){
                return 0;
            }
    }
}


