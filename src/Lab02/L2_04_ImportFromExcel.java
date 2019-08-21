package Lab02;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

public class L2_04_ImportFromExcel {

    public static void main(String[] args) throws FileNotFoundException, IOException {

        List<String> A = new ArrayList<>();
        List<String> B = new ArrayList<>();

        try {
            FileInputStream excelFile = new FileInputStream(new File("excell.xlsx"));
            Workbook workbook = new XSSFWorkbook(excelFile);
            Sheet dataTypeShet = workbook.getSheetAt(0);
            Iterator<Row> iterator = dataTypeShet.iterator();

            FileInputStream excelFile2 = new FileInputStream(new File("excell2.xlsx"));
            Workbook workbook2 = new XSSFWorkbook(excelFile2);
            Sheet dataTypeShet2 = workbook2.getSheetAt(0);
            Iterator<Row> iterator2 = dataTypeShet2.iterator();

            while (iterator.hasNext()) {
                Row currentRow = iterator.next();
                Iterator<Cell> cellIterator = currentRow.iterator();
                while (cellIterator.hasNext()) {
                    Cell currentCell = cellIterator.next();
                    if (currentCell.getCellTypeEnum() == CellType.STRING) {
                        A.add(currentCell.getStringCellValue());
                    } else if (currentCell.getCellTypeEnum() == CellType.NUMERIC) {
                        System.out.println(currentCell.getNumericCellValue() + "--");
                    }
                }
            }
            while (iterator2.hasNext()) {
                Row currentRow = iterator2.next();
                Iterator<Cell> cellIterator = currentRow.iterator();
                while (cellIterator.hasNext()) {
                    Cell currentCell = cellIterator.next();
                    if (currentCell.getCellTypeEnum() == CellType.STRING) {
                        B.add(currentCell.getStringCellValue());
                    } else if (currentCell.getCellTypeEnum() == CellType.NUMERIC) {
                        System.out.println(currentCell.getNumericCellValue() + "--");
                    }
                }
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
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