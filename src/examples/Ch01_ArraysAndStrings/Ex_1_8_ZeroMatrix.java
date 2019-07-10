package examples.Ch01_ArraysAndStrings;

import javafx.util.Pair;

import java.util.ArrayList;

/**
 * Write an algorithm such that if an element in an MxN matrix is 0, its entire row and
 * column are set to 0.
 */
public class Ex_1_8_ZeroMatrix {

    public static int[][] getZeroedMatrix(int matrix[][]){

        ArrayList<Pair> zeroCoordinates = new ArrayList<>();

        //First find out all of the zero coordinates.
        for (int i = 0; i < matrix.length ; i++) {
            for (int j = 0; j < matrix[0].length ; j++) {
                if(matrix[i][j] == 0) zeroCoordinates.add(new Pair(i, j));
            }
        }

        //Now scrub matrix for each zero coordinate
        for(Pair pair : zeroCoordinates){
            matrix = scrubMatrix((int)pair.getKey(), (int)pair.getValue(), matrix);
        }

        return matrix;
    }

    private static int[][] scrubMatrix(int row, int col, int[][] matrix){

        //Zero row values
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length ; j++) {

                if(i == row) matrix[i][j] = 0;
                if(j == col) matrix[i][j] = 0;
            }
        }
        return matrix;
    }
}
