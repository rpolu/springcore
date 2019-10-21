package com.elegant.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import org.springframework.stereotype.Repository;

import com.elegant.dao.StudentDao;
import com.elegant.model.StudentModel;

@Repository
public class StudenDaoImpl implements StudentDao {

	public void SaveStudent(StudentModel model) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/SYSTEM";
			String un = "root";
			String password = "Root@123";
			String query = "insert into student values(?,?,?,?)";
			Connection conn = DriverManager.getConnection(url, un, password);
			PreparedStatement pst = conn.prepareStatement(query);
			pst.setInt(1, model.getRollNum());
			pst.setString(2, model.getName());
			pst.setInt(3, model.getMarks());
			pst.setString(4, model.getAddress());
			int rows = pst.executeUpdate();
			pst.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
