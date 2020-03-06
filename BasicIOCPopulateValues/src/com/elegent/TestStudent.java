package com.elegent;

public class TestStudent {

	public static void main(String[] args) {

		Student student = new Student();
		student.setRollNum(10);
		student.setName("rama");
		student.setMarks(55);

		//Student student = new Student(10, "hhh", 90);
		student.displayData();

	}

}
