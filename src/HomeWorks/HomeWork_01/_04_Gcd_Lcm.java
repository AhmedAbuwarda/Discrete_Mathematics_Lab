/*
 * To change this template file, choose Settings | Editor | File and Code Templates
 * and change the template in the editor.
 */

package HomeWorks.HomeWork_01;

import java.util.Scanner;

/**
 * @author Ahmed Abuwarda.
 */
public class _04_Gcd_Lcm {

    /**
     * @param args the command line here.
     */
    public static void main(String[] args) {
        // TODO code application logic here.

        compute_Gcd_Lcm();

    }

    // This method to run the program.
    private static void compute_Gcd_Lcm() {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the first number and the second (1st  2nd): ");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        System.out.print("\nGCD or LCM: ");

        // Switch case.
        switch (scan.nextInt()) {

            case 1:
                gcd(num1, num2);
                break;
            case 2:
                lcm(num1, num2);
                break;
            default:
                System.out.println("Error");
                break;

        }

    }

    /**
     * @param num1 Any int number.
     * @param num2 Any int number.
     * @return num1 or gcd(num1 - num2, num2) or gcd(num1, num2 - num1)
     */
    private static int gcd(int num1, int num2) {

        // If statement.
        if (num1 == num2) {
            return num1;
        }
        if (num1 > num2) {
            return gcd(num1 - num2, num2);
        } else {
            return gcd(num1, num2 - num1);
        }

    }

    /**
     * @param num1 Any int number.
     * @param num2 Any int number.
     * @return (num1 * num2) / gcd(num1, num2)
     */
    private static int lcm(int num1, int num2) {
        return (num1 * num2) / gcd(num1, num2);
    }

}