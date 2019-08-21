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
public class Quiz_01_A {

    /**
     * @param args the command line arguments.
     */
    public static void main(String[] args) {
        // TODO code application logic here.

        // Create Sets a , b , c
        Set<Integer> a = new HashSet<>();
        Set<Integer> b = new HashSet<>();
        Set<Integer> c = new HashSet<>();

        // Add Numbers to Set a.
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        a.add(5);
        a.add(9);

        // Add Numbers to Set b.
        b.add(1);
        b.add(2);
        b.add(3);
        b.add(6);
        b.add(5);
        b.add(7);

        // Add Numbers to Set c.
        c.add(1);
        c.add(2);
        c.add(3);
        c.add(5);
        c.add(6);

        // Print The Old Sets.
        System.out.println("A = " + a);
        System.out.println("B = " + b);
        System.out.println("C = " + c);

        // If Statement.
        if (isSubSet(a, b) && isSubSet(a, c) && isSubSet(b, c)) {
            System.out.println("A Sub B and A Sub C and B Sub C");
        } else if (isSubSet(a, b) && isSubSet(a, c)) {
            System.out.println("A Sub B and A Sub C");
        } else if (isSubSet(a, b) && isSubSet(b, c)) {
            System.out.println("A Sub B and B Sub C");
        } else if (isSubSet(a, c) && isSubSet(b, c)) {
            System.out.println("A Sub C and B Sub C");
        } else if (isSubSet(a, b)) {
            System.out.println("Yes A Sub B");
        } else if (isSubSet(a, c)) {
            System.out.println("Yes A Sub C");
        } else if (isSubSet(b, c)) {
            System.out.println("Yes B Sub C");
        } else {
            System.out.println("never");
        }

    }

    /**
     * @param SM
     * @param BI
     * @return Is SubSet Or Not.
     */
    private static Boolean isSubSet(Set<Integer> SM, Set<Integer> BI) {

        boolean isSub = false;

        // For Loop.
        for (Integer i : SM) {

            // If Statement.
            if (BI.contains(i)) {
                isSub = true;
            } else {
                isSub = false;
                break;
            }

        }

        return isSub;

    }

}