//  Grade Average Calculator - Layla Dawood
// 30--8-2025


import java.util.Scanner;

public class GradeCalc

{

    public static void main (String[] args)
   {
    
    //Print Greeting for user.
    System.out.println("---------------------------------------------------\n");
    String heart = "\u2764\uFE0F";

    System.out.println(" Welcome to your very own" + heart + " Grade Average Calculator" + heart + "  !\n ");
    System.out.println("----------------------------------------------------");

    //Create Scanner object
    Scanner marks = new Scanner(System.in);

    System.out.println("Please enter your first grade.");
    double gradeOne = marks.nextDouble();

    System.out.println("Please enter your second grade.");
    double gradeTwo = marks.nextDouble();
    
    System.out.println("Please enter your third grade.");
    double gradeThree = marks.nextDouble();

    System.out.println("Please enter your fourth grade.");
    double gradeFour = marks.nextDouble();


    //Calculate avergae based on marks given.

    double average = (gradeOne + gradeTwo + gradeThree + gradeFour) / 4;

    
    if (average >= 50) 
    {
        System.out.println("Congratulations! you have a passing average of : " + average + " !");
    }
    else if (average < 50 && average > 20)
    {
        System.out.println("You have an average of : " + average + ". Hopefully, theres no where to go from here but up!");
    }
    else
    {
        System.out.println("Your average is: " + average + "... you are beyond help.");

    }


 }

} 
