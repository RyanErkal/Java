//Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.

import java.util.Arrays;

class MoveZeros{

  public static void main(String[] args) {
  MoveZeros myInstance = new MoveZeros();
  int[] numlist = {0,1,0,3,12};
  myInstance.moveZeros(numlist);
  }

  public void moveZeros(int[] nums){

    int j = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != 0) {
				int temp = nums[j];
				nums[j] = nums[i];
				nums[i] = temp;
				j++;
			}
		}

    System.out.println(Arrays.toString(nums));

  }
}
