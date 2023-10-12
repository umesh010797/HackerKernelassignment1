package bankinSys;

public class Account {
	private int accNo;
	private Customer accHolder;
	private double balance;
	
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Account(int accNo, Customer accHolder, double balance) {
		super();
		this.accNo = accNo;
		this.accHolder = accHolder;
		this.balance = balance;
	}
	public int getAccNo() {
		return accNo;
	}
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	public Customer getAccHolder() {
		return accHolder;
	}
	public void setAccHolder(Customer accHolder) {
		this.accHolder = accHolder;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalances(double balance) {
		this.balance = balance;
	}
	
	public boolean depositing (double amount) {
		 if (amount > 0) {
	            balance += amount;
	            return true;
	        }
	        return false;
	}
	public boolean withdrawing  (double amount) {
		if (amount > 0 && amount <= balance) {
            balance -= amount;
            return true;
        }
        return false;
	}

	@Override
	public String toString() {
		return "accNo=" + accNo + ", accHolder=" + accHolder.getName() + ",contactNo="+accHolder.getContactNo()+", balance=" + balance  ;
	}
	
	
}
