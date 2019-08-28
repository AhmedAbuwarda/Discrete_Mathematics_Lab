package HomeWorks.HomeWork_01;

import java.util.Scanner;

public class _01_SwitchXY {
    public static void main(String[] args) {

        Scanner  input = new Scanner(System.in);
        System.out.print(" >> Enter Your numbers: ");
        double x = input.nextDouble(), y = input.nextDouble();
        System.out.println("\n Before: " + "X = " + x + "\n\t\t Y = " + y);
        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println("\n After:  " + "X = " + x + "\n\t\t Y = " + y);
    }
}