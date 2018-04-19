/**
 * 
 */
package io.github.fyggh.bettercardgame;

import java.util.ArrayList;

/**
 * @author 200503041
 * @param <E>
 *
 */
public class Deck<E> extends ArrayList<Card> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 520721790926502595L;

	public void populate() {
		for (Suit suit : Suit.values()) {
			for (Rank rank : Rank.values()) {
				this.add(new Card(rank, suit));
			}
		}
	}
	
	public void shuffle() {
		
	}
	
}
