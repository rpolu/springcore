package com.elegant;

import java.io.Serializable;

public class Atm implements Serializable {
	Bank bank;

	public Atm(Bank bank) {
		this.bank = bank;
	}

	void fundsTranfer() {
		bank.fundsTrnafer();
	}
}
