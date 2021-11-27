package com.bank;

import java.util.Scanner;

public class Main {
	
	

	    public static void main(String[] args) {

	        Account abhaysAccount = new Account("Number",0.0,"Name","Email","PhoneNumber");
	        Scanner sc = new Scanner(System.in);
	        
	        System.out.println("Please Enter your Account Number: ");
	        String Number=sc.next();   
	        
	        System.out.println("Please Enter your Name: ");
	        String Name=sc.next();
	        
	        System.out.println("Please Enter your Email you want to register with Account: ");
	        String Email=sc.next();
	        
	        System.out.println("Please Enter your Phone Number you want to register with Account:: ");
	        String PhoneNumber=sc.next();
	        
	        System.out.println("Please enter the amount you want to deposite");
	        double Balance= sc.nextDouble();
	        

	        abhaysAccount.DepositMoney(0);
	        abhaysAccount.DepositMoney(0);

	        abhaysAccount.WithDrawMoney(0);
	    
	    }
	}

