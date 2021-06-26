package Recursion.Day_3;

import java.util.ArrayList;

public class Maze {
    public static ArrayList<String> maze(int[][] matrix, int row, int col)
    {
        // termination case

        if(col == matrix.length-1)
        {
            return new ArrayList<String>(); 
        }
            
    }

    public static void main(String[] args) {
        int[][] matrix = new int[3][3];
        ArrayList<String> list = maze(matrix, 0, 0);
    }
}
