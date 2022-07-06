import java.io.*;
import java.util.*;

public class Methods
{
    public static void main (String [] args)
    {
        //Check isDivisible.
        isDivisible(7, 48);
      
        //Check isTriangle.
        isTriangle(1, 2, 3);

        //Check ack.
        System.out.println("A(1,2)= " + ack(1,2));
    }
  
    
    public static boolean isDivisible(int n, int m)
    {  
        if (n % m == 0)
        {     
            System.out.printf("%d is divisible by %d.\n", m, n);
            return true;     
        }
        else 
        {     
            System.out.printf("%d is not divisible by %d.\n", m, n);
            return false;     
        }   
    }

  
    public static boolean isTriangle(int x, int y, int z)
    {
        if (x + y <= z || x + z <= y || y + z <= x)
        {
            System.out.printf("%d, %d, and %d do not form a triangle.\n", x, y, z);
            return false;      
        }         
        else 
        {
            System.out.printf("%d, %d, and %d form a triangle.\n", x, y, z);
            return true;     
        }
    }

  
    public static int ack(int m, int n)
    {
        if (m == 0)
        {
          return n+1;
        }        
        else if (m > 0 && n == 0)
        {
          return ack(m-1, 1);
        }          
        else
        {
          return ack(m-1, ack(m, n-1)); 
        }
    }
  
}