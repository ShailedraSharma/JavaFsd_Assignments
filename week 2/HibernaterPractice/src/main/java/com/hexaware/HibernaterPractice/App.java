package com.hexaware.HibernaterPractice;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.hexaware.HibernaterPractice.config.AppConfig;
import com.hexaware.HibernaterPractice.model.Doctor;
import com.hexaware.HibernaterPractice.service.DoctorServiceImp;
import com.hexaware.HibernaterPractice.service.IDoctorService;

public class App 
{
	static Scanner scanner = new Scanner(System.in);

    public static void main( String[] args )
    {
    	ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
    	IDoctorService service = context.getBean(DoctorServiceImp.class);
    	
    	boolean flag = true;
    	while(flag){
    		
    		System.out.println("1.insert");
    		System.out.println("2.select by name");
    		System.out.println("3.select all");
    		System.out.println("4.Update doctor details");
    		System.out.println("5.Delete doctor");
    		System.out.println("4.Exit");
    		
    		int choice = scanner.nextInt();
    		scanner.nextLine();
    		switch (choice) {
			case 1:
				Doctor doctor = readData(); 
				boolean isAdded = service.addDoctor(doctor);
				if(isAdded) {
					System.out.println("Added sucessfully");
				}else {
					System.out.println("error occured");
				}
				break;
			
			case 2:
				System.out.println("Enter doctor name: ");
				String doctorName = scanner.nextLine();
				Doctor doc = service.selectDoctorByName(doctorName);
				System.out.println(doc);
				break;
			
			case 3:
				List<Doctor> list = service.selectAllDoctor();
				for(Doctor dr: list) {
					System.out.println(dr);
				}
				break;
			
			case 4:
				Doctor updateDoc = readData();
				boolean isUpdated = service.updateDoctor(updateDoc);
				if(isUpdated) {
					System.out.println("data updated sucessfully");
				}else {
					System.out.println("error occured");
				}
				break;
			case 5:
				System.out.println("Enter id of the doctor: ");
				int id = scanner.nextInt();
				scanner.nextLine();
				if(service.deleteDoctor(id)){
					System.out.println("doctor deleted sucessfully");
				}else {
					System.out.println("error occured");
				}
				break;
    		}
    	}
    }
    
public static Doctor readData() {
    	Doctor doctor = new Doctor();
    	System.out.println("Enter id: ");
    	doctor.setDoctorId(scanner.nextInt());
    	scanner.nextLine();
    	System.out.println("Enter name: ");
    	doctor.setDoctorName(scanner.nextLine());
    	System.out.println("Enter speciality");
    	doctor.setSpeciality(scanner.nextLine());
    	System.out.println("Enter experience");
    	doctor.setExperience(scanner.nextInt());
    	scanner.nextLine();
    	return doctor;
    }
}
