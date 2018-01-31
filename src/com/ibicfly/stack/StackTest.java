package com.ibicfly.stack;

import java.util.Stack;

public class StackTest {
public static void main(String[] args) {
	Stack stack=new Stack<>();
	Object temp1=new Object();
	for(int i=0;i<10;i++)
	{
		stack.push(temp1);
	}
	stack.peek();
	stack.pop();
}
}
