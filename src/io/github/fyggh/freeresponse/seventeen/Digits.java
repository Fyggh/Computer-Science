package io.github.fyggh.freeresponse.seventeen;

import java.util.ArrayList;
import java.util.List;

public class Digits {
	
	private ArrayList<Integer> digitList;
	
	public Digits(int num) {

		digitList = new ArrayList<>();
		
		int mutableNum = num;

		do {
			digitList.add(0, mutableNum % 10);
			mutableNum /= 10;
		} while (mutableNum > 0);
		
	}
	
	public List<Integer> getArray() {
		return digitList;
	}
	
	public static void main(String[] args) {
		Digits d1 = new Digits(3051);
		System.out.println(d1.getArray());
		
		Digits d2 = new Digits(0);
		System.out.println(d2.getArray());
		
		String s = "aaaaX";
		int i = s.indexOf("X");
		String sub1 = s.substring(0, i);
		
	}

}
