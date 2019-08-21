/*
 * To change this template file, choose Settings | Editor | File and Code Templates
 * and change the template in the editor.
 */

package Lab02;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author Ahmed Abuwarda.
 */
public class L2_01_SetOperation {

    /**
     * @param args the command line arguments.
     */
    public static void main(String[] args) {
        // TODO code application logic here.

        // Create Sets A , B.
        Set<Integer> A = new HashSet<Integer>();
        Set<Integer> B = new HashSet<Integer>();

        // Add Numbers to Set A Using For Loop.
        for (int i = 0; i <= 3; i++) {
            A.add(i);
        }

        // Add Numbers to Set B Using For Loop.
        for (int i = 2; i <= 5; i++) {
            B.add(i);
        }

        // Print The Sets.
        System.out.println("\nFirst Set: " + A);
        System.out.println("Second Set: " + B);

        // Create New Set union And Print It.
        Set<Integer> union = new HashSet<>(A);
        union.addAll(B);
        System.out.printf("\nUnion of two set: %s and %s in java is %s %n",
                A.toString(), B.toString(), union.toString());

        // Create New Set intersection And Print It.
        Set<Integer> intersection = new HashSet<>(A);
        intersection.retainAll(B);
        System.out.printf("Intersection of two set: %s and %s in java is %s %n",
                A.toString(), B.toString(), intersection.toString());

        // Create New Set difference And Print It.
        Set<Integer> difference = new HashSet<>(A);
        difference.removeAll(B);
        System.out.printf("Difference of two set: %s and %s in java is %s %n",
                A.toString(), B.toString(), difference.toString());

        // Create New List cartesianProduct.
        List<Set<Integer>> cartesianProduct = new ArrayList<Set<Integer>>();

        // For Loop.
        for (int i = 0; i < A.size(); i++) {

            // Another For Loop.
            for (int j = 0; j < B.size(); j++) {

                Set<Integer> compination = new HashSet<Integer>();
                compination.add(i);
                compination.add(j);
                cartesianProduct.add(compination);

            }

        }

        // Print The Result.
        System.out.println("\nCartesianProduct between two Set: \n" + cartesianProduct);
    }

}