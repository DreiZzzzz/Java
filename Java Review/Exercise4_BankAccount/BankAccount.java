public class BankAccount {
	private int id;
	private String accountName;
	private double cashBalance;

	public BankAccount(int id, String accountName) {
		this.id = id;
		this.accountName = accountName;
		this.cashBalance = 0; 
	}
	public BankAccount(int id, String accountName, double initialBalance) {
		this(id, accountName);
		this.cashBalance = initialBalance; 
	}

	public int getID() {
		return this.id;
	}
	public String getAccountName() {
		return this.accountName;
	}
	public double getCashBalance() {
		return this.cashBalance;
	}


	public boolean creditCash(double creditAmount) {
		if (creditAmount > 0) {
			this.cashBalance += creditAmount;
			return true;
		}
		else {
			return false;
		}
	}
	public boolean debitCash(double debitAmount) {
		if (this.cashBalance >= debitAmount) {
			this.cashBalance -= debitAmount; 
			return true;
		}
		else {
			return false;
		}
	}


	public String accountInquiry() {
		return getID() + " " + getAccountName() + ": " + getCashBalance();  
	}
}

