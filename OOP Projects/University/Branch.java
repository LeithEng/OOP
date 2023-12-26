import java.util.ArrayList;
public class Branch {
    private String name;
    private ArrayList<Course> courses;
    private Teacher HeadOfBranch;

    public Branch(String name,Teacher t) {
        this.name = name;
        this.courses = new ArrayList<>();
        this.HeadOfBranch=t;
    }

    public void AddCourse(Course c) {
        courses.add(c);
    }

    public void ShowBranch() {
        System.out.println("Branch Name: " + name);
        System.out.println("Head of branch: ");
        HeadOfBranch.show_info();
        for (int i = 0; i < courses.size(); i++) {
            courses.get(i).ShowCourse();

        }

    }
}