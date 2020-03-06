package com.elegent;

public class Student {
	int rollNum;
	String name;
	int marks;

	/*
	 * public Student(int rollNum, String name, int marks) { this.rollNum = rollNum;
	 * this.name = name; this.marks = marks; }
	 */

	void displayData() {
		System.out.println(rollNum + " " + name + " " + marks);
	}

	public void setRollNum(int rollNum) {
		this.rollNum = rollNum;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

}
