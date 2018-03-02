/**
 * 
 */
package io.github.fyggh.madlibs;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author 200503041
 *
 */
public class Madlibs {
	
	List<String> nouns = new ArrayList<>();
	List<String> verbs = new ArrayList<>();
	
	Random rand = new Random();
	
	/**
	 * 
	 */
	public Madlibs() {
		
		nouns.add("car");
		nouns.add("bunny");
		nouns.add("house");
		nouns.add("astronaut");
		
		verbs.add("runs");
		verbs.add("absconds");
		verbs.add("ascends");
		verbs.add("obviates");
		
	}
	
	public String getRandomWord(List<String> list) {
		return list.get(
				rand.nextInt(list.size())
				);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Madlibs mad = new Madlibs();
		
		for(int i = 0; i < 10; i++) {
			System.out.printf("The %s %s.\n", 
					mad.getRandomWord(mad.nouns), 
					mad.getRandomWord(mad.verbs));
		}
		
	}

}
