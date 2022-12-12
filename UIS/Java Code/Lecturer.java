public class Lecturer extends ResearchAssociate {
    public Lecturer(int ssNo, String name, String email, int counter) {
        super(ssNo, name, email, counter);
    }

    public void employeeDoes() {
        System.out.println("Lecturer starts to teach a course");
    }
}