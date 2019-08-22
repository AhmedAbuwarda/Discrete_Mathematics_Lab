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
import java.util.*;

/**
 * @author Ahmed Abuwarda.
 */
public class Quiz_02 {

    /**
     * @param args the command line arguments.
     */
    public static void main(String[] args) {
        // TODO code application logic here.

        // Create New Lists A1 , A2 , A3.
        List<Integer> A1 = new ArrayList<>();
        List<Integer> A2 = new ArrayList<>();
        List<Integer> A3 = new ArrayList<>();

        // Try Catch Block.
        try {

            // Reading The Data From .xlsx Files.
            FileInputStream excelFile = new FileInputStream(new File("Files\\Excell_03.xlsx"));
            Workbook workbook = new XSSFWorkbook(excelFile);
            Sheet dataTypeShet = workbook.getSheetAt(0);
            Iterator<Row> iterator = dataTypeShet.iterator();

            FileInputStream excelFile2 = new FileInputStream(new File("Files\\Excell_04.xlsx"));
            Workbook workbook2 = new XSSFWorkbook(excelFile2);
            Sheet dataTypeShet2 = workbook2.getSheetAt(0);
            Iterator<Row> iterator2 = dataTypeShet2.iterator();

            FileInputStream excelFile3 = new FileInputStream(new File("Files\\Excell_05.xlsx"));
            Workbook workbook3 = new XSSFWorkbook(excelFile3);
            Sheet dataTypeShet3 = workbook3.getSheetAt(0);
            Iterator<Row> iterator3 = dataTypeShet3.iterator();

            // While Loop.
            while (iterator.hasNext()) {

                Row currentRow = iterator.next();

                // For Each Loop.
                for (Cell currentCell : currentRow) {

                    // If Statement.
                    if (currentCell.getCellTypeEnum() == CellType.STRING) {
                        System.out.println(currentCell.getStringCellValue());
                    } else if (currentCell.getCellTypeEnum() == CellType.NUMERIC) {
                        A1.add((int) currentCell.getNumericCellValue());
                    }

                }

            }

            // While Loop.
            while (iterator2.hasNext()) {

                Row currentRow = iterator2.next();

                // For Each Loop.
                for (Cell currentCell : currentRow) {

                    // If Statement.
                    if (currentCell.getCellTypeEnum() == CellType.STRING) {
                        System.out.println(currentCell.getStringCellValue());
                    } else if (currentCell.getCellTypeEnum() == CellType.NUMERIC) {
                        A2.add((int) currentCell.getNumericCellValue());
                    }

                }

            }

            // While Loop.
            while (iterator3.hasNext()) {

                Row currentRow = iterator3.next();

                // For Each Loop.
                for (Cell currentCell : currentRow) {

                    // If Statement.
                    if (currentCell.getCellTypeEnum() == CellType.STRING) {
                        System.out.println(currentCell.getStringCellValue());
                    } else if (currentCell.getCellTypeEnum() == CellType.NUMERIC) {
                        A3.add((int) currentCell.getNumericCellValue());
                    }

                }

            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        // Print The Sets.
        System.out.println("A Set: " + A1);
        System.out.println("B Set: " + A2);
        System.out.println("C Set: " + A3);

        // Print The Result "If Statement".
        if (A2.containsAll(A1)) {
            System.out.println("A is a sub set of B");
        } else if (A2.containsAll(A3)) {
            System.out.println("C is a sub set of B");
        } else if (A3.containsAll(A1)) {
            System.out.println("A is a sub set of C");
        }

    }

}