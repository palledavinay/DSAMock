package in.ineuron.main;

import java.util.Arrays;

class Solution{
	 public void moveZeroes(int[] nums) {
	        int insertPos = 0;


	        for (int currPos = 0; currPos < nums.length; currPos++) {
	            if (nums[currPos] != 0) {
	                int temp = nums[currPos];
	                nums[currPos] = nums[insertPos];
	                nums[insertPos] = temp;
	                insertPos++;
	            }
	        }

	        for (int i = insertPos; i < nums.length; i++) {
	            nums[i] = 0;
	        }
	    }
}
public class DSAMockQuestion1 {

	public static void main(String[] args) {
		
		 int[] nums1 = {0, 1, 0, 3, 12};
	        Solution solution = new Solution();
	        solution.moveZeroes(nums1);
	        System.out.println(Arrays.toString(nums1));
	        

	        int[] nums2 = {0};
	        solution.moveZeroes(nums2);
	        System.out.println(Arrays.toString(nums2));
	}

}
