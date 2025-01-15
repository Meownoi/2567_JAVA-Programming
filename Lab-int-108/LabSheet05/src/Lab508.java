import javax.swing.*;
public class Lab508 {

	public static void main(String[] args) {
		int[] nums = {25, 78, 41,29,36,85,37};
		do {
			int index = Integer.parseInt(JOptionPane.showInputDialog("Input Index of array: "));
			if(!checkIndex(nums,index)) {
				System.out.print(JOptionPane.showInputDialog("Input Index of array, again: "));
			}while (!checkIndex(nums,index))
			
				System.out.print("Current data, nums["+index+"]="+currentData(nums,index) + "\n");
				System.out.print("previous data,nums["+(index-1)+"] ="+(prevData(nums, index)!=-1 ? prevData(nums,index):"No previous data")+"\n");
				System.out.print("next data,nums["+(index+1)+"] ="+(nextData(nums, index)!=-1 ? nextData(nums,index):"No next data")+"\n");

		

	}
	
	public static boolean checkIndex(int[] nums,int index) {
		return index >= 0&& index <nums.length;
	}
	
	public static int currentData(int[] nums, int index) {
		return nums[index];
	}
	
	public static int prevData(int[] nums, int index) {
		return index>0?nums[index-1]:-1;
	}
	
	public static int nextData(int[] nums, int index) {
		return index<nums.length-1?nums[index+1]:-1;
	}

}
