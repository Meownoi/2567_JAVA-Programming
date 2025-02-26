import java.io.*;
import java.util.*;
public class SaveandOpen extends employee{
	
	private String name;
	private String dept;
	
	public void insert() throws IOException{
		Scanner input = new Scanner(System.in);
		//ประกาศ object ชื่อ writeFile เพื่อ บันทึกข้อมูลลงไฟล์โดยใช้ชื่อ PrintStream
		PrintWriter writeFile = new PrintWriter(new FileWriter("src//txtFile//employee.txt",true));
		String answer;
		do {
			super.header();
			//รับข้อมูลชื่อแผนกทาง keyboard
			System.out.print("Enter name: ");
			name = input.next();
			System.out.print("Enter department: ");
			dept = input.next();
			//บันทึกข้อมูลชื่อกับแผนกลงไฟล์
			writeFile.println(name+"," + dept);
			System.out.print("Do you want to input data again? : ");
			answer = input.next();
			
		}while(answer.equalsIgnoreCase("y"));
		
		
	}
	
	public void searchData(){
		try {
			Scanner readFile = new Scanner(new File("src//txtFile//employee.txt"));
			int i =0;
			Boolean check = false;
			super.header();
			while(readFile.hasNext()) {
				name = readFile.next();
				dept = readFile.next();
				
				if(dept.equalsIgnoreCase(super.getDept())) {
					i++;
					System.out.println(i+")" + name);
					check = true;
					
				}
				if(check) {
					super.header();
					System.out.print("Employee in dept " + super.getDept() + "is" + i + " person(s)");
				}
				else {
					System.out.println("\nSorry, no dept: " + super.getDept() + " in file.");
				}
				
				
				
				
				
			}
			
			
		}catch (Exception e) {
			System.out.println("\nSorry File not found...");
		}
	}
	
	
}
