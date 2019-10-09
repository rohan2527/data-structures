package Com.Bridgelabaz.DataStructure;

import com.bridgeLabaz.utility.Queue;
import com.bridgeLabaz.utility.Utility;

public class BankCashCounter {
	static Utility utility=new Utility();
	static Queue Q=new Queue(10);
	static int cash=10000000;
	static int c;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String exit=new String();
		do{ Q.showStatus();
		System.out.println("toatal amount in cash is="+cash);

			System.out.println("1: Deposite Cash");
			System.out.println("2: Withdraw Cash");
			System.out.println("3. for Exit");
			 c=utility.integerInput();
			BankCashCounter.menuChoice(c);
		}while(c!=3);
		if(Q.isFull())
		{
			Q.deQueue();
		}
	}

	public static void menuChoice(int choice){
		switch(choice){
			case 1: Deposite();
					break;
			case 2: Withdraw();
					break;
			 default:System.out.println("Invalid Option");
		            break; 
		}
	}

	public static void Deposite(){
		System.out.println();
		System.out.println("1: Join In queue.");
		System.out.println("2:Exit");
		int n=Utility.integerInput();
		switch(n){
			case 1: try{
				System.out.println("please Enter amount you want to Deposite =");
				int amount=Utility.integerInput();
				Q.enQueue(amount);
				 cash = cash+amount;
		System.out.println("Amount deposited ="+amount);

				}catch(Exception exception){
						System.out.println("Queue is Full.");
					}
					break;
			case 2: System.exit(1);
					break;
		}
	}

	
	public static void Withdraw(){
		System.out.println();
		System.out.println("1: Join In queue.");
		System.out.println("2:Exit");
		int n=utility.integerInput();
		switch(n){
			case 1: try{
				System.out.println("please Enter amount you want to Withdraw =");
				int amount=Utility.integerInput();
				Q.enQueue(amount);
				 cash = cash-amount;
					System.out.println("Amount withdrawed ="+amount);

					}catch(Exception exception){
						System.out.println("Queue is Full.");
					}
					break;
			case 2: System.exit(1);
					break;
		}
	}

	}


