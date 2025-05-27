package assignments;

public class Assignment2_MultyDimentionalArray {

	public static void main(String[] args) {
		String[][][] semister = new String [5][2][6];
		
		semister[0][0][0] = "Mathematics 1";
		semister[0][1][0] = "Pass(78)";
		semister[0][0][1] = "Physics";
		semister[0][1][1] = "Pass(85)";
		semister[0][0][2] = "Chemistry";
		semister[0][1][2] = "Fail(21)";
		semister[0][0][3] = "Computer Programming";
		semister[0][1][3] = "Pass(74)";
		semister[0][0][4] = "Engineering Drawing";
		semister[0][1][4] = "Pass(88)";
		semister[0][0][5] = "Basic Electrical Eng.";
		semister[0][1][5] = "Pass(79)";
		
		semister[1][0][0] = "Mathematics 2";
		semister[1][1][0] = "Pass(82)";
		semister[1][0][1] = "Mechanics";
		semister[1][1][1] = "Pass(77)";
		semister[1][0][2] = "Environmental Sci.";
		semister[1][1][2] = "Pass(93)";
		semister[1][0][3] = "Basic Electronics";
		semister[1][1][3] = "Fail(19)";
		semister[1][0][4] = "Engineering Physics";
		semister[1][1][4] = "Faail(24)";
		semister[1][0][5] = "Engineering Graphics";
		semister[1][1][5] = "Pass(90)";


		semister[2][0][0] = "Data Structures";
		semister[2][1][0] = "Pass(88)";
		semister[2][0][1] = "Discrete Mathematics";
		semister[2][1][1] = "Pass(81)";
		semister[2][0][2] = "Digital  Electronics ";
		semister[2][1][2] = "Pass(76)";
		semister[2][0][3] = "Operating Systems";
		semister[2][1][3] = "Fail(32)";
		semister[2][0][4] = "Signals and Systems";
		semister[2][1][4] = "Pass(85)";
		semister[2][0][5] = "Object-Oriented Prog.";
		semister[2][1][5] = "Pass(78)";


		semister[3][0][0] = "Algorithms";
		semister[3][1][0] = "Pass(91)";
		semister[3][0][1] = "Computer Networks";
		semister[3][1][1] = "Pass(73)";
		semister[3][0][2] = "Database Systems ";
		semister[3][1][2] = "Fail(19)";
		semister[3][0][3] = "Microprocessors";
		semister[3][1][3] = "Pass(80)";
		semister[3][0][4] = "Communication Eng.";
		semister[3][1][4] = "Pass(76)";
		semister[3][0][5] = "Software Engineering";
		semister[3][1][5] = "Pass(87)";


		semister[4][0][0] = "Probability & Stats";
		semister[4][1][0] = "Pass(86)";
		semister[4][0][1] = "Machine Learning ";
		semister[4][1][1] = "Pass(88)";
		semister[4][0][2] = "Compiler Design";
		semister[4][1][2] = "Pass(84)";
		semister[4][0][3] = "Theory of Computation";
		semister[4][1][3] = "Pass(95)";
		semister[4][0][4] = "Embedded System";
		semister[4][1][4] = "Pass(73)";
		semister[4][0][5] = "Computer Graphics";
		semister[4][1][5] = "Pass(90)";
		
		//Print Semester 2 Subject 4 and Subject 5 names. 
		// As per the given Table result will be Basic Electronics & Engineering Physics 
		System.out.println("Semister 2 subjects are: " + semister[1][0][3]+ " & " +semister[1][0][4]);
		
		//Print the Status/Marks of Semester 4 Subject 3 and Subject 6.
		// As per the given Table result will be Fail(19) & Pass(87)
		System.out.println("Semister 4 Status/Marks is: " + semister[3][1][2]+ " & " +semister[3][1][5]);
	}

}
