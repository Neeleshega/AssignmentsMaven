package assignments;

import java.util.HashMap;
import java.util.Map;

public class Assignment9_ConditionalStmentsLoops {

	public static void main(String[] args) {
		String[] employee = { "Alice Johnson", "Bob Smith", "Carol Davis", "David Brown", "Eva Green" };

		Double[] empData1 = { 75000.0, 5.0, 4.2 };
		Double[] empData2 = { 68000.0, 3.0, 3.8 };
		Double[] empData3 = { 82000.0, 7.0, 4.5 };
		Double[] empData4 = { 90000.0, 10.0, 2.0 };
		Double[] empData5 = { 60000.0, 2.0, 3.5 };

		Map<String, Double[]> empData = new HashMap<>();

		empData.put(employee[0], empData1);
		empData.put(employee[1], empData2);
		empData.put(employee[2], empData3);
		empData.put(employee[3], empData4);
		empData.put(employee[4], empData5);

		Map<String, Double> hikeMap = new HashMap<>();

		for (String emp : employee) {

			Double[] data = empData.get(emp);

			double baseSalary = data[0];
			double experience = data[1];
			double rating = data[2];

			double variablePayPercentage;
			double bonus;
			double reward = 0;

			if (rating >= 4) {
				variablePayPercentage = 15;
				bonus = 1500;
			} else if (rating >= 3) {
				variablePayPercentage = 10;
				bonus = 1200;
			} else {
				variablePayPercentage = 3;
				bonus = 300;
			}

			if (experience >= 5) {
				reward = 5000;
			}

			double hike = (baseSalary * variablePayPercentage / 100) + bonus + reward;
			double hikePercentage = (hike / baseSalary) * 100;

			hikeMap.put(emp, hikePercentage);
		}

		System.out.println("Employee Hike Details:");
		System.out.println(hikeMap);

	}

}
