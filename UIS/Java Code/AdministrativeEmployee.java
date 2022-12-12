public class AdministrativeEmployee extends Employee {
    public AdministrativeEmployee(int ssNo, String name, String email, int counter) {
        super(ssNo, name, email, counter);
    }

    @Override
    public void employeeDoes() {
        System.out.println("Administrative employee starts to work");
    }
}