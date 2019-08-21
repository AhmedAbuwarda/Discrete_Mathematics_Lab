/*
 * To change this template file, choose Settings | Editor | File and Code Templates
 * and change the template in the editor.
 */

package Lab02;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

/**
 * @author Ahmed Abuwarda
 */
public class L2_04_ImportFromExcel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here

        List<String> A = new ArrayList<>();
        List<String> B = new ArrayList<>();

        try {
            FileInputStream excelFile = new FileInputStream(new File("Files\\excell.xlsx"));
            Workbook workbook = new XSSFWorkbook(excelFile);
            Sheet dataTypeShet = workbook.getSheetAt(0);
            Iterator<Row> iterator = dataTypeShet.iterator();

            FileInputStream excelFile2 = new FileInputStream(new File("Files\\excell2.xlsx"));
            Workbook workbook2 = new XSSFWorkbook(excelFile2);
            Sheet dataTypeShet2 = workbook2.getSheetAt(0);
            Iterator<Row> iterator2 = dataTypeShet2.iterator();

            while (iterator.hasNext()) {

                Row currentRow = iterator.next();

                for (Cell currentCell : currentRow) {

                    if (currentCell.getCellTypeEnum() == CellType.STRING) {
                        A.add(currentCell.getStringCellValue());
                    } else if (currentCell.getCellTypeEnum() == CellType.NUMERIC) {
                        System.out.println(currentCell.getNumericCellValue() + "--");
                    }

                }
            }
            while (iterator2.hasNext()) {

                Row currentRow = iterator2.next();

                for (Cell currentCell : currentRow) {

                    if (currentCell.getCellTypeEnum() == CellType.STRING) {
                        B.add(currentCell.getStringCellValue());
                    } else if (currentCell.getCellTypeEnum() == CellType.NUMERIC) {
                        System.out.println(currentCell.getNumericCellValue() + "--");
                    }

                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        Set<String> newSet = new HashSet<String>(A);
        newSet.addAll(B);
        List<String> newList = new ArrayList<String>(newSet);

        System.out.println("First Set: " + A);
        System.out.println("Second Set: " + B);
        System.out.println("New Set: " + newList);
    }
}