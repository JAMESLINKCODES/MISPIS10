public class ResearchAssociate extends Employee {

	private String fieldOfStudy;

	public ResearchAssociate(int ssNo, String name, String email, int counter) {
		super(ssNo, name, email, counter);
	}

	public ResearchAssociate(int ssNo, String name, String email, int counter, String fieldOfStudy) {
		super(ssNo, name, email, counter);
		this.fieldOfStudy = fieldOfStudy;
	}

	public void setFieldOfStudy(String fieldOfStudy) {
		this.fieldOfStudy = fieldOfStudy;
	}

	@Override
	public void employeeDoes(){
		System.out.println("Research associate has field of study: " + this.fieldOfStudy);
	}
}