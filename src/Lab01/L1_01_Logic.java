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
     * @return truth table.
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

        int array2[] = new int[lengthOfLargeNumber];
        System.out.println("The truth table: -----");
        int numbOfOperations = 1;

        L:

        // For Loop.
        for (int i = 0; i < array.length; i++) {

            // Another For loop.
            for (int j = 0; j < array2.length; j++) {
                array2[j] = array[i].charAt(j) - '0';
            }
            numbOfOperations = array2[0];

            // Switch Case.
            switch (operation.toLowerCase()) {
                case "and":
                    for (int j = 1; j < array2.length; j++) {
                        numbOfOperations &= array2[j];
                    }
                    break;
                case "or":
                    for (int j = 1; j < array2.length; j++) {
                        numbOfOperations |= array2[j];
                    }
                    break;
                case "xor":
                    for (int j = 0; j < array2.length; j++) {
                        numbOfOperations ^= array2[j];
                    }
                    break;
                case "imp":
                    for (int j = 0; j < array2.length; j++) {
                        numbOfOperations = inverter(numbOfOperations);
                        numbOfOperations |= array2[j];
                    }
                case "bic":
                    for (int j = 0; j < array2.length; j++) {
                        numbOfOperations ^= array2[j];
                    }
                    numbOfOperations = inverter(numbOfOperations);
                    break;
                default:
                    System.out.println("Please!, enter correct operation!");
                    break L;
            }

            // Print The Result.
            System.out.println(array[i] + "\t" + numbOfOperations);
            System.out.println("*****************");
            numbOfOperations = 1;

        }

    }

    /**
     * @param x
     * @return zero or one.
     */
    public static int inverter(int x) {
        return x == 1 ? 0 : 1;
    }

}