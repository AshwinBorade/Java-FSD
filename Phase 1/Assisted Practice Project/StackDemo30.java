package com.AssistedProjects3;
import java.util.Stack;

public class StackDemo30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Stack<String> stack=new Stack<>();
      stack.push("ashwin");
      stack.push("gopal");
      stack.push("samaksh");
      stack.push("aditya");
      System.out.println(stack);
      stack.pop();
      System.out.println(stack.peek());
      System.out.println(stack);
	}

}
