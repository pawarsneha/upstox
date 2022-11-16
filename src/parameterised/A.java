package parameterised;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.WorkbookFactory;

public class A {
public static void main(String[] args) throws Throwable {
	FileInputStream fis=new FileInputStream("C:\\Users\\Dell\\Desktop\\parameterization\\with-ddf.xlsx");
	String value = WorkbookFactory.create(fis).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
System.out.println(value);
}
}
