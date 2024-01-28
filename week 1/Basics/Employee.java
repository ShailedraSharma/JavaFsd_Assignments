import java.lang.*;

class Employee{	
      static int y=200;    	//Class variable
      int z=300;		// instance variable
      public static void main(String[] args)
      {
 	int x=100;			// Local variable
	System.out.println("Welcome to Java " + x + "  " + y);

	Employee emp = new Employee();     // Class Instantiation
	System.out.println("Z " + emp.z);
	System.out.println("Z " + new Employee().z);

	System.out.println(emp);
	System.out.println(emp);
	System.out.println(emp);

	System.out.println(new Employee());
	System.out.println(new Employee());
	System.out.println(new Employee());

      }    

}