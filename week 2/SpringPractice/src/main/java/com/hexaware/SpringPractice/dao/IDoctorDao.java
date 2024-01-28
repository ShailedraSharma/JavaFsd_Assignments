package com.hexaware.SpringPractice.dao;

import java.util.List;

import com.hexaware.SpringPractice.model.Doctor;

public interface IDoctorDao {
	
	public boolean addDoctor(Doctor doctor);
	public List<Doctor> selectDoctorByName(String doctorName);
	public List<Doctor> selectAllDoctor();

}
