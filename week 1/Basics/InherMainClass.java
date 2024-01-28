class Employee {

	int empno=100;
	String ename="Arun";

	Employee(){
	   System.out.println("From Employee Constructor");
	}

	Employee(int a){			// Constructor Overloading
	   System.out.println("From Employee Parmer . Constructor " + a);
	}

	Employee(int eno, String enam){			// Constructor Overloading
	   System.out.println("Employee Parmer . Constructor ");
	   this.empno=eno;				
    	   this.ename = enam;
	}

	public void getSalaryDetails(){			// Method Overloading
		System.out.println("Salary : " + 50000);
	}

	protected int getSalaryDetails(int sal){		//Method Overloading
		return  sal;
	}


	protected String getEmpDetails(){
		return empno+ " " + ename;
	}

}

class Manager  extends Employee{      // IS-A relationship
	String dept="IT";	
	Manager(){
	    super(900,"Madhu");			// calll to base class constructor
	    System.out.println("From Manager Constructor");   	   
	}
	
	public String getEmpDetails(){			// Overridden method
		return super.getEmpDetails()+ "  " + dept;   // call to base class overridden method
		
	}

}

class OtherCompanyOwner {

	public String getEmpDetails(){			// Overridden method
		return super.getEmpDetails()+ "  " + dept;   // call to base class overridden method
		
	}


}
class InherMainClass {

	public static void main(String[] args) {

		Employee e1 = new Employee();
		System.out.println(e1.getEmpDetails());
		
		Manager m1 = new Manager();
		System.out.println(m1.getEmpDetails());


		e1.getSalaryDetails();
		System.out.println("Sal : " + e1.getSalaryDetails(40000));

		//Employee e2= new Employee(500);
		//System.out.println(e1.getEmpDetails());
	}

}
