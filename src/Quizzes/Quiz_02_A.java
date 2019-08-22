/*
 * To change this template file, choose Settings | Editor | File and Code Templates
 * and change the template in the editor.
 */

package Quizzes;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

/**
 * @author Ahmed Abuwarda.
 */
public class Quiz_02_A {

    /**
     * @param args the command line arguments.
     */
    public static void main(String[] args) {
        // TODO code application logic here.

        // Create New Sets setA , setB , setC.
        Set<Double> setA = getAllListOfCarsInExcel("A.xlsx");
        Set<Double> setB = getAllListOfCarsInExcel("B.xlsx");
        Set<Double> setC = getAllListOfCarsInExcel("C.xlsx");


        // Create New Sets intersection_A_B , intersection_A_C , intersection_B_C.
        Set<Double> intersection_A_B = new HashSet<>(setA);
        intersection_A_B.retainAll(setB);
        System.out.println("intersection between A and B is " + intersection_A_B);

        Set<Double> intersection_A_C = new HashSet<>(setA);
        intersection_A_C.retainAll(setC);
        System.out.println("intersection between A and C is " + intersection_A_C);

        Set<Double> intersection_B_C = new HashSet<>(setB);
        intersection_B_C.retainAll(setC);
        System.out.println("intersection between B and C is " + intersection_B_C);

        // If Statement.
        if (check(intersection_A_B, intersection_A_C) && check(intersection_A_B, intersection_B_C)) {
            System.out.println("both");
        } else if (check(intersection_A_B, intersection_A_C)) {
            System.out.println("A n B = A n C");
        } else if (check(intersection_A_B, intersection_B_C)) {
            System.out.println("A n B = B n C");
        } else {
            System.out.println("never");
        }
    }

    /**
     * @param file Any .xlsx File.
     * @return Set.
     */
    private static Set<Double> getAllListOfCarsInExcel(String file) {

        // Create New Set.
        Set<Double> set = new HashSet<>();

        // Try Catch Block.
        try {

            FileInputStream excelFile2 = new FileInputStream(new File(file));
            Workbook workbook = new XSSFWorkbook(excelFile2);
            Sheet datatypeSheet = workbook.getSheetAt(0);

            // This For One Row From Sheet "For Each Loop".
            for (Row currentRow : datatypeSheet) {

                // The Raw have Many Cell "Another For Each Loop".
                for (Cell currentCell : currentRow) {

                    //If Statement.
                    if (currentCell.getCellTypeEnum() == CellType.NUMERIC) {
                        set.add(currentCell.getNumericCellValue());
                    }

                }

            }

        } catch (IOException e1) {
            e1.printStackTrace();
        }

        return set;

    }

    /**
     * @param a The First Set.
     * @param b The Second Set.
     * @return Is Equals Or Not.
     */
    private static boolean check(Set<Double> a, Set<Double> b) {
        return a.equals(b);
    }

}