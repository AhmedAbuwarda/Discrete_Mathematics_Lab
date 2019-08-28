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

    // This Method Returns Truth Table.
    public static void logic() {

        // Crete A Scanner To Take The Data From The User.
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number of input: ");
        int numOfPossibilities = (int) Math.pow(2, input.nextInt());
        // ex : 2^2 -> 4 , 2^3 -> 8 / 2 is constant and scan cahange
        // like #of bits.

        int lengthOfLargeNumber = Integer.toBinaryString(numOfPossibilities - 1).length();
        // index for binary , 4 - 1 = 3 => 11 in bin => length = 2 = index  0 , 1 // 3 => 3-1 0 , 1 , 2 for index.
        // example 2**countPossibilities = 9 => countPossibilities -1 = 8 => 8 -> 1000 => 4bit.
        // example countPossibilities = 4 => countPossibilities -1 = 8 => 8 -> 1000 => 4bit.
        // System.out.println("aaa " + lenLargeNumOfBinay);.

        String[] array = new String[numOfPossibilities];
        // create string of array , length = 2 -> 4 , length = 3 -> 8.
        // #of propartes , 2**2 => 00 , 01 , 10 ,11.
        // 2**3 => 8 => 000 ,001,010,011,100,101,110,111.
        // System.out.println("arr length = " + arr.length);.

        System.out.println("Please!, enter the operation: ");
        String operation = input.next();

        String str = "";

        // For Loop.
        for (int i = 0; i < numOfPossibilities; i++) {
            str = Integer.toBinaryString(i);
            // 0 -> 0 , 1 -> 1 , 2 -> 10 , 3 -> 11 all length of the number the same the large number ,2 bit.
            // System.out.println("" + str);

            // If Statement.
            if (str.length() < lengthOfLargeNumber) {
                array[i] = String.join("", Collections.nCopies(lengthOfLargeNumber -
                        str.length(), "0")) + str;
                // this add the 0 for the smallest length of bits.

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
            // #of propartes like we in 2 -> 2**2 = 4 pro , 00 , 01 , 10 , 11.

            // Another For Loop.
            for (int j = 0; j < array2.length; j++) {

                array2[j] = s.charAt(j) - '0';
                //the arr[0] = "000" we need convert to int.
                //n[0] = arr[0].charAt(0) - '0' = 0 int.
                //n[1] = arr[0].charAt(1) - '0' = 0 int.
                //n[2] = arr[0].charAt(2) - '0' = 0 int.

            }
            // after we convert the "000" to 000 we directly get the result.

            numbOfOperations = array2[0];   // pass the first item form the 000 to nOp because we start.

            // Switch Case "get the operator what i need from scan".
            switch (operation.toLowerCase()) {

                case "and":

                    // For Loop "the for loop started from 1 not 0 becuase 0 i pass before switch".
                    for (int j = 1; j < array2.length; j++) {
                        numbOfOperations &= array2[j]; // start the my opration.
                    }
                    break;  // after end I go out switch.
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
                case "imp": // p'|q.

                    // For Each.
                    for (int value : array2) {
                        numbOfOperations = inverter(numbOfOperations);
                        numbOfOperations |= value;
                    }
                case "bic": // (p(xor)q)' = (p'&q)|(p&q').

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
            System.out.println(s + "\t" + numbOfOperations);    // print the propartes and get space and get the result.
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