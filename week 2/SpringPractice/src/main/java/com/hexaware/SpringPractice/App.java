package com.hexaware.SpringPractice;

import java.util.List;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.hexaware.SpringPractice.service.IDoctorService;
import com.hexaware.SpringPractice.config.AppConfig;
import com.hexaware.SpringPractice.model.Doctor;
import com.hexaware.SpringPractice.service.DoctorServiceImp;

public class App 
{
	static Scanner scanner = new Scanner(System.in);

    public static void main( String[] args )
    {
    	ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
    	IDoctorService service = context.getBean(DoctorServiceImp.class);
    	
    	boolean flag = true;
    	while(flag) {
    		
    		System.out.println("1.insert");
    		System.out.println("2.select by name");
    		System.out.println("3.select all");
    		System.out.println("4.Exit");
    		
    		int choice = scanner.nextInt();
    		scanner.nextLine();
    		switch (choice) {
			case 1:
				Doctor doctor = readData(); 
				System.out.println(doctor);
				boolean isAdded = service.addDoctor(doctor);
				if(isAdded) {
					System.out.println("Doctor added sucessfully");
				}else {
					System.out.println("Error");
				}
				break;
			
			case 2:
				System.out.println("Enter doctor name: ");
				String name = scanner.nextLine();
				List<Doctor> list = service.selectDoctorByName(name);
				
				if(list != null) {
					for(Doctor doc : list) {
						System.out.println(doc);
					}
				}
				break;
			
			case 3:
				List<Doctor> list1 = service.selectAllDoctor();
				for(Doctor doc: list1) {
					System.out.println(doc);
				}
				break;
			
			case 4:
				flag = false;
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
