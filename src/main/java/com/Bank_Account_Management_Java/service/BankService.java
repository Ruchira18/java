package com.Bank_Account_Management_Java.service;
import java.util.Scanner;

import com.Bank_Account_Management_Java.dao.BankDao;
import com.Bank_Account_Management_Java.entity.BankAcc1;

public class BankService {
	BankDao bdao = new BankDao();
	Scanner ip = new Scanner(System.in);
	
	public boolean addAccount(int count)
	{
		while(count>0)
		{
			System.out.println("Enter the Account Details:");
			System.out.println("Enter Account No.: ");
			int AccNo = ip.nextInt();
			ip.nextLine();
			System.out.println("Enter Account Holder Name: ");
			String name = ip.nextLine();
			System.out.println("Enter the Account Type: ");
			String AccType = ip.nextLine();
			System.out.println("Enter the Balance: ");
			Double Balance = ip.nextDouble();
			
			BankAcc1 b = new BankAcc1(AccNo,name,AccType,Balance);
			bdao.addAccountRecord(b);
			count--;
		}
		return true;	
	}
	
	public BankAcc1 viewAccount(int AccNo)
	{
		return bdao.getAccountRecord(AccNo);
	}
	

	public boolean updateAccount(int AccNo)
	{
		System.out.println("Enter the Account Details:");
		System.out.println("Enter Account No.: ");
		int AccNo1 = ip.nextInt();
		ip.nextLine();
		System.out.println("Enter Account Holder Name: ");
		String name = ip.nextLine();
		System.out.println("Enter the Account Type: ");
		String AccType = ip.nextLine();
		System.out.println("Enter the Balance: ");
		Double Balance = ip.nextDouble();
		
		BankAcc1 b = new BankAcc1(AccNo1,name,AccType,Balance);
		bdao.updateAccountRecord(b);
		return true;
	}
	
	public Boolean withdraw(int AccNo)
	{
		System.out.println("Enter the Account Details:");
		System.out.println("Enter Account No.: ");
		int AccNo1 = ip.nextInt();
		ip.nextLine();
		System.out.println("Enter Account Holder Name: ");
		String name = ip.nextLine();
		System.out.println("Enter the Account Type: ");
		String AccType = ip.nextLine();
		System.out.println("Enter the Balance: ");
		Double Balance = ip.nextDouble();
		System.out.println("Enter the Amount for withdraw: ");
		Double amount = ip.nextDouble();
		BankAcc1 b = new BankAcc1(AccNo1,name,AccType,Balance);
		bdao.updateAccountRecord(b);
		return true;
	}
	
	public Boolean deposite(int AccNo)
	{
		System.out.println("Enter the Account Details:");
		System.out.println("Enter Account No.: ");
		int AccNo1 = ip.nextInt();
		ip.nextLine();
		System.out.println("Enter Account Holder Name: ");
		String name = ip.nextLine();
		System.out.println("Enter the Account Type: ");
		String AccType = ip.nextLine();
		System.out.println("Enter the Balance: ");
		Double Balance = ip.nextDouble();
		System.out.println("Enter the Amount for deposite: ");
		Double amount = ip.nextDouble();
		BankAcc1 b = new BankAcc1(AccNo,name,AccType,Balance);
		bdao.updateAccountRecord(b);
		return true;
	}
	
	public boolean deleteAccount(int AccNo)
	{
		return bdao.deleteAccountRecord(AccNo);
	}
}
