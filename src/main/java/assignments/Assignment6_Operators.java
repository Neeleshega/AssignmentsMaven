package assignments;

import java.util.ArrayList;
import java.util.List;

public class Assignment6_Operators {

	public static void main(String[] args) {

		String[] studentNames = {"Suresh","Mahesh","Naresh"};

		List<Integer> studentMarks = new ArrayList<Integer>();
		
		studentMarks.add(75);
		studentMarks.add(80);
		studentMarks.add(82);
		System.out.println("Actual Marks are: " + studentMarks);
		
		int[] marks = {75,80,82};

		int[] updatedMarks = new int [3];
		
		updatedMarks[0] = marks[0]+10;
		updatedMarks[1] = marks[1]+10;
		updatedMarks[2] = marks[2]+10;
		
		System.out.println("Updated Marks are: ");
		
		System.out.println(studentNames[0]+ " : " +updatedMarks[0]);
		System.out.println(studentNames[1]+ " : " +updatedMarks[1]);
		System.out.println(studentNames[2]+ " : " +updatedMarks[2]);
		
		double average = (updatedMarks[0]+ updatedMarks[1]+updatedMarks[2])/3;
		
		System.out.println("Average of marks is: " + average);
	}

}
