package com.hexa;

public class Calculate {
	
	public int add(int... number) {
		int result =0;
		for(int i : number) {
			result +=i;
		}
		
		return result;
	}
	
	public int multiply(int... number) {
		int result =1;
		for(int i : number) {
			result *=i;
		}
		
		return result;
	}

	public static void main(String[] args) {
		Calculate c = new Calculate();
		System.out.println(c.add(2,3));
		System.out.println(c.add(2,3,1));
		System.out.println(c.add(2,3,5,2));

	}

}
