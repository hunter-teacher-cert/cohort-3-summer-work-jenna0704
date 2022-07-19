import java.io.*;
import java.util.*;

public class SortSearchDriver 
{
    public static void main(String[] args) 
    {
        // Uncomment these to test part 1
        
        SortSearch ss = new SortSearch(20);
        System.out.println(ss);
        
        System.out.println(ss.findSmallestIndex(10));
            
        // Uncomment these to test part 2

        int i;
        // starting from index 0; find and return the index of the smallest data  
        i = ss.findSmallestIndex(0); 
        // ss[index of the smallest data] = value of the smallest data
        System.out.println("ss[" + i + "] = " + ss.get(i) + " : " + ss);

        // starting from index 3; find and return the index of the smallest data  
        i = ss.findSmallestIndex(3);
        System.out.println("ss[" + i + "] = " + ss.get(i) + " : " + ss);
        
        // Uncomment these to test part 3

        System.out.println(ss);
        
        // Test linearSearch
        System.out.println(ss.linearSearch(1));

        ss.sort();
        System.out.println(ss);
	
        // Test binarySearch
        System.out.println(ss.binarySearch(1));
        
        // Test binarySearchRecursive
	    System.out.println( ss.binarySearchRecursive(1, 0, 20) );

    }
}