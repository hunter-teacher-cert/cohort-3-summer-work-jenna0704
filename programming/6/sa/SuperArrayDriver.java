import java.io.*;
import java.util.*;

public class SuperArrayDriver
{
  public static void main( String[] args )
  {
    
    System.out.println("Testing default constructor.");
    SuperArray sa = new SuperArray();

    System.out.println("Testing empty print:");
    System.out.println(sa);
    
    System.out.println("Testing isEmpty (should be true)");
    System.out.println(sa.isEmpty());

    System.out.println();
    
    // -----------------------------------------------------------
    // YOUR HOMEGROWN/HOUSEMADE/ROLL-YOUR-OWN TEST METHODS HERE...
    // -----------------------------------------------------------

    //precondition: newly-instantiated SuperArray of default capacity
    System.out.println("Testing overfill (calling grow() in add)");
    
    for (int i = 0; i < 15; i++) 
    {
        sa.add(i);
    }//for i

    System.out.println(sa);
    System.out.println("Testing isEmpty (should be flase)");
    System.out.println(sa.isEmpty());

    System.out.println("\nTesting add at index 5, 0 and 17(end)");
    System.out.println("Add 100 at index 5: ");
    sa.add(5, 100);
    System.out.println(sa);
    System.out.println("\nAdd 100 at index 0: ");
    sa.add(0, 100);
    System.out.println(sa);
     System.out.println("\nAdd 100 at index 17: ");
    sa.add(17, 100);
    System.out.println(sa);

    System.out.println("\nTesting remove at 0, 5, and 15(end)");
    System.out.println("Remove the value at index 0: ");
    sa.remove(0);
    System.out.println(sa);
    System.out.println("\nRemove the value at index 5: ");
    sa.remove(5);
    System.out.println(sa);
    System.out.println("\nRemove the value at index 15: ");
    sa.remove(15);
    System.out.println(sa);


  }//main

}//class SuperArrayDriver