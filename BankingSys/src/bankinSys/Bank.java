package bankinSys;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Bank {
	
	
	public static void main(String agr[]) {
		
		
		List<Customer> customers =new ArrayList<>();
	    List<Account> accounts= new ArrayList<>();
		Customer customer1=new Customer(101,"umesh",1012);
		Customer customer2=new Customer(102,"rohit",1013);
		Customer customer3=new Customer(103,"akshay",1014);
		 customers.add(customer1);
		 customers.add(customer2);
		 customers.add(customer3);
		
		
		Account acc1=new Account(201, customer1, 10000.0);
		Account acc2=new Account(202, customer2, 150000.0);
		Account acc3=new Account(203, customer3, 200000.0);
		accounts.add(acc1);
		accounts.add(acc2);
		accounts.add(acc3);
		
		
		System.out.println(accounts);
		
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Find Customer");
            System.out.println("4. Find Account ");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            
            if (choice == 1) {
                System.out.print("Enter account number: ");
                int accountNumber = scanner.nextInt();
                System.out.print("Enter amount to deposit: ");
                double amount = scanner.nextDouble();
                List<Account> acc= accounts.stream().filter(x->x.getAccNo()==accountNumber).collect(Collectors.toList());
                Account account = acc.get(0);
                if (account != null && account.depositing(amount)) {
                    System.out.println("Deposit successful.");
                    System.out.println(account);
                } else {
                    System.out.println("Failed to deposit.");
                }
                


		}
            if (choice == 2) {
            	System.out.print("Enter account number: ");
                int accountNumber = scanner.nextInt();
                System.out.print("Enter amount to withdraw: ");
                double amount = scanner.nextDouble();
                List<Account> acc= accounts.stream().filter(x->x.getAccNo()==accountNumber).collect(Collectors.toList());
                Account account = acc.get(0);
                if (account != null && account.withdrawing(amount)) {
                    System.out.println("Deposit successful.");
                    System.out.println(account);
                } else {
                    System.out.println("Failed to deposit.");
                }
	}			
            if(choice==3) {
            	System.out.print("Enter Customer ID: ");
            	int customerId = scanner.nextInt();
            	List<Customer> cust=customers.stream().filter(x->x.getId()==customerId).collect(Collectors.toList());
            	
            	if (cust != null) {
                    System.out.println("Customer Details");
                    System.out.println(cust);
                } else {
                    System.out.println("Customer Not find");
                }
            	
            	
            }
            
            if(choice==4) {
            	System.out.print("Enter account number: ");
            	int accountNo = scanner.nextInt();
            	List<Account> acc=accounts.stream().filter(x->x.getAccNo()==accountNo).collect(Collectors.toList());
            	Account account= acc.get(0);
            	if (account != null) {
                    System.out.println("Account Details");
                    System.out.println(account);
                } else {
                    System.out.println("Account Not find");
                }
            	
            	
            }
            else if (choice == 5) {
                System.out.println("Exiting...");
                break;
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
}
}
}
