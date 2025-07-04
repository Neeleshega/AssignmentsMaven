package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtil {

	public static List<Map<String, String>> readData(String fileName, String sheetName) {

		List<Map<String, String>> data = new ArrayList<Map<String, String>>();

		try {

			// read the file using Java - any file like pdf, excel, etc.,
			FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "\\TestData\\" + fileName);

			try (// Load the file into Excel related Class
			XSSFWorkbook wb = new XSSFWorkbook(fis)) {
				// Read the data from specific sheet
				XSSFSheet sh = wb.getSheet(sheetName);

				// Get the total rows & Columns having data
				int totalRows = sh.getPhysicalNumberOfRows();
				int totalColumns = sh.getRow(0).getPhysicalNumberOfCells();

				// Create Loops and load row wise data (column name = column Value) into maps
				// then store them in List

				// Loop to iterate over Rows
				for (int r = 1; r < totalRows; r++) {
					Map<String, String> rowData = new HashMap<String, String>();

					// Loop to iterate columns
					for (int c = 0; c < totalColumns; c++) {
						String columnName = sh.getRow(0).getCell(c).getStringCellValue();
						String columnValue = sh.getRow(r).getCell(c).getStringCellValue();
						rowData.put(columnName, columnValue);

					}
					data.add(rowData);

				}
			}

		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return data;
	}

}
