public abstract class Staff {
    protected String name;
    protected int id;
    protected int age;

    public Staff(String name, int id,int age) {
        this.name = name;
        this.id = id;
        this.age=age;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
    public void ShowStaff()
    {
        System.out.println("Name: "+name);
        System.out.println("ID: "+id);
        System.out.println("age: "+age);
    }
}

class AdministrationStaff extends Staff {
    private String department;

    AdministrationStaff(String name, int id, int age, String department) {
        super(name, id, age);
        this.department = department;
    }
    public String getDepartment() {
        return department;
    }

    @Override
    public void ShowStaff() {
        super.ShowStaff();
        System.out.println("Department: "+department);
    }
}

class CleaningStaff extends Staff{
    private String area;

    public CleaningStaff(String name, int id, int age, String area) {
        super(name, id,age);
        this.area = area;
    }

    @Override
    public void ShowStaff() {
        super.ShowStaff();
        System.out.println("Area: "+area);
    }
}

class Guard extends Staff{
    private String WorkingTime;
    public Guard(String name, int ID, int age, String WorkingTime)
    {super(name,ID,age);
    this.WorkingTime=WorkingTime;}
    public void showGuard()
    {super.ShowStaff();
        System.out.println("Working Time: "+WorkingTime);}

}