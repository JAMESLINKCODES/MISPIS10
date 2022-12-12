public class Course {

	private String name;
	private int id;
	private float hours;

	public Course(String name, int id, float hours) {
		this.name = name;
		this.id = id;
		this.hours = hours;
	}

	public void runACourse(){
		System.out.println("Course " + this.name + " of " + this.hours + " hours is running");
	}
}