package Lab02;

public class L2_02_PowerSet {

    public static void main(String[] args) {

        char[] set = {'a', 'b', 'c'};
        //int [] set = {1, 2, 3};
        //String [] set = {" love ", " ahm ", " saf "};
        printPowerSet(set,3);

    }

    private static void printPowerSet(char [] set, int setSize) {

        long powerSetSize = (long) Math.pow(2, setSize);
        for (int i = 0; i < powerSetSize; i++) {
            for (int j = 0; j < setSize; j++) {
                if ((i & (1 << j)) > 0){
                    System.out.print(set[j]);
                }
            }
            System.out.println();
        }

    }

}