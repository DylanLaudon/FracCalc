package src;
import java.util.Scanner;

public class FracCalc {

    public static void main(String[] args) {
        // TODO: Read the input from the user and call produceAnswer with an equation
        Scanner exput = new Scanner(System.in);
        System.out.println("Input fraction equation in \"Whole_Numerator/Denominator + Whole_Numerator/Denominator\" form: ");
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
        //The delimiter splits the string into numerator and denominator variables
        Scanner workv2 = new Scanner(frac);
        workv2.useDelimiter(" ");
        String fullFraction1 = workv2.next();
        //This takes in the plus sign
        String sign = workv2.next();
        String fullFraction2 = workv2.next();

        int wholeNum1 = 0;
        String fraction1;
        if(fullFraction1.contains("_")) {
            Scanner workv4 = new Scanner(fullFraction1);
            workv4.useDelimiter("_");
            wholeNum1 = workv4.nextInt();
            fraction1 = workv4.next();
        } else {
            fraction1 = fullFraction1;
        }

        int wholeNum2 = 0;
        String fraction2;
        if(fullFraction2.contains("_")) {
            Scanner workv5 = new Scanner(fullFraction2);
            workv5.useDelimiter("_");
            wholeNum2 = workv5.nextInt();
            fraction2 = workv5.next();
        } else {
            fraction2 = fullFraction2;
        }

        Scanner work = new Scanner(fraction1);
        work.useDelimiter("/");
        int numerator1 = work.nextInt();
        int denominator1 = work.nextInt();
        Fraction objfrac1 = new Fraction(numerator1, denominator1);

        Scanner workv3 = new Scanner(fraction2);
        workv3.useDelimiter("/");
        int numerator2 = workv3.nextInt();
        int denominator2 = workv3.nextInt();
        Fraction objfrac2 = new Fraction(numerator2, denominator2);

        int newNum = 0;
        int newDen = 0;
        //Does the addition
        if (sign.equals("+")) {
            newNum = (numerator1 * denominator2) + (numerator2 * denominator1);
            newDen = (denominator1 * denominator2);
        } else  {
            newNum = (numerator1 * denominator2) - (numerator2 * denominator1);
            newDen = (denominator1 * denominator2);
        }


            int fWholeNum = wholeNum1 + wholeNum2;
            int reducedNum = 0;
            if(newNum > newDen) {
                reducedNum = newNum % newDen;
                int addWhole = newNum / newDen;
                fWholeNum += addWhole;
            }
            if(fWholeNum > 0) {
                return fWholeNum + "_" + reducedNum + "/" + newDen;
            }
            else {
                return newNum + "/" + newDen;
            }
        // TODO: Fill in the space below with any helper methods that you think you will need
    }
}