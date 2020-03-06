package com.elegant;

public class Test {

	public static void main(String[] args) {
		Bank bank = new SBIBankImpl("Marathalli");
		Atm atm = new Atm(bank);
		atm.fundsTranfer();

	}

}
