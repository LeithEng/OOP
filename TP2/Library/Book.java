import java.util.ArrayList;
public class Book {
    protected String title;
    protected String author;
    protected int year;
    public Book(){}
    public Book(String t, String a, int y)
    {title=t;
    author=a;
    year=y;}
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }
    public void displayInfo(){}
}

class Novel extends Book{
    private String genre;
    Novel(String t,String a, int y, String g)
    {super(t,a,y);
    genre=g;}

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void displayInfo(){
        System.out.println("---------");
        System.out.println("Title of the novel: "+title);
        System.out.println("Author: "+ author);
        System.out.println("Year of publication: "+year);
        System.out.println("Genre: "+genre);
    }
}

class Textbook extends Book{
    private String subject;
    Textbook(String t,String a, int y, String s)
    {super(t,a,y);
    subject=s;}

    public void setSubject(String subject) {
        this.subject = subject;
    }
    public void displayInfo(){
        System.out.println("---------");
        System.out.println("Title of the textbook: "+title);
        System.out.println("Author: "+ author);
        System.out.println("Year of publication: "+year);
        System.out.println("Subject: "+subject);
    }
}

class Library {
    public ArrayList<Book> Inventory = new ArrayList<Book>();

    public void AddBook(Book B) {
        Inventory.add(B);
    }

    public void RemoveBook(int i) {
        Inventory.remove(i);
    }

    public void ShowBooks() {
        for (int i = 0; i < Inventory.size(); i++) {
            Book b = Inventory.get(i);
            b.displayInfo();
        }


    }
}

interface LibraryUser{
    public void borrowBook(Book b);
    public void returnBook(Book b);
}

class Student implements LibraryUser {
    private String name;
    private int age;
    private int student_id;
    public ArrayList<Book> BorrowedBooks = new ArrayList<Book>();
    private LibraryCard card=new LibraryCard();
    public Student (String n, int a , int i)
    {   name=n;
        card.name=n;
        age=a;
        student_id=i;
        card.id=i;}

    @Override
    public void borrowBook(Book b) {
        BorrowedBooks.add(b);
    }

    public void returnBook(Book b) {
        int p = 0;
        for (int i = 0; i < BorrowedBooks.size(); i++) {
            if (b.title == (BorrowedBooks.get(i)).title) {
                p = i;
                break;
            }
        }
        BorrowedBooks.remove(p);
    }
}

class Teacher implements LibraryUser{
    private String name;
    private int age;
    private int teacher_id;
    private ArrayList<Book> BorrowedBooks = new ArrayList<Book>();
    private LibraryCard card=new LibraryCard();
    public Teacher (String n, int a , int i)
    {name=n;
    card.name=n;
    age=a;
    teacher_id=i;
    card.id=i;}

    @Override
    public void borrowBook(Book b) {
        BorrowedBooks.add(b);
    }

    public void returnBook(Book b) {
        int p = 0;
        for (int i = 0; i < BorrowedBooks.size(); i++) {
            if (b.title == (BorrowedBooks.get(i)).title) {
                p = i;
                break;
            }
        }
        BorrowedBooks.remove(p);
    }

}

class LibraryCard {
    static int number = 1;
    public String name;
    public int id;

    LibraryCard() {
        number++;
    }

    public static void main(String[] args) {
        Library l = new Library();
        Novel n = new Novel("t", "a", 2000, "g");
        Textbook t = new Textbook("t1", "a1", 2005, "s");
        l.AddBook(n);
        l.AddBook(t);
        l.ShowBooks();
        Student s = new Student("name", 15, 15);
        s.borrowBook(n);
        s.borrowBook(t);
        s.returnBook(n);
        for (int i = 0; i < 1; i++) {
            Book b = s.BorrowedBooks.get(i);
            b.displayInfo();
        }
    }
}