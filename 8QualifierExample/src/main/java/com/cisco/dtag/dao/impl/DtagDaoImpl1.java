package com.cisco.dtag.dao.impl;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.cisco.dtag.dao.DtagDao;

@Repository("dtag1")
public class DtagDaoImpl1 implements DtagDao {

	public void saveData() {
		System.out.println("DtagDaoImpl1");
	}

}
