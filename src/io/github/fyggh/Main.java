package io.github.fyggh;

import java.util.List;
import java.util.Random;
import java.util.Scanner;

import io.github.fyggh.algorithms.helpers.RandomArrayList;
import io.github.fyggh.bankaccount.BankAccount;
import io.github.fyggh.bankaccount.SavingsAccount;
import io.github.fyggh.face.FaceViewer;
import io.github.fyggh.gui.FrameViewer;

public class Main {
	
	/**
	 * Number defined as one greater than FIFTY_THREE
	 */
	private final static int FIFTY_FOUR = 54;
	
	/**
	 * Number halfway between TWELVE and THIRTEEN
	 */
	private final static double TWELVE_POINT_FIVE = 12.5;
	
	Random rand = new Random(200503041L);
	private static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		 
//		System.out.println(GET_FIFTY_FOUR());
//		System.out.println(TWELVE_POINT_FIVE);
//		System.out.println(FIFTY_FOUR + (int) TWELVE_POINT_FIVE);

		//FrameViewer viewer = new FrameViewer();
		//viewer.initializeFrame();
		
//		FaceViewer viewer = new FaceViewer();
//		viewer.initializeFrame();
		//System.out.println(scan.nextInt());
		
		BankAccount acct1 = new BankAccount();
		System.out.println(acct1.getBalance());
		acct1.deposit(0.07);
		acct1.withdraw(0.05);
		System.out.println(acct1.getBalance());
		
		System.out.println();
		
		SavingsAccount acct2 = new SavingsAccount();
		acct2.deposit(FIFTY_FOUR);
		System.out.println(acct2.getBalance());
		acct2.addInterest();
		System.out.println(acct2.getBalance());
		SavingsAccount.setInterestRate(FIFTY_FOUR);
		acct2.addInterest();
		System.out.println(acct2.getBalance());
		
		List<Integer> list = new RandomArrayList<Integer>(null, 0);
	}

	/**
	 * @return the number defined as one greater than FIFTY_THREE
	 */
	public final static int GET_FIFTY_FOUR() {
		return FIFTY_FOUR;
	}

}
