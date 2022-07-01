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
  
}