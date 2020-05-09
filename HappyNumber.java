// Write an algorithm to determine if a number n is "happy".
//
// A happy number is a number defined by the following process: Starting with any positive integer,
// replace the number by the sum of the squares of its digits, and repeat the process until the number
// equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1.
// Those numbers for which this process ends in 1 are happy numbers.
//
// Return True if n is a happy number, and False if not.

import java.util.ArrayList;

class HappyNumber {

  public static void main(String[] args) {
    HappyNumber myInstance = new HappyNumber();
    myInstance.happyNumber(1242);
  }

  int loop = 0;

  public boolean happyNumber(int n){
    //int to string to array
    //sqaure every item in array
    //add squares
    //call function on the sum recursively

    loop++;

    if (n == 1){
      System.out.println("Happy Number");
      return true;
    }
    else if(loop > 99){
      System.out.println("Not a Happy Number");
      return false;
    }

    int temp = n;

    ArrayList<Integer> digits = new ArrayList<Integer>();

    do{
      digits.add(temp % 10);
      temp /= 10;
    } while  (temp > 0);

    int sum = 0;

    for (int i = 0;i < digits.size();i++){
      // System.out.println("index: " + digits.indexOf(digits.get(i)));
      // System.out.println("to square: " + digits.get(i));
      // System.out.println("square: " + digits.get(i)*digits.get(i));
      // System.out.println("sum: " + sum);
      // System.out.println("\n");
      sum += (digits.get(i)*digits.get(i));
      digits.set(digits.indexOf(digits.get(i)), (digits.get(i)*digits.get(i)));

    }

    //System.out.println(sum);
    return happyNumber(sum);

  }
}
