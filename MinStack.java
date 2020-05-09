// Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.
//
// push(x) -- Push element x onto stack.
// pop() -- Removes the element on top of the stack.
// top() -- Get the top element.
// getMin() -- Retrieve the minimum element in the stack.

import java.io.*;
import java.util.*;

@SuppressWarnings("unchecked")

class MinStack {

  public static void main(String[] args) {
    MinStack myStack = new MinStack();
    myStack.push(-2);
    myStack.push(0);
    myStack.push(-3);
    myStack.getMin(); // return -3
    myStack.pop();
    myStack.top();    // return 0
    myStack.getMin(); // return -2
  }

  Stack<Integer> stack1;
  Stack<Integer> stack2;

  /** initialize your data structure here. */
  public MinStack() {
    stack1 = new Stack<>();
    stack2 = new Stack<>();
  }

  public void push(int x) {
    stack1.push(x);
    if (stack2.isEmpty()) {
      stack2.push(x);
    } else {
      stack2.push(Math.min(stack2.peek(), x));
    }
  }

  public void pop() {
    stack1.pop();
    stack2.pop();
  }

  public int top() {
    return stack1.peek();
  }

  public int getMin() {
    return stack2.peek();
  }
}
