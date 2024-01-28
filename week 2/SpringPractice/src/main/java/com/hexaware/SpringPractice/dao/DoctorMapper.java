package com.hexaware.SpringPractice.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.hexaware.SpringPractice.model.Doctor;

public class DoctorMapper implements RowMapper<Doctor>{

	@Override
	public Doctor mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		Doctor doctor = new Doctor();
		doctor.setDoctorId(rs.getInt("id"));
		doctor.setDoctorName(rs.getString("name"));
		doctor.setSpeciality(rs.getString("speciality"));
		doctor.setExperience(rs.getInt("experience"));
	
		return doctor;
	}

}
