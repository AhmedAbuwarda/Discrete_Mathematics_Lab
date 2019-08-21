package Lab02;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class L2_01_SetOperation {

    public static void main(String[] args) {

        Set<Integer> A = new HashSet<Integer>();
        Set<Integer> B = new HashSet<Integer>();

        for (int i = 0; i <= 3; i++) {
            A.add(i);
        }
        for (int i = 2; i <= 5; i++) {
            B.add(i);
        }

        System.out.println("\nFirst Set: " + A);
        System.out.println("Second Set: " + B);

        Set<Integer> union = new HashSet<>(A);
        union.addAll(B);
        System.out.printf("\nUnion of two set: %s and %s in java is %s %n",
                A.toString(),B.toString(),union.toString());

        Set<Integer> intersection = new HashSet<>(A);
        intersection.retainAll(B);
        System.out.printf("Intersection of two set: %s and %s in java is %s %n",
                A.toString(),B.toString(),intersection.toString());

        Set<Integer> difference = new HashSet<>(A);
        difference.removeAll(B);
        System.out.printf("Difference of two set: %s and %s in java is %s %n",
                A.toString(),B.toString(),difference.toString());

        List<Set<Integer>> cartesianProduct = new ArrayList<Set<Integer>>();
        for (int i = 0; i < A.size(); i++) {
            for (int j = 0; j < B.size(); j++) {
                Set<Integer> compination = new HashSet<Integer>();
                compination.add(i);
                compination.add(j);
                cartesianProduct.add(compination);
            }
        }

        System.out.println("\nCartesianProduct between two Set: \n" + cartesianProduct);

    }

}