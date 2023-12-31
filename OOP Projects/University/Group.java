import java.util.ArrayList;
public class Group {
    private String name;
    private Branch branch;
    private ArrayList <Student> list_of_students=new ArrayList<>();

    public Group(String name, Branch branch)
    {this.name=name;
    this.branch=branch;}

    public void AddStudent(Student s)
    {list_of_students.add(s);}

    public String getName() {
        return name;
    }

    public Branch getBranch() {
        return branch;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBranch(Branch branch) {
        this.branch = branch;
    }
    public void ShowGroup()
    {
        System.out.println("The students in this group are: ");
        for (Student s: list_of_students)
    {
        s.show_student_info();
    }
        }
}
