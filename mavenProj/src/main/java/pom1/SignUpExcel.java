package pom1;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import configuration.Shortcuts;

public class SignUpExcel {
	public String excel(int row, int column) throws EncryptedDocumentException, IOException {

		FileInputStream file = new FileInputStream(Shortcuts.excelPathSignUp);
		Sheet ExcelMaven = WorkbookFactory.create(file).getSheet("Sheet1");

		CellType datatype = ExcelMaven.getRow(row).getCell(column).getCellType();

		String a;
		if (datatype == CellType.STRING) {
			a = ExcelMaven.getRow(row).getCell(column).getStringCellValue();

		} else {
			long numv = (long) ExcelMaven.getRow(row).getCell(column).getNumericCellValue();
			a = Long.toString(numv);

		}
		return a;
	}
}
