package com.cisco.dtag.dao;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository("dtag1")
public class DtagDaoImpl1 implements DtagDao {

	public void saveData() {
		System.out.println("DtagDaoImpl1");
	}

}
