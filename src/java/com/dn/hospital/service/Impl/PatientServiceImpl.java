package com.dn.hospital.service.Impl;

import com.dn.hospital.dao.PatientDao;
import com.dn.hospital.entity.Patient;
import com.dn.hospital.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientServiceImpl implements PatientService {
	@Autowired
	private PatientDao patientDao;

	@Override
	public List<Patient> search(){
		return patientDao.search();
	}
}
