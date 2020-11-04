package com.elegant.service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.elegant.dao.StudentDao;

@Service
public class StudentService {

	@Autowired
	private StudentDao studentDao;

	public void saveStudent(int rollNum, String name) {
		System.out.println("from service");
		studentDao.saveStudent(rollNum, name);
	}

	@PreDestroy
	public void destroy() throws Exception {
		System.out.println("from destroy method");

	}

	@PostConstruct
	public void init() throws Exception {
		System.out.println("from init method");

	}

}
