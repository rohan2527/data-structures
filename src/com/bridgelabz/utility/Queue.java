package com.bridgelabz.utility;

public class Queue<E> {
	private E[] array;
	int front,rear;
	public final int SIZE=100;
	public Queue(){
		array=(E[])new Object[SIZE];
		front=-1;
		rear=-1;
}
	public void enQueue(E item)throws Exception{
		//check queue is full
		rear++;
		if(rear==SIZE){
			throw new Exception();
		}
		if(rear==0)
			front=0;

		array[rear]=item;

	}
	public E deQueue()throws Exception{
		//if front less then or equal to rear
		if(front <= rear){
			front++;
			return array[front-1];
		}else{
			throw new Exception();
		}
				 
	}
	public boolean isEmpty(){
		if(rear==-1)
			return true;
		else if(front>rear)
			return true;
		else
			return false;
	}
	public int size(){
		if(isEmpty())
			return 0;
		else
			return rear-front+1;
	}
	

}
