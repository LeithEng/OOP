public class Exam {
    private String subject;
    private float Grade;
    private String Date;
    Exam(String subject, float Grade, String Date)
    {this.subject=subject;
    this.Grade= Grade;
    this.Date=Date;}

    public float getGrade() {
        return Grade;
    }

    public String getSubject() {
        return subject;
    }

    public String getDate() {
        return Date;
    }
    public void ShowExam()
    {
        System.out.println("Subject: "+subject);
        System.out.println("Grade: "+Grade);
        System.out.println("Date: "+Date);

    }

}
