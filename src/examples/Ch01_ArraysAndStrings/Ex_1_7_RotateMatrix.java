package examples.Ch01_ArraysAndStrings;

/**
 * Given an image represented by an N x N dimensional matrix where each pixel is represented
 * by an Integer, write a method to rotate the image by 90 degrees.
 */
public class Ex_1_7_RotateMatrix {

    public static int[][] rotateMatrix90Degrees(int[][] matrix){

        int rowCount = matrix.length;
        int colCount = matrix[0].length;

        int[][] rotatedMatrix = new int[colCount][rowCount];

        int counter = 0;

        for(int col = 0; col < colCount; col++){
            for(int row = rowCount - 1; row >= 0; row--){

                rotatedMatrix[col][counter] = matrix[row][col];
                counter++;
            }
            counter = 0;

        }
        return rotatedMatrix;
    }
}
