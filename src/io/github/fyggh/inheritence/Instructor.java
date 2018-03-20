/**
 * 
 */
package io.github.fyggh.inheritence;

/**
 * @author 200503041
 *
 */
public class Instructor extends Person {

	private int salary;
	
	/**
	 * @param name
	 * @param yearOfBirth
	 */
	public Instructor(String name, int yearOfBirth, int salary) {
		super(name, yearOfBirth);
		this.setSalary(salary);
	}

	/**
	 * @return the salary
	 */
	public int getSalary() {
		return salary;
	}

	/**
	 * @param salary the salary to set
	 */
	protected void setSalary(int salary) {
		this.salary = salary;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return String.format("Instructor [salary=%s, getName()=%s, getYearOfBirth()=%s]", getSalary(), getName(),
				getYearOfBirth());
	}

}
