package com.bridgeLabaz.utility;

public class StackUsingList {
	int size;
	int top;
	public StackUsingList(int n) 
	{
		size=n;
		top=0;
	}
LinkedList list=new LinkedList();
public void push(char c)
{if(isFull())
{
	System.out.println("list is full");
}
else
	list.instertAtFirst(c);
top++;
	
}
public void pop()
{
	if(isEmpty())
{
	System.out.println("stack is empty");
}
	list.deleteAtLast();
	top--;
}
public <T> T peek()
{if(isEmpty())
{
	System.out.println("stack is empty");
	System.exit(0);
}
	return 	(T) list.lastNode();	
}
public boolean isEmpty()
{
	if(top==0)
	{
		return true;
	}
	else 
		return false;
}
public boolean isFull()
{
	if(top==size)
	{
		return true;
	}
	else 
		return false;
}
}
