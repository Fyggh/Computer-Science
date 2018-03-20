package io.github.fyggh.inheritence;

public class Person {
	
	private String name;
	private int yearOfBirth;

	/**
	 * @param name
	 * @param yearOfBirth
	 */
	public Person(String name, int yearOfBirth) {
		super();
		this.setName(name);
		this.setYearOfBirth(yearOfBirth);
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the yearOfBirth
	 */
	public int getYearOfBirth() {
		return yearOfBirth;
	}

	/**
	 * @param yearOfBirth the yearOfBirth to set
	 */
	protected void setYearOfBirth(int yearOfBirth) {
		this.yearOfBirth = yearOfBirth;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return String.format("Person [name=%s, yearOfBirth=%s]", name, yearOfBirth);
	}

}
