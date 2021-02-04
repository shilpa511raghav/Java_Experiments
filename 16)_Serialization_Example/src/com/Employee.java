package com;

import java.io.Serializable;

public class Employee implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public int empId;
	public String name;
	public static String company;
	
	// static variables cannot be serialized because they are related to class not of object
	
	public Employee(int eid, String name, String companyName) {
		this.empId = eid;
		this.name = name;
		this.company = companyName;
	}

}
