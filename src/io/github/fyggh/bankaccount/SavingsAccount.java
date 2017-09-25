/**
 * 
 */
package io.github.fyggh.bankaccount;

import java.math.BigDecimal;

/**
 * @author 200503041
 *
 */
public class SavingsAccount extends BankAccount {

	private static double interestRate = 0.10;
	
	/**
	 * 
	 */
	public SavingsAccount() {
		super();
	}

	/**
	 * @param balance
	 * @param name
	 * @param accountNumber
	 */
	public SavingsAccount(double balance, String name, int accountNumber) {
		super(balance, name, accountNumber);
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * 
	 */
	public double addInterest() {
		double newBalance = getBalance() + (getBalance() * interestRate);
		this.setBalance(newBalance);
		return getBalance();
	}
	
	/**
	 * @return the interestRate
	 */
	public static double getInterestRate() {
		return interestRate;
	}

	/**
	 * @param interestRate the interestRate to set
	 */
	public static void setInterestRate(double interestRate) {
		SavingsAccount.interestRate = interestRate;
	}

}
