// Given an array nums of n integers where n > 1,  return an array output such that output[i]
// is equal to the product of all the elements of nums except nums[i].

class ProductExceptSelf {

public static void main(String[] args) {

        ProductExceptSelf myInstance = new ProductExceptSelf();
        int[] numlist = {2,4,8,16,32};
        myInstance.productExceptSelf(numlist);

}

public int[] productExceptSelf(int[] nums) {

        int length = nums.length; //length of input

        int[] L = new int[length]; //inplace everything to the left
        int[] R = new int[length]; //inplace everything to the right

        int[] answer = new int[length];

        L[0] = 1; //there is no element to the left of L[0] so it equals 1

        for (int i = 1; i < length; i++ ) {

                L[i] = nums[i-1] * L[i-1];
                //L[i-1] is the product of everything to the left of i-1 so multiplying it by i-1 gives
                //the product of everything to the left of i

        }

        R[length - 1] = 1; //there is no element to the right of R[length - 1] so it equals 1

        for (int i = length - 2; i >= 0; i-- ) {

                R[i] = nums[i+1] * R[i+1];
                //R[i+1] is the product of everything to the right of of i+1 so multiplying it by i+1
                //gives the product of evrything to the right of i

        }

        for (int i = 0; i < length; i++ ) {
                answer[i] = L[i] * R[i];
                //multiply the products of the products of the left and right to get the product except self

        }

        for (int i = 0; i < length; i++ ) {
                System.out.println(answer[i]);
                //print

        }

        return answer;
}
}
