import java.io.*;
import java.util.*;


public class SortSearch
{
    /* Sort project starts here */
    
    /* Instance Variables */
    private ArrayList<Integer> data;  // to store the data
    
    private Random r; 
  
    public SortSearch()
    {
        data = new ArrayList<Integer>();
  	    r = new Random();
           
  	    for (int i = 0; i < 15; i++)
        {
  	        data.add(r.nextInt(20));
  	    }	
    }

  
    public SortSearch(int size)
    {
        data = new ArrayList<Integer>();
  	    r = new Random();
          
  	    for (int i = 0; i < size; i++)
        {
  	        data.add(r.nextInt(20));
  	    }	
    }

  
    /* Convenience function to get data out of the ArrayList from the driver */
    public int get(int index)
    {
	      return this.data.get(index);
    }
    

    /*
      return the index of the smallest data idem from index start to the end
      of the ArrayList. If there are multiple of the smallest value,
      return any of them.
      
      Example, if the arraylist has:
      5,3,10,6,8
      if start was 2 (start at index 2, value 10) then it would return 3
      which is the index of the value 6 which is the index with the
      smallest value from start to end

      On the otherh and, if start was 0, then the method would
      return 1 since the value 3 is in index 1 and that is the smallest.    
    */
    public int findSmallestIndex(int start)
    {
  	    int smallIndex = start;
          
        for(int i = start; i < data.size(); i++)
        {
            if(data.get(i) < data.get(smallIndex))
            {
                smallIndex = i;
            }
        }
          
  	    return smallIndex;
    }


    /**
       Implement the selection sort algorithm by sorting the ArrayList
       data in place.

       Algorithm:
       Loop a variable that represents the ArrayList index from
       0 to the end of the ArrayList.
       For each index, find the smallest from that Location
	     to the end of the array and swap it with that index.
    */
    public void sort()
    {
        for(int i = 0; i < data.size(); i++)
        {
            int smallIndex = findSmallestIndex(i);
          
            int temp = data.get(i);
            data.set(i, data.get(smallIndex));
            data.set(smallIndex, temp);            
        }
    }


    /* Search project starts here */
    
    /**
       performs a linear search. Returns the index of the first occurence of
       value in the ArrayList data or -1 if not found.

       This works by starting at the first element and searching one element at a time 
       until either the element is found or you've looked at all the elements.

       This algorithm works on any ArrayList.
    */
    public int linearSearch(int value)
    {
        for(int i = 0; i < data.size(); i++)
        {
            if(data.get(i) == value)
            {
                return i;
            }
        }
	
	      return -1;
    }
    

    /**
       Implement a binary search as specified by the comments
       
       This algorithm only works on sorted ArrayLists.
    */
    public int binarySearch(int value)
    {
        int low = 0;
        int high = data.size();

        while(low <= high)
        {
            int middle = (low + high) / 2;

            if(data.get(middle) == value)
            {
                if(data.get(middle) == data.get(middle - 1))
                {
                    middle -= 1;
                }
              
                return middle;
            }

            else if(data.get(middle) < value)
            {
                low = middle + 1;
            }
            
            else if(data.get(middle) > value)
            {
                high = middle - 1;
            }       
        }

        return -1;
    }

  
    /**
       Implement a RECURSIVE binary search as specified by the comments
       
       This algorithm only works on sorted ArrayLists.
    */
    public int binarySearchRecursive(int value, int lowIndex, int highIndex)
    {
        while(lowIndex <= highIndex)
        {
            int middle = (lowIndex + highIndex) / 2;

            // target found
            if(data.get(middle) == value) 
            {
                if(data.get(middle) == data.get(middle - 1))
                {
                    middle -= 1;
                }
              
                return middle;
            }
    
            // if value at the middle index is greater than the target value
            else if(data.get(middle) > value)
            {
                //discard all elements to the right of get(middle), including get(middle). Now the new high value would be middle - 1. 
                return binarySearchRecursive(value, lowIndex, middle - 1);
            }
    
            // if value at the middle index is less than the target value
            else if(data.get(middle) < value) 
            {
                //discard all elements to the left of get(middle), including get(middle). Now the new low value would be mPos + 1. 
                return binarySearchRecursive(value, middle + 1, highIndex);
            }
          
        }
        
        return -1;	    
    }
    
	  public int binarySearchRecursive(int value)
    {
	      return binarySearchRecursive(value, 0, data.size());
    }

  
    public String toString()
    {
	      return "" + data;
    }


    public void builtinSort()
    {
	      Collections.sort(data);	
    }

  
    /* Merge Sort Stuff after here */
    /**
       Builds and returns an ArrayList that's already in increasing order.
       You can use this method to test your merge method.
    */
    public ArrayList<Integer> buildIncreasingList(int size)
    {
      	ArrayList <Integer> newlist = new ArrayList<Integer>();
      	Random r = new Random();
      	int nextval = r.nextInt(20) + 1;
      	for (int i = 0; i < size; i++)
        {
      	    newlist.add(nextval);
      	    nextval = nextval + r.nextInt(20);
	      }

	      return newlist;
	  }

    /**
       this routine should create and return a new ArrayList of
       integers and fill it by merging list1 and list2 into the new
       list.

       list1 and list2 are already sorted in increasing order.

       Example:
       If list1 contains [1,5,17,25]
       and list2 contains [3,6,10,30,40,50]

       The new list will contain:
       [1, 3, 5, 6, 10, 17, 25, 30, 40, 50]     
    */
       
    public ArrayList<Integer> merge(ArrayList<Integer> list1, ArrayList<Integer> list2)
    {
      	// create a new ArrayList merged to store values from list1 and list2
      	ArrayList <Integer> merged = new ArrayList <Integer>();

        // use i, j, and k to keep track of where we are at in list1, list2, and merged list
        int i = 0;
        int j = 0;
        int k = 0;

        while(i < list1.size() && j < list2.size())
        {
            if(list1.get(i) < list2.get(j))
            {
                merged.add(list1.get(i));
                k++;
                i++;
            }
            else 
            {
                merged.add(list2.get(j));
                k++;
                j++;
            }
        }

        while(i < list1.size())
        {
            merged.add(list1.get(i));
            k++;
            i++;
        }

        while(j < list2.size())
        {
            merged.add(list2.get(j));
            k++;
            j++;
        }
        
      	return merged;
    }

    
     
}
