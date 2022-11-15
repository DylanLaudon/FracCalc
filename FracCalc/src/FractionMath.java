public class FractionMath {
    int newNum = (objfrac1.getNumerator() * objfrac2.getDenominator()) + (objfrac2.getNumerator() * objfrac1.getDenominator());
    int newDen = (objfrac1.getDenominator() * objfrac2.getDenominator());
        return newNum + " / " + newDen;
}
