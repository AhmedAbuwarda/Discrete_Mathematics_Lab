/*
 * To change this template file, choose Settings | Editor | File and Code Templates
 * and change the template in the editor.
 */

package HomeWorks.HomeWork_01;

import java.util.Scanner;

/**
 * @author Ahmed Abuwarda.
 */
public class _01_SwitchXY {

    /**
     * @param args the command line here.
     */
    public static void main(String[] args) {
        // TODO code application logic here.

        Scanner input = new Scanner(System.in);
        System.out.print(" >> Enter Your numbers: ");
        double x = input.nextDouble(), y = input.nextDouble();

        System.out.println("\n Before: " + "X = " + x + "\n\t\t Y = " + y);
        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println("\n After:  " + "X = " + x + "\n\t\t Y = " + y);

    }

}