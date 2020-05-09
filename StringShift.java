// You are given a string s containing lowercase English letters, and a matrix shift, where shift[i] = [direction, amount]:
//
// direction can be 0 (for left shift) or 1 (for right shift).
// amount is the amount by which string s is to be shifted.
// A left shift by 1 means remove the first character of s and append it to the end.
// Similarly, a right shift by 1 means remove the last character of s and add it to the beginning.
//
// Return the final string after all operations.

class StringShift {

public static void main(String[] args) {

        String test = "abcdefg";
        int[][] nums = {{1,1}, {1,1}, {0,2}, {1,3}};
        StringShift myInstance = new StringShift();
        myInstance.stringShift(test, nums);
        String s = "HelloWorld";
        //rotating right by X is the same as rotating left by length - X
        System.out.println(myInstance.leftrotate(s, 2));
        System.out.println(s.length());
        System.out.println(myInstance.rightrotate(s, s.length()-2));

}

public String stringShift(String s, int[][] shift) {

        for (int i = 0; i < shift.length; i++) {
                if(shift[i][0] == 0) {
                        s = leftrotate(s, shift[i][1]);
                        System.out.println(s);
                }
                if(shift[i][0] == 1) {
                        s = rightrotate(s, shift[i][1]);
                        System.out.println(s);
                }
        }
        return s;
}

public String leftrotate(String str, int d){

        String ans = str.substring(d) + str.substring(0, d);
        return ans;
        //shifting left <--
        //string = HelloWorld
        //substring(4) = oWorld
        //substring(0, 4) = Hell
        //oWorld + Hell = oWorldHell
        //
        //shifting right -->
        //string = HelloWorld
        //rightrotate(HelloWorld, 2) //shift 2 space to the right
        //HelloWorld.length = 9
        //leftrotate(HelloWorld, 9-2)
        //substring(7) = rld
        //substring(0, 7) = HelloWo
        // rld + HelloWo = rldHello
        //
        //rotating right by X is the same as rotating left by length - X
}

public String rightrotate(String str, int d){

        return leftrotate(str, str.length() - d);
}
}
