public class Teacher {
    private String name;
    private int Age;
    private int ID;
    private String Speciality;
    Teacher(String name, int Age, int ID, String Speciality)
    {this.Age=Age;
    this.name=name;
    this.ID=ID;
    this.Speciality=Speciality;}

    public String getName() {
        return name;
    }

    public int getAge() {
        return Age;
    }

    public int getID() {
        return ID;
    }

    public String getSpeciality() {
        return Speciality;
    }
    public void show_info()
    {
        System.out.println("Teacher's name: "+this.name);
        System.out.println("Age: "+this.Age);
        System.out.println("ID: "+this.ID);
        System.out.println("Speciality: "+this.Speciality);

    }

}

