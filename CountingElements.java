// Given an integer array arr, count element x such that x + 1 is also in arr.
//
// If there're duplicates in arr, count them seperately.

import java.util.Arrays;

class CountingElements {

  public static void main(String[] args) {
    CountingElements myInstance = new CountingElements();
    int[] numlist = {2,9,0,7,6,2,7,7,0};
    myInstance.countElements(numlist);

  }

  public int countElements(int[] arr) {

    //sort
    //iterate through
    //check if next item is same or n+1
    //increment counter

    Arrays.sort(arr);
    System.out.println(Arrays.toString(arr));

    int count = 0;
    int run = 1;

    for (int i = 1;i < arr.length;i++){
      //System.out.println("i: " + i + " / run: " + run + " / count: " + count + "\n");
      if (arr[i] == arr[i-1]){
        run++;
        continue;
      }
      if(arr[i] == arr[i-1]+1){
        count += run;
      }
      run = 1;
    }
    System.out.println(count);
    return count;
  }
}
