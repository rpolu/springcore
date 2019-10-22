package com.elegant.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Repository;

import com.elegant.dao.StudentDao;
import com.elegant.model.StudentModel;

@Repository
public class StudenDaoImpl implements StudentDao, InitializingBean, DisposableBean {
	Connection conn = null;

	public void SaveStudent(StudentModel model) {
		try {
			String query = "insert into student values(?,?,?,?)";
			PreparedStatement pst = conn.prepareStatement(query);
			pst.setInt(1, model.getRollNum());
			pst.setString(2, model.getName());
			pst.setInt(3, model.getMarks());
			pst.setString(4, model.getAddress());
			int rows = pst.executeUpdate();
			pst.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void afterPropertiesSet() throws Exception {

		System.out.println(" Connection object creation");
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/SYSTEM";
			String un = "root";
			String password = "Root@123";
			conn = DriverManager.getConnection(url, un, password);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void destroy() throws Exception {
		System.out.println(" Close object creation");
		conn.close();

	}

}
