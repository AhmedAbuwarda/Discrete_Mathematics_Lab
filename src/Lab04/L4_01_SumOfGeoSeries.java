/*
 * To change this template file, choose Settings | Editor | File and Code Templates
 * and change the template in the editor.
 */

package Lab04;

/**
 * @author Ahmed Abuwarda
 */
public class L4_01_SumOfGeoSeries {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int a = 1;
        float r = (float) (1 / 2.0);
        int n = 10;

        System.out.printf("%.6f", (sumOfGS(a, r, n)));

    }

    private static float sumOfGS(float a, float r, float n){

        float sum = 0;

        for (int i = 0; i < n; i++) {
            sum += a;
            a *= r;
        }

        return sum;
    }
}