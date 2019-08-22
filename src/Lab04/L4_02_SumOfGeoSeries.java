/*
 * To change this template file, choose Settings | Editor | File and Code Templates
 * and change the template in the editor.
 */

package Lab04;

/**
 * @author Ahmed Abuwarda.
 */
public class L4_02_SumOfGeoSeries {

    /**
     * @param args the command line arguments.
     */
    public static void main(String[] args) {
        // TODO code application logic here.

        float a = 2;
        float r = 2;
        int n = 15;

        System.out.println((int) sumOfGS(a, r, n));

    }

    /**
     * @param a The Parameter From Geo Series.
     * @param r The Parameter From Geo Series.
     * @param n The Parameter From Geo Series.
     * @return The Sum Of Geo Series.
     */
    private static float sumOfGS(float a, float r, float n) {
        return (a * (1 - (int) Math.pow(r, n))) / (1 - r);
    }

}