package com.bridelabz.datastructure;

import com.bridgelabz.utility.Base;

public class BalancedParentheses {
	public static void main(String[] args) {
		Base b = new Base();
		String input = b.inputString();
		char[] c = input.toCharArray();
		Stack<Character> stack = new Stack<Character>(c.length);
		for(int i=0;i<c.length;i++) {
			if(c[i]=='(') {
				stack.push(c[i]);
			}
			else if(c[i]==')') {
				stack.pop();
			}else if(c[i]=='{') {
				stack.push(c[i]);
			}else if(c[i]=='}') {
				stack.pop();
			}
			else if(c[i]=='[') {
				stack.push(c[i]);
			}
			else if(c[i]==']') {
				stack.pop();
			}
		}
		boolean b1 = stack.isEmpty();
		
		if(b1) {
			System.out.println("Parentheses are Balanced");
		}
		else {
			System.out.println("Parentheses are Not Balanced");
		}
	}
}