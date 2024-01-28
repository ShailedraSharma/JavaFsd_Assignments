package com.hexaware.HibernaterPractice.dao;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import com.hexaware.HibernaterPractice.model.Doctor;

@Repository
public class DoctorDaoImp implements IDoctorDao{
	
	Session session;
	
	public DoctorDaoImp() {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		session = sessionFactory.openSession();
	}

	@Override
	public boolean addDoctor(Doctor doctor) {
    	Transaction txn = session.beginTransaction();
    	Serializable ser = session.save(doctor);
    	txn.commit();
    	if(ser!=null) {
    		return true;
    	}
		return false;
	}
	
	
	@Override
	public boolean updateDoctor(Doctor doctor){
    	Transaction txn = session.beginTransaction();
    	Doctor doc =  session.get(Doctor.class,doctor.getDoctorId());
    	
    	doc.setDoctorName(doctor.getDoctorName());
    	doc.setSpeciality(doctor.getSpeciality());
    	doc.setExperience(doctor.getExperience());
    
    	Serializable ser = session.save(doc);
    	txn.commit();
    	if(ser!=null) {
    		return true;
    	}
		return false;
	}
	
	@Override
	public boolean deleteDoctor(int id) {
    	Transaction txn = session.beginTransaction();
    	Query query = session.createNamedQuery("deleteDoctor");
    	query.setParameter("id", id);
    	int count = query.executeUpdate();
    	txn.commit();
    	return count > 0;
	}

	@Override
	public Doctor selectDoctorByName(String doctorName) {
		Query query = session.createNamedQuery("getDoctorByName");
		query.setParameter("name", doctorName);
		Doctor doctor = (Doctor)query.getSingleResult();
		return doctor;
	}

	@Override
	public List<Doctor> selectAllDoctor() {
		Query query = session.createNamedQuery("getAllDoctor");
		List<Doctor> list = query.getResultList();
		return list;
	}
}
