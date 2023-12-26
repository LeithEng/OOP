public class Main{
    public static void main(String[] args) {
        Student s=new Student("Leith Engazzou",20,1);
        Exam E=new Exam("Operating Systems",17,"30/10/2023");
        Club cl=new Club("ACM","Competitive Programming");
        ClubStaff cs=new ClubStaff("Alex Hunter",23, 1466,"President");
        Event e=new Event("Code Quest","One Piece-themed CP contest","10/12/2023","ACM INSAT");
        Teacher t=new Teacher("John Smith",40,4587,"Java and OOP");
        Course c= new Course("OOP",t,4);
        Branch GL=new Branch("Software Engineering",t);
        Guard g=new Guard("John Doe",4789,33,"Daytime");
        AdministrationStaff a=new AdministrationStaff("Jane Smith",1347,38,"Internal Affairs");
        s.AddExam(E);
        cl.AddStaff(cs);
        cl.AddMember(s);
        cl.AddEvent(e);
        c.AddStudent(s);
        GL.AddCourse(c);
        s.show_student_info();
        t.show_info();
        cl.ShowClubInfo();
        g.showGuard();
        a.ShowStaff();

    }
}