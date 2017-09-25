package io.github.fyggh.bankaccount;

public class BankAccount {

	/**
	 * the amount of money in a given account
	 */
	private double balance;
	private String name;
	private int accountNumber;
	
	private static final double DEFAULT_BALANCE = 0.0;
	private static final String DEFAULT_NAME = "";
	private static final int DEFAULT_ACCOUNT_NUMBER = 111111111;
	
	/**
	 * 
	 */
	public BankAccount() { //default constructor
		this(DEFAULT_BALANCE, DEFAULT_NAME, DEFAULT_ACCOUNT_NUMBER);
	}


	/**
	 * @param balance
	 * @param name
	 * @param accountNumber
	 */
	public BankAccount(double balance, String name, int accountNumber) {
		super();
		this.setBalance(balance);
		this.setName(name);
		this.setAccountNumber(accountNumber);
	}


	public double deposit(double money) {
		this.setBalance(this.getBalance() + money);
		return this.getBalance();
	}


	public double withdraw(double money) {
		this.setBalance(this.getBalance() - money);
		return this.getBalance();
	}


	/**
	 * @return the balance
	 */
	public double getBalance() {
		return balance;
	}


	/**
	 * @param balance the balance to set
	 */
	protected void setBalance(double balance) {
		this.balance = balance;
	}


	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}


	/**
	 * @param name the name to set
	 */
	private void setName(String name) {
		this.name = name;
	}


	/**
	 * @return the accountNumber
	 */
	public int getAccountNumber() {
		return accountNumber;
	}


	/**
	 * @param accountNumber the accountNumber to set
	 */
	private void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	
}
