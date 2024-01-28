package functional_interface;

public class Impljava7 implements MyInterface{
	
	public int add(int a, int b) {
		return a+b;
		
	}
	
	public static void main(String[] args) {
		MyInterface mi = new Impljava7();
		System.out.println(mi.add(2, 3));
		
	}

}
