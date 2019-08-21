/*
 * To change this template file, choose Settings | Editor | File and Code Templates
 * and change the template in the editor.
 */

package Lab02;

/**
 * @author Ahmed Abuwarda
 */
public class L2_02_PowerSet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        char[] set = {'a', 'b', 'c'};
        //int [] set = {1, 2, 3};
        //String [] set = {" love ", " ahm ", " saf "};
        printPowerSet(set, 3);

    }

    private static void printPowerSet(char[] set, int setSize) {

        long powerSetSize = (long) Math.pow(2, setSize);

        for (int i = 0; i < powerSetSize; i++) {
            for (int j = 0; j < setSize; j++) {
                if ((i & (1 << j)) > 0) {
                    System.out.print(set[j]);
                }
            }
            System.out.println();
        }

    }
}