/**
 * Recursion Practice with Strings by Team SweatEquity
 * Jenna Lin
 * collaborators: First Last, First Last
 */

public class Fence
{
    public static void main(String[] args)
    {          
        for(int i = 0; i <= 10; i++) 
        {
             System.out.println(i + "-post fences: ");
             System.out.println(fenceR(i));
        }
    }
 
  
    public static String fenceR(int n)
    {
       if (n == 0)
       {
           return "";
       }
       if (n == 1)
       {
           return "|";
       }       
       else 
       {
           return fenceR(n - 1) + "--|";
       }
    }

}