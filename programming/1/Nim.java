import java.util.*;

public class Nim
{
    public static void main(String[] args)
    {
        int stones = 12;
        int stonesTaken;

        Scanner in = new Scanner(System.in);
        Random random = new Random(); 

        System.out.println("There are 12 stones in the bag. You and the computer will take turn to remove 1 to 3 stones from the bag. The last person to remove the stones wins the game!");
      
        //loop until game ends
        while(stones > 0)
        {
            //prompt user for input
            System.out.print("How many stones do you wish to remove? ");
            stonesTaken = in.nextInt();
            in.nextLine();

            if (stonesTaken > 0 && stonesTaken <= 3)  
            {
                //Calculate the number of stones remaining in the bag, then print.
                stones = stones - stonesTaken;
                System.out.printf("You removed %d stones. There are %d stones remaining.\n", stonesTaken, stones);
        
                if (stones <= 3)
                {
                    System.out.println("Computer wins!");
                    break;
                }

                //computer pick a radomn number between 1-3
                int computer = random.nextInt(3)+1;
                stones = stones - computer;

                //Calculate the number of stones remaining in the bag, then print. 
                System.out.printf("The computer removed %d stones. There are %d stones remanining.\n", computer, stones);

                if (stones <= 3)
                {
                    System.out.println("You win!");
                    break;
                }

            }  
            
            //Show error message if user inputs a number > 3.
            else
            {
                System.out.println("You may only remove 1 to 3 stones each time.");

            }
            
            

            
        }
        

    }

}