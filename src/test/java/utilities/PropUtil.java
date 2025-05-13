package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropUtil {

	public static Properties readData(String fileName) {
		Properties prop = null;

		try {
			// read the file using Java - any file like pdf, excel, etc.,

			FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "\\Config\\" + fileName);

			// Load all the properties available with in the file into 'prop' variable
			prop = new Properties();
			prop.load(fis);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return prop;

	}

}
