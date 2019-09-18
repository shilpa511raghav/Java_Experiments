package objectsDemo.java;


class Calculator{
	
	int num1;
	int num2;
	float result;
	
	public void perform()    // void is a returnType does not return anything
	{
		result = num1 + num2;
	}
}

public class Objects {

	public static void main(String[] args) {
		
		Calculator obj = new Calculator();
		obj.num1 = 3;
		obj.num2 = 5;
		
		obj.perform();
		
		System.out.println(obj.result); 
	}
	

}
