package Com.Bridgelabaz.DataStructure;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import com.bridgeLabaz.utility.LinkedList;
import com.bridgeLabaz.utility.Utility;

public class OrderedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Utility utility=new Utility();
		System.out.println("enter integer you want to search");
		 int n=utility.integerInput();
		 LinkedList list=new LinkedList();

		 String line;
		 try {
		     // FileReader reads text files in the default encoding.
		     FileReader fileReader =  new FileReader("/home/admin1/Desktop/file.txt");//giving path to read file

		     // Always wrap FileReader in BufferedReader.
		     BufferedReader bufferedReader = new BufferedReader(fileReader); //reading text from file

		     while((line = bufferedReader.readLine()) != null) //storing words in string named as line
		     {
		    	 System.out.println(line);
			 String [] s=line.split(" ");
			 int num[]=new int[s.length];
//			 for(String a:s)
//			 {
//				 System.out.println(a);
//			 }
			 for(int i=0;i<s.length;i++)
			 {
				 num[i]=Integer.parseInt(s[i]);
				
			 }System.out.println("before sorting");
			 for(int i=0;i<num.length;i++)
			 {
				 System.out.println(num[i]);
			 }
			num=utility.bubblesort(num);
			 System.out.println("after sorting");
			for(int i=0;i<num.length;i++)
			 {	
				System.out.println(num[i]);
			 }
		for(int j=num.length-1;j>=0;j--)
		     {
		    	 list.push(num[j]);
		     }
		     }
		     bufferedReader.close();

		     int pos=list.searchInt(list.head, n);
		     if(pos>=0)
		     {
		    System.out.println("*Number is found in file *");
		    System.out.println("*Number is deleted from linkedlist and file *");
		    System.out.println("updated list is :");
		    System.out.println("Deleted at " + pos); //for refrence 

		    list.deleteNode(pos);
			list.printList();
			}
		     else
		     {
		     System.out.println("*Number is not found in file*");
		     System.out.println("*Number is added  in linkedlist and file*");
		     System.out.println("updated list is :");
		     list.sortedInsert( list.newNode(n)); //created new node with number and inserted in list
		     list.printList();
		     }
		     File file = new File("/home/admin1/Desktop/file.txt");   // Step #2. Create a file writer object with above file

		     FileWriter fileWriter = new FileWriter(file);            // Step #3. Create a file object with above file writer.

		      	 BufferedWriter writer = new BufferedWriter(fileWriter);

		    // Step #4. Prepare data to be stored in above file
		      	 String str=list.intToString();

		   // Step #5. Perform write operation.
		         System.out.println("string "+str);

		writer.write(str);
		writer.close();
		     

		 } 
		 catch(FileNotFoundException ex)
		 {
		     System.out.println("Unable to open file " );                
		 }
		 catch(IOException ex) 
		 {
		     System.out.println("Error reading file");                  
		//catch if file is not found            
		     }
	}

}
