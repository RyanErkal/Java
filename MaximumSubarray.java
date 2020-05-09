//Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.

import java.util.Arrays;
import java.util.Collections;

class MaximumSubarray {

  public static void main(String[] args) {

    MaximumSubarray myMaximumSubarray = new MaximumSubarray();
    int[] numlist = {-2, 1, 4, -1, 3, -1, -6};

    myMaximumSubarray.maxSubArray(numlist);

  }

  public int maxSubArray(int[] nums){
    //FAST WAY
    //running sum
    //reset when negative
    //max array

    int[] runningSum = new int[nums.length];

    int sum = 0;

    for (int i = 0;i < nums.length;i++){
      if (sum < 0){
        sum = 0;
      }
      sum += nums[i];
      runningSum[i] = sum;
    }

    int maxSum = runningSum[0];

    for (int i = 0;i < runningSum.length;i++){
      if (runningSum[i] > maxSum){
        maxSum = runningSum[i];
      }
    }

    System.out.println(maxSum);
    return maxSum;

    //SLOW WAY!!
    //for item in array
    //extend right
    //sum array
    //if newSum > sum, sum = newSum

    //int maxSub = nums[0];

    // for (int i = 0;i < nums.length;i++){
    //   for (int j = i;j < nums.length;j++){
    //     int curSub = 0;
    //     int temp = i;
    //     while (temp <= j){
    //       curSub += nums[temp];
    //       temp++;
    //     }
    //     if (curSub > maxSub){
    //       maxSub = curSub;
    //     }
    //   }
    // }
    // System.out.println(maxSub);
    // return maxSub;
  }
}
