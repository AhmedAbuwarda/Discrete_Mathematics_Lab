/*
 * To change this template file, choose Settings | Editor | File and Code Templates
 * and change the template in the editor.
 */

package HomeWorks.HomeWork_02;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author Ahmed Abuwarda.
 */
public class _01_PowerSet {

    /**
     * @param args the command line here.
     */
    public static void main(String[] args) {
        // TODO code application logic here.

        char[] set = {'a', 'b', 'c'};
        printPowerSet(set, 3);

    }

    /**
     * @param set      Any array.
     * @param set_size array size.
     */
    private static void printPowerSet(char[] set, int set_size) {

        long pow_set_size = (long) Math.pow(2, set_size);
        int counter, j;
        List<Set<String>> power_set = new ArrayList<>();

        // For loop.
        for (counter = 0; counter < pow_set_size; counter++) {

            Set<String> combination = new HashSet<>();

            // Another for loop.
            for (j = 0; j < set_size; j++) {

                // If statement.
                if ((counter & (1 << j)) > 0) {

                    combination.add(set[j] + "");

                }

            }

            power_set.add(combination);

        }

        System.out.println("power set: " + power_set);

    }

}