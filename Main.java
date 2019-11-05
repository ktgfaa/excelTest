package excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Main {

	public static final int SCREEN_WIDTH = 720;
	public static final int SCREEN_HEIGHT = 480;

	public static void main(String[] args) throws Exception {

		new ExcelTest_GUI();

	}
}
