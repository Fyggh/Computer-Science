/**
 * 
 */
package io.github.fyggh.cardgame;

import java.util.ArrayList;
import java.util.List;
import io.github.fyggh.bettercardgame.Rank;
import io.github.fyggh.bettercardgame.Suit;

import io.github.fyggh.bettercardgame.Rank;

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
		
		String[] ranks = {"ACE", "2", "3", "4", "5", "6", "7", "8", "9", "10", "JACK", "QUEEN", "KING"};
		String[] suits = {"CLUBS", "DIAMONDS", "HEARTS", "SPADES"};
		int[] values = {1,2,3,4,5,6,7,8,9,10,10,10,10};
		
		
//		deck.add(new Card("4", "Spades", 5));
//		deck.add(new Card("4", "Spades", 5));
//		deck.add(new Card("5", "Spades", 5));
//		deck.add(new Card("10", "Hearts", 10));
//		
//		for (int i = 0; i < deck.size(); i++) {
//			for (int j = i + 1; j < deck.size(); j++) {
//				System.out.printf("Comparing %s and %s... %b\n",
//						deck.get(i).toString(),
//						deck.get(j).toString(),
//						deck.get(i).matches(deck.get(j)));
//				//System.out.printf(format, args)
//			}
//		}
		
		Deck otherDeck = new Deck(ranks, suits, values);
		otherDeck.deal();
		otherDeck.deal();		
		System.out.println(otherDeck.toString());
		
		Deck smallDeck = new Deck(new String[]{"ACE"}, new String[]{"SPADES"}, new int[]{1});
		System.out.println(smallDeck);
		
		smallDeck.deal();
		System.out.println(smallDeck);
		
		System.out.println(smallDeck.deal());
		System.out.println(smallDeck);
		


	}

}
