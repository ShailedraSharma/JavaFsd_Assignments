package com.hexaware.HibernaterPractice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.HibernaterPractice.dao.IDoctorDao;
import com.hexaware.HibernaterPractice.model.Doctor;

@Service
public class DoctorServiceImp implements IDoctorService {
	
	@Autowired
	IDoctorDao dao;

	@Override
	public boolean addDoctor(Doctor doctor) {
		return dao.addDoctor(doctor);
	}

	@Override
	public Doctor selectDoctorByName(String doctorName) {
		return dao.selectDoctorByName(doctorName);
	}

	@Override
	public List<Doctor> selectAllDoctor() {
		return dao.selectAllDoctor();
	}
	
	@Override
	public boolean updateDoctor(Doctor doctor) {
		return dao.updateDoctor(doctor);
	}
	
	@Override
	public boolean deleteDoctor(int id) {
		return dao.deleteDoctor(id);
	}

}
