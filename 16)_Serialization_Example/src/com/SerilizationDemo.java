package com;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerilizationDemo {
	
	public static void main(String[] args) {
		Employee empObj = new Employee(1, "shilpa");
		
		String fileName = "DemoFile.ser";
		
		try {
			FileOutputStream file = new FileOutputStream(fileName);
			ObjectOutputStream obj = new ObjectOutputStream(file);
			obj.writeObject(empObj);
			obj.close();
			file.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("done writing");
		
	}
	
}
