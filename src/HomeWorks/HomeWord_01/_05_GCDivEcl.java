package HomeWorks.HomeWord_01;

import java.util.Scanner;

public class _05_GCDivEcl {

    //Euclid's Algorithms
    public static int gcd(int p, int q) {

        if (q == 0) {
            return p;
        } else {
            return gcd(q, p % q);
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print(" >> Enter Your Numbers: ");
        int p = input.nextInt();
        int q = input.nextInt();
        System.out.printf(" >> GCG (%d,%d) is: %d", p, q, gcd(p,q));
        System.out.printf("\n >> LCM (%d,%d) is: %d", p, q, (p * q)/gcd(p,q));
    }
}