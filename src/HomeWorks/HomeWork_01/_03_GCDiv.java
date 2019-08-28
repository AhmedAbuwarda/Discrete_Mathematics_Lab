/*
 * To change this template file, choose Settings | Editor | File and Code Templates
 * and change the template in the editor.
 */

package HomeWorks.HomeWork_01;

import java.util.Scanner;

/**
 * @author Ahmed Abuwarda.
 */
public class _03_GCDiv {

    /**
     * @param args the command line here.
     */
    public static void main(String[] args) {
        // TODO code application logic here.

        Scanner input = new Scanner(System.in);
        System.out.print(" >> Enter Your numbers: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        // While loop.
        while (num1 != num2) {

            // If statement.
            if (num1 > num2)
                num1 -= num2;
            else
                num2 -= num1;

        }

        System.out.println(" The GCD is: " + num1);

    }

}