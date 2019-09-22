package abstractClassExample.java;


public class Employee extends Person {
	
	private int empId;
	
	public Employee(String name, int num, String addr, String gen, int id) {
		super(name,num,addr,gen);
		this.empId = id;
	}
	public void work() {
		if(empId == 0) {
			System.out.println("not working");
		}else {
			System.out.println("working as an employee");
		}
	}
	
	public static void main(String args[]) {
		Person student = new Employee("shilpa",987654321,"India", "female",0);
		Person employee = new Employee("john",987654321,"Thailand","male",7);
		
		employee.mailCheck();
		student.work();
		employee.work();
		
		employee.setAddress("house no 123 Himachal India");
		employee.mailCheck();
		employee.getGender();
	}
	
}


