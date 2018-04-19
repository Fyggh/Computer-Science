/**
 * 
 */
package io.github.fyggh.bettercardgame;

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
		
		deck.add(new Card(Rank.FOUR, Suit.SPADES, 5));
		deck.add(new Card(Rank.FOUR, Suit.SPADES, 5));
		deck.add(new Card(Rank.FIVE, Suit.SPADES, 5));
		deck.add(new Card(Rank.TEN, Suit.HEARTS, 10));
		
		for (int i = 0; i < deck.size(); i++) {
			for (int j = i + 1; j < deck.size(); j++) {
				System.out.printf("Comparing %s and %s... %b\n",
						deck.get(i).toString(),
						deck.get(j).toString(),
						deck.get(i).matches(deck.get(j)));
				//System.out.printf(format, args)
			}
		}
		
		System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
		
		Deck<Card> otherDeck = new Deck<>();
		otherDeck.populate();
		compareCardPairs(otherDeck);
		
		

	}
	
	public static void compareCardPairs(List<Card> deck) {
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
