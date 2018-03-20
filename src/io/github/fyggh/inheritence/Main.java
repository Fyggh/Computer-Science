package io.github.fyggh.inheritence;

public class Main {

	public static void main(String[] args) {
//		Dog toto = new Dog("Toto");
//		System.out.println(toto.speak());
//		Pug puggy = new Pug("Puggy");
//		System.out.println(puggy.speak());
		
		Person p = new Student("Thomas", 1999, "CS");
		System.out.println(p.toString());
		
	}

}
