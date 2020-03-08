package com.elegant;

public class EmpController {
	private EmpService empService;

	public EmpController(EmpService empService) {
		this.empService = empService;
	}

	void needTosave(int empId, String name) {
		empService.displayEmpData(empId, name);
	}

}
