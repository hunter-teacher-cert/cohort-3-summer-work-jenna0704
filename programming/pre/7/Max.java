import java.io.*;
import java.util.*;

public class Max
{
    public static void main (String [] args)
    {

        int [] randoms = new int [20];
        for (int i = 0; i < randoms.length; i++)
        {
            randoms[i] = (int) (Math.random()*20);
            System.out.print(randoms[i] + " ");
        }
        
        System.out.println();
    
        //Check indexOfMax
        indexOfMax(randoms);
      
        System.out.println();
        indexOfMaxEnhancedForLoop(randoms);
    }


    //indexOfMax
    public static int indexOfMax(int[] a)
    {
      int maxValue = a[0];
      int maxIndex = 0; 

      for (int i = 0; i < a.length; i++)
      { 
          if (a[i] > maxValue)
          {
              maxValue = a[i];
              maxIndex = i;
          }
      }
      
      System.out.printf("The index of the maximum value is %d.\n", maxIndex);
        
      return maxIndex;
    }
      
  
    //You can write this method using an enhaced for loop becasue we are focusing on the        value of each index of the array.
    public static int indexOfMaxEnhancedForLoop(int[] a)
    {
        int maxValue = a[0];
        int maxIndex = 0;
      
        for (int i : a)
        { 
            if (a[i] > maxValue)
            {
                maxValue = a[i];
                maxIndex = i;
            }
        }
        
        System.out.printf("The index of the maximum value is %d.\n", maxIndex);
        
        return maxIndex;
    
    }
  
}
