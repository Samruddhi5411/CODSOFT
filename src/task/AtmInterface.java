package task;

import java.util.Scanner;
 


class userAccount{
	
	private double totalAmount;
	
	
	 userAccount(double balance) {
        this.totalAmount = balance;
	}
	
	public double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}

	public void withDraw(double amount) {
		
		if(amount<=0 && amount > totalAmount) {
			
			System.out.println("Enter valid amount");
		} else {
			 totalAmount = totalAmount - amount;
			 System.out.println("Withdraw successfully");
			System.out.println("Total Amount after withdraw : " + totalAmount);
		}
	}
	
	public void deposite(double amount) {
		if(amount< 0 ) {
			System.out.println("enter valid number");
		} else {
			totalAmount = totalAmount + amount;
			System.out.println("deposited successfully");
			System.out.println("Total amount after deposite : " + totalAmount);
		}
	}
	
}
	
	class AtmMachine{
		
		private userAccount account;
		
	      AtmMachine(userAccount account) {
			this.account = account;
		}
		
	      public void menu() {
	    	  Scanner sc = new Scanner(System.in);
	    	  int choice;
	    	  do {
	    		 System.out.println("");
	    		System.out.println("ATM Menu");  
	    	    System.out.println("1. Check Balance");
    	        System.out.println("2. Withdraw");
     	        System.out.println("3. Deposit");
    	        System.out.println("4. Exit");
    	        System.out.print("Make Choice : ");
    	        choice = sc.nextInt();
    	        switch(choice) {
    	        case 1 :
    	        	    System.out.println("Current Balance : " + account.getTotalAmount());
    	        	    break;
    	        case 2 :
    	        	    System.out.print("Enter amount want to Withdraw : ₹ " );
    	        	 
    	        	    double withdrawAmount = sc.nextDouble();
    	        	    account.withDraw(withdrawAmount);
    	        	    break;
    	        case 3 : 
    	        	    System.out.print("Enter amount want to Deposite : ₹ ");
    	        	 
    	        	    double depositedAmount = sc.nextDouble();
    	        	    account.deposite(depositedAmount);
    	        	    break;
    	        case 4 :
    	        	System.out.println("Exit ... Thank you !");
    	        	break;
    	        default :
    	        	System.out.println("Enter the valid choice");
    	        	
    	        }
	      }while(choice != 4);
	      }
	      
		
	}

	


  
 
public class AtmInterface {

	public static void main(String[] args) {
		userAccount  user = new userAccount(50000);
		AtmMachine machine = new AtmMachine(user);
		machine.menu();
		

		 
		  
	}

}
