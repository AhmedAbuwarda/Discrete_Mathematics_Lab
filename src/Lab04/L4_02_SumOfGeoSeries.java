package Lab04;

public class L4_02_SumOfGeoSeries {

    public static void main(String[] args) {

        float a = 2;
        float r = 2;
        int n = 15;

        System.out.println((int) sumOfGS(a, r, n));

    }

    private static float sumOfGS(float a, float r, float n) {
        return (a * (1 - (int) Math.pow(r, n))) / (1 - r);
    }

}