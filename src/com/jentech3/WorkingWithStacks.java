package com.jentech3;

import java.util.List;
import java.util.Stack;

public class WorkingWithStacks {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(5);
        stack.push(10);
        stack.push(15);
        stack.push(20);
        stack.push(25);
        stack.push(30);

        System.out.println(stack.peek()); //element at the top of the stack
        System.out.println(stack.size());
        System.out.println(stack.pop()); // show the element at the top of the stack and remove it from the stack
        System.out.println(stack.size());
        System.out.println(stack.peek());
    }
}
