package com.banking;

import java.util.Scanner;

public class Account {

	private String Number;
	private double Balance;
	private String Name;
	private String Email;
	private String PhoneNumber;

	public Account(String Number,double Balance,String Name,String Email ,String PhoneNumber, double DepositedMoney, double WithdrawalMoney){

		Scanner sc = new Scanner(System.in);

		System.out.println("Please Enter your Account Number: ");
		Number=sc.next();   

		System.out.println("Please Enter your Name: ");
		Name=sc.next();

		System.out.println("Please Enter your Email you want to register with Account: ");
		Email=sc.next();

		System.out.println("Please Enter your Phone Number you want to register with Account:");
		PhoneNumber=sc.next();

		System.out.println("\nYour Account has been Successfully created\n\n" + "Following are your Details you have entered:\n\n" + "Account Number: " +Number+ "\nName: " + Name+ "\nEmail: " +Email+ "\nPhone Number: " + PhoneNumber);

		System.out.println();
		System.out.println("Your current Balance is: " + Balance);
		System.out.println();

		{  
			while(true) {
				System.out.println("Welcome to Automated Teller Machine");  
				System.out.println("Press 1 for Withdraw");  
				System.out.println("Press 2 for Deposit");  
				System.out.println("Press 3 for Check Balance");  
				System.out.println("Press 4 for Account Details");  
				System.out.println("Press 5 for EXIT");  
				System.out.print("\nChoose the operation you want to perform:");  

				//user  
				int choice = sc.nextInt();  

				switch(choice)  
				{  
				case 1:  
					System.out.print("\nEnter money to be withdrawn:");  

					//withdrawal amount from user  
					WithdrawalMoney = sc.nextInt();  

					//check whether the balance is greater than or equal to the withdrawal amount  
					if(this.Balance - WithdrawalMoney < 0){
						System.out.println("\n"+Name+ ", Withdraw unseccessful only " + this.Balance+" is left");
					}else {
						this.Balance-=WithdrawalMoney;
						System.out.println("\n"+Name+ ", Withdraw successful, Current Balance is "+this.Balance);
					}

				case 2: 

					System.out.print("\nEnter money to be deposited:");  

					//amount from user  
					DepositedMoney = sc.nextInt();
					if(DepositedMoney<=0) {
						System.out.println("\nInvalid insertion!");
					}
					else {
						this.Balance+=DepositedMoney;
						System.out.println("\n"+Name+ ", Deposit is Successful, new Balance is " +this.Balance);

						break;  
					}
				case 3:  
					//displaying the total balance of the user  
					System.out.println("\nBalance : "+this.Balance);  
					System.out.println("");  
					break;  

				case 4:
					System.out.println("\nAccount Details:\n" + "\nAccount Number: " +Number+ "\nName: " + Name+ "\nEmail: " +Email+ "\nPhone Number: " + PhoneNumber);
					;

				case 5:  
					//exit from the menu  
					System.out.println("\nThank you "+Name+" for Banking with us.");
					System.exit(0);  
				}
				System.out.println();
			}

		}
	}
}
