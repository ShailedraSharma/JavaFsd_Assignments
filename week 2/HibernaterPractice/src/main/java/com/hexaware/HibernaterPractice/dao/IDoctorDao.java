package com.hexaware.HibernaterPractice.dao;

import java.util.List;

import com.hexaware.HibernaterPractice.model.Doctor;

public interface IDoctorDao {
	
	public boolean addDoctor(Doctor doctor);
	public Doctor selectDoctorByName(String doctorName);
	public List<Doctor> selectAllDoctor();
	public boolean updateDoctor(Doctor doctor);
	public boolean deleteDoctor(int id);

}
