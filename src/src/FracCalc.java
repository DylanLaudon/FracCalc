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
        //The delimiter splits the string into two fractions
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

        int impWhole1 = 0;
        int numerator1 = 0;
        int denominator1 = 0;
        //Takes in just whole numbers
        if(!fraction1.contains("/")){
            wholeNum1 = Integer.parseInt(fraction1);
            numerator1 = 0;
            denominator1 = 0;
        } else {
            Scanner work = new Scanner(fraction1);
            work.useDelimiter("/");
            numerator1 = work.nextInt();
            denominator1 = work.nextInt();
            impWhole1 = denominator1 * wholeNum1;
            wholeNum1= 0;
        }

        int impWhole2 = 0;
        int numerator2 = 0;
        int denominator2 = 0;
        if(!fraction2.contains("/")){
            wholeNum2 = Integer.parseInt(fraction2);
            numerator2 = 0;
            denominator2 = 0;
        } else {
            Scanner workv3 = new Scanner(fraction2);
            workv3.useDelimiter("/");
            numerator2 = workv3.nextInt();
            denominator2 = workv3.nextInt();
            impWhole2 = denominator2 * wholeNum2;
            wholeNum2 = 0;
        }
        if(impWhole1 == 0) {
            numerator1 = numerator1 * denominator1;
        } else {
            numerator1 = (numerator1 * denominator1) + impWhole1;
        }
        if (impWhole2 == 0) {
            numerator2 = numerator2 * denominator2;
        } else {
            numerator2 = (numerator2 * denominator2) + impWhole2;
        }

        int newNum = 0;
        int newDen = 0;
        //Does the addition, else does the subtraction
        if (sign.equals("+")) {
            newNum = (numerator1 * denominator2) + (numerator2 * denominator1);
            newDen = (denominator1 * denominator2);
        } else if (denominator1 == 0) {
            newNum = numerator2;
            newDen = denominator2;
        } else if (denominator2 == 0) {
            newNum = numerator1;
            newDen = denominator1;
        } else  {
            newNum = (numerator1 * denominator2) - (numerator2 * denominator1);
            newDen = (denominator1 * denominator2);
        }

        int fWholeNum = 0;
        if (sign == "+") {
            fWholeNum = wholeNum1 + wholeNum2;
        } else {
            fWholeNum = wholeNum1 - wholeNum2;
        }
            if(Math.abs(newNum) > newDen) {
                fWholeNum = newNum / newDen;
                newNum = newNum % newDen;
            }
            //Removes the negative in front of the fraction if both are negative
        if(fWholeNum < 0 && newNum < 0){
            newNum = Math.abs(newNum);
        }
            if(fWholeNum > 0 || fWholeNum < 0) {
                return fWholeNum + "_" + newNum + "/" + newDen;
            }
            else {
                return newNum + "/" + newDen;
            }
        // TODO: Fill in the space below with any helper methods that you think you will need
    }
}