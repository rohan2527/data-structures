package com.bridgeLabaz.utility;

import java.util.Scanner;

public class Utility {
static Scanner scanner = new Scanner(System.in);
	
	public static int integerInput()
	{
		int integerValue = scanner.nextInt();
		return integerValue;
	}
	
			
	public static char charInput()
	{
		char charValue = scanner.next().charAt(0);
		return charValue;
	}
	
	
	
	public static String stringInput()
	{
		String stringValue = scanner.next();
		return stringValue;
	}
	public static String line()
	{
		String lineValue = scanner.nextLine();
		return lineValue;
	}
	public static double doubleInput()
	{
		Double doubleValue = scanner.nextDouble();
		return doubleValue;
	}
public static <T>void printArray(T[] n)
{
	for(int i=0;i<n.length;i++)
	{
		System.out.print(n[i]+",");
	}
}
public int[] bubblesort(int[] a) {
	// TODO Auto-generated method stub
	
	int temp; 
	for(int i=0;i<a.length-1;i++)
	{
		for(int j=0;j<a.length-i-1;j++)
		{
			if(a[j]>a[j+1])
			{
			temp=a[j];
			a[j]=a[j+1];
			a[j+1]=temp;
				
			}
		}
	}
	return a;
}


public boolean checkParenthese(String s) {
	// TODO Auto-generated method stub
int n=s.length();
Stack stack=new Stack(n);
	for(int i=0;i<n;i++)
	{		
		char ch = s.charAt(i);

		if(ch=='{'||ch=='('||ch=='[')
		{
			try
			{
				stack.push(ch);
			}
			catch(Exception exception)
			{
				//stack size is full
				System.out.println("Array index out of bound exception.");
			}
		}
		
		if(ch=='}'||ch==']'||ch==')')
		try
		{
			stack.pop();
		}
		catch(Exception exception)
		{
	System.out.println("Stack is empty");
		return false; //No element is there in stack.
		}
	}
		if(stack.isEmpty())
				return true;
			else
				return false;
	
	
}


}
