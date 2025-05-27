package com.cg.creatio.crm.language.basics;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.util.logging.Logger;

public class FirstJavaProgram {

	public static void main(String[] args) throws FileNotFoundException {
		
		// Print the content and then go to next line
		System.out.println("Hello, World!");
		
		// Print the content and then stay on same line
		System.out.print("Hello, ");
		System.out.print("World!");
		System.out.println();
		
		
		// Print the formated content and then stay on same line
		System.out.printf("%s is working in HSBC, emp id is %d and Visa status is %b", "Neelesh", 44004568, true);
		System.out.println();
		
		// Format the digits and then Print the formated content and then stay on same line
		System.out.format("Total bill is %2f", 98.2354687);
		System.out.println();
		
		// Join multiple print statements together
		System.out.append("My name is Neelesh ").append("and am working in HSBC");
		System.out.println();
		
		// Print the char based on ASCII value
		System.out.write(66);
		System.out.println();
		
		// Print Logs of Program
		Logger log = Logger.getLogger("My Logger");
		log.info("current line is 26");
		log.warning("warning comes in line 28");
		
		// Print the errors in print statements
		System.err.println("Error: its just a basic error");
		
		
		PrintWriter writer = new PrintWriter("C:\\AutomationTraining\\AutomationProject\\src\\com\\cg\\creatio\\crm\\language\\basics\\logs.txt");
		System.out.println();
				
		writer.println(LocalDateTime.now()+" - Currently Line 54 is running");
		writer.println(LocalDateTime.now()+" - Currently Line 55 is running");
		writer.println(LocalDateTime.now()+" - Execution is completed");
		writer.close();		
		
	}

}
