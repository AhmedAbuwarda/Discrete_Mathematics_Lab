/*
 * To change this template file, choose Settings | Editor | File and Code Templates
 * and change the template in the editor.
 */

package Quizzes;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Ahmed Abuwarda.
 */
public class Quiz_01_B {

    /**
     * @param args the command line arguments.
     */
    public static void main(String[] args) {
        // TODO code application logic here.

        // Create Sets A, B , C.
        Set<Integer> A = new HashSet<Integer>();
        Set<Integer> B = new HashSet<Integer>();
        Set<Integer> C = new HashSet<Integer>();

        // Add Numbers To Set A Using For Loop.
        for (int i = 1; i < 7; i++) {
            A.add(i);
        }

        // Add Numbers To Set B.
        B.add(2);
        B.add(12);
        B.add(5);
        B.add(18);

        // Add Numbers To Set C.
        C.add(5);
        C.add(8);
        C.add(88);
        C.add(2);

        // Create New Sets intersection_A_B , intersection_A_C , intersection_B_C.
        Set<Integer> intersection_A_B = new HashSet<Integer>(A);
        intersection_A_B.retainAll(B);
        System.out.println("intersection between A and B is " + intersection_A_B);

        Set<Integer> intersection_A_C = new HashSet<Integer>(A);
        intersection_A_C.retainAll(C);
        System.out.println("intersection between A and C is " + intersection_A_C);

        Set<Integer> intersection_B_C = new HashSet<Integer>(B);
        intersection_B_C.retainAll(C);
        System.out.println("intersection between B and C is " + intersection_B_C);

        // If Statement.
        if (check(intersection_A_B, intersection_A_C) && check(intersection_A_B, intersection_B_C)) {
            System.out.println("both");
        } else if (check(intersection_A_B, intersection_A_C)) {
            System.out.println("A n B = A n C");
        } else if (check(intersection_A_B, intersection_B_C)) {
            System.out.println("A n B = B n C");
        } else {
            System.out.println("never");
        }

    }

   /* public static boolean check(Set<Integer> a, Set<Integer> b) {
        boolean isDoneCheck = false;
        for (Integer k : a) {
            for (Integer l : b) {
                if (k == l) {
                    isDoneCheck = true;
                    continue;
                } else {
                    isDoneCheck = false;
                }
            }
        }
        return isDoneCheck;
    }*/

    /**
     *
     * @param a
     * @param b
     * @return Is Equals Or Not.
     */
    public static boolean check(Set<Integer> a, Set<Integer> b) {
        return a.equals(b);
    }

}