package assignments;

import java.util.ArrayList;
import java.util.List;

public class Assignment6_Operators1 {

	public static void main(String[] args) {
		List<String> studentNames = new ArrayList<String>();

		studentNames.add("Suresh");
		studentNames.add("Mahesh");
		studentNames.add("Naresh");

		System.out.println("Student Names are: " + studentNames);

		List<Integer> actualMarks = new ArrayList<Integer>();

		actualMarks.add(75);
		actualMarks.add(80);
		actualMarks.add(82);

		System.out.println("Updated Marks: ");

		List<Integer> updatedMarks = new ArrayList<Integer>();
		updatedMarks.add(actualMarks.get(0) + 10); 
		updatedMarks.add(actualMarks.get(1) + 10);
		updatedMarks.add(actualMarks.get(2) + 10);

		System.out.println(studentNames.get(0) + ": " + updatedMarks.get(0));
		System.out.println(studentNames.get(1) + ": " + updatedMarks.get(1));
		System.out.println(studentNames.get(2) + ": " + updatedMarks.get(2));

		double average = (updatedMarks.get(0) + updatedMarks.get(1) + updatedMarks.get(2)) / 3;

		System.out.println("Average of marks is: " + average);

	}

}
