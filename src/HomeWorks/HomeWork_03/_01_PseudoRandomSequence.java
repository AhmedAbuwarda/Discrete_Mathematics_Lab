/*
 * To change this template file, choose Settings | Editor | File and Code Templates
 * and change the template in the editor.
 */

package HomeWorks.HomeWork_03;

import java.util.Scanner;

/**
 * @author Ahmed Abuwarda.
 */
public class _01_PseudoRandomSequence {

    /**
     * @param args the command line here.
     */
    public static void main(String[] args) {
        // TODO code application logic here.

        Scanner input = new Scanner(System.in);
        System.out.print("Enter multiplayer: ");
        int multiplayer = input.nextInt();

        System.out.print("Enter Addition: ");
        int addition = input.nextInt();

        System.out.print("Enter the Seed: ");
        int seed = input.nextInt();

        System.out.print("Enter modular: ");
        int modular = input.nextInt();

        int value = ((multiplayer * seed) + addition) % modular;
        int startValue = value;
        System.out.println(value);

        int counter = 0;

        do {

            value = ((multiplayer * seed) + addition) % modular;

            // If statement.
            if (value != startValue) {
                System.out.println(value);
            }

            counter++;

        } while (value != startValue);

        System.out.println("\n" + counter);

    }

}