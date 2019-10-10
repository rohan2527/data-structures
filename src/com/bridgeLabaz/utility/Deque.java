package com.bridgeLabaz.utility;

public class Deque {
	 public int size;
	 public int maxSize;
	 public Deque(int n)
	 { 
		 maxSize = n;
		 size=0;
		 
	 }
	 LinkedList list=new LinkedList();
	 //////////////////////////////////
	 public <T> void addFront(T data)
	 {if(isFull())
		{
		 System.out.println("Queue is full");
		}
	 else
	 list.instertAtFirst(data);
	 size++;
	 }
	 /////////////////////////////////////
	public <T>void addRear(T data)
	{
		if(isFull())
		{
		 System.out.println("Queue is full");
		}
	 else
	 list.insertAtLast(data);
	 size++;
	}
	///////////////////////////////////
	public char removeFront()
	{ 
	   char c = 0;
		if(isEmpty())
		{
			System.out.println("Queue is empty");
		}
		else 
			
		 c = (char) list.firstNode();
			list.deleteAtfirst();
		size--;
		return c;
	}
	//////////////////////////////////
	public char removeRear()
	{ char c = 0;
		if(isEmpty())
		{
			System.out.println("Queue is empty");
		}
		else
			
			 c = (char) list.lastNode();
			list.deleteAtLast();
			size--;
			return c;
	}
	///////////////////////////////////
	 public int size()
	 {
		 return size;
	 }
	 public boolean isEmpty()
	 {
		 if(size==0)
		 {
			 return true;
		 }
		 else 
			 return false;
	 }
	 public boolean isFull()
	 {
		 if(size==maxSize)
		 {
			 return true;
		 }
		 else
			 return false;
	 }
}
