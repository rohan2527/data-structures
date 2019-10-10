package Com.Bridgelabaz.DataStructure;

import com.bridgeLabaz.utility.Deque;
import com.bridgeLabaz.utility.Utility;

public class PalindromeChecker {

	public static void main(String[] args) {
		
 // TODO Auto-generated method stub
		System.out.println("Enter Word ");

String s=Utility.stringInput();
int n=s.length();
Deque D=new Deque(n);
System.out.println(s);	

char[] c=s.toCharArray();
for(int i=0;i<n;i++)
{
D.addFront(c[i]);	
}  
char[] rev=new char[n];
for(int i=0;i<n;i++)
{
	rev[i]=D.removeFront();
}

String string = new String(rev);
System.out.println(string);	

if(string.compareTo(s)==0)
{
	System.out.println("word is palindrome");
}
else
{
	System.out.println("word is not palindrome");
}
	}
}
