import java.util.Scanner;
import java.util.ArrayList;
public class Bank extends MainBank {
	
	static ArrayList <Integer> ID = new ArrayList <>();
	static ArrayList<String> NAME = new ArrayList<>();
	static ArrayList<Double> MONEY = new ArrayList<>();
	static Scanner scan1 = new Scanner(System.in);
	
	static int loop1 = 0;
	static int loop2 = 0;
	static double total1;
	static double total2;
	
    public static void setNewAccount(int newId, String newName) {
    	ID.add(newId);
    	NAME.add(newName);
    	MONEY.add(0.0);
    	
    }
    
    public static void setDeposit(int newId){
    if(ID.contains(newId)){
    	System.out.print("Amount deposit : ");
		int accDep = scan1.nextInt();
		
    	do{
    		if(newId == ID.get(loop1)){
    			double num1 = MONEY.get(loop1);
    			compute1(num1, accDep);
    			
    		MONEY.set(loop1, total1);
    			break;   		
    		}
    		else{
    			loop1++;
    		}
    	}while(true);	
   	
    }else{
    	System.out.println("Id number can't find");
    }
    
    }
    
    public static void setWithdrawal(int newIdd){
    if(ID.contains(newIdd)){
    	System.out.print("Amount withdrawal : ");
		double accWith = scan1.nextInt();
		
    	do{
    		if(newIdd == ID.get(loop2)){
    			double gMoney = MONEY.get(loop2);
    			compute2(gMoney, accWith);	
    			
    		MONEY.set(loop2, total2);
    		
    		System.out.println(" ");
    		System.out.println("Remarks:");
    		System.out.println("Ammount Balance: " + MONEY.get(loop2));
    		break;
    		}
    		else{
    			loop2++;
    		}
    	}while(true);	
   	
    }else{
    	System.out.println("Id number can't find");
    }    	
    }
    
    public static void compute1(double num1, double num2){
    	total1 = num1 + num2; 
    		
    }
    
    public static void compute2(double num1, double num2){
    	total2 = num1 - num2; 
    		
    }
}