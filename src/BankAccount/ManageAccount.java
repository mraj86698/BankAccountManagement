package BankAccount;

import java.util.Scanner;

public class ManageAccount {


	private static int accountBalance = 50000;

	public static int getAccountBalance() {
		return accountBalance;
	}

	public static void setAccountBalance(int accountBalance) {
		ManageAccount.accountBalance = accountBalance;
	}


	public void addbalance() {
		System.out.println("\nPlease Enter the Amount to add");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		accountBalance += input;
		System.out.println("Amount Added Sucessfully");
		System.out.println("\nPress 2 to view account Balance");
		int acc = sc.nextInt();
		if (acc == 2) {
			System.out.println("Your account balance is " + accountBalance);
		}
	}

	public void view() {
		System.out.println("Your account balance is " + accountBalance);

	}

	public void withdraw() {
		System.out.println("Enter the amount for withdraw");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		if (input <= 0) {
			System.out.println("Please Enter Valid Amount");
		} else if (input > accountBalance) {
			System.out.println("Insufficient Fund !!");
		} else {
			System.out.println("Please wait ");
			System.out.println(".......");
			System.out.println("Balance withdrawal sucessfully");
			accountBalance -= input;
			System.out.println("\nAvailable Balance is " + accountBalance);
		}
	}
}
