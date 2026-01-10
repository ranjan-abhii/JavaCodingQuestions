package RahulShetty;

public class MethodDemo {

	public static void main(String[] args) {
		
		MethodDemo m = new MethodDemo();
		m.getData();
		MethodDemo2 m2 = new MethodDemo2();
		System.out.println(m2.getStringData());
		//static method 
		getIntegerData();
		
		
	}
	
	public void getData() {
		System.out.println("Hello World");
	}
	
	//if we make method static then we don't need to create object. Condition: Same class limited. Refer below method
	
	public static void getIntegerData() {
		System.out.println("12345");
	}
	

}
