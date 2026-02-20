package org.DBMS.dao;

import java.sql.*;

import org.DBMS.db.DatabaseConnection;
import org.DBMS.model.Patient;

public class PatientDao {
	
	public void insertPatient(Patient patient) throws SQLException {
		Connection con = DatabaseConnection.getConnection();
		String sql = "INSERT INTO patients(name,dob,phone,email,address,blood_group) VALUES(?,?,?,?,?,?)";
		PreparedStatement ps = con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
		
		ps.setString(1, patient.getName());
		ps.setDate(2, patient.getDob());
		ps.setString(3, patient.getPhone());
		ps.setString(4, patient.getEmail());
		ps.setString(5, patient.getAddress());
		ps.setString(6, patient.getBloodGroup());
		ps.executeUpdate();
		
		ResultSet rs = ps.getGeneratedKeys();
		if(rs.next()) {
			int generatedKey = rs.getInt(1);
			System.out.println("Patient ID -> "+generatedKey);
		}
		
	}
}
