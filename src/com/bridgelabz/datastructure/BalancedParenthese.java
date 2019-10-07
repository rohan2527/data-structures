package com.bridgelabz.datastructure;

import com.bridgelabz.utility.Stack;
import com.bridgelabz.utility.Utility;

public class BalancedParenthese {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Utility u=new Utility();
		System.out.println("Enter  expression");
		String s=u.stringInput();
		int n=s.length();
		u.checkParenthese(s);
		Stack stack=new Stack(n);

if(u.checkParenthese(s))
{
	System.out.println("Expression is balanced");

}else
	System.out.println("Expression is not balance");

	}

}
