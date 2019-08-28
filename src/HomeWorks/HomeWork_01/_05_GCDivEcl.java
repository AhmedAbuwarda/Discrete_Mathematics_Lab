/*
 * To change this template file, choose Settings | Editor | File and Code Templates
 * and change the template in the editor.
 */

package HomeWorks.HomeWork_01;

import java.util.Scanner;

/**
 * @author Ahmed Abuwarda.
 */
public class _05_GCDivEcl {

    /**
     * @param args the command line here.
     */
    public static void main(String[] args) {
        // TODO code application logic here.

        Scanner input = new Scanner(System.in);
        System.out.print(" >> Enter Your Numbers: ");
        int p = input.nextInt();
        int q = input.nextInt();

        System.out.printf(" >> GCG (%d,%d) is: %d", p, q, gcd(p, q));
        System.out.printf("\n >> LCM (%d,%d) is: %d", p, q, (p * q) / gcd(p, q));

    }

    /**
     * Euclid's Algorithms.
     *
     * @param p Any int number.
     * @param q Any int number.
     * @return gcd(q, p % q)
     */
    private static int gcd(int p, int q) {

        // If statement.
        if (q == 0) {
            return p;
        } else {
            return gcd(q, p % q);
        }

    }

}