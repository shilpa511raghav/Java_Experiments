package abstractClassExample.java;

public abstract class Employee{
	private String name;
	private int number;
	private String address;
	
	public Employee(String name, int num, String addr){
		System.out.println("Constructing an Employee");
		this.name = name;
		this.number = num;
		this.address = addr;
	}
	
	public void mailCheck() {
	      System.out.println("Mailing a check to " + this.name + " " + this.address);
	}
	
	public String getName() {
	      return name;
	}
	
	public String getAddress() {
	      return address;
	}
	   
	public void setAddress(String newAddress) {
	      address = newAddress;
	}
	
	public int getNumber() {
	      return number;
	}
	 
	
}
