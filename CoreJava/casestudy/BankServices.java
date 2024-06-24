package casestudy;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class BankServices {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		HashMap<Long, Account> accounts = new HashMap<Long, Account>();

		HashMap<Byte, Transaction> transactions = new HashMap<Byte, Transaction>();

		String accHolderName;

		Long contactNo;

		Long accNo;

		String typeOfAccount;

		float balance = 0;

		Account account;
		boolean value = true;

		while (value) {
			System.out.println("Welcome to banking services");
			System.out.println("---------------------------");

			System.out.println("1.Create an account");
			System.out.println("2.Balance check");
			System.out.println("3.Check account details");
			System.out.println("4.Deposit");
			System.out.println("5.Withdraw");
			System.out.println("6.FundTransfer");
			System.out.println("7.Bank Statement \n");

			System.out.print("Please select your option:-");
			byte option = scan.nextByte();
			System.out.println();

			switch (option) {
			case 1: {
				System.out.println("Create an account");

				System.out.print("Please enter your name:-");
				accHolderName = scan.next();

				System.out.print("Please enter your contact number:-");
				contactNo = scan.nextLong();

				System.out.print("Please enter your type of account:-");
				typeOfAccount = scan.next();

				accNo = contactNo - 93874534;

				account = new Account(accHolderName, contactNo, accNo, typeOfAccount, balance);

				accounts.put(accNo, account);

				System.out.println("Your account is created successfully");
				System.out.println("Your account number is :-" + accNo);
				System.out.println("                           ------------");

				System.out.println("\n \n \n");

				break;
			}
			case 2: {
				System.out.println("Balance Check");

				System.out.print("Please enter your account number:-");
				accNo = scan.nextLong();

				account = accounts.get(accNo);

				float AccountBalance = account.getBalance();

				System.out.println("The current balance is :-" + AccountBalance);
				System.out.println("\n \n \n");

				break;
			}
			case 3: {
				System.out.println("Check Account details");

				System.out.print("Please enter your account number:-");
				accNo = scan.nextLong();

				account = accounts.get(accNo);

				System.out.println(account);

				System.out.println("\n \n \n");

				break;
			}
			case 4: {
				System.out.println("Deposit");

				System.out.print("Please enter your account number:-");
				accNo = scan.nextLong();

				System.out.print("Please enter your deposit amount:-");
				float depositAmount = scan.nextFloat();

				account = accounts.get(accNo);

				float existingAmount = account.getBalance();

				float finalAmount = existingAmount + depositAmount;

				account.setBalance(finalAmount);

				System.out.println("Your amount is credited successfully");

				System.out.println("The current balance is:-" + finalAmount);

				accounts.put(accNo, account);

				Random random = new Random();

				byte transId = (byte) random.nextInt();

				LocalDate date = LocalDate.now();

				Transaction trans = new Transaction(transId, date, "deposit", depositAmount, 0, finalAmount);

				transactions.put(transId, trans);

				System.out.println("\n \n \n");

				break;
			}
			case 5: {
				System.out.println("Withdraw");

				System.out.print("Enter your account number:-");
				accNo = scan.nextLong();

				System.out.print("Enter your withdrawl amount:-");
				float withdrawalAmount = scan.nextFloat();

				account = accounts.get(accNo);

				float existingBalance = account.getBalance();

				float finalAmount = existingBalance - withdrawalAmount;

				account.setBalance(finalAmount);

				System.out.println("Your amount is debited successfully");
				System.out.println("The current balance is:-" + finalAmount);

				accounts.put(accNo, account);

				Random random = new Random();

				byte transId = (byte) random.nextInt();

				LocalDate date = LocalDate.now();

				Transaction trans = new Transaction(transId, date, "withdrawl", 0, withdrawalAmount, finalAmount);

				transactions.put(transId, trans);

				System.out.println("\n \n \n");

				break;
			}
			case 6: {
				System.out.println("Fund Transfer");

				System.out.print("Enter your account number:-");
				long fromAccNum = scan.nextLong();

				System.out.print("Enter your to account number:-");
				long toAccNum = scan.nextLong();

				System.out.print("Enter your transfer amount :-");
				float transferAmount = scan.nextFloat();

				Account fromAccount = accounts.get(fromAccNum);

				Account toAccount = accounts.get(toAccNum);

				float existingAmount = fromAccount.getBalance();

				float toExiAmount = toAccount.getBalance();

				float fromfinalAmount = existingAmount - transferAmount;

				float tofinalAmount = toExiAmount + transferAmount;

				fromAccount.setBalance(fromfinalAmount);

				toAccount.setBalance(tofinalAmount);

				System.out.println("Your amount is transffered successfully");

				System.out.println("The current balance is :-" + fromfinalAmount);

				Random random = new Random();

				byte transId = (byte) random.nextInt();

				LocalDate date = LocalDate.now();

				Transaction trans = new Transaction(transId, date, "fundTransfer", 0, transferAmount, fromfinalAmount);
				
				transactions.put(transId, trans);
				
				System.out.println("\n \n \n");

				break;
			}
			case 7: {
				System.out.println("Print Bankstatment");
				System.out.println("------------------");
				
				System.out.printf("%-15s%-15s%-15s%-15s%-15s%-15s","transId","Date","typeOfTrans","Credits","Debits","Balance");
				
				System.out.println();
				Set<Byte> set = transactions.keySet();
				
				for(Byte key :set) {
					
					Transaction trans = transactions.get(key);
					
					System.out.println(trans.getTransId()+"            "+trans.getDate()+"     "+trans.getTypeOfTrans()+"     "+trans.getCredits()+"     "+trans.getDebits()+"     "+trans.getAmount());
				}
				
				
				value = false;
				System.out.println("\n \n \n");
				
				break;
			}
			default: {
				System.out.println("Thank you");
				break;
			}
			}
		}

	}
}
