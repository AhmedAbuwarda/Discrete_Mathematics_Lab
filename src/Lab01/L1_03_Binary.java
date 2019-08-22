/*
 * To change this template file, choose Settings | Editor | File and Code Templates
 * and change the template in the editor.
 */

package Lab01;

import java.util.Scanner;

/**
 * @author Ahmed Abuwarda.
 */
public class L1_03_Binary {

    /**
     * @param args the command line arguments.
     */
    public static void main(String[] args) {
        // TODO code application logic here.

        BinaryOperation();

    }

    /**
     * @return Calculate Binary Operation.
     */
    public static void BinaryOperation() {

        // Create A Scanner To Take The Input From The User.
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        String firstNum = input.next();

        System.out.print("Enter second number: ");
        String secondNum = input.next();

        int num1 = Integer.parseInt(firstNum, 2);
        int num2 = Integer.parseInt(secondNum, 2);
        System.out.print("Enter the operation: ");
        String operation = input.next();

        int result = 0;
        int remainder = 0;

        // Switch Case.
        switch (operation) {

            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                result = num1 / num2;
                remainder = num1 % num2;
                break;

            // Default Block.
            default:
                System.out.println("Invalid operation! try again!");
                break;

        }

        // Print The Result.
        System.out.println("The result: " + Integer.toBinaryString(result) + ", int = " + result);
        System.out.println("The remainder: : " + Integer.toBinaryString(remainder) +
                ", int: " + remainder);

    }

}