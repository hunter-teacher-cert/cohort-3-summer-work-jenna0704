import java.io.*;
import java.util.*;

public class Array
{
    public static void main (String [] args)
    {

        double [] number = new double [3];
        number[0] = 1;
        number[1] = 2;
        number[2] = 3;
    
        //Check powArray
        printArray(powArray(number));
        
        //Check powArrayBeta
        printArray(powArrayBeta(number, 3));
    
        // System.out.println(Arrays.toString(number));

        //Check histogram.
        int [] scores = new int [100];
        for (int i = 0; i < scores.length; i++)
        {
            scores[i] = (int) (Math.random()*100);
            System.out.print(scores[i] + " ");
        }
        
        System.out.println();
        
        histogram(scores,7);
    
    }


    //powArray
    public static double[] powArray(double[] a)
    {
        double[] powerArray = new double [a.length]; 
        
        for (int i = 0; i < a.length; i++)
        { 
            powerArray[i] = Math.pow(a[i], 2.0); 
        }
      
        return powerArray;   
    }


    //powArrayBeta
    public static double[] powArrayBeta(double[] a, int n)
    {
        double[] powerArray = new double [a.length];
        
        for (int i = 0; i < a.length; i++)
        { 
            powerArray[i] = Math.pow(a[i], n);
        }
      
        return powerArray;
    } 


    //histogram
    public static int histogram(int [] scores, int n)
    {
        int count = 0;
      
        for (int i = 0; i < scores.length; i++)
        {
            if (scores[i] == n)
            {
              count++;
            }
        }
      
        System.out.println("Number of " + n + " = " + count);
      
        return count;
    }
  

    //printArray
    public static void printArray(double[] data)
    {
       for (int i = 0; i < data.length; i++)
       {
         System.out.print(data[i] + " ");
       }

        System.out.println();
    }
  }