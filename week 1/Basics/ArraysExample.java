import java.util.Arrays;

public class ArraysExample{

	public static void main(String[] args) {

		int[] intArr = new int[3];
		intArr[0] = 100;
		intArr[1] = 200;
		intArr[2] = 300;
		
		System.out.println(intArr);
		System.out.println(Arrays.toString(intArr));
		
		
		int[] intgArr  = {400,500,600};
		System.out.println(Arrays.toString(intgArr));
		
		String[] strArr  = {"apple","bannana","cherry"};
		System.out.println(Arrays.toString(strArr));
		
			
	}

}