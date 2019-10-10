package com.bridgeLabaz.utility;

public class StackUsingArray {
	private int maxSize;
	private long[] stackArray;
	private int top;

	//for size  
	public  StackUsingArray (int n)
	{
		int max_size=n;
		stackArray = new long[max_size];
		top = -1;
	}
	//for push   
	public void push(char ch)
	{
	stackArray[++top] = ch;//put char in array
	}
	//for pop   
	public long pop() 
	{
	 return stackArray[top--];
	}
	//for peek   
	public long peek() 
	{
	return stackArray[top];
	}
	//to check whether stack is empty	   
	public boolean isEmpty()
	{
		if(top==-1)
		{
			return true;
		}
	return false;
	}
	//to check whether stack is full	   
	public boolean isFull()
	{
	return (top == maxSize - 1);
	}
	public int size(){
		return top+1;
	}
}
