package src;
import java.util.Scanner;

public class FracCalc {

    public static void main(String[] args) 
    {
        // TODO: Read the input from the user and call produceAnswer with an equation
        Scanner input = new Scanner(System.in);
        System.out.println("Input your first fraction: ");
        Scanner frac1 = input.nextLine();
        System.out.println("Input your second fraction: ");
        Scanner frac2 = input.nextLine();

        Scanner work = new Scanner(frac1);
        work.useDelimiter("/");
        int numerator1 = work.nextInt();
        int denominator1 = work.nextInt();
        Scanner work = Scanner(frac2);
        work.useDelimiter("/");
        int numerator2 = work.nextInt();
        int denominator2 = work.nextInt();

        FracCalc.produceAnswer;
    }
    
    // ** IMPORTANT ** DO NOT DELETE THIS FUNCTION.  This function will be used to test your code
    // This function takes a String 'input' and produces the result
    //
    // input is a fraction string that needs to be evaluated.  For your program, this will be the user input.
    //      e.g. input ==> "1/2 + 3/4"
    //        
    // The function should return the result of the fraction after it has been calculated
    //      e.g. return ==> "1_1/4"
    public static String produceAnswer(String input)
    { 
        // TODO: Implement this function to produce the solution to the input
        int newNum = (numerator1 * denominator2) + (numerator2 * denominator1);
        int newDen = (denominator1 * denominator2);
        return newNum + " / " + newDen;
    }

    // TODO: Fill in the space below with any helper methods that you think you will need
    
}