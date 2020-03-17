package com.elegant;

public class EmpService {

	private EmpDao empDao;

	public void setEmpDao(EmpDao empDao) {
		this.empDao = empDao;
	}

	public void saveEmp() {
		System.out.println("from service");
		empDao.saveEmp();
	}

}
