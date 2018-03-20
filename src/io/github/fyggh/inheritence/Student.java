/**
 * 
 */
package io.github.fyggh.inheritence;

/**
 * @author 200503041
 *
 */
public class Student extends Person {

	private String major;
	
	/**
	 * @param name
	 * @param yearOfBirth
	 */
	public Student(String name, int yearOfBirth, String major) {
		super(name, yearOfBirth);
		this.setMajor(major);
	}

	/**
	 * @return the major
	 */
	public String getMajor() {
		return major;
	}

	/**
	 * @param major the major to set
	 */
	protected void setMajor(String major) {
		this.major = major;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return String.format("%s is a student, born in %d, with %s as their major.", getName(), getYearOfBirth(), getMajor());
	}

}
