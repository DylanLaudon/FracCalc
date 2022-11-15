package src;
import java.util.Scanner;

public class FracCalc {

    public static void main(String[] args)
    {
        // TODO: Read the input from the user and call produceAnswer with an equation
        System.out.println(FracCalc.produceAnswer);
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
        Scanner input = new Scanner(System.in);

        System.out.println("Input your first fraction: ");
        String frac1 = input.nextLine();
        System.out.println("Input your second fraction: ");
        String frac2 = input.nextLine();

        Scanner work = new Scanner(frac1);
        work.useDelimiter("/");
        int numerator1 = work.nextInt();
        int denominator1 = work.nextInt();
        Fraction objfrac1 = new Fraction(numerator1, denominator1);

        Scanner workv2 = new Scanner(frac2);
        workv2.useDelimiter("/");
        int numerator2 = workv2.nextInt();
        int denominator2 = workv2.nextInt();
        Fraction objfrac2 = new Fraction(numerator2, denominator2);

        // TODO: Implement this function to produce the solution to the input
        public static FracCalc produceAnswer {
        int newNum = (objfrac1.getNumerator() * objfrac2.getDenominator()) + (objfrac2.getNumerator() * objfrac1.getDenominator());
        int newDen = (objfrac1.getDenominator() * objfrac2.getDenominator());
        return newNum + " / " + newDen;
    }

    // TODO: Fill in the space below with any helper methods that you think you will need

}
