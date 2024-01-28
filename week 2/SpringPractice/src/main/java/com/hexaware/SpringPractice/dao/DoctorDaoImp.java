package com.hexaware.SpringPractice.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.hexaware.SpringPractice.model.Doctor;

@Repository
public class DoctorDaoImp implements IDoctorDao {
	
	JdbcTemplate jdbcTemplate;
	
	@Autowired
	public DoctorDaoImp(DataSource dataSource) {
		
		jdbcTemplate = new JdbcTemplate(dataSource);
		System.out.println(jdbcTemplate);	
	}
	

	@Override
	public boolean addDoctor(Doctor doctor) {
		String insertQuery = "insert into doctors(id, name, speciality, experience) values(?,?,?,?)"; 
		int count = jdbcTemplate.update(insertQuery,doctor.getDoctorId(), doctor.getDoctorName(), doctor.getSpeciality(),doctor.getExperience());
		return count>0;
	}

	@Override
	public List<Doctor> selectDoctorByName(String doctorName) {

		String selectQueryByName = "select id, name, speciality, experience from doctors where name = ?";
		List<Doctor> list = jdbcTemplate.query(selectQueryByName, new DoctorMapper(), doctorName);
		return list;
	}

	@Override
	public List<Doctor> selectAllDoctor() {
		String selectQuery = "select id, name, speciality, experience from doctors";
		List<Doctor> list = jdbcTemplate.query(selectQuery, new DoctorMapper());
		return list;
	}

}
