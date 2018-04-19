/**
 * 
 */
package io.github.fyggh.cardgame;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 200503041
 *
 */
public class CardTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		List<Card> deck = new ArrayList<>();
		
		deck.add(new Card("4", "Spades", 5));
		deck.add(new Card("4", "Spades", 5));
		deck.add(new Card("5", "Spades", 5));
		deck.add(new Card("10", "Hearts", 10));
		
		for (int i = 0; i < deck.size(); i++) {
			for (int j = i + 1; j < deck.size(); j++) {
				System.out.printf("Comparing %s and %s... %b\n",
						deck.get(i).toString(),
						deck.get(j).toString(),
						deck.get(i).matches(deck.get(j)));
				//System.out.printf(format, args)
			}
		}
		
		

	}

}
