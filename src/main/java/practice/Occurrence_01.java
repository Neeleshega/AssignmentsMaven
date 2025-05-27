package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Occurrence_01 {

	public static void main(String[] args) {

		int[] list = { 2, 3, 4, 2, 5, 3, 3 };

		for (int i = 0; i < list.length; i++) {
			if (list[i] == -1)
				continue;

			int count = 1;

			for (int j = i + 1; j < list.length; j++) {

				if (list[i] == list[j]) {
					count++;
					list[j] = -1;
				}
			}
			System.out.println(list[i] + " - " + count);
		}

	}
}
