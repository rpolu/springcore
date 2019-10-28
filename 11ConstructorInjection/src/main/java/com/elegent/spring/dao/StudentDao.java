package com.elegent.spring.dao;

public class StudentDao {
	private String name;
	private int marks;

	public void saveStudent() {
		System.out.println(name);
		System.out.println(marks);
		System.out.println("Saved Student details");
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
	 * @return the marks
	 */
	public int getMarks() {
		return marks;
	}

	/**
	 * @param marks the marks to set
	 */
	public void setMarks(int marks) {
		this.marks = marks;
	}

}
