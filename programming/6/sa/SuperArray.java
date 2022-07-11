/**
 * SuperArray by Team MarvelvsDC
 * Jenna Lin
 * collaborators: Christopher D, Harrison Fung, Sam Lojacono
 */

/**
   SKELETON
   SuperArray is a wrapper class for an array.

   Provides "pass-thru" accessibility to pre-existing array capabilities:
   - get/set by index
   - get length

   Adds functionality:
   - dynamic capacity
   - auto-grow capacity if necessary
*/

import java.io.*;
import java.util.*;

public class SuperArray
{
    //instance vars
    private int[] data;           // "interior"/"underlying" data container
    private int numberElements;   // number of "meaningful" elements

    // ~~~~~~~~~~~~~~~ CONSTRUCTORS ~~~~~~~~~~~~~~~
    //default constructor -- initializes capacity to 10
    public SuperArray()
    {
        //init underlying/inner storage of capacity 10
        this.data = new int[10];

        //init instance vars
        this.numberElements = 0;
    }
    
    //overloaded constructor -- allows specification of initial capacity
    public SuperArray(int size)
    {
        this.data = new int[size];
        this.numberElements = 0;
    }


    // ~~~~~~~~~~~~~~~ METHODS ~~~~~~~~~~~~~~~
    public void add(int value)
    {
        // test to see if we need to grow, then grow
        if(this.data.length == this.numberElements)
        {
            grow();
        }

        // add item to the end
        this.data[this.numberElements] = value;

        // increment numberElements
        this.numberElements += 1;

    } //end add()


    public boolean isEmpty()
    {
        //return whether this SuperArray instance is empty
        return this.numberElements == 0;
    }


    public int get(int index)
    {
        //return item at index
        return this.data[index];
    }


    public String toString()
    {
        String newString = "{";

        //return stringified version of this Object       
        for (int i = 0; i < this.numberElements; i++)
        {
            if(i == 0)
            {
                newString += this.data[i];
            }
            else
            {
                newString += ", " + this.data[i];
            }            
        }

        newString += "}";

        return newString;

    }//end toString()


    // return Stringified version of this Object,
    // with extra debugging info
    // (helper method for debugging/development phase)
    public String debug()
    {
        String s = "";
        s = "Size: " + this.data.length;
        s = s + " LastItem: " + numberElements + "  Data: ";

        for (int i = 0; i < numberElements; i++) 
        {
            s = s + data[i] + ", ";
        }
        
        s = s + "\n";
        
        return s;

    }//end debug()


    public void remove(int index)
    {
        // shift items down to remove the item at index
        for (int i = index; i < numberElements; i++)
        {
            this.data[i] = this.data[i + 1];
        }

        // subtract 1 from numberElements;
        this.numberElements -= 1; 
    }


    public void add(int index, int value)
    {
        // see if there's enough room
        if(this.data.length == this.numberElements)
        {
            grow();
        }

        // shift elements toward the end of the array
        for(int i = numberElements; i > index; i--)
        {
            this.data[i] = this.data[i - 1];
        }
        
        // insert new element
        this.data[index] = value;

        // increment numElements
        this.numberElements += 1; 
    }


    // grow() is called when data.length = numberElements
    private void grow()
    {
        // create a new array with extra space
        int[] newArray = new int[this.data.length + 5];

        // copy over all the elements from the old array to the new one
        for(int i = 0; i < this.data.length; i++)
        {
            newArray[i] = this.data[i];
        }

        // point data to the new array
        this.data = newArray;

    }//end grow()

}//end class