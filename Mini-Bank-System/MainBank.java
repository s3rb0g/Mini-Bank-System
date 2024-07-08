import java.util.Scanner;
public class MainBank{
	
	public static void main(String args[]){
		
	Scanner scan = new Scanner(System.in);
	Bank bank = new Bank();

do{	
	System.out.println(" ");
	System.out.println("BANK SYSTEM");
	System.out.println("[1] - New Account");
	System.out.println("[2] - Deposit");
	System.out.println("[3] - Withdrawal");
	System.out.println("[4] - Exit ");
	System.out.println(" ");
	System.out.print("Option : ");
	int pick = scan.nextInt();
	
	if (pick == 1){
		System.out.println(" ");
		System.out.println("New Account");
		System.out.println("===========");
		
		System.out.print("Account Number : ");
		int id = scan.nextInt();
		System.out.print("Name : ");
		String name = scan.next();
		
		bank.setNewAccount(id, name);
		System.out.println("**********************");
		
	}
	else if (pick == 2){
		System.out.println(" ");
		System.out.println("Deposit");
		System.out.println("=======");
		
		System.out.print("Account Number : ");
		int accNum1 = scan.nextInt();
		
		bank.setDeposit(accNum1);
		System.out.println("**********************");
		
	}
	else if (pick == 3){
		System.out.print("Account Numer : ");
		int accNum2 = scan.nextInt();
		
		
		bank.setWithdrawal(accNum2);
		System.out.println("**********************");
		
	}
	else if (pick == 4){
		System.out.println("");
		System.out.println("Exit Program. Thank You.");
		break;
	}
	else{
		System.out.println(" ");
		System.out.println("Invalid input");
		System.out.println("**********************");
	}
}while(true);	
	}	
}