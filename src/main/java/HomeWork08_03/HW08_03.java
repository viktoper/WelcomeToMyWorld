package HomeWork08_03;

import java.io.*;

import org.apache.poi.*;
import org.apache.poi.xssf.usermodel.*;

import HomeWork08_01.*;

public class HW08_03 {
    public static void main(String[] args) {
        // XLSX-files

        String pathFile = "D:\\test\\java\\WelcomeToMyWorld\\src\\main\\java\\HomeWork08_02";
        String fileName = "automationpractice.com.errors.xls";

        System.out.println("1) Read XLS-file..");

        try (FileInputStream fis = new FileInputStream(pathFile + "\\" + fileName);) {
            XSSFWorkbook book = new XSSFWorkbook(fis);
            XSSFSheet sheet = book.getSheetAt(0);

            String hdrLogin = sheet.getRow(0).getCell(0).getStringCellValue();
            String hdrPasswd = sheet.getRow(0).getCell(1).getStringCellValue();
            String hdrMsg = sheet.getRow(0).getCell(3).getStringCellValue();

            System.out.println(String.format("%-30s %-10s %-50s", hdrLogin, hdrPasswd, hdrMsg));
            System.out.println(String.format("------------------------------------------------------------------------------------------" ));
            for (int row = 1; row <= sheet.getLastRowNum(); row++) {

                String login = sheet.getRow(row).getCell(0).getStringCellValue();
                String passwd = sheet.getRow(row).getCell(1).getStringCellValue();
                String msg = sheet.getRow(row).getCell(3).getStringCellValue();

                System.out.println(String.format("%-30s %-10s %-50s", login, passwd, msg));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }



    }
}
