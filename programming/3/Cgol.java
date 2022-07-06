import java.io.*;
import java.util.*;

/**
 * Conway's Game of Life Team AreWeSentientYet?
 * Jenna Lin
 * collaborators: Mike Randazzo, Adam Prado, Aasine Cassara
 */

/**
   The Rules of Life:

   Survivals:
   * A living cell with 2 or 3 living neighbours will survive for the next generation.

   Deaths:
   * Each cell with >3 neighbours will die from overpopulation.
   * Every cell with <2 neighbours will die from isolation.

   Births:
   * Each dead cell adjacent to exactly 3 living neighbours is a birth cell. It will come alive next generation.

   NOTA BENE:  All births and deaths occur simultaneously. Together, they constitute a single generation.
*/

public class Cgol
{
    static char dead = '-';
    static char alive = 'X';

    public static void main( String[] args )
    {
        char[][] board;
        board = createNewBoard(5,5);

        //breathe life into some cells:
        setCell(board, 0, 0, 'X');
        setCell(board, 0, 1, 'X');
        setCell(board, 1, 0, 'X');

        System.out.println("Gen X:");
        printBoard(board);
        System.out.println("--------------------------\n\n");

        board = generateNextBoard(board);

        System.out.println("Gen X+1:");
        printBoard(board);
        System.out.println("--------------------------\n\n");

    }
   
 
    //create, initialize, and return  empty board (all cells dead)
    public static char[][] createNewBoard(int rows, int cols)
    {
        char[][] board = new char[rows][cols];
        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < cols; j++)
            {
                board[i][j] = dead;
            }
        }
        return board;
    }


    //print the board to the terminal
    public static void printBoard(char[][] board)
    {
        for (int i = 0; i < board.length; i++)
        {
            for (int j = 0; j < board[0].length; j++)
            {
                System.out.print(board[i][j] + " ");
            }

            System.out.println();
        }
    }


    //set cell (r,c) to val
    public static void setCell( char[][] board, int r, int c, char val )
    {
        board[r][c] = val;
    }


    //return number of living neigbours of board[r][c]
    public static int countNeighbours( char[][] board, int r, int c )
    {
        int numOfNeighbours = 0;

        for (int i = Math.max(0, r - 1); i <= Math.min(r + 1, board.length - 1); i++)
        {
            for (int j = Math.max(0, c - 1); j <= Math.min(c + 1, board[0].length - 1); j++)
            {
                if (!(i == r && j == c) && board[i][j] == alive)
                {          
                    numOfNeighbours++;                   
                }
            }
        }       
            return numOfNeighbours;
    }


    /**
        precond: given a board and a cell
        postcond: return next generation cell state based on CGOL rules
        (alive 'X', dead ' ')
    */
    public static char getNextGenCell( char[][] board,int r, int c )
    {
        int counts = countNeighbours(board, r, c);

        if(board[r][c] == alive)
        {
            if (counts == 2 || counts == 3)
            {
                return alive;
            }
            else 
            {
                return dead;
            }
        }
        else
        {
            if (counts == 3)
            {
                return alive;
            }
            else 
            {
                return dead;
            }
        }
    }


    //generate and return a new board representing next generation
    public static char[][] generateNextBoard( char[][] board )
    {
        char[][] nextBoard = new char[board.length][board[0].length];

        for(int i = 0; i < board.length; i++)
        {
            for (int j = 0; j < board[i].length; j++)
            {
                nextBoard[i][j] = getNextGenCell(board, i, j);
            }
        }

        return nextBoard;
    }


  


}