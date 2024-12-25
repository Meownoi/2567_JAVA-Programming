import javax.swing.*;
public class Lab507 {

	public static void main(String[] args) {
		int[] nums = new int[5];
		for(int i = 0 ; i<nums.length;i++) {
			nums[i] = Integer.parseInt(JOptionPane.showInputDialog("Input number " + (i+1) + ": "));
		}
		showEven(nums);
		showOdd(nums);

	}
	
	public static void showEven(int[] nums) {
		String evenNum = "List of even number : \n";
		for(int num : nums) {
			if(num%2==0) {
			evenNum += num + " ";
			}
		}
		JOptionPane.showMessageDialog(null, evenNum.trim());
	}
	
	public static void showOdd(int[] nums) {
		String oddNum = "List of even number : \n";
		for(int num : nums) {
			if(num%2!=0) {
			oddNum += num + " ";
			}
		}
		JOptionPane.showMessageDialog(null, oddNum.trim());
	}

}
