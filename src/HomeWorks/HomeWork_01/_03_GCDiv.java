package HomeWorks.HomeWork_01;

import java.util.Scanner;

public class _03_GCDiv {
    public static void main(String[] args) {

        //Sub
        Scanner input = new Scanner(System.in);
        System.out.print(" >> Enter Your numbers: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        while(num1 != num2)
        {
            if(num1 > num2)
                num1 -= num2;
            else
                num2 -= num1;
        }
        System.out.println(" The GCD is: " + num1);
    }
}