import java.util.*;
public class Lab404 {

	public static void main(String[] args) {
		inputStudent();
	}
	
	public static void inputStudent() {
		Scanner scanner = new Scanner(System.in);
		String studentID, subjectCode;
		boolean isStudentIDValid, isSubjectCodeValid;
		while(true) {
			//input student id
			System.out.print("Enter student ID(10 digits): ");
			studentID = scanner.nextLine();
			
			//input subjectCode
			System.out.print("Enter subject code (7 digits): ");
			subjectCode = scanner.nextLine();
			isStudentIDValid = isLenght(studentID, 10);
			isSubjectCodeValid = isLenght(subjectCode, 7);
			
			/*if(isStudentIDValid && isSubjectCodeValid) {
				//check student details
				boolean isITStudent = isITStudent(studentID);
				boolean isITSubject = isITSubject(subjectCode);
				
				//DisplayData
				displayData(isITStudent,isITSubject);
				break;
			}else {
				System.out.println("");*/
			
			if(isITStudent(studentID)) {
				if(isITSubject(subjectCode)){
					displayData(studentID, true);
				}else {
					displayData(studentID, false);
				}
			
			}else {
				displayData(studentID, false);
				break;
			}
		}//end while()
	}//end of inputStudent() method
	
	public static boolean isLenght(String input, int len) {
		
		return input.length()==len;
	}
	
	public static boolean isITStudent(String studentID) {
		return studentID.length() == 10 && studentID.startsWith("2113");
	}
	public static boolean isITSubject(String subjectID) {
		return subjectID.startsWith("IT");
	}
	
	public static void displayData(String studentID, boolean isEligible) {
		if(isEligible) {
			System.out.println("\nStudent ID:   "+ studentID +"   is last year student in IT");
			System.out.println("Enrool in courses for Year 1");
		}else {
			System.out.println("\nStudent ID:  " + studentID + "  is not last year student in IT");
			System.out.println("Enrool in courses for Year 1\n");
		}
	}
}
