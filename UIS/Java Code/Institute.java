public class Institute {

	private String name;
	private String address;

	public Institute(String name, String address) {
		this.name = name;
		this.address = address;
	}

	public void runAnInstitute(){
		System.out.println("The " + this.name + " is running, location: " + this.address);
	}
}