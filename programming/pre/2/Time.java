import java.io.*;
import java.util.*;

public class Time
{

  public static void main(String[] args) 
  {

    int hour = 19;
    int minute = 7;
    int second = 30;

    System.out.printf("The current time is %d:%d:%d.\n", hour, minute, second);

    final int SEC_PER_HOUR = 3600;
    final int SEC_PER_MIN = 60;
    
    //Calculate and display the number of seconds since midnight.
    System.out.print("Number of seconds since midnight = ");
    System.out.println(hour*SEC_PER_HOUR + minute*SEC_PER_MIN + second);

    //Calculuate and display the number of seconds remaining in the day.
    int secSinceMidnight = hour*SEC_PER_HOUR + minute*SEC_PER_MIN + second;
    System.out.print("Number of seconds remaining in the day = ");
    System.out.println(24*SEC_PER_HOUR - secSinceMidnight);

    //Calculate and display the percentage of the day that ha passed.
    double timePassed = hour*60.0*60.0 + minute*60.0 + second;
    double percentPassed = timePassed/(24.0*60.0*60.0) * 100;
    System.out.printf("Percentage of the day that has passed = %.1f %% \n", percentPassed);
    
    int hourCurrent = 20;
    int minuteCurrent = 17;
    int secondCurrent = 45;

    System.out.printf("The current time is %d:%d:%d.\n", hourCurrent, minuteCurrent, secondCurrent);

    //Calculate and display elapsed time
    int a = Math.abs(hourCurrent-hour);
    int b = Math.abs(minuteCurrent-minute);
    int c = Math.abs(secondCurrent-second);
    System.out.print("The elapsed time since I started working on this exercise is ");
    System.out.printf("%d hours, %d minutes, and %d seconds.\n", a, b, c);

    int z = a * 3600 + b * 60 + c;

    System.out.println("Number of seconds since I started working on this exercise: " + z);
  
  }
}