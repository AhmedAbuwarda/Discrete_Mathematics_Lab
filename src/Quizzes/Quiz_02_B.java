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
public class Quiz_02_B {

    /**
     * @param args the command line arguments.
     */
    public static void main(String[] args) {
        // TODO code application logic here.

        // Create New Sets setA , setB , setC.
        Set<Double> setA = getAllListOfCarsInExcel("A.xlsx");
        Set<Double> setB = getAllListOfCarsInExcel("B.xlsx");
        Set<Double> setC = getAllListOfCarsInExcel("C.xlsx");

        // Print The Sets.
        System.out.println("A = " + setA);
        System.out.println("B = " + setB);
        System.out.println("C = " + setC);

        // If Statement.
        if (isSubSet(setA, setB) && isSubSet(setA, setC) && isSubSet(setB, setC)) {
            System.out.println("A Sub B and A Sub C and B Sub C");
        } else if (isSubSet(setA, setB) && isSubSet(setA, setC)) {
            System.out.println("A Sub B and A Sub C");
        } else if (isSubSet(setA, setB) && isSubSet(setB, setC)) {
            System.out.println("A Sub B and B Sub C");
        } else if (isSubSet(setA, setC) && isSubSet(setB, setC)) {
            System.out.println("A Sub C and B Sub C");
        } else if (isSubSet(setA, setB)) {
            System.out.println("Yes A Sub B");
        } else if (isSubSet(setA, setC)) {
            System.out.println("Yes A Sub C");
        } else if (isSubSet(setB, setC)) {
            System.out.println("Yes B Sub C");
        } else {
            System.out.println("never");
        }

    }

    /**
     * @param file Any .xlsx File.
     * @return Set.
     */
    private static Set<Double> getAllListOfCarsInExcel(String file) {

        // Create New Set set.
        Set<Double> set = new HashSet<>();

        // Try Catch Block.
        try {

            // Reading The Data From .xlsx Files.
            FileInputStream excelFile2 = new FileInputStream(new File(file));
            Workbook workbook = new XSSFWorkbook(excelFile2);
            Sheet datatypeSheet = workbook.getSheetAt(0);

            // This For One Row From Sheet "For Each Loop".
            for (Row currentRow : datatypeSheet) {

                // The Raw Have Many Eell "Another For Each Loop".
                for (Cell currentCell : currentRow) {

                    // If Statement.
                    if (currentCell.getCellTypeEnum() == CellType.NUMERIC) {
                        set.add(currentCell.getNumericCellValue());
                    }

                }

            }

        } catch (IOException ignored) {
            ignored.printStackTrace();
        }

        return set;

    }

    /**
     * @param SM The First Set.
     * @param BI The Second Set.
     * @return Is Sub Set Or Not.
     */
    private static Boolean isSubSet(Set<Double> SM, Set<Double> BI) {

        boolean isSub = false;

        // For Each Loop.
        for (Double i : SM) {

            // If Statement.
            if (BI.contains(i)) {
                isSub = true;
            } else {
                isSub = false;
                break;
            }

        }

        return isSub;

    }

}