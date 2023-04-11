package com.example.test.five;

import java.util.Stack;

public class BalanceParenthesis {

	public static boolean isBalanced(String s) {
		Stack<Character> stack= new Stack<>();
		for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (stack.empty()) {
                    return false;
                }
                if (c == ')' && stack.peek() == '(') {
                    stack.pop();
                } else if (c == '}' && stack.peek() == '{') {
                    stack.pop();
                } else if (c == ']' && stack.peek() == '[') {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        return stack.empty();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String s="{([)}";
      if(isBalanced(s)) {
    	  System.out.println("This is balanced parenthesis...");
      } else {
    	  System.out.println("Not baalanced parenthesis..");
      }
      
	}

}
