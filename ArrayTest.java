import java.util.*;

public class ArrayTest {

  public static void main(String[] args) {
    System.out.println("Hello World");

    int[] myIntArray = new int[]{1,1,2,4,5,6,6};

    int counter = 1;

    Arrays.sort(myIntArray);

    for (int i = 1;i < myIntArray.length;i++ ) {

      if (myIntArray[i] != myIntArray[i-1]+1 && myIntArray[i] != myIntArray[i-1]){
        System.out.println(myIntArray[i-1]+1);
        return;
      }
    }
    System.out.println(myIntArray[myIntArray.length-1]+1);
  }
}
