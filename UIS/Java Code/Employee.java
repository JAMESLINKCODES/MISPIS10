public class Employee {

	private int ssNo;
	private String name;
	private String email;
	private int counter;

	public Employee(int ssNo, String name, String email, int counter) {
		this.ssNo = ssNo;
		this.name = name;
		this.email = email;
		this.counter = counter;
	}

	public void employeeDoes(){
		System.out.println("Employee " + this.name + " starts to work");
	}

}