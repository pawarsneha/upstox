package parameterised;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.WorkbookFactory;

public class B {
public static void main(String[] args) throws Throwable {
	FileInputStream f=new FileInputStream("C:\\Users\\Dell\\Desktop\\parameterization\\Book1.xlsx");

boolean s = WorkbookFactory.create(f).getSheet("Sheet1").getRow(1).getCell(0).getBooleanCellValue();


System.out.println(s);
System.out.println("hello");





}
}
