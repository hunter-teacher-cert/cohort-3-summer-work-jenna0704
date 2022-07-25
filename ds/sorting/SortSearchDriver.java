import java.io.*;
import java.util.*;

public class SortSearchDriver 
{
    public static void main(String[] args) 
    {
        // Uncomment these to test part 1       
        SortSearch ss = new SortSearch(20);
      
        System.out.println(ss);
        
        System.out.printf("The index of the smallest value in the array list from index 2 is %d. \n", ss.findSmallestIndex(2));
      
        System.out.println();

      
        // Uncomment these to test part 2
        int i;
        // starting from index 0; find and return the index of the smallest data  
        i = ss.findSmallestIndex(0); 
        // ss[index of the smallest data] = value of the smallest data
        System.out.println("ss[" + i + "] = " + ss.get(i) + " : " + ss);

        // starting from index 3; find and return the index of the smallest data  
        i = ss.findSmallestIndex(3);
        System.out.println("ss[" + i + "] = " + ss.get(i) + " : " + ss);

        System.out.println();

      
        // Uncomment these to test part 3
        System.out.println(ss);
        
        // Test linearSearch
        System.out.print("Linear Search: ");
        System.out.printf("1 is at index %d. \n", ss.linearSearch(1));

        System.out.println();
      
        ss.sort();
        System.out.println(ss);
	
        // Test binarySearch
        System.out.print("Binary Search: ");
        System.out.printf("1 is at index %d. \n", ss.binarySearch(1));

        System.out.println();
      
        // Test binarySearchRecursive
        System.out.print("Binary Search Recursive: ");
	      System.out.printf("1 is at index %d. \n", ss.binarySearchRecursive(1, 0, 19));

      
        System.out.println("\nMerging 2 Array Lists:");
        ArrayList <Integer> list1 = ss.buildIncreasingList(5);
        System.out.println("List 1: " + list1);

        ArrayList <Integer> list2 = ss.buildIncreasingList(10);
        System.out.println("List 2: " + list2);

        ArrayList <Integer> merged = ss.merge(list1, list2);
        System.out.println("Merged list: " + merged);
    }
}