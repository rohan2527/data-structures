package com.bridgeLabaz.utility;

public class QueusingList {
	 public int size;
	 public int maxSize;
	 public QueusingList(int n)
	 { 
		 maxSize = n;
		 size=0;
		 
	 }
	 LinkedList list=new LinkedList();
	 public void enQueue(int data)
	 {if(isFull())
	 {
		 System.out.println("Queue is full");
	 }
	 else
		 list.instertAtFirst(data);
		 size++;
	 }
	
	 public void deQueue()
	 {
		 if(isEmpty())
		 {
			 System.out.println("Queue is Empty");
		 }
		 else
			 list.deleteAtLast();
		 size--;
	 }
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
