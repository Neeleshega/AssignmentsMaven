package assignments;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Assignment4_Collections {

	public static void main(String[] args) {
		// 1. Create Lists with area of top 5 largest cities.
		// Print the total area of the 3rd and 4th cities combined.

		// Create a list for 5 largest cities

		List<Double> cityArea = new ArrayList<>();

		// Adding areas Values
		cityArea.add(1500.0); // 1st city
		cityArea.add(1100.0); // 2nd city
		cityArea.add(850.0); // 3rd city
		cityArea.add(720.0); // 4th city
		cityArea.add(590.0); // 5th city

		// Calculate the total area of the 3rd and 4th cities combined
		double totalArea = cityArea.get(2) + cityArea.get(3);

		// Print the result
		System.out.println("The total area of 3rd and 4th cities combined is: " + totalArea);
		
		
		// 2. Create a set of the top 10 most visited tourist attractions in the world
		//	  print out all of them and its size.
		
		//Adding Tourist places in to List
		List<String> touristplaces = new LinkedList<>();
		touristplaces.add("TajMahal - India");
		touristplaces.add("Statue of Liberty - USA");
		touristplaces.add("Burj Khalifa - Dubai");
		touristplaces.add("Eiffel Tower - Paris");
		touristplaces.add("Great Waal of China - China");
		touristplaces.add("Niagara Falls - USA");
		touristplaces.add("The Great Pyramid of Giz - Egypt");
		touristplaces.add("Pamukkale Natural Park - Turkey");
		touristplaces.add("Sydney - Australia");
		touristplaces.add("Golden Gate Bridge - San Francisco");
		
		
		// Printing all the tourist places
		System.out.println("\n" + touristplaces);
		
		// Printing tourist List Size
		System.out.println(touristplaces.size());
		
		
		
		// 3. Create an array of 10 numbers (any 10 numbers)
		// 	  print out the Average of 5th and 6th Value.
		
		int[] numbers = new int[10];
		numbers[0] = 10;
		numbers[1] = 15;
		numbers[2] = 20;
		numbers[3] = 15;
		numbers[4] = 25;
		numbers[5] = 30;
		numbers[6] = 35;
		numbers[7] = 40;
		numbers[8] = 45;
		numbers[9] = 50;
		
		float avg = (numbers[4]+numbers[5])/2;
		
		System.out.println("\nAverage of 5th & 6th number is: " + avg);
		
		
		// 4. Create a list of the top 5 highest-grossing movies of all time
		// print out the third movie on the list.
		
		List<String> movieshighgross = new LinkedList<>();
		movieshighgross.add("Pushpa 2 - 1,471.1 crore");
		movieshighgross.add("Bahubali 2 The Conclusion - 1,429.83 crore");
		movieshighgross.add("KGF Chapter 2 - 1,008 crore");
		movieshighgross.add("RRR - 944 crore");
		movieshighgross.add("Kalki 2898 AD - 776 crore");
		
		System.out.println("\n3rd Highest Grossing collection Movie is: " + movieshighgross.get(2));
		
	}

}
