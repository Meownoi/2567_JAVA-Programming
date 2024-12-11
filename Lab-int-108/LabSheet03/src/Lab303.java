import java.util.*;
public class Lab303 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Input a sentence : ");
		String sentence = scan.next();
		while(sentence.endsWith(".")!=true) {
			System.out.print("Input a sentence, again: ");
			sentence = scan.next();
		}
		
		int spaceBar = 0;
		for(int i = 0;i<=sentence.length();i++) {
			char st = sentence.charAt(i);
			if(st == ' ' ) {
			       spaceBar++; 
			}
		}
		System.out.print("This sentence has "+ spaceBar + "spacebar.");
		
		//scan.close();
	}

}
