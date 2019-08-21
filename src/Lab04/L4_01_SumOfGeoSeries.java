package Lab04;

public class L4_01_SumOfGeoSeries {

    public static void main(String[] args) {

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