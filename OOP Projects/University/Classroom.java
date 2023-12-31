public class Classroom {
    private int Number;
    private int size;

    public Classroom (int n, int s)
    {Number=n;
    size=s;}

    public int getNumber() {
        return Number;
    }

    public int getSize() {
        return size;
    }

    public void ShowClassroom()
    {
        System.out.println("Classroom number: "+Number);
        System.out.println("Size: "+size);
    }

}
