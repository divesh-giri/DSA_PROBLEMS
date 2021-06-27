package Recursion.Day_3;

import java.util.ArrayList;

public class Maze {
    public static ArrayList<String> maze(int[][] matrix, int row, int col)
    {
        if(col == matrix.length-1 && row == matrix.length-1)
        {
            ArrayList<String> empty = new ArrayList<>();
            empty.add("");
            return empty;
        }
        ArrayList<String> result = new ArrayList<>();
        if(col<matrix.length && row<matrix.length)
        {
            ArrayList<String> temp = maze(matrix, row, col+1);
            for(String s: temp)
            {
                result.add("H"+s);
            }
            temp = maze(matrix, row+1, col);
            for(String s: temp)
            {
                result.add("V"+s);
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[][] matrix = new int[4][4];
        ArrayList<String> list = maze(matrix, 0, 0);
        System.out.println(list);
    }
}
