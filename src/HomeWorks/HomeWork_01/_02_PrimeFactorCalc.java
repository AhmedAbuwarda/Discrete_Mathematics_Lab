/*
 * To change this template file, choose Settings | Editor | File and Code Templates
 * and change the template in the editor.
 */

package HomeWorks.HomeWork_01;

import java.lang.Math;
import java.util.Scanner;

/**
 * @author Ahmed Abuwarda.
 */
public class _02_PrimeFactorCalc {

    /**
     * @param args the command line here.
     */
    public static void main(String[] args) {
        // TODO code application logic here.

        Scanner input = new Scanner(System.in);
        System.out.print("  >> Enter Your Numbers: ");
        int num1 = input.nextInt(), num2 = input.nextInt();

        primeFactors(num1);
        System.out.println("");
        primeFactors(num2);

    }

    /**
     * @param num Any int number.
     */
    private static void primeFactors(int num) {

        int[] array = new int[6];

        // While loop.
        while (num % 2 == 0) {

            array[0] = 2;
            System.out.print(2 + " ");
            num = num / 2;

        }

        // For loop.
        for (int i = 3; i <= Math.sqrt(num); i = i + 2) {

            // While loop.
            while (num % i == 0) {

                System.out.print(i + " ");
                num = num / i;

            }
        }

        // If statement.
        if (num > 2) {

            System.out.print(num);

        }

    }

}