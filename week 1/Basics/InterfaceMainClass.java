interface Animal{
	
	int noofeyes=2;

	public void eat();
	
}

class Dog implements Animal{
	
	public void eat()
	{
		System.out.println("Dog Eating");
	}

	public void bark()
	{
	    	System.out.println("Dog Barking");
	}
}

class InterfaceMainClass{

	public static void main(String[] args)
	{
		//Animal  ani=new Animal();
		Animal animal= new Dog();   // Polymorphic object
		animal.eat(); 	
		//animal.bark();


	}
}