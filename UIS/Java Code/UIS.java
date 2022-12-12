import java.util.ArrayList;
import java.util.List;

public class UIS {

    public static void main(String[] args) {
        Institute vsu = new Institute("VSU", "the city of Voronezh");

        Employee dean = new Employee(1, "The Dean", "dean-email", 0);
        Employee em1 = new AdministrativeEmployee(2, "admin employee 1", "ad-email-1", 0);
        Employee em2 = new ResearchAssociate(3, "research worker 1", "re-email-1", 0, "math");
        Employee em22 = new ResearchAssociate(22, "research worker 2", "re-email-2", 0, "physics");
        Employee em3 = new Lecturer(4, "lecturer 1", "lec-email-1", 0);

        Faculty faculty = new Faculty(dean, "Computer Science");

        Course course1 = new Course("MISPIS", 10, 150);

        Project project1 = new Project("Lab 10", "24th of November", "15th of December");

        vsu.runAnInstitute();
        dean.employeeDoes();
        em1.employeeDoes();
        faculty.runAFaculty();
        course1.runACourse();
        em3.employeeDoes();
        em2.employeeDoes();
        em22.employeeDoes();

        project1.runAProject();
        System.out.println("Adding participants...");
        List<Employee> newTeam = new ArrayList<>();
        newTeam.add(em2); newTeam.add(em22); newTeam.add(em3);
        project1.setParticipants(newTeam);
        project1.runAProject();
    }

}
