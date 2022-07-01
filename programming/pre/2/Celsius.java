import java.io.*;
import java.util.*;

public class Celsius
{

  public static void main(String[] args)
  {

    double celsius, fahrenheit;
    
    Scanner in = new Scanner (System.in);

    //prompt the user for input temperature in degree Celsius. 
    System.out.print("Enter a temperature in degree Celsius: ");
    celsius = in.nextDouble();
    in.nextLine(); //flushes out the previous input 
        
    //convert degree celsius to degree fahrenheit
    fahrenheit = celsius * (9.0/5.0) + 32;

    //print the temperature in degree fahrenheit. 
    System.out.printf("%.1f °C = %.1f °F\n", celsius, fahrenheit);

  
    
  }
}