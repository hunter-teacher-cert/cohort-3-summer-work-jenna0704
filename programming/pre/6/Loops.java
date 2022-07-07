import java.io.*;
import java.util.*;

public class Loops
{
    public static void main (String [] args)
    {
        //Check squareRoot.
        squareRoot(15);

        //Check power.
        power(3.14,3);

        //Check factorial.
        factorial(5);

    }


    //squareRoot
    public static double squareRoot(double a)
    {
        double guess = a / 2;
        double nextGuess = (guess + a / guess) / 2;
    
        while (Math.abs(guess - nextGuess) > 0.0001)
        {
          guess = nextGuess;    
          nextGuess = (guess + a / guess) / 2;
        }

        System.out.printf("The square root of %f is approximately %f.\n", a, nextGuess);
      
        return nextGuess;
      
    }


    //power
    public static double power(double x, int n)
    {
        double y = 1.0;
      
        for (int i = 0; i < n; i++)
        {               
            y = y * x;  
        }

        System.out.printf("%f raised to the power of %d is %f.\n", x, n, y);
      
        return y;
    }


    //factorial
    public static int factorial(int x)
    { 
        int product = x;
        
        for (int i = 1; i < x; i++)
        {    
          product = product * i;         
        }
  
        System.out.printf("The factorial of %d is %d.\n", x, product);
        return product;
      
    }
  
}