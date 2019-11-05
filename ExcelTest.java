package excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ExcelTest {
	public int excelTests(int x, int y, int sheet) throws IOException {
		File exceltest = new File("test.xls");
		FileInputStream exc = new FileInputStream(exceltest);
		HSSFWorkbook wb = new HSSFWorkbook(exc);
		HSSFSheet sheet1 = wb.getSheetAt(sheet);

		char[] data = sheet1.getRow(x).getCell(y).getStringCellValue().toCharArray();
		//System.out.println(data);
		int count = 0;
		for (char ch : data) {

			if (ch == ',') {
				count += 1;
			}
		}

		return count +1;
	}
}
