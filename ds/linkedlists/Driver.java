import java.io.*;
import java.util.*;

public class Driver{
  public static void main(String[] args) 
  {
    LinkedList l = new LinkedList();
    
    l.add("one");
    l.add("two");
    l.add("three");
    l.add("four");
    l.add("five");

    System.out.println(l);

    System.out.println("\nElement at index 1: " + l.get(1));

    System.out.printf("\nThe size of the linked list is %d.\n", l.size());

    System.out.println();

    l.add(4, "BOO");
    System.out.println(l);
    
    System.out.println();
    System.out.println("The index of BOO is: " + l.indexOf("BOO"));

    System.out.println();
    System.out.println(Arrays.toString(l.toArray()));

    System.out.println();
    l.remove(2);
    System.out.println(l);
    
  }
}