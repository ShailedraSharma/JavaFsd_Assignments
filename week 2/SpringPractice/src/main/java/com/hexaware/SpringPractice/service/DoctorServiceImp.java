package com.hexaware.SpringPractice.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hexaware.SpringPractice.dao.IDoctorDao;
import com.hexaware.SpringPractice.model.Doctor;

@Service
public class DoctorServiceImp implements IDoctorService {
	
	@Autowired
	IDoctorDao dao;

	@Override
	public boolean addDoctor(Doctor doctor) {
		return dao.addDoctor(doctor);
	}

	@Override
	public List<Doctor> selectDoctorByName(String doctorName) {
		return dao.selectDoctorByName(doctorName);
	}

	@Override
	public List<Doctor> selectAllDoctor() {
		return dao.selectAllDoctor();
	}

}
