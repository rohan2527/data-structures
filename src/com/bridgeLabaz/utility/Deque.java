package com.bridgeLabaz.utility;

public class Deque 
	{
	public static	int deque[];
	public	int data;
	 static int front;
	 static	int rear;
	static int size;
		//constructor to create queue
	public Deque(int n)
	{
		deque=new int[n];
		size = n;
		front=0;
		rear=0;
	}
	public void addFront(int data)
	{if(isFull())
	{
		System.out.println("Queue is full");
	}
	else if(front==rear) //for first add 
	{
		deque[front]=data;
		rear++;
	}
	else
	{
		for(int i=rear;i>=front;i--)
	
	{
		deque[i]=deque[i-1];	
	}
		deque[front]=data;
		rear++ ;
	}
	}
	public void addRear(int data)
	{
		if(isFull())
	{
		System.out.println("queue is full");
	}
	else 
		{			
		deque[rear]=data;
		rear++;
		}
	}
	public int removeFront(int data)
	{if(isEmpty())
	{		
		System.out.println("queue is empty");
	}
	for(int i=front;i<rear;i++)
	{
		deque[i]=deque[i+1];
	}
	rear--;
		return deque[front];
	}
	
	public int removeRear(int data)
	{if(isEmpty())
	{
		System.out.println("queue is empty");
	}
		rear--;
		return deque[rear];
	}

	public boolean isFull()
	{
		if(rear==size)
		{
			return true;
		}
		else
		return false;
	}
	public boolean isEmpty()
	{
		if(front==rear)
			return true;
		else
			return false;
	}
	public void showDeque()
	{
		for(int i=front;i<rear;i++)
		{
			System.out.println(deque[i]);
		}
	}
	
}
