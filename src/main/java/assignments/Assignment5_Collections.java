package assignments;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Assignment5_Collections {

	public static void main(String[] args) {
		
		Map<String,String> productRow1 = new HashMap<String,String>();
		
		productRow1.put("Product ID", "P001");
		productRow1.put("Name", "Laptop");
		productRow1.put("Category", "Electronics");
		productRow1.put("Price", "$1,200");
		productRow1.put("Stock Quantity", "50");
		productRow1.put("Supplier", "Tech Supplies");
		productRow1.put("Warrenty", "2 Years");
		productRow1.put("Rating", "4.5");
		productRow1.put("Manufacturing Date", "1/15/2023");
		productRow1.put("Expiry Date", "1/15/2025");

		
		Map<String,String> productRow2 = new HashMap<String,String>();
		
		productRow2.put("Product ID", "P002");
		productRow2.put("Name", "Desk Chair");
		productRow2.put("Category", "Furniture");
		productRow2.put("Price", "$150");
		productRow2.put("Stock Quantity", "100");
		productRow2.put("Supplier", "Office Depot");
		productRow2.put("Warrenty", "1 Years");
		productRow2.put("Rating", "4");
		productRow2.put("Manufacturing Date", "2/10/2023");
		productRow2.put("Expiry Date", "N/A");
		
		
		Map<String,String> productRow3 = new HashMap<String,String>();
		
		productRow3.put("Product ID", "P003");
		productRow3.put("Name", "Coffee Maker");
		productRow3.put("Category", "Kitchen");
		productRow3.put("Price", "$75");
		productRow3.put("Stock Quantity", "200");
		productRow3.put("Supplier", "KitchenWorld");
		productRow3.put("Warrenty", "6 Months");
		productRow3.put("Rating", "4.2");
		productRow3.put("Manufacturing Date", "3/20/2023");
		productRow3.put("Expiry Date", "9/20/2023");
		
		List<Map<String,String>> productList = new ArrayList<Map<String,String>>();
		
		productList.add(productRow1);
		productList.add(productRow2);
		productList.add(productRow3);
		
		System.out.println("Product List is: " + productList);
		
		Map<String,String> employeeRow1 = new HashMap<String,String>();
		
		employeeRow1.put("Employee ID", "E001");
		employeeRow1.put("Name", "Alice Green");
		employeeRow1.put("Age", "30");
		employeeRow1.put("Gender", "Female");
		employeeRow1.put("Department", "Engineering");
		employeeRow1.put("Position", "Software Engineer");
		employeeRow1.put("Salary", "75,000");
		employeeRow1.put("Email", "alice@gmail.com");
		employeeRow1.put("Contact Number", "9876543213");
		
		
		Map<String,String> employeeRow2 = new HashMap<String,String>();
		
		employeeRow2.put("Employee ID", "E002");
		employeeRow2.put("Name", "Bob Johnson");
		employeeRow2.put("Age", "35");
		employeeRow2.put("Gender", "Male");
		employeeRow2.put("Department", "Marketing");
		employeeRow2.put("Position", "Marketing Manager");
		employeeRow2.put("Salary", "85,000");
		employeeRow2.put("Email", "bob@gmail.com");
		employeeRow2.put("Contact Number", "9876543214");
		
		
		Map<String,String> employeeRow3 = new HashMap<String,String>();
		
		employeeRow3.put("Employee ID", "E003");
		employeeRow3.put("Name", "Carol White");
		employeeRow3.put("Age", "28");
		employeeRow3.put("Gender", "Female");
		employeeRow3.put("Department", "Sales");
		employeeRow3.put("Position", "Sales Executive");
		employeeRow3.put("Salary", "65,000");
		employeeRow3.put("Email", "carol@gmail.com");
		employeeRow3.put("Contact Number", "9876543215");
		
		List<Map<String,String>> employeeList = new ArrayList<Map<String,String>>();
		
		employeeList.add(employeeRow1);
		employeeList.add(employeeRow2);
		employeeList.add(employeeRow3);
		
		System.out.println("Employee List is: " + employeeList);
		
		Map<String,String> studentRow1 = new HashMap<String,String>();
		
		studentRow1.put("Name", "John Doe");
		studentRow1.put("Age", "20");
		studentRow1.put("Gender", "Male");
		studentRow1.put("Roll Number", "S12345");
		studentRow1.put("Grade", "A");
		studentRow1.put("Major", "Computer Science");
		studentRow1.put("GPA", "3.8");
		studentRow1.put("Email", "john@gmail.com");
		studentRow1.put("Contact Number", "9876543210");
		studentRow1.put("Address", "123 Elm St");
		
		
		Map<String,String> studentRow2 = new HashMap<String,String>();
		
		studentRow2.put("Name", "Jane Smith");
		studentRow2.put("Age", "21");
		studentRow2.put("Gender", "Female");
		studentRow2.put("Roll Number", "S12346");
		studentRow2.put("Grade", "B");
		studentRow2.put("Major", "Mathematics");
		studentRow2.put("GPA", "3.5");
		studentRow2.put("Email", "jane@gmail.com");
		studentRow2.put("Contact Number", "9876543211");
		studentRow2.put("Address", "456 Oak St");
		
		
		Map<String,String> studentRow3 = new HashMap<String,String>();
		
		studentRow3.put("Name", "Mike Brown");
		studentRow3.put("Age", "22");
		studentRow3.put("Gender", "Male");
		studentRow3.put("Roll Number", "S12347");
		studentRow3.put("Grade", "A");
		studentRow3.put("Major", "Physics");
		studentRow3.put("GPA", "3.9");
		studentRow3.put("Email", "mike@gmail.com");
		studentRow3.put("Contact Number", "9876543212");
		studentRow3.put("Address", "789 Pine St");
		
		
		List<Map<String,String>> studentList = new ArrayList<Map<String,String>>();
		
		studentList.add(studentRow1);
		studentList.add(studentRow2);
		studentList.add(studentRow3);
		System.out.println("Student List is: " + studentList);
		
		Map<String,List<Map<String,String>>> list = new HashMap<String, List<Map<String,String>>>();
		
		list.put("Products", productList);
		list.put("EmployeeDetails", employeeList);
		list.put("StudentDetails", studentList);
						
				
		System.out.println("Supplier Name of 2nd Row: " + list.get("Products").get(1).get("Supplier"));
	}

}
