/*
 * To change this template file, choose Settings | Editor | File and Code Templates
 * and change the template in the editor.
 */

package HomeWorks.HomeWork_02;

import java.util.Scanner;

/**
 * @author Ahmed Abuwarda.
 */
public class _02_CeaserCipher {

    /**
     * @param args the command line here.
     */
    public static void main(String[] args) {
        // TODO code application logic here.

        Cipher();

    }

    // This method to run the program.
    private static void Cipher() {

        Scanner input = new Scanner(System.in);
        System.out.print("\n  1) Encrypt..\n  2) Decrypt..\n  0) Exit.." +
                "\n  >> Enter your Word: ");
        String word = input.nextLine();

        System.out.print("  >> Shift by: ");
        char shifting = input.next().charAt(0);

        int shift;

        // If statement.
        if (Character.isUpperCase(shifting)) {
            shift = Math.abs(shifting - 65);
        } else {
            shift = Math.abs(shifting - 97);
        }

        System.out.print("  >> Enter Your Choice: ");
        int choice = input.nextInt();

        // Switch case.
        switch (choice) {

            case 0:
                break;
            case 1:
                EncryptAndDecrypt(word, shift);
                break;
            case 2:
                shift *= -1;
                EncryptAndDecrypt(word, shift);
                break;
            default:
                System.out.println("  >> Wrong choice!, Please try again!");
                Cipher();

        }

    }

    /**
     * @param word  Any string.
     * @param shift Any int number.
     */
    private static void EncryptAndDecrypt(String word, int shift) {

        System.out.print("  >> ");

        // for loop.
        for (int i = 0; i < word.length(); i++) {

            // If statement.
            if (Character.isLowerCase(word.charAt(i))) {

                char cha = (char) (((int) word.charAt(i) + shift - 97) % 26 + 97);
                System.out.print(cha);

            } else {

                char cha = (char) (((int) word.charAt(i) + shift - 65) % 26 + 65);
                System.out.print(cha);

            }

        }

    }

}