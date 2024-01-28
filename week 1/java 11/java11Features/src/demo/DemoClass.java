package demo;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DemoClass {
	public static void main(String[] args) {
	
		String str = "   This is my string   ";
		
		System.out.println(str);
		System.out.println(str.length());
		System.out.println(str.isBlank());
		
		System.out.println(str.strip());
		System.out.println(str.strip().length());
		
		System.out.println(str.stripTrailing());
	
		try {
			
			Path path = Paths.get("resources/input.txt");
			String data = Files.readString(path);
			System.out.println(data);

			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
