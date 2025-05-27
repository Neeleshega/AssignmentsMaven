package assignments;

public class Assignment2_MultyDimentionalArray_1 {

	public static void main(String[] args) {
		
		String[][][] semister = {
	            { // Semester 1
	                {"Mathematics I", "Pass(78)"},
	                {"Physics", "Pass(85)"},
	                {"Chemistry", "Fail(21)"},
	                {"Computer Programming", "Pass(74)"},
	                {"Engineering Drawing", "Pass(88)"},
	                {"Basic Electrical Eng.", "Pass(79)"}
	            },
	            { // Semester 2
	                {"Mathematics II", "Pass(82)"},
	                {"Mechanics", "Pass(77)"},
	                {"Environmental Sci.", "Pass(93)"},
	                {"Basic Electronics", "Fail(19)"},
	                {"Engineering Physics", "Fail(24)"},
	                {"Engineering Graphics", "Pass(90)"}
	            },
	            { // Semester 3
	                {"Data Structures", "Pass(88)"},
	                {"Discrete Mathematics", "Pass(81)"},
	                {"Digital Electronics", "Pass(76)"},
	                {"Operating Systems", "Fail(32)"},
	                {"Signals and Systems", "Pass(85)"},
	                {"Object-Oriented Prog.", "Pass(78)"}
	            },
	            { // Semester 4
	                {"Algorithms", "Pass(91)"},
	                {"Computer Networks", "Pass(73)"},
	                {"Database Systems", "Fail(19)"},
	                {"Microprocessors", "Pass(80)"},
	                {"Communication Eng.", "Pass(76)"},
	                {"Software Engineering", "Pass(87)"}
	            },
	            { // Semester 5
	                {"Probability & Stats", "Pass(86)"},
	                {"Machine Learning", "Pass(88)"},
	                {"Compiler Design", "Pass(84)"},
	                {"Theory of Computation", "Pass(95)"},
	                {"Embedded Systems", "Pass(73)"},
	                {"Computer Graphics", "Pass(90)"}
	            }
	        };

			//Print Semester 2 Subject 4 and Subject 5 names. 
			// As per the given Table result will be Basic Electronics & Engineering Physics 
			System.out.println("Semister 2 subjects are: " + semister[1][3][0]+ " & " +semister[1][4][0]);

			
			//Print the Status/Marks of Semester 4 Subject 3 and Subject 6.
			// As per the given Table result will be Fail(19) & Pass(87)
			System.out.println("Semister 3 subjects are: " + semister[3][2][1]+ " & " +semister[3][5][1]);

		

	}

}
