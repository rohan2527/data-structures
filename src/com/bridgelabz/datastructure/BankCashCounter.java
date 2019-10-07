package com.bridgelabz.datastructure;

import java.util.Queue;

import com.bridgelabz.utility.Utility;

public class BankCashCounter {

		// TODO Auto-generated method stub
		
			static Utility utility=new Utility();
			static Queue<Integer> withdrawQueue= new Queue<Integer>();
			static Queue<Integer> depositeQueue= new Queue<Integer>();

			
			public static void main(String args[]){
				BankCashCounter queueDemo=new BankCashCounter();
				Utility utility=new Utility();

				String exit=new String();
				do{
					System.out.println("1: Deposite Cash");
					System.out.println("2: Withdraw Cash");
					System.out.println("3: Withdraw Queue size");
					System.out.println("4: Deposite Queue size");
					BankCashCounter.menuChoice(utility.integerInput());
					System.out.println("Press E to exit");
					exit=queueDemo.utility.stringInput();		
				}while(!exit.equalsIgnoreCase("E"));
			}

			public static void menuChoice(int choice){
				switch(choice){
					case 1: Deposite();
							break;
					case 2: Withdraw();
							break;
					case 3: System.out.println("withdraw Queue size is: "+withdrawQueue.size());
							break;
					case 4: System.out.println("Deposite Queue size is: "+depositeQueue.size());
							break;
				}
			}

			public static void Deposite(){
				System.out.println();
				System.out.println("1: Join In queue.");
				System.out.println("2: Get service (Leave Queue).");
				int n=utility.integerInput();
				switch(n){
					case 1: try{
								depositeQueue.enQueue( Integer(1));
							}catch(Exception exception){
								System.out.println("Queue is Full.");
							}
							break;
					case 2: try{
								depositeQueue.deQueue();
							}catch(Exception exception){
								System.out.println("Queue is Empty.");
							}
							break;
				}
			}

			private Object Integer(int i) {
				// TODO Auto-generated method stub
				return null;
			}
			public static void Withdraw(){
				System.out.println();
				System.out.println("1: Join In queue.");
				System.out.println("2: Get service (Leave Queue).");
				int n=utility.integerInput();
				switch(n){
					case 1: try{
								withdrawQueue.enQueue(new Integer(1));
							}catch(Exception exception){
								System.out.println("Queue is Full.");
							}
							break;
					case 2: try{
								withdrawQueue.deQueue();
							}catch(Exception exception){
								System.out.println("Queue is Empty.");
							}
							break;
				}
			}
		}
	}

}
