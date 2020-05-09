//Given a non-empty array of integers, every element appears twice except for one. Find that single one.

import java.util.ArrayList;

class SingleNumber {

    public static void main(String[] args) {
      int[] numlist = {1,1,2,3,3,4,4};
      SingleNumber mySingleNumber = new SingleNumber();
      mySingleNumber.singleNumber(numlist);

    }

    public int singleNumber(int[] nums) {
        //step through list
        //add first instance of integer to list
        //remove second instance of integer
        //return integer remaining in list
        ArrayList<Integer> firstInstances = new ArrayList<Integer>();
        int loopcounter = 0;
        for (int i = 0; i < nums.length; i++){
          System.out.println(loopcounter); loopcounter++;
            if (firstInstances.contains(nums[i])){
              firstInstances.remove(firstInstances.indexOf(nums[i]));
              System.out.println("removed");
            }
            else{
              firstInstances.add(nums[i]);
              System.out.println("added");
            }

        }
        System.out.println(firstInstances.get(0));
        return nums[0];
    }
}
