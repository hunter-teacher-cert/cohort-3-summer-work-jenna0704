import java.io.*;
import java.util.*;

public class Date{

  public static void main(String[] args)
  {

    String day = "Tuesday";
    String month = "March";
    int year = 2022;
    int date = 8;
   
    System.out.println("Day:" + day);
    System.out.println("Month:" + month);
    System.out.println("Date:" + date);
    System.out.println("Year:" + year);
    
    //Display the date in standard American format 
    System.out.printf("American format: %s, %s %d, %d\n", day, month, date, year);
        
    //Display the date in European format 
    System.out.printf("European format: %s %d %s %d\n", day, date, month, year);

  }
  
}