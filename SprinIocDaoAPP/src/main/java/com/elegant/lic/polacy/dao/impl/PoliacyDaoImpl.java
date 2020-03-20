package com.elegant.lic.polacy.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import org.springframework.stereotype.Repository;

import com.elegant.lic.polacy.dao.PolacyDao;
import com.elegant.lic.policy.model.PolacyModel;

@Repository
public class PoliacyDaoImpl implements PolacyDao {

	private static final String ORACLE_JDBC_DRIVER_ORACLE_DRIVER = "oracle.jdbc.driver.OracleDriver";
	private static final String URL = "jdbc:oracle:thin:@localhost:1521:XE";
	private static final String USERNAME = "system";
	private static final String PASSWORD = "tiger";
	private static final String INSERT_POLACY = "INSERT INTO INSURANCE_POLICY (PNUM, NAME, PREMIUM,TENTURE,ADDRESS) VALUES(?,?,?,?,?)";

	public void savePolacy(PolacyModel polacyModel) {
		Connection connection = null;
		PreparedStatement pst = null;
		try {
			Class.forName(ORACLE_JDBC_DRIVER_ORACLE_DRIVER);
			connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
			pst = connection.prepareStatement(INSERT_POLACY);
			pst.setString(1, polacyModel.getpNum());
			pst.setString(2, polacyModel.getName());
			pst.setDouble(3, polacyModel.getPremium());
			pst.setInt(4, polacyModel.getTenture());
			pst.setString(5, polacyModel.getAddress());
			int result = pst.executeUpdate();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				pst.close();
				connection.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

	public PolacyModel getPolacyDetails(String pNum) {
		return null;
	}

}
