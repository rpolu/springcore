package com.elegent.spring.sp;

import java.io.Serializable;

public class A implements Serializable {

	public static void main(String[] args) {
		A a = new A();
		System.out.println(a instanceof Serializable);
	}

}
