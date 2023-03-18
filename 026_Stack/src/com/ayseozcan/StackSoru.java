package com.ayseozcan;

import java.util.Stack;

public class StackSoru {

	public static boolean isValid(String s) {

		Stack<Character> stack = new Stack<>();

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);

			// eger sol parantezle karsilasilirsa

			if (ch == '(' || ch == '[' || ch == '{') {
				stack.push(ch);
			
			//eger sag parantezler karsilasilirsa
				
			} else if (ch == ')' && !stack.isEmpty() && stack.peek() == '(') {
				stack.pop();
				
			} else if (ch == ']' && !stack.isEmpty() && stack.peek() == '[') {
				stack.pop();
				
			} else if (ch == '}' && !stack.isEmpty() && stack.peek() == '{') {
				stack.pop();
				
			} else {
				return false;  
			}

		}
		return stack.isEmpty();

	}

	public static void main(String[] args) {

		// Düzgün Parantezler Problemi
		/*
		 * Given a string s containing just the characters '(', ')', '{', '}', '[' and
		 * ']', determine if the input string is valid.
		 * 
		 * An input string is valid if:
		 * 
		 * Open brackets must be closed by the same type of brackets. Open brackets must
		 * be closed in the correct order. Constraints : s consists of parentheses only
		 * '()[]{}'.
		 * 
		 * Example 1: Input: s = "()" Output: true
		 * 
		 * Example 2: Input: s = "()[]{}" Output: true
		 * 
		 * Example 3: Input: s = "(]" Output: false
		 * 
		 * Example 4: Input: s = "([)]" Output: false
		 * 
		 * Example 5: Input: s = "{[]}" Output: true
		 * 
		 * Note: In this question, we need to deal with only 6 symbols — (, ), {, }, [,
		 * ]. We will be given a string containing only these symbols.
		 */

		System.out.println(StackSoru.isValid("([)]"));
		System.out.println(isValid("(){}[]"));
		System.out.println(isValid("{[]}"));
		System.out.println(isValid("{}"));
		

	}

}
