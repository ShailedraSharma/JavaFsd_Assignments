package com.hexaware.SpringPractice.model;

import org.springframework.stereotype.Component;

@Component
public class Doctor {
	private int doctorId;
	private String doctorName;
	private String speciality;
	private int experience;
	
	public Doctor() {
		super();
	}

	public Doctor(int doctorId, String doctorName, String speciality, int experience) {
		super();
		this.doctorId = doctorId;
		this.doctorName = doctorName;
		this.speciality = speciality;
		this.experience = experience;
	}

	public int getDoctorId() {
		return doctorId;
	}

	public void setDoctorId(int doctorId) {
		this.doctorId = doctorId;
	}

	public String getDoctorName() {
		return doctorName;
	}

	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}

	public String getSpeciality() {
		return speciality;
	}

	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	@Override
	public String toString() {
		return "Doctor [doctorId=" + doctorId + ", doctorName=" + doctorName + ", speciality=" + speciality
				+ ", experience=" + experience + "]";
	}
}
