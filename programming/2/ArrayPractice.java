/**
 * ArrayPractice by Team BossCoders
 * Jenna Lin
 * Contributors: Sarah McCoy, Stay Goldstein,	Rachel Kaufman
 */

import java.util.*;
import java.io.*;

public class ArrayPractice
{
    //global arrays
    static int[] someData = new int[] {1, 2, 3, 4, 5, 6, 7};
    static int[] someData2 = new int[] {1, 1995, 7, 4};
    static int[] someData3 = new int[] {-5, -2, -3, -1, -9};

  public static void main(String[] args)
    {
        //Check 1. buildIncreasingArray
        printArray(buildIncreasingArray(5, 3, 2));
        System.out.println();
      
        //Check 2. buildRandomArray
        printArray(buildRandomArray(5, 100));
        System.out.println();
      
        //Check 3. printArray
        printArray(someData);
        System.out.println();
      
        //Check 4. arraySum
        System.out.printf("The sum of elements in the array is %d.\n", arraySum(someData));
        System.out.println();        
  
        //Check 5.firstOccurence
        System.out.printf("The first occurence of 4 is at index %d.\n", firstOccurence(someData, 4));
        System.out.println(); 
      
        //Check 6.isSorted
        System.out.println("Is the array sorted? " + isSorted(someData));
        System.out.println();     

        //Check 7. findMaxValue
        System.out.printf("The max value of the array is %d.\n", findMaxValue(someData));
        System.out.println(); 

        //Check 8. countOdds
        System.out.printf("There are %d odd numbers in the array.\n", countOdds(someData2));
        System.out.println(); 
      
        //Check 9. flip
        flip(someData);
        printArray(someData);
      
      
    }

    // 1. buildIncreasingArray
    public static int[] buildIncreasingArray(int size, int startValue, int step)
    {
        int[] data = new int[size];

        for (int n = 1; n < data.length; n++)
        {
            data[0] = startValue; //assign startValue to index 0
            data[n] = data[n-1] + step; //find the next element in the array
        }

        return data;
    }


    // 2. buildRandomArray
      public static int[] buildRandomArray(int size, int maxValue)
      {
          Random r = new Random();
          int[] data = new int[size];
  
          for (int i = 0; i < data.length; i++)
          {
              data[i] = r.nextInt(maxValue);
          }

          return data;
      }

  
    // 3. printArray
      public static void printArray(int[] data)
      {
          System.out.print("{" + data[0]);
        
          for (int i = 1; i < data.length; i++)
          {
            System.out.print(", " + data[i]);
          }

          System.out.println("}");
      }


    // 4. arraySum
      public static int arraySum(int[] data)
      {
          int sum = data[0];
          
          for (int i = 1; i < data.length; i++)
          {
              sum = sum + data[i];
          }
          
          return sum;
      }

  
    // 5. firstOccurence
      public static int firstOccurence(int[] data, int value)
        {    
            int i = 0;
    
            while (i < data.length && data[i] != value)
            {
                i++;
            }
            
            return i;
        }


    // 6. isSorted
      public static boolean isSorted(int[] data)
      {

          for (int i = 0; i < data.length - 1; i++)
          {
              if (data[i] > data[i+1])
              {
                return false;
              }             
          }
    
            return true;
        }

  
    // 7. findMaxValue
      public static int findMaxValue(int[] data) 
      {
          int maxValue = data[0]; 

          for (int i = 0; i < data.length - 1; i++)
          {
              if(data[i+1] > maxValue)
              {
                  maxValue = data[i+1];
              }
          }

          return maxValue;
      }

  
    // 8. countOdds
        public static int countOdds(int[] data) 
        {
            int count = 0;
        
            for (int i = 0; i < data.length; i++)
            {
                if (data[i] % 2 != 0)
                {
                  count++;
                }
            }

            return count;
        }

  
    // 9. flip
        public static void flip(int[] data)
        {
            //Create a temp array.
            int[] tempData = new int[data.length];

            //Copy array data to array tempData.
            for (int i = 0; i < data.length; i++)
            {
                tempData [i] = data [i];
            }

            for (int i = 0; i < data.length; i++)
            {
                data[i] = tempData[data.length - i - 1];
            }

          /** Jushua Higgins
          *  for (int i = 0; i < data.length/2; i++)
              {
                  temp = data[i];
                  data[i] = data[data.length - 1 - i];
                  data[data.length - 1 - i] = temp;
              }
          *
          */  
        }
}

