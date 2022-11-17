package src;
import java.util.Scanner;

public class FracCalc {

    public static void main(String[] args) {
        // TODO: Read the input from the user and call produceAnswer with an equation
        Scanner exput = new Scanner(System.in);
        System.out.println("Input fraction equation: ");
        String frac = exput.nextLine();
        System.out.println(FracCalc.produceAnswer(frac));
    }

    // ** IMPORTANT ** DO NOT DELETE THIS FUNCTION.  This function will be used to test your code
    // This function takes a String 'input' and produces the result
    //
    // input is a fraction string that needs to be evaluated.  For your program, this will be the user input.
    //      e.g. input ==> "1/2 + 3/4"
    //        
    // The function should return the result of the fraction after it has been calculated
    //      e.g. return ==> "1_1/4"
    public static String produceAnswer(String frac) {
        /*
        The delimiter splits the string into numerator and denominator variables
         */
        Scanner work = new Scanner(frac);
        work.useDelimiter("/");
        double numerator1 = work.nextInt();
        double denominator1 = work.nextInt();
        Fraction objfrac1 = new Fraction(numerator1, denominator1);

        double numerator2 = work.nextInt();
        double denominator2 = work.nextInt();
        Fraction objfrac2 = new Fraction(numerator2, denominator2);

            double newNum = (numerator1 * denominator2) + (numerator2 * denominator1);
            double newDen = (denominator1 * denominator2);
            return newNum + "/" + newDen;

        // TODO: Fill in the space below with any helper methods that you think you will need
    }
}