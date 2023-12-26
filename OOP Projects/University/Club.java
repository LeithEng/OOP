import java.util.ArrayList;
public class Club {
    private String name;
    private String domain;
    private ArrayList<ClubStaff> staff;
    private ArrayList<Student> members;
    private ArrayList<Event> Events;

    Club(String name, String domain) {
        this.name = name;
        this.domain = domain;
        staff = new ArrayList<>();
        members = new ArrayList<>();
        Events = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getDomain() {
        return domain;
    }

    public void AddStaff(ClubStaff C) {
        staff.add(C);
    }

    public void AddMember(Student s) {
        members.add(s);
    }

    public void AddEvent(Event e) {
        Events.add(e);
    }

    public void ShowClubInfo() {
        System.out.println("Club name: " + name);
        System.out.println("Domain: " + domain);
        System.out.println("This club's staff members are: ");
        for (int i = 0; i < staff.size(); i++) {
            staff.get(i).show_staff_info();
        }
        if (Events.size() != 0) {
            for (int i = 0; i < Events.size(); i++) {
                Events.get(i).ShowEvent();

            }
        }
    }
}