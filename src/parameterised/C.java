package parameterised;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.WorkbookFactory;

public class C {
public static void main(String[] args) throws Throwable {
	FileInputStream  ff = new FileInputStream("C:\\Users\\Dell\\Desktop\\parameterization\\P1.xlsx");

WorkbookFactory.create(ff).getSheet("Sheet1").getRow(1).getCell(2).getNumericCellValue();




}
}
