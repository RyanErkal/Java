// Given two strings S and T, return if they are equal when both are typed into empty text editors. # means a backspace character.
//
// Note that after backspacing an empty text, the text will continue empty.

import java.io.*;
import java.util.*;

@SuppressWarnings("unchecked")

class BackspaceCompare {

  public static void main(String[] args) {
    BackspaceCompare myInstance = new BackspaceCompare();
    myInstance.backspaceCompare("abc", "xyz");
  }

  public boolean backspaceCompare(String S, String T) {
        return build(S).equals(build(T));
    }

    public String build(String S) {
        Stack<Character> ans = new Stack();
        for (char c: S.toCharArray()) {
            if (c != '#')
                ans.push(c);
            else if (!ans.empty())
                ans.pop();
        }
        return String.valueOf(ans);
    }
}
