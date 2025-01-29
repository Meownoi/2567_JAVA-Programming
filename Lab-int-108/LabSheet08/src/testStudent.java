import java.util.*;
public class testStudent {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		//input the number of student
		System.out.print("How many student in classroom: ");
		int numberOfStudent = scan.nextInt();
		//consume new line character
		scan.nextLine();
		
		//1.create an array of student object
		student[] students  = new student[numberOfStudent];
		
		//input information for each student
		for(int i =0; i<numberOfStudent;i++) {
			//2.Create a new student object
			students[i] = new student();
			System.out.println("\nINPUT INFORMATION OF STUDENT "+ (i+1));
			Line();
			//input student name
			System.out.print("Input student Name: ");
			/*String stdName = scan.nextLine();
			students[i].setName(stdName);*/
			
			students[i].setName(scan.nextLine());//String only
			//Input student's score and validate
			while(true) {
				System.out.print("Input student score : ");
				int score = scan.nextInt();
				
				//consume new line character
				scan.nextLine();
				students[i].setScore(score);
				if(students[i].checkScore()) {
					break;
				}else {
					System.out.println("Input score ,again");
				}
				
			}//end while
			//display the list of student who passed
			System.out.println("\nLIST OF PASS STUDENT(>=50) : ");
			Line();			
			//findGrade();
			for(student student : students) {
				if(student.isPass()) {
					System.out.print(">>" + student.getName() + "(" + student.getScore()+")");
				}
			}
			
			
			
			
		}//end of for
		
		

		
		
		scan.close();
	}//end of main method
	
	public static void Line() {
		for(int i=1 ; i<=60;i++) {
			System.out.print("-");
		}
		System.out.println();
	}
	
	public static String findGrade(int score) {
		/*return score>=80 ? "A" :
					score<=79&&score>=75 ? "B+":
					score<=70&&score>=74 ? "B":
					score<=69&&score>=65 ? "C+":
					score<=60&&score>=64 ? "C":
					score<=59&&score>=55 ? "D+":
					score<=50&&score>=54 ? "D":"F";*/
		if(score>=80) return "A";
		else if(score>76)return "B+";
		else if(score>70)return "B";
		else if(score>66)return "C+";
		else if(score>60)return "C";
		else if(score>56)return "D+";
		else if(score>50)return "D";
		else return "F";
	}

}//end of class
