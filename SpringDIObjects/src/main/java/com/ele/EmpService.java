package com.ele;

public class EmpService {

	private EmplDao emplDao;

	public void setEmplDao(EmplDao emplDao) {
		this.emplDao = emplDao;
	}

	public void empSave() {
		System.out.println("I need to save the Data");
		emplDao.saveEmp();
	}

}
