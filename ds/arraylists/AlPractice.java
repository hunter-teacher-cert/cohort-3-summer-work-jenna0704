import java.io.*;
import java.util.*;

public class AlPractice
{

    public static void main(String[] args) 
    {
        ArrayList <Integer> al;

        // Uncomment these to test buildRandomList
        al = buildRandomList(10,100);
        System.out.println("ArrayList al: " + al);
        System.out.println();
        
        // Check sumOfList
        System.out.printf("The sum of elements in ArrayList al is %d.\n", sumOfList(al));
        System.out.println();
        
        // Uncomment these to test swapElements
        System.out.println("Swap the elements in index 2 and 6 in ArrayList al.");
        swapElements(al, 2, 6);
        System.out.println(al);
        System.out.println();

        // Uncomment these to test removeValue
        System.out.println("Add 5, 10, 5, and 13 to the end of ArrayList al. \nThen set the elements in index 2 and 3 to 5.");
        al.add(5);
        al.add(10);
        al.add(5);
        al.add(13);
        al.set(2, 5);
        al.set(3, 5);
        System.out.println(al);
        System.out.println("\nRemove all the 5s.");
        removeValue(al, 5);
        System.out.println(al);
        System.out.println();

        ArrayList <Integer> listA = buildRandomList(5, 10);
        System.out.println("List A: " + listA);
        ArrayList <Integer> listB = buildRandomList(5, 30);
        System.out.println("List B: " + listB);
        System.out.println("Sum List: " + sumLists(listA, listB));
        System.out.println();

        // Check zipLists
        ArrayList <Integer> listC = buildRandomList(2, 10);
        System.out.println("List C: " + listC);
        ArrayList <Integer> listD = buildRandomList(5, 10);
        System.out.println("List D: " + listD);        
        System.out.println("Zip List: " + zipLists(listC, listD));

    }

    /**
    Parameters:
    - size - an integer representing how many items to add to the list
    - maxval - the largest value to store in the list
    Preconditions:
    - size >= 0
    - maxVal > 0
    Returns:
    - A new ArrayList of Integers with each value being a random
        number between 0 and maxval (not including maxval).
    */

    public static ArrayList<Integer> buildRandomList(int size, int maxval)
    {
        Random random = new Random();
        ArrayList <Integer> randomNumbers = new ArrayList <Integer> ();

        for (int i = 0; i < size; i++)
        {
            randomNumbers.add(random.nextInt(maxval));
        }
     
        return randomNumbers;
    }


    /**
    Parameters:
    - dataList - an ArrayList of integer values.
    Returns:
    - The sum of all of the elements of the ArrayList.
    */

    public static int sumOfList(ArrayList<Integer> dataList)
    {
        int sum = 0;

        for (int i = 0; i < dataList.size(); i++)
        {
            sum += dataList.get(i);
        }

        return sum;//placeholder to compile.
    }


    /**
    Parameters:
    - dataList - an ArrayList of Integers
    - index1, index2 - the two locations to swap.
    Preconditions:
    - index1 and index2 are valid indecies of dataList
    Postconditions:
    - The ArrayList is modified such that
        The value that was in dataList[index1] is now in dataList[index2], and
        the value  that was in dataList[index2] is now in dataList[index1].
    - No other values should be modified.
    */

    public static void swapElements(ArrayList<Integer> dataList, int index1,int index2)
    {
        int temp = dataList.get(index1);
        dataList.set(index1, dataList.get(index2));
        dataList.set(index2, temp);
    }


    /**
    Parameters:
    - dataList - an AraryList of Integers
    - valueToRemove - the value to remove
    Postconditions:
    - The dataList is modified such that all occurances of valueToRemove are removed.
    */

    public static void removeValue(ArrayList<Integer> dataList, int valueToRemove)
    {
        for (int i = 0; i < dataList.size(); i++)
        {
            dataList.remove(new Integer(valueToRemove));
        }

    }

    // public static void removeValue(ArrayList<Integer> dataList, int valueToRemove)
    // {
    //     int i = 0;

    //     while (i < dataList.size())
    //     {
    //         if (dataList.get(i) == valueToRemove)
    //         {
    //             dataList.remove(i);
    //         }
    //         else
    //         {
    //           i++;
    //         }
    //     }

    // }


    /**
    Parameters:
    - ListA,ListB - ArrayLists of integer values.
    Preconditions:
    - ListA and ListB have equal lengths.
    Returns:
    - A new ArrayList that contains the sum of the corresponding indecies of the two arraylists.
        e.g. sumLists( [1,2,3], [4,0,5]) would return: [5,2,8]
    Postconditions:
    - The parameter ArrayLists should not be modified.
    */

    public static ArrayList<Integer> sumLists(ArrayList <Integer> ListA, ArrayList <Integer> ListB)
    {
        ArrayList <Integer> sumArray = new ArrayList <Integer> ();
        for (int i = 0; i < ListA.size(); i++)
        {
            sumArray.add(ListA.get(i) + ListB.get(i));
        }
        
        return sumArray;
    }


    /** zipLists
    Parameters:
    - ListA,ListB - ArrayLists of integer values.
    Returns:
    - A new ArrayList that contains all of the elements from both ArrayLists in alternating order starting with ListA's first element.
        When one list has no more values to add, continue adding the remaining values of the longer list.
        e.g. zipLists( [1,2,3,4], [8,9]) would return: [1,8,2,9,3,4]
    Postconditions:
    - The parameter ArrayLists should not be modified.
    */

    public static ArrayList<Integer> zipLists(ArrayList<Integer>ListA,ArrayList<Integer>ListB)
    {
        ArrayList <Integer> zipArray = new ArrayList <Integer> ();

        int i = 0;
        int j = 0;
        
        // Loop through both lists until the elements of the shorter list are exhausted. 
        while (i < ListA.size() && j < ListB.size())
        {
            // Add an element from List A
            zipArray.add(ListA.get(i));

            // Add an element from List B
            zipArray.add(ListB.get(j));

            //Incrementing the counters
            i++;
            j++;
        }

        // Loop through the remaining part of List A
        while (i < ListA.size())
        {
            zipArray.add(ListA.get(i));

            i++;
        }

        // Loop through the remaining part of List B
        while (j < ListB.size())
        {
            zipArray.add(ListB.get(j));

            j++;
        }

        return zipArray;
    }


} //end class
