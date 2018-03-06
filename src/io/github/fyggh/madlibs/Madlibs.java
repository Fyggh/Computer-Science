/**
 * 
 */
package io.github.fyggh.madlibs;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.URI;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 * @author 200503041
 *
 */
public class Madlibs {
	
	public static final String SENTENCE = "Once upon a time, "
			+ "there was a %s %s that loved to %s %s.\n";
	
	List<String> nouns = new ArrayList<>();
	List<String> verbs = new ArrayList<>();
	List<String> adverbs = new ArrayList<>();
	List<String> adjectives = new ArrayList<>();
	
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
	 * 
	 * @author Mr Gilette
	 * @return
	 */
	public static ArrayList<String> getVerbArray(String fileName) {
		ArrayList<String> str = new ArrayList<>();
		File file = new File("assets/words/" + fileName);
		
		try {
			Scanner scan = new Scanner(file);
			while (scan.hasNextLine()) {
				str.add(scan.nextLine());
			}
			scan.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		return str;
		
	}
	
//	public static List<String> getVerbArrayNIO() {
//		List<String> verbArray = new ArrayList<>();
//		URI uri = new URI(str);
//		//Path path = Paths.get
//	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Madlibs mad = new Madlibs();
		
		mad.verbs = Madlibs.getVerbArray("31K verbs.txt");
		mad.nouns = Madlibs.getVerbArray("91K nouns.txt");
		mad.adjectives = Madlibs.getVerbArray("28K adjectives.txt");
		mad.adverbs = Madlibs.getVerbArray("6K adverbs.txt");
		
		for(int i = 0; i < 10; i++) {
//			System.out.printf("The %s %s.\n", 
//					mad.getRandomWord(mad.nouns), 
//					mad.getRandomWord(mad.verbs));
			
			System.out.printf(SENTENCE, 
					mad.getRandomWord(mad.adjectives),
					mad.getRandomWord(mad.nouns),
					mad.getRandomWord(mad.verbs),
					mad.getRandomWord(mad.adverbs));
		}
		
	}

}
