
public class student {
	//private two attribute
	private String studentName;
	private int studentScore;
	
	//setter and getter method
	public void setName(String stdName) {
		studentName = stdName;
	}
	
	public String getName( ) {
		return studentName;
	}
	
	public void setScore(int stdScore) {
		studentScore = stdScore;
	}
	
	public int getScore() {
		return studentScore;
	}
	
	
	//check the score is within the valid range (0 - 100)
	public boolean checkScore() {
		/*if(getScore >= 0 && getScore <= 100) 
			return true;
		
		return false;
	*/
		return getScore()>=0&&getScore()<=100;
	}
	
	public boolean isPass() {
		
		return getScore()>=50;
		
		//return false;
	}
	
	
	

}
