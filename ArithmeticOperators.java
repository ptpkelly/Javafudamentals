package arithmeticoperators;

/**
 *
 * @author paulkelly
 * @version 1
 */
public class ArithmeticOperators {

    public static void main(String[] args) {
        // Define the variables used in the program
        int var1, var2;
        /*
         * Place values into the variables and display the values in the
         * variables
         */
        var1 = 0;
        var2 = 10;
        System.out.format("var1 is %d and var2 is %d\n", var1, var2);
        /*
         * Do some arithmetic with the variables and display the values in the
         * variables
         */
        var2 = var1 + 18;
        System.out.println("var2 is now " + var2);
        var1 = var2 * 3;
        System.out.println("var1 is now " + var1);
        var1 = var2 / 3;
        System.out.println("var1 is now " + var1);
        var2 = var1 - 1;
        System.out.println("var2 is now " + var2);
        var1 = var2 % 3;
        System.out.println("var1 is now " + var1);
        var1 = var1 + 1;
        System.out.println("var1 is finally " + var1);
        var2 = var2 * 5;
        System.out.println("and var2 is finally " + var2);
    }

}
