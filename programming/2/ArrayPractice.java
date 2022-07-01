import java.util.*;
import java.io.*;

public class ArrayPractice
{
    /**
        Parameters:
        size - how large the array should be
        startValue - the value of the first element
        step - the interval to the next value
        Returns:
        a new array of integers
        Examples:
        buildIncreasingArray(5,3,2) will return an array
        with the values 3,5,7,9,11 (five values, starting with 3 with a step size of 2)
    */
    public static int[] buildIncreasingArray(int size, int startValue, int step)
    {
        int[] data = new int[size];

        for (int n = 1; n < data.length; n++)
        {
            data[0] = startValue; //index 0 = startValue
            data[n] = data[n-1] + step; //previous number plus step
        }
        
        //display the elements of the array
        System.out.println(Arrays.toString(data));

        return data;
    }


    
    public static void main(String[] args)
    {
    
        buildIncreasingArray(7, 1, 2);


    }

}

