package abstractClassExample.java;

//abstract class
public abstract class Person{
	private String name;
	private int number;
	private String address;
	private String gender;
	
	public Person(String name, int num, String addr, String gen){
		System.out.println("Constructing an Employee");
		this.name = name;
		this.number = num;
		this.address = addr;
		this.gender = gen;
	}
	
	//abstract method
	public abstract void work();
	     
	
	public String getName() {   //private  variables are accessed using getters
	      return name;
	}
	
	public void mailCheck() {
	      System.out.println("Mailing a check to " + this.name + " " + this.address);
	   }
	
	public String getGender() {
		return gender;
		
	}
	
	public String getAddress() {
	      return address;
	}
	   
	public void setAddress(String newAddress) { // private variables are modified using setters
	      address = newAddress;
	}
	
	public int getNumber() {
	      return number;
	}
	 
	
}
