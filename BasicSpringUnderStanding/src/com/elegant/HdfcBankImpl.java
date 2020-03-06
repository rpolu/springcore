package com.elegant;

public class HdfcBankImpl implements Bank {
	private String name;

	public HdfcBankImpl(String name) {
		this.name = name;
	}

	public void fundsTrnafer() {
		System.out.println("Hdfc Funds tranfer");

	}

}
