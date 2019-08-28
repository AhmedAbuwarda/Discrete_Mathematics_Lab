package HomeWorks.HomeWord_01;

import java.util.Scanner;

public class _04_Gcd_Lcm {

    public static void compute_Gcd_Lcm() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the first number and the second (1st  2nd): ");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        System.out.print("\nGCD or LCM: ");
        switch (scan.nextInt()){
            case 1: gcd(num1, num2); break;
            case 2: lcm(num1,num2); break;
            default: System.out.println("Error"); break;
        }
    }

    public static int gcd(int num1, int num2) {
        if (num1 == num2) {
            return num1;
        }
        if (num1 > num2) {
            return gcd(num1 - num2, num2);
        } else {
            return gcd(num1, num2 - num1);
        }
    }

    public static int lcm(int num1, int num2) {
        return (num1 * num2) / gcd(num1, num2);
    }
}