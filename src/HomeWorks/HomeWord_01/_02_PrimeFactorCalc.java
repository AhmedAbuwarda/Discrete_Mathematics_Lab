package HomeWorks.HomeWord_01;

import java.lang.Math;
import java.util.Scanner;

public class _02_PrimeFactorCalc {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("  >> Enter Your Numbers: ");
        int num1 = input.nextInt(), num2 = input.nextInt();
        primeFactors(num1);
        System.out.println("");
        primeFactors(num2);

    }

    public static void primeFactors(int num) {

        int array [] = new int[6];
        while (num % 2 == 0) {
            array[0] = 2;
            System.out.print(2 + " ");
            num = num / 2;
        }
        for (int i = 3; i <= Math.sqrt(num); i = i + 2) {
            while (num % i == 0) {
                System.out.print(i + " ");
                num = num / i;
            }
        }
        if (num > 2) {
            System.out.print(num);
        }
    }
}