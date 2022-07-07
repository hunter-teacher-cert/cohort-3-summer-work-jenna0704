/**
 * Recursive String Reverser by Team Palindromotosis
 * Jenna Lin
 * collaborators: First Last, First Last
 */


public class Reverser
{
    public static void main( String[] args )
    {
        System.out.println(reverseR("odd"));
        System.out.println( reverseR("even") );
        System.out.println( reverseR("abcdefg") );
        System.out.println( reverseR("stressed") );
        System.out.println( reverseR("amanaplanacanalPanama") );

    }
  
    
    public static String reverseR(String s)
    {
        if (s.length() == 0)
        {
            return s;
        }

        else 
        {
            return reverseR(s.substring(1)) + s.charAt(0);       
        }
        
    }

  
}