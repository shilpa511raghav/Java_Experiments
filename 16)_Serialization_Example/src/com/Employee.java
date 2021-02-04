package com;

import java.io.Serializable;

public class Employee implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public int empId;
	public String name;
	
	public Employee(int eid, String name) {
		this.empId = eid;
		this.name = name;
	}

}
