package HomeWorks.HomeWork_03;

import java.util.Scanner;

public class _01_PseudoRandomSequence {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter multiplayer: ");
        int multiplayer = input.nextInt();
        System.out.print("Enter Addition: ");
        int addition = input.nextInt();
        System.out.print("Enter the Seed: ");
        int seed = input.nextInt();
        System.out.print("Enter modular: ");
        int modular = input.nextInt();
        int value = ((multiplayer * seed) + addition) % modular;
        int startValue = value;
        System.out.println(value);
        int counter = 0;
        do {
            value = ((multiplayer * seed) + addition) % modular;
            if (value != startValue){
                System.out.println(value);
            }
            counter++;
        }while (value != startValue);
        System.out.println("\n" + counter);
    }
}