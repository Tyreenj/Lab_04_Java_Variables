  //TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Operators {
    public static void main(String[] args) {
        int intOperandA = 1;
        int intOperandB = 6;
        int intSum = 5;
        int intProduct = 11;
        int intDifference = 18;
        int intQuotient = 14;
        int intModulo = 14;

        double doubleOperandA = 14.14;
        double doubleOperandB = 4.4;
        double doubleSum = 7.8;
        double doubleProduct = 4.7;
        double doubleDifference = 8.9;
        double doubleQuotient = 9.1;
        double doubleModulo = 8.1;

        intSum = intOperandA + intOperandB;
        System.out.println("The sum using ints of " +intOperandA +" and " +intOperandB +" is " +intSum);

        intProduct = intOperandA * intOperandB;
        System.out.println("The product using ints of " +intOperandA +" and " +intOperandB +" is " +intProduct);

        intDifference = intOperandA - intOperandB;
        System.out.println("The difference using ints of " +intOperandA +" and " +intOperandB +" is " +intDifference);

        intQuotient = intOperandA / intOperandB;
        System.out.println("The Quotient using ints of " +intOperandA +" and " +intOperandB +" is " +intQuotient);

        intModulo = intOperandA % intOperandB;
        System.out.println("The Modulo using ints of " +intOperandA +" and " +intOperandB +" is " +intModulo);


        doubleSum = doubleOperandA + doubleOperandB;
        System.out.println("The sum using doubles of " +doubleOperandA +" and " +doubleOperandB +" is " +doubleSum);

        doubleProduct = doubleOperandA * doubleOperandB;
        System.out.println("The product using doubles of " +doubleOperandA +" and " +doubleOperandB +" is " +doubleProduct);

        doubleDifference = doubleOperandA - doubleOperandB;
        System.out.println("The difference using doubles of " +doubleOperandA +" and " +doubleOperandB +" is " +doubleDifference);

        doubleQuotient = doubleOperandA / doubleOperandB;
        System.out.println("The Quotient using doubles of " +doubleOperandA +" and " +doubleOperandB +" is " +doubleQuotient);

        doubleModulo = doubleOperandA % doubleOperandB;
        System.out.println("The Modulo using doubles of " +doubleOperandA +" and " +doubleOperandB +" is " +doubleModulo);

    }
}