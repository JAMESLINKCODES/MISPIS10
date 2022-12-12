import java.util.ArrayList;
import java.util.List;

public class Project {

    private String name;
    private String start;
    private String end;

    private List<List> participants = new ArrayList<>();

    public List<List> getParticipants() {
        return participants;
    }

    public void setParticipants(List newParticipants) {
        this.participants.addAll(newParticipants);
    }

    public Project(String name, String start, String end) {
        this.name = name;
        this.start = start;
        this.end = end;
    }

    public void runAProject() {
        String projectParticipants = "no participants yet";
        if (!participants.isEmpty()) {
            projectParticipants = Integer.toString(participants.size());
            projectParticipants += " participants";
        }
        System.out.println("A " + this.name + " project is running with " + projectParticipants + ". Starts on the " + this.start + " and ends on the " + this.end);
    }
}