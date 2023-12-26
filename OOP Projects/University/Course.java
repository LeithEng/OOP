import java.util.ArrayList;
public class Course {
    private String name;
    private Teacher teacher;
    private float coefficient;
    private ArrayList<Student> students = new ArrayList<>();

    Course(String name, Teacher teacher, float coeff) {
        this.name = name;
        this.teacher = teacher;
        coefficient = coeff;
    }

    public void AddStudent(Student s) {
        students.add(s);
    }

    public void ShowCourse() {
        System.out.println("Course name: " + name);
        System.out.println("Teacher info: ");
        teacher.show_info();
        System.out.println("Coefficient: " + coefficient);
        System.out.println("Students following this course: ");
        for (int i = 0; i < students.size(); i++) {
            System.out.println("Student " + (i + 1));
            students.get(i).show_student_info();
        }
    }

    public String getName() {
        return name;
    }

    public float getCoefficient() {
        return coefficient;
    }

    public Teacher getTeacher() {
        return teacher;
    }


}