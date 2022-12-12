public class Faculty {

	Employee dean;
	private String name;

	public Faculty(Employee dean, String name) {
		this.dean = dean;
		this.name = name;
	}

	public void runAFaculty(){
		System.out.println("A " + this.name + " faculty is running");
	}
}