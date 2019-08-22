/*
 * To change this template file, choose Settings | Editor | File and Code Templates
 * and change the template in the editor.
 */

package Lab01;

import java.util.Collections;
import java.util.Scanner;

/**
 * @author Ahmed Abuwarda.
 */
public class L1_01_Logic {

    /**
     * @param args the command line arguments.
     */
    public static void main(String[] args) {
        // TODO code application logic here.

        logic();

    }

    /**
     * This Method Returns Truth Table.
     */
    public static void logic() {

        // Crete A Scanner To Take The Data From The User.
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number of input: ");
        int numOfPossibilities = (int) Math.pow(2, input.nextInt());
        int lengthOfLargeNumber = Integer.toBinaryString(numOfPossibilities - 1).length();
        String[] array = new String[numOfPossibilities];

        System.out.println("Please!, enter the operation: ");
        String operation = input.next();

        String str = "";

        // For Loop.
        for (int i = 0; i < numOfPossibilities; i++) {
            str = Integer.toBinaryString(i);

            // If Statement.
            if (str.length() < lengthOfLargeNumber) {
                array[i] = String.join("", Collections.nCopies(lengthOfLargeNumber -
                        str.length(), "0")) + str;
            } else {
                array[i] = str;
            }

        }

        int[] array2 = new int[lengthOfLargeNumber];
        System.out.println("The truth table: -----");
        int numbOfOperations = 1;

        L:

        // For Each Loop.
        for (String s : array) {

            // Another For Loop.
            for (int j = 0; j < array2.length; j++) {
                array2[j] = s.charAt(j) - '0';
            }
            numbOfOperations = array2[0];

            // Switch Case.
            switch (operation.toLowerCase()) {

                case "and":

                    // For Loop.
                    for (int j = 1; j < array2.length; j++) {
                        numbOfOperations &= array2[j];
                    }
                    break;
                case "or":

                    // For Loop.
                    for (int j = 1; j < array2.length; j++) {
                        numbOfOperations |= array2[j];
                    }
                    break;
                case "xor":

                    // For Each.
                    for (int value : array2) {
                        numbOfOperations ^= value;
                    }
                    break;
                case "imp":

                    // For Each.
                    for (int value : array2) {
                        numbOfOperations = inverter(numbOfOperations);
                        numbOfOperations |= value;
                    }
                case "bic":

                    // For Each.
                    for (int value : array2) {
                        numbOfOperations ^= value;
                    }
                    numbOfOperations = inverter(numbOfOperations);
                    break;

                // Default Block.
                default:
                    System.out.println("Please!, enter correct operation!");
                    break L;

            }

            // Print The Result.
            System.out.println(s + "\t" + numbOfOperations);
            System.out.println("*****************");
            numbOfOperations = 1;

        }

    }

    /**
     * @param x Any Number To Invert.
     * @return zero or one.
     */
    private static int inverter(int x) {
        return x == 1 ? 0 : 1;
    }

}