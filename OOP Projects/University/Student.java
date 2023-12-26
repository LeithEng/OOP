import java.util.ArrayList;
public class Student {
    protected String name;
    protected int age;
    protected int ID;
    protected ArrayList<Exam> Exams = new ArrayList<>();

    public Student(String name, int age, int ID) {
        this.name = name;
        this.age = age;
        this.ID = ID;
    }

    public int getID() {
        return ID;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void AddExam(Exam e) {
        Exams.add(e);
    }

    public void show_student_info() {
        System.out.println("Student name: " + name);
        System.out.println("ID: " + ID);
        System.out.println("Age: " + age);
        for (int i = 0; i < Exams.size(); i++) {
            System.out.println("Exam "+(i+1));
            Exams.get(i).ShowExam();

        }

    }
}

class ClubStaff extends Student{
    private String role;
    ClubStaff(String name, int age, int ID, String r)
    {super(name,age,ID);
    role=r;}
    public void show_staff_info()
    {super.show_student_info();
        System.out.println("Role: "+role);}
}