package com.bridgeLabaz.utility;

public class QueueUsingArray {
	public static	int queue[];
	public	int data;
	 static int front;
	 static	int rear;
	static int size;
		//constructor to create queue
	public QueueUsingArray(int n)
	{
		queue=new int[n];
		size = n;
		front=0;
		rear=-1;
		
	}
	public void enQueue(int data)
		{
			if (isFull())
			{
				System.out.println("Queue is full ");
				System.exit(1);
			}
			else if(rear<front) {
				queue[0]=data;
				rear ++;
			}

			else
			{
				queue[rear+1]=data;	
				rear++;
			}
		
			}

		

	public  void deQueue() {
		if(isEmpty())
		{
			System.out.println("Queue is empty ");
			System.exit(1);
		}
		else
			for(int i=0;i<rear;i++)
			{
				queue[i]=queue[i+1];
			}
		rear--;
		
	}
	public  boolean isFull() {
		// TODO Auto-generated method stub
		if(rear==size-1)
		{
			return true;
		}
		return false;
	}
	private  boolean isEmpty()
	{
		// TODO Auto-generated method stub
		if(rear<0)
		{
		return true;	
		}
		return false;
	}
	
	public  int size()
	{
		return rear+1;
	}
	public void showQueue()
	{
		if(isEmpty())
	{
		System.out.println("queue is empty");
	}
	else
		for(int i=0;i<=rear;i++)
		{
			System.out.println(queue[i]);
		}
	}
	
	public void showStatus()
	{
		if(isEmpty())
		{
		System.out.println("queue is empty");
		}
	else if(isFull())
	{
		System.out.println("queue is Full");

	}
	else {
		System.out.println((rear+1)+" peoples are in queue");

	}
	}
}
