package com.bridgelabz.datastructure;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Demo d=new Demo();
String s[]= {"rohan","abc","hjsbd","yus"};
	Integer a[]= {1,3,4,5,6};
	d.printArray(s);
	d.printArray(a);
	}
public <E> void printArray(E []s)
{
	for(E x:s)
	{
		System.out.println(x);
	}
}
}
