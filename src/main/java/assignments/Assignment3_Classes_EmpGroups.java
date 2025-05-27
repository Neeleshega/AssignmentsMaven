package assignments;

public class Assignment3_Classes_EmpGroups {

	public static void main(String[] args) {

		// Create an Object to access Employee class information
		Assignment3_Classes_Employees emp = new Assignment3_Classes_Employees();

		// Create Arrays to store Employee Names and IDs
		String[] employeeNames = new String[3];
		int[] employeeIds = new int[3];

		// Storing data in to Arrays
		employeeNames[0] = emp.empname1;
		employeeNames[1] = emp.empname2;
		employeeNames[2] = emp.empname3;

		employeeIds[0] = emp.empId1;
		employeeIds[1] = emp.empId2;
		employeeIds[2] = emp.empId3;
		
		
		// Printing 1st Employee Name and ID
		System.out.println("Employee Name: " + employeeNames[0] + "Employee ID: " + employeeIds[0]);

	}
}
