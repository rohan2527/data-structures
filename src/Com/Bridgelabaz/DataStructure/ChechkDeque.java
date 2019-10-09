package Com.Bridgelabaz.DataStructure;

import com.bridgeLabaz.utility.Deque;
import com.bridgeLabaz.utility.Utility;

public class ChechkDeque {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter size of Queue");
		int size=Utility.integerInput();
Deque dq=new Deque(size);
dq.addFront(3);
dq.addFront(4);
dq.addFront(6);
dq.showDeque();

	}

}
