import java.io.*;
import java.util.*;

public class Seive
{
    public static void main(String [] args)
    {
        sieve(30);
    }
    
    
    public static boolean[] sieve(int n)
    {      
        boolean [] primes = new boolean[n];
    
        for (int i = 0; i < n; i++)
        {
            primes[i] = true; 
        }
    
        for (int i = 2; i <= Math.sqrt(n); i++)
        {
            for (int a = i * 2; a <= n; a+=i)
            {
                primes[a - 1] = false;
            } 
        }
    
        for (int i = 1; i < n; i++)
        {
            if (primes[i] == true)
            {
                System.out.print(i + 1 + " ");
            }
        }

        System.out.println();
      
        return primes;
    }
      
    
  }
    
    
  