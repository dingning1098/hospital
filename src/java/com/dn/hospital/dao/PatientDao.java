package com.dn.hospital.dao;

import com.dn.hospital.entity.Patient;

import java.util.List;

public interface PatientDao {
	List<Patient> search();
}
