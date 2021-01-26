package Walmart;

import java.util.Stack;

/**
 *   Keep two stacks one for content and one for min value
 *   2,3,4,3,1   // Content
 *   2,2,2,2,1   // Min Stack
 */
public class P155MinStack {

    Stack<Integer> stack, minStack;

    public P155MinStack() {
        stack = new Stack();
        minStack = new Stack();
    }

    public void push(int x) {
        stack.push(x);
        if(minStack.isEmpty()){
            minStack.push(x);
        }else{
            int min = minStack.peek();
            if(x<min)minStack.push(x); else minStack.push(min);
        }
    }

    public void pop() {
        stack.pop();
        minStack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }
}
