package com.cisco.dtag.dao;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository("dtag2")
public class DtagDaoImpl2 implements DtagDao {

	public void saveData() {
		System.out.println("DtagDaoImpl2");
	}

}
