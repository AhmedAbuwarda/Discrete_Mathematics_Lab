package HomeWorks.HomeWork_02;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class _01_PowerSet {

    public static void main(String[] args) {
        char[] set = {'a', 'b', 'c'};
        printPowerSet(set, 3);
    }

    static void printPowerSet(char[] set, int set_size) {
        long pow_set_size = (long) Math.pow(2, set_size);
        int counter, j;
        List <Set<String>> power_set = new ArrayList<Set<String>>();
        for (counter = 0; counter < pow_set_size; counter++) {
            Set<String> combination = new HashSet<String>();
            for ( j = 0; j < set_size; j++) {
                if ((counter & (1 << j)) > 0) {
                    combination.add(set[j] + "");
                }
            }
            power_set.add(combination);
        }
        System.out.println("power set: " + power_set);
    }
}