package com.hexaware.SpringPractice.service;

import java.util.List;


import com.hexaware.SpringPractice.model.Doctor;

public interface IDoctorService {
	
	public boolean addDoctor(Doctor doctor);
	public List<Doctor> selectDoctorByName(String doctorName);
	public List<Doctor> selectAllDoctor();
}
