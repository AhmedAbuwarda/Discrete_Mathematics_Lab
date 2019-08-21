package Lab01;

import java.util.Collections;
import java.util.Scanner;

public class L1_01_Logic {

    public static void main(String[] args) {

        logic();

    }

    public static void logic() {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number of input: ");
        int numOfPossibilities = (int) Math.pow(2, input.nextInt());
        int lengthOfLargeNumber = Integer.toBinaryString(numOfPossibilities - 1).length();
        String[] array = new String[numOfPossibilities];
        System.out.println("Please!, enter the operation: ");
        String operation = input.next();
        String str = "";
        for (int i = 0; i < numOfPossibilities; i++) {
            str = Integer.toBinaryString(i);
            if (str.length() < lengthOfLargeNumber) {
                array[i] = String.join("", Collections.nCopies(lengthOfLargeNumber -
                        str.length(), "0")) + str;
            } else {
                array[i] = str;
            }
        }
        int array2[] = new int[lengthOfLargeNumber];
        System.out.println("The truth table: -----");
        int numbOfOperations = 1;

        L:
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                array2[j] = array[i].charAt(j) - '0';
            }
            numbOfOperations = array2[0];
            switch (operation.toLowerCase()) {
                case "and":
                    for (int j = 1; j < array2.length; j++) {
                        numbOfOperations &= array2[j];
                    }
                    break;
                case "or":
                    for (int j = 1; j < array2.length; j++) {
                        numbOfOperations |= array2[j];
                    }
                    break;
                case "xor":
                    for (int j = 0; j < array2.length; j++) {
                        numbOfOperations ^= array2[j];
                    }
                    break;
                case "imp":
                    for (int j = 0; j < array2.length; j++) {
                        numbOfOperations = inverter(numbOfOperations);
                        numbOfOperations |= array2[j];
                    }
                case "bic":
                    for (int j = 0; j <array2.length; j++) {
                        numbOfOperations ^= array2[j];
                    }
                    numbOfOperations = inverter(numbOfOperations);
                    break;
                default:
                    System.out.println("Please!, enter correct operation!");
                    break L;
            }
            System.out.println(array[i] + "\t" + numbOfOperations);
            System.out.println("*****************");
            numbOfOperations = 1;
        }

    }

    public static int inverter(int x) {
        return x == 1 ? 0 : 1;
    }
}