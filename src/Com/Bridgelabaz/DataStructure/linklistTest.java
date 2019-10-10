package Com.Bridgelabaz.DataStructure;

import com.bridgeLabaz.utility.LinkedList;

public class linklistTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LinkedList list=new LinkedList();
list.insertAtLast(3);
//list.deleteAtLast();
list.insertAtLast(4);
list.insertAtLast(8);
list.insertAtLast(9);
list.instertAtFirst(10);
list.insertAtPos(4,5);
list.deleteAtfirst();
list.printList();
System.out.println("#####");
list.deleteAtPos(7);
list.printList();

	}

}
