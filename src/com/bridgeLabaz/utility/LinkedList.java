package com.bridgeLabaz.utility;

public class LinkedList<T> {
	 public Node head;  // head of list 
	  
	    /* Linked list Node*/
	    class Node <T>
	    { 
	      T data; 
	        Node <T> next; 
	        Node(T d)
	        {
	        	data = d; 
	        	next = null; 
	        }
		} 
	    
	   
	    /* Inserts a new Node at front of the list. */
	    public <T> void push(T new_data) 
	    { 
	        /* 1 & 2: Allocate the Node & 
	                  Put in the data*/
	        Node new_node = new Node(new_data); 
	  
	        /* 3. Make next of new Node as head */
	        new_node.next = head; 
	  
	        /* 4. Move the head to point to new Node */
	        head = new_node; 
	    } 
	    public void printList() 
	    { 
	        Node temp = head; 
	        while (temp != null) 
	        { 
	            System.out.println(temp.data+" "); 
	            temp = temp.next; 
	        } 
	    } 
	    public  int searchWord(Node head,String w)
	    {
	    	Node temp=head;
	    	int pos=0;
	     while(temp!=null)
			{
	    	 if( w.compareTo( (String) temp.data)==0)
	    	 {	   
	    		return pos;
	    	 }
	    	pos++;
	    	 temp=temp.next;
			}
	     return -1;
		}
	    public <T> int searchInt(Node head,int n)
	    {
	    	Node temp=head;
	    	int pos=0;
	     while(temp!=null)
			{
	    	 if(Integer.compare((int) temp.data, n)==0)
	    	 {	   
	    		return pos;
	    	 }
	    	pos++;
	    	 temp=temp.next;
			}
	     return -1;
	    }
	   public void deleteNode(int position) 
	    { 
	        // If linked list is empty 
	        if (head == null) 
	            return; 
	  
	        // Store head node 
	        Node temp = head; 
	  
	        // If head needs to be removed 
	        if (position == 0) 
	        { 
	            head = temp.next;   // Change head 
	            return; 
	        } 
	  
	        // Find previous node of the node to be deleted 
	        for (int i=0; temp!=null && i<position-1; i++) 
	            temp = temp.next; 
	  
	    
	        // Node temp->next is the node to be deleted 
	        // Store pointer to the next of node to be deleted 
	        Node next = temp.next.next; 
	  
	        temp.next = next;  // Unlink the deleted node from list 
	    } 
	  public  String intToString () {
        String result = "";
        Node current = head;
        while(current!= null)
        {
     	   
            result =result+ Integer.toString((int) current.data) +" ";
           
            current = current.next;
        }
        return  result;
}
	  public  String wordsToString () {
       String result = "";
       Node current = head;
       while(current!= null)
       {
    	   
           result =result+ current.data+" ";
          
           current = current.next;
       }
       return  result;
}
	  public Node newNode(int data) 
	    { 
	       Node x = new Node(data); 
	       return x; 
	    } 
	  
	  public void sortedInsert(Node new_node) 
	    { 
	         Node current; 
	  
	         /* Special case for head node */
	         if (head == null ||Integer.compare((int) new_node.data,(int) head.data)<0) 
	         { 
	            new_node.next = head; 
	            head = new_node; 
	         } 
	         else { 
	  
	            /* Locate the node before point of insertion. */
	            current = head; 
	  
	            while (current.next != null ) 
	            {
	            	if(Integer.compare((int) current.data,(int) new_node.data)<0&&Integer.compare((int) current.next.data,(int) new_node.data)>0)
	            {
	            	 new_node.next = current.next; 
	     	            current.next = new_node; 
	     	            break;
	            } 
	            	
	            	current = current.next;             	
	            }		
	            
	            if(current.next==null)	
	            {
	            	 current.next = new_node;
	            	 new_node.next=null;
	            }
	  
	          
	         } 
	     } 
	  
}
