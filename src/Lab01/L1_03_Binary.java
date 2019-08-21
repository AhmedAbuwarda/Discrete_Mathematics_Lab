package Lab01;

import java.util.Scanner;

public class L1_03_Binary {

    public static void main(String[] args) {

        BinaryOperation();

    }
    public static void BinaryOperation(){

        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        String firstNum = input.next();
        System.out.print("Enter second number: ");
        String secondNum = input.next();
        int num1 = Integer.parseInt(firstNum, 2);
        int num2 = Integer.parseInt(secondNum,2);
        System.out.print("Enter the operation: ");
        String operation = input.next();
        int result = 0;
        int remainder = 0;
        switch (operation){
            case "+": result = num1 + num2; break;
            case "-": result = num1 - num2; break;
            case "*": result = num1 * num2; break;
            case "/": result = num1 / num2; remainder = num1 % num2; break;
            default: System.out.println("Invalid operation! try again!"); break;
        }
        System.out.println("The result: " + Integer.toBinaryString(result) + ", int = " + result);
        System.out.println("The remainder: : " + Integer.toBinaryString(remainder) +
                ", int: " + remainder);
    }

}