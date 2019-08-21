/*
 * To change this template file, choose Settings | Editor | File and Code Templates
 * and change the template in the editor.
 */

package Lab03;

import java.util.Scanner;

/**
 * @author Ahmed Abuwarda
 */
public class L3_01_TowersOfHanoi {

    private static int counter;
    private static Scanner input = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int disks;

        do {

            System.out.println("how many disks (0 to end): ");
            disks = input.nextInt();

            if (disks != 0) {
                counter = 0;
                System.out.println(solve(disks, 1, 3));
            }

        } while (disks != 0);
    }

    private static String solve(int disks, int startPeg, int endPeg) {

        if (disks == 1) {
            counter++;
            return counter + ": " + startPeg + " to " + endPeg + "\n";
        }

        int sparePeg = 6 - startPeg - endPeg;
        String firstSteps = solve(disks - 1, startPeg, sparePeg);
        counter++;
        String thisStep = counter + ": " + startPeg + " to " + endPeg + "\n";
        String lastStep = solve(disks - 1, sparePeg, endPeg);

        return firstSteps + thisStep + lastStep;
    }
}