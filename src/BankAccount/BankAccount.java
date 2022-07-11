package BankAccount;

import java.util.Scanner;

public class BankAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while (true) {
			System.out.println("\nWelcome to Bank Account Management");
			System.out.println("\nEnter Input 1  Add Balance");
			System.out.println("Enter Input 2 View Balance");
			System.out.println("Enter Input 3 Withdraw Balance");

			ManageAccount account = new ManageAccount();
			Scanner scanner = new Scanner(System.in);
			int input = scanner.nextInt();

				switch (input) {
				case 1:
					account.addbalance();

					break;
				case 2:
					account.view();
					break;
				case 3:
					account.withdraw();
					break;
				}
			}
		}


}
