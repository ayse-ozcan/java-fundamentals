package com.ayseozcan;

import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		
		// Stack synchronized metodlar bulunur, vektor sinifi gibi thread lerle kullanilabilir.
		Stack<String> stack = new Stack<>();
		//add ya da push ile ekliyoruz
		stack.add("kedi");
		stack.add("kus");
		stack.add("kopek");
		
		for (String string : stack) {
			System.out.println(string);
		}
		
		//peek(): listeye son giren elemani goster metodu
		
		System.out.println("************");
		
		System.out.println(stack.peek());
		System.out.println(stack.peek());
		
		// pop() : stack e son giren elemani cikar metodu
		
		System.out.println("------------");
		String string = stack.pop();
		System.out.println(string);
		System.out.println("************");
		
		System.out.println(stack.peek());
		
		// isEmpty() : stack bos mu kontrolu
		
		System.out.println("stack bos mu?:" + stack.isEmpty());
		
		stack.pop();
		stack.pop();
		System.out.println("stack bos mu?:" + stack.isEmpty());
		
		if(!stack.isEmpty())
			stack.pop();
		
		
		
	}

}
