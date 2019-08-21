/*
 * To change this template file, choose Settings | Editor | File and Code Templates
 * and change the template in the editor.
 */

package Lab03;

import java.util.Scanner;

/**
 * @author Ahmed Abuwarda.
 */
public class L3_01_TowersOfHanoi {

    // Data Field.
    private static int counter;
    private static Scanner input = new Scanner(System.in);

    /**
     * @param args the command line arguments.
     */
    public static void main(String[] args) {
        // TODO code application logic here.

        int disks;

        // Do While loop.
        do {

            System.out.println("how many disks (0 to end): ");
            disks = input.nextInt();

            // If Statement.
            if (disks != 0) {
                counter = 0;
                System.out.println(solve(disks, 1, 3));
            }

            // while.
        } while (disks != 0);

    }

    /**
     * @param disks
     * @param startPeg
     * @param endPeg
     * @return firstSteps + thisStep + lastStep.
     */
    private static String solve(int disks, int startPeg, int endPeg) {

        // If Statement.
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