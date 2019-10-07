package com.bridgelabz.datastructure;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  LinkedList<String> arrl = new LinkedList<String>();
	        //adding elements to the end
	        arrl.add("First");
	        arrl.add("Second");
	        arrl.add("Third");
	        arrl.add("Random");
	        System.out.println("Actual LinkedList:"+arrl);
	        List<String> list = new ArrayList<String>();
	        arrl.add("one");
	        arrl.add("two");
	        arrl.addAll(list);
	        System.out.println("After Copy: "+arrl);
	}

}
