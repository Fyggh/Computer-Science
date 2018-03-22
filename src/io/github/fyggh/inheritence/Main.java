package io.github.fyggh.inheritence;

public class Main {

	public static void main(String[] args) {
//		Dog toto = new Dog("Toto");
//		System.out.println(toto.speak());
//		Pug puggy = new Pug("Puggy");
//		System.out.println(puggy.speak());
		
		Person j = new Person("Johnny", 2011);
		Person p = new Student("Thomas", 1999, "CS");
		Student s = new Student("Thomas", 1999, "CS");
		System.out.println(j.toString());
		System.out.println(j.getClass().getName());
		System.out.println(p.toString());
		System.out.println(p.getClass().getName());
		System.out.println(s.toString());
		System.out.println(s.getClass().getName());
		
		System.out.println(s.equals(p));
		
	}

}
