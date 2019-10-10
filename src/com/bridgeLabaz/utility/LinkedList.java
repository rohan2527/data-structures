package com.bridgeLabaz.utility;

public class LinkedList<T> {
	 public  Node head;  // head of list 
	public int size;
	  
	    /* Linked list Node*/
	    class Node <T>
	    { 
	      T data; 
	        Node <T> next; 
	        Node(T d)
	        {
	        	data = d; 
	        	next = null; 
	        	size=0;
	        }
		} 
	    
	   
	    /* Inserts a new Node at front of the list. */
	    public <T> void instertAtFirst(T new_data) 
	    { 
	        /* 1 & 2: Allocate the Node & 
	                  Put in the data*/
	        Node new_node = new Node(new_data); 
	  
	        /* 3. Make next of new Node as head */
	        new_node.next = head; 
	  
	        /* 4. Move the head to point to new Node */
	        head = new_node; 
	        size++;
	    }
	    public <T> void insertAtLast(T data) 
	    {	Node New_Node=new Node(data);
	    	Node current=head;
	    	New_Node.next=null;
	    	if(head==null)
	    	{
	    		instertAtFirst(data);
	    		head=New_Node;
	    		return;
	    	}
	    	
	    	while(current.next!=null)
	    	{
	    		current=current.next;
	    	}
	    	current.next=New_Node;
	    	size++;
	    	return;
	    	
	    }
	    public  void deleteAtfirst()
	    {Node current=head;
	    	if(head==null)
	    {
	    	System.out.println("List is empty");
	    	return;
	    }
	    	if (head.next==null)
	    	{
	    		head=null;
	    		size--;
	    		return;
	    	}
	    else
	    {
	    	head=head.next;
	    	size--;
	    }
	    }
	    public  void deleteAtLast()
	    {Node current=head;
	    	if(head==null)
	    {
	    	System.out.println("List is empty");
	    	return;
	    }
	    	if (head.next==null)
    	{
    		head=null;
    		size --;
    		return;
    	}
	    else
	    	while(current.next.next!=null)
	    	{
	    		current=current.next;
	    	}
	    	current.next=null;
	    	size--;
	    }
	  
	    public <T> void insertAtPos(int pos,T data) 
	    { if(pos>size)
	    {
	    	System.out.println("invalid position");
	    	return;
	    }
	    	Node New_Node = new Node(data);
	    Node current=head;
			if(pos==0)
	    {
	    	instertAtFirst(data);
	    }
			else
	    {
	    	for(int i=1;i<pos;i++)
	    	{
	    		current=current.next;
	    	}
	    	New_Node.next=current.next;
	    	current.next=New_Node;
	    	size++;
	    }
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
	    public int size()
	    {
			return size;
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
	   public void deleteAtPos(int position) 
	    { 
		   if(position>size)
		    {
		    	System.out.println("invalid position");
		    	return;
		    }
	        // If linked list is empty 
	        if (head == null) 
	            return; 
	  
	        // Store head node 
	        Node temp = head; 
	  
	        // If head needs to be removed 
	        if (position == 0) 
	        { 
	            head = temp.next;  // Change head
	            size--;
	            return; 
	        } 
	  
	        // Find previous node of the node to be deleted 
	        for (int i=1; temp!=null && i<position-1; i++) 
	            temp = temp.next; 
	  
	    
	        // Node temp->next is the node to be deleted 
	        // Store pointer to the next of node to be deleted 
	        Node next = temp.next.next; 
	        
	        temp.next = next;  // Unlink the deleted node from list 
	        size--;
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
	         if (head == null ) 
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
	  public <T> T lastNode()
	  {
		  Node current=head;
		  while(current.next!=null)
		  {
			 current=current.next;
		  }
		  Node last=current.next;
		 return (T) last.data;
	  }
	  
	  public <T> T firstNode()
	  {
		  return (T) head.data;
	  }
}
