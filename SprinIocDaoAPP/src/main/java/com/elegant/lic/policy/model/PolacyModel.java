package com.elegant.lic.policy.model;

import java.io.Serializable;

public class PolacyModel implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String pNum;
	private String name;
	private double premium;
	private int tenture;
	private String address;

	public PolacyModel() {

	}

	public PolacyModel(String pNum, String name, double premium, int tenture, String address) {
		this.pNum = pNum;
		this.name = name;
		this.premium = premium;
		this.tenture = tenture;
		this.address = address;
	}

	public String getpNum() {
		return pNum;
	}

	public void setpNum(String pNum) {
		this.pNum = pNum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPremium() {
		return premium;
	}

	public void setPremium(double premium) {
		this.premium = premium;
	}

	public int getTenture() {
		return tenture;
	}

	public void setTenture(int tenture) {
		this.tenture = tenture;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "PolacyModel [pNum=" + pNum + ", name=" + name + ", premium=" + premium + ", tenture=" + tenture
				+ ", address=" + address + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((pNum == null) ? 0 : pNum.hashCode());
		long temp;
		temp = Double.doubleToLongBits(premium);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + tenture;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PolacyModel other = (PolacyModel) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (pNum == null) {
			if (other.pNum != null)
				return false;
		} else if (!pNum.equals(other.pNum))
			return false;
		if (Double.doubleToLongBits(premium) != Double.doubleToLongBits(other.premium))
			return false;
		if (tenture != other.tenture)
			return false;
		return true;
	}
}
