package io.github.fyggh.elevens;

import java.util.List;
import java.util.Random;
import java.util.ArrayList;

/**
 * The Deck class represents a shuffled deck of cards.
 * It provides several operations including
 *      initialize, shuffle, deal, and check if empty.
 */
public class Deck {

	/**
	 * cards contains all the cards in the deck.
	 */
	private List<Card> cards;

	/**
	 * size is the number of not-yet-dealt cards.
	 * Cards are dealt from the top (highest index) down.
	 * The next card to be dealt is at size - 1.
	 */
	private int size;
	
	/**
	 * rand is a random number generator used to shuffle the deck.
	 */
	private Random rand;


	/**
	 * Creates a new <code>Deck</code> instance.<BR>
	 * It pairs each element of ranks with each element of suits,
	 * and produces one of the corresponding card.
	 * @param ranks is an array containing all of the card ranks.
	 * @param suits is an array containing all of the card suits.
	 * @param values is an array containing all of the card point values.
	 */
	public Deck(String[] ranks, String[] suits, int[] values) {
		
		cards = new ArrayList<>();
		rand = new Random();
		size = 0;
		
		for (int i = 0; i < ranks.length; i++) {
			for (int j = 0; j < suits.length; j++) {
				
				cards.add(new Card(ranks[i], suits[j], values[i]));
				size++;
				
			}
		}
		
	}


	/**
	 * Determines if this deck is empty (no undealt cards).
	 * @return true if this deck is empty, false otherwise.
	 */
	public boolean isEmpty() {
		
		return (size == 0);
		
	}

	/**
	 * Accesses the number of undealt cards in this deck.
	 * @return the number of undealt cards in this deck.
	 */
	public int size() {

		return size;
		
	}

	/**
	 * Randomly permute the given collection of cards
	 * and reset the size to represent the entire deck.
	 */
	public void shuffle() {
		
		List<Card> shuffledCards = new ArrayList<>();
		
		while (cards.size() > 0) {
			shuffledCards.add(
					cards.remove(rand.nextInt(cards.size()))
					);
		}
		
		cards = shuffledCards;
		this.size = cards.size();
		
	}
	
	/**
	 * Randomly permute the undealt cards using an in-place algorithm
	 */
	public void inPlaceShuffle() {
		
		int swapIndex;
		
		for (int i = size - 1; i > 0; i--) {
			swapIndex = rand.nextInt(i);
			
			cards.add(i, cards.remove(swapIndex));
			cards.add(swapIndex, cards.remove(i - 1));
		}
		
	}
	
	/**
	 * Randomly permute the given collection of cards
	 * according to a realistic model
	 * and reset the size to represent the entire deck.
	 */
	public void realisticTotalShuffle() {
		int midpointIndex = (int) ((cards.size() / 2) + rand.nextGaussian() * 2);
		
		
	}

	/**
	 * Deals a card from this deck.
	 * @return the card just dealt, or null if all the cards have been
	 *         previously dealt.
	 */
	public Card deal() {
		if (this.isEmpty()) {
			return null;
		}
		else {
			size--;
			return cards.get(size);
		}
	}

	/**
	 * Generates and returns a string representation of this deck.
	 * @return a string representation of this deck.
	 */
	@Override
	public String toString() {
		String rtn = "size = " + size + "\nUndealt cards: \n";

		for (int k = size - 1; k >= 0; k--) {
			rtn = rtn + cards.get(k);
			if (k != 0) {
				rtn = rtn + ", ";
			}
			if ((size - k) % 2 == 0) {
				// Insert carriage returns so entire deck is visible on console.
				rtn = rtn + "\n";
			}
		}

		rtn = rtn + "\nDealt cards: \n";
		for (int k = cards.size() - 1; k >= size; k--) {
			rtn = rtn + cards.get(k);
			if (k != size) {
				rtn = rtn + ", ";
			}
			if ((k - cards.size()) % 2 == 0) {
				// Insert carriage returns so entire deck is visible on console.
				rtn = rtn + "\n";
			}
		}

		rtn = rtn + "\n";
		return rtn;
	}
}
