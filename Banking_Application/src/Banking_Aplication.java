import java.util.Scanner;

public class Banking_Aplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BankAccont obj=new BankAccont("xyz", "ba001");
		obj.showMenu();
		
	}

}
class BankAccont{
	int balance;
	int previousTransaction;
	String customerName;
	String customerId;
	BankAccont( String cname, String cid){
		customerName=cname;
		customerId=cid;
	}
	
	
	
	void deposite(int amount) {
		if(amount != 0) {
			balance=balance+amount;
			previousTransaction =amount;
		}
	}
	void withdraw(int amount) {
		if(amount !=0) {
			balance=balance-amount;
			previousTransaction = -amount;
		}
	}
	void getPreviousTransaction() {
		if(previousTransaction>0) {
			System.out.println("Deposit"+ previousTransaction);
		}
		else if (previousTransaction<0){
			System.out.println("WIthdraw:"+Math.abs(previousTransaction));// to get positive vasllu
			
		} else {
			System.out.println("no transaction");
		}
	}
	void showMenu() {
		char option ='\0';
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Welcom "+ customerName);
		System.out.println(" Your ID is "+customerId);
		System.out.println("\n");
		System.out.println("A .chech balance");
		System.out.println("B . Deposit");
		System.out.println("C.Withdrow");
		System.out.println("D.privious transaation");
		System.out.println("E.Exite");
		do {
			System.out.println(".......................");
			System.out.println("etr options");
			System.out.println("=======================");
			option=sc.next().charAt(0);
			
			
			
			
			switch (option) {
			case 'A':
				System.out.println("----------------");
				System.out.println("Balance ="+balance);
				System.out.println("\n");
				System.out.println("...........");
				break;
				
			case 'B':
				System.out.println("----------------");
				System.out.println("etr amt of deposit");
			int amount =sc.nextInt();
			deposite(amount);
				System.out.println("...........");
				System.out.println("\n");
				break;

				
			case 'C':
				System.out.println("----------------");
				System.out.println("etr amt of wthidrow");
			int amount2 =sc.nextInt();
			withdraw(amount2);
				System.out.println("...........");
				System.out.println("\n");
				break;

			case 'D':
				System.out.println("----------------");
				getPreviousTransaction();
				System.out.println("etr amt of wthidrow");
			
				System.out.println("\n");
				break;

			case 'E':
				System.out.println("************");
				break;
			default:System.out.println("invalid option1!! plz try agin");
				break;
			}
		
		}while(option!='E');
		System.out.println("thankg fr usng server");
	
		
		
	}
	
}