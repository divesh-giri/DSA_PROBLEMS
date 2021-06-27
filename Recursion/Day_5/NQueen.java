package Recursion.Day_5;

public class NQueen {
    private static boolean isSafe(boolean[][] chess_board, int curr_row, int curr_col)
    {   
        // check upper rows
        for(int i = curr_row;i>=0;i--)
        {
            if(chess_board[i][curr_col])
                return false;
        }
        // check left diagonal
        for(int i = curr_row, j=curr_col; i>=0 && j>=0; i--,j--)
        {
            if(chess_board[i][j])
                return false;
        }
        // check right diagonal
        for(int i = curr_row, j= curr_col; i>=0 && j<chess_board.length; i--, j++) {
            if(chess_board[i][j]) {
                return false;
            }
        }

        return true;
    }
    public static int solution(boolean[][] chess_board, int curr_row)
    {
        int count = 0;
        if(curr_row==chess_board.length-1)
            return 1;
        for(int col = 0;col<chess_board.length;col++)
        {
            if(isSafe(chess_board, curr_row, col))
            {
                chess_board[curr_row][col] = true;
                count += solution(chess_board, curr_row+1);
                chess_board[curr_row][col] = false;
            }
        }
        return count;
        
    }
    public static void main(String[] args) {
        boolean[][] chess_board = new boolean[3][3];
        System.out.println(solution(chess_board, 0));
    }
}
