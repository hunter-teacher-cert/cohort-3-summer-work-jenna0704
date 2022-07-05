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
    char[][] board = buildBoard(3, 4, 'a');

    //Check buildBoard and printBoard
    printBoard(board);

    System.out.println("");

    //Check setRow
    setRow(board, 1, '#');
    printBoard(board);
    
    System.out.println("");

    //Check copyBoard
    char[][] board2 = buildBoard(3, 3, '$');
    copyBoard(board2);

    char[][] board3 = buildBoard(9, 9, '$');
    explodeSquare(board3, 3, 3);
    printBoard(board3);

    
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
   for (int row = 0; row < board.length; row++)
   {
       for (int col = 0; col < board[0].length; col++)
       {
           System.out.print(board[row][col]);
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