/*
 * To change this template file, choose Settings | Editor | File and Code Templates
 * and change the template in the editor.
 */

package Quizzes;

/**
 * @author Ahmed Abuwarda.
 */
public class Quiz_01 {

    /**
     * @param args the command line arguments.
     */
    public static void main(String[] args) {
        // TODO code application logic here.

        // Create Arrays a , b , c.
        int[] a = {1, 2, 3, 4, 5, 6};
        int[] b = {2, 12, 10, 18};
        int[] c = {5, 8, 9, 2};

        // Create Primitive Data Type.
        int n1 = 0;
        int n2 = 0;
        int n3 = 0;

        // For Each Loop.
        for (int value : a) {

            // Another For Each Loop.
            for (int i : b) {

                // If Statement.
                if (value == i) {
                    n1 = value;
                    System.out.println("A n B: " + n1);
                }

            }

        }

        System.out.print("A n C: ");

        // For Each Loop.
        for (int value : a) {

            // Another For Each Loop.
            for (int i : c) {

                // If Statement.
                if (value == i) {
                    n2 = i;
                    System.out.print(n2 + " ");
                }

            }

        }

        // For Each Loop.
        for (int value : b) {

            // Another For Each Loop.
            for (int i : c) {

                // If Statement.
                if (value == i) {
                    n3 = value;
                    System.out.println("\nB n C: " + n3);
                }

            }

        }

        // If Statement.
        if (n1 == n3) {
            System.out.println("A n B == B n C");
        }

    }

}