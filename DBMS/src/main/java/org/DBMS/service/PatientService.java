package org.DBMS.service;

import java.sql.SQLException;

import org.DBMS.dao.PatientDao;
import org.DBMS.model.Patient;

public class PatientService {
	private PatientDao patientDao = new PatientDao();
	
	public void registerPatient(Patient patient) throws SQLException {
		patientDao.insertPatient(patient);
	}
	
}
