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
public class L2_03_PowerSet {

    /**
     * @param args the command line arguments.
     */
    public static void main(String[] args) {
        // TODO code application logic here.

        char[] set = {'a', 'b', 'c'};
        printPowerSet(set, 3);

    }

    /**
     * @param set
     * @param setSize
     */
    private static void printPowerSet(char[] set, int setSize) {

        long powerSetSize = (long) Math.pow(2, setSize);

        //create New Set inside of List Called powerSet.
        List<Set<String>> powerSet = new ArrayList<Set<String>>();

        // For Loop.
        for (int i = 0; i < powerSetSize; i++) {
            Set<String> compination = new HashSet<String>();

            // Another For Loop.
            for (int j = 0; j < setSize; j++) {

                // If Statement.
                if ((i & (1 << j)) > 0) {
                    compination.add(set[j] + "");
                }
            }
            powerSet.add(compination);
        }

        // Print The Result.
        System.out.println("Power Set: \n" + powerSet);

    }

}