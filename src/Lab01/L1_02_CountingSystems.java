/*
 * To change this template file, choose Settings | Editor | File and Code Templates
 * and change the template in the editor.
 */

package Lab01;

import java.util.Scanner;

/**
 * @author Ahmed Abuwarda.
 */
public class L1_02_CountingSystems {

    /**
     * @param args the command line arguments.
     */
    public static void main(String[] args) {
        // TODO code application logic here.

        convertCounting();

    }

    /**
     * This Method Returns A Number In Different Format.
     */
    private static void convertCounting() {

        // Create A Scanner To Take The Input From The User.
        Scanner input = new Scanner(System.in);
        System.out.println("Please!, enter counting number: ");
        System.out.print("From: "); // ex 2 - 8 - 10 - 16.
        int from = input.nextInt();

        System.out.print("To: ");   // ex 2 - 8 - 10 - 16.
        int to = input.nextInt();

        System.out.print("Please!, Enter number: ");
        String numb = input.next();

        int num = 0;

        // Switch Case from.
        switch (from) {

            case 16:

                //Try Catch Block.
                try {
                    num = Integer.parseInt(numb, 16);
                    break;
                } catch (Exception e) {
                    System.out.println("Error");
                    break;
                }
            case 8:

                //Try Catch Block.
                try {
                    num = Integer.parseInt(numb, 8);
                    break;
                } catch (Exception e) {
                    System.out.println("Error");
                    break;
                }
            case 10:

                //Try Catch Block.
                try {
                    num = Integer.parseInt(numb, 10);
                    break;
                } catch (Exception e) {
                    System.out.println("Error");
                    break;
                }
            case 2:

                //Try Catch Block.
                try {
                    num = Integer.parseInt(numb, 2);
                    break;
                } catch (Exception e) {
                    System.out.println("Error");
                    break;
                }

                //Default Block.
            default:
                System.out.println("Error");
                break;

        }

        // Print The Result.
        System.out.print("The result is: ");

        // If Statement.
        if (to == 16) {
            System.out.println(Integer.toHexString(num));
        } else if (to == 8) {
            System.out.println(Integer.toOctalString(num));
        } else if (to == 2) {
            System.out.println(Integer.toBinaryString(num));
        } else {
            System.out.println(num);
        }

    }

}