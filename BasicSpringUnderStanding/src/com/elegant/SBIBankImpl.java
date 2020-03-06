package com.elegant;

public class SBIBankImpl implements Bank {
	private String name;

	public SBIBankImpl(String name) {
		this.name = name;
	}

	public void fundsTrnafer() {
		System.out.println("Funds tranfer SBI");
	}

}
