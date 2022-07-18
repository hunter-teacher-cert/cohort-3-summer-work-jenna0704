import java.io.*;
import java.util.*;

/**
For all attempted methods, make sensible decisions for error and
edge cases (such as indexing out of bounds).

Basic
-----
add(string value)
get(int index);
toString()


Intermediate (at least add, size + one of the other two)
------------
size()
add(int index,String value)
indexOf(String value);
toArray()


Challenge
--------
remove(int index);
*/

public class LinkedList
{

    private Node head;

    public LinkedList()
    {
        head = null;
    }

    /**
    Parameters:
    value - the new string to add to the list

    Adds a new node containing value to the front of the list.
    */
    public void add(String value)
    {
        // Allocate the Node and put in the value, then make next of newNode as head;
        Node newNode = new Node(value, head);

        // Move the head to point to newNode;
        head = newNode;
    }


    /**
    Returns the String in the node at location index.
    */
    public String get(int index)
    {
        String returnString = "Index Out of Bound Error.";
        
        Node walker = head;

        int i = 0;

        while(i <= index && walker != null)
        {
            if(i == index)
            {
                returnString = walker.getData();
            }
            
            walker = walker.getNext();
            i++;
        }

        return returnString;
    }


    /**
    Return a string representation of the list
    */
    public String toString()
    {
        // Create an empty string
        String returnString = "";

        Node walker = head;

        while(walker.getNext() != null)
        {
            returnString += walker;
            walker = walker.getNext();
        }
        
        return returnString + walker.getData();
    }


    /**
    returns the number of elements in the list
    */
    public int size()
    {
        int count = 0;

        Node walker = head;

        while(walker != null)
        {
            count++;
            walker = walker.getNext();
        }
        
        return count;
    }



    /**
    Parameters:
    index - an int with the location to add
    value - the new value

    Adds a new node with the String value to the list.
    The new node should be added at the location specified by the index.

    For example, given the list:
    "a" -> "b" -> "c" -> "d"

    add(1,"z") results in:
    "a"-> "z" -> "b" -> "c" -> "d"

    */
    public void add(int index, String value)
    {

        Node walker = head;

        if (index == 0)
        {
            add(value);
        }
        
        else
        {
            for(int i = 0; i < index - 1; i++)
            {
                walker = walker.getNext();
            }

            // Allocate the Node and put in the value, then make next of newNode as walker.getNext();
            Node newNode = new Node(value, walker.getNext());
            
            walker.setNext(newNode);
        }
          
    }


    /**
    Returns the index (location) of the first node in the list
    that contains value.

    Example:
    Given the list:
    "a"->"b"->"c"->"d"->"e"
    indexOf("d") would return 3 since "d" is at location 3.

    */
    public int indexOf(String value)
    {
        int index = 0;

        Node walker = head;
        
        while (walker != null)
        {
            if(walker.getData() == value)
            {
                return index;
            }
            
            walker = walker.getNext();

            index += 1;

        }
        
        return -1; // return -1 if value is not found.
    }


    /**
    This routine should create a new array that is the same
    size as the number of Nodes in the list.

    It should then copy all of the values to the array and return
    the array.

    */
    public String[] toArray()
    {
        String[] newArray = new String[size()];

        Node walker = head;
        
        for (int i = 0; i < newArray.length; i++)
        {
            newArray[i] = walker.getData();
            walker = walker.getNext();
        }
        
        return newArray;
    }


    /**
    Remove the Node at location index from the list.

    Ex:
    
    Given the list:
    "a"->"b"->"c"->"d"->"e"

    remove(2) results in:
    "a"->"b"->"d"->"e"
    */
    public void remove(int index)
    {
        Node walker = head; 

        if(index == 0)
        {
            head = walker.getNext();
        }
        
        for(int i = 0; i < index - 1; i++)
        {
            walker = walker.getNext();
        }

        walker.setNext(walker.getNext().getNext());

    }






} // end class