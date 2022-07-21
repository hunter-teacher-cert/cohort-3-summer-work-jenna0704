
// Goal - make an upside-down tree that contains stars *
// Example - makeATree(3) will display 
  // * * *
  //  * *
  //   *
public class TreeOfStars
{

    public static void main(String[] args)
    {
       // Call the method you created with any value less than 20
       makeATree(9);
    }

  //create 
    public static void makeATree(int value)
    {
      //Initiate numStars to keep track of the number of stars
        int numStars = value;
        
      //The spacer variable controls how far the * is from the edge of the console. 
        int spacer = 0;
        // write code to traverse through the rows and print the spaces and stars.
        for(int row = 0; row <= value; row++)
        {
            for(int i = 0; i < spacer; i++)
            {
                System.out.print(" ");
            }
            
            for(int j = numStars; j > 0; j--)
            {
                System.out.print("* ");
            }
            
            System.out.println();
            //The spacer variable should change size each iteration through the outer loop!
            spacer++;
          // the variable numStars should get decreased by one each time
            numStars--;
        }
        
    }
}
