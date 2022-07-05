import java.util.*;
import java.io.*;

/**
 * Array2DPractice by Jenna Lin
 * collaborators: First Last, First Last
 */

public class Array2DPractice
{

  public static void main(String[] args)
  {
    
  }

  //buildBoard Example
  public static char[][] buildBoard(int rows, int cols, char value)
  {
    char[][] board = new char[rows][cols];
    for (int i = 0; i < rows; i++) 
    {
      for (int j = 0; j < cols; j++) 
      {
        board[i][j]=value;
      }
    }
    return board;
  }

//printBoard
public static void printBoard(char[][] board)
{
   for (int rows = 0; rows < board.length; rows++)
   {
       for (int cols = 0; cols < board[0].length; cols++)
       {
           System.out.print(board[rows][cols]);
       }

       System.out.println("");
   }
}


//setRow
public static void setRow(char[][] board, int row, char value)
{
    for (int c = 0; c < board[0].length; c++)
    {
        board[row][c] = value;
    }
}


//copyBoard
public static char[][] copyBoard(char[][] original)
{
    char[][] duplicateBoard = new char[original.length][original[0].length];

    for (int rows = 0; rows < original.length; rows++)
    {
        for (int cols = 0; cols < original[0].length; cols++)
        {
            duplicateBoard[rows][cols] = original[rows][cols];
        }
    }

    printBoard(duplicateBoard);

    return duplicateBoard;

}
}