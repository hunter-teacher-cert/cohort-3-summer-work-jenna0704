import java.io.*;
import java.util.*;

public class Guess
{
  
  public static void main(String[] args) 
  {


    System.out.println("I'm thinking of a number between 1 and 100 (including both). Can you guess what it is?");

    Scanner in = new Scanner(System.in);
    
    int guess;

    //Prompt the user for an input. 
    System.out.print("Type a number: ");
    guess = in.nextInt();
    in.nextLine();
    
    System.out.printf("Your guess is %d. \n", guess);
    
    //Pick a random number between 1-100. 
    Random random = new Random();
    int number = random.nextInt(100)+1;
  
    System.out.printf("The number I was thinking of is %d. \n", number);

    //Calculate the difference. 
    int difference = Math.abs(guess - number);
    
    System.out.printf("You were off by %d.\n", difference);
  
  }
}

