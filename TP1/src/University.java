import java.util.ArrayList;
import java.util.Scanner;

class Instructor{
    int instructorID;
    String firstName;
    String lastName;
    Instructor(int i, String f, String l)
    {instructorID=i;
    firstName=f;
    lastName=l;}

    public int getInstructorID() {
        return instructorID;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}

class Course{
int courseID;
String courseName;
Instructor instructor;

    Course(int i,String n, Instructor in)
    {
        courseID=i;
        courseName=n;
        instructor=in;
    }
    public int getCourseID() {
        return courseID;
    }

    public String getCourseName() {
        return courseName;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public String toString()
    {return ("Course ID: "+ courseID+" / Course Name: "+courseName+"/ Instructor "+ instructor.firstName+" "+instructor.lastName );}
}


class Student{
    int studentID;
    String firstName;
    String lastName;
    ArrayList <Course> c;

    Student(int i, String n, String l)
    {studentID=i;
    firstName=n;
    lastName=l;
    c=new ArrayList<Course>();}

    public int getStudentID() {
        return studentID;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public ArrayList<Course> getCourses() {
        return c;
    }

    public void enroll(Course course)
    {c.add(course);}
}


public class University {
    public static void main(String args[]) {
        Student s = new Student(500, "Leith", "Engazzou");
        Instructor in = new Instructor(100, "Alex", "Hunter");
        Course c = new Course(1, "Physics", in);
        Course a=new Course(2,"Maths",in);
        s.enroll(c);
        s.enroll(a);
        ArrayList<Course> cr = s.getCourses();

        for (int i = 0; i < cr.size(); i++) {
            System.out.println(cr.get(i).toString());
        }
    }
}

