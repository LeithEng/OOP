# University Simulation Project Documentation

In this document, you'll find you'll find detailed information about the structure, classes and functionalities included in this project. The objective of this project is to simulate a university and its different structures and "parts".
I] Branch class

This class represents the different branches in a university.

1)Properties:

-name (String): Name of the branch (e.g., "Software Engineering").
-courses (ArrayList<Course>): List of courses offered in the branch.
-headOfBranch (Teacher): The teacher serving as the head of the branch.

2)Constructor:

Branch(String name, Teacher headOfBranch): Initializes a new branch with the given name and head teacher.

3)Methods:

-addCourse(Course course): void: Adds a course to the list of courses in the branch.
-showBranch(): void: Displays all the information about the branch

II] Teacher class

This class represents the various teacher working in the establishment

1)Properties:

-name (String): Name of the teacher.
-age (int): Age of the teacher.
-ID (int): ID of the teacher.
-speciality (String): subject of expertise of the teacher (e.g. "Algebra", "OOP"...)

2)Constructor:

-Teacher(String name, int age, int ID, String speciality): Initializes a new teacher with the given name, age, ID, and speciality.

3)Methods:

-accessors for all the different properties of a Teacher (name,age,ID,speciality)

-show_info(): void: Displays detailed information about the teacher.

III] Course class

This class represents the different courses in each branch's curriculum.

1)Properties:

-name (String): Name of the course.
-teacher (Teacher): The teacher conducting the course.
-coefficient (float): Coefficient associated with the course.
-students (ArrayList<Student>): List of students enrolled in the course.

2)Constructor:

-Course(String name, Teacher teacher, float coefficient): Initializes a new course with the given name, teacher, and coefficient.

3)Methods:

-addStudent(Student student): void: Adds a student to the list of students enrolled in the course.
-showCourse(): void: Displays information about the course, including details of the teacher and of each student enrolled in the course.
-accessors for all the different properties of a Course.

IV] Student Class:

This class represents the students enrolled in the university.


1)Properties:

-name (String): Name of the student.
-age (int): Age of the student.
-ID (int): ID of the student.
-exams (ArrayList<Exam>): List of exams taken by the student.

2)Constructor:

-Student(String name, int age, int ID): Initializes a new student with the given name, age, and ID.

3)Methods:
-As usual, the accessors to the private attributes.
-addExam(Exam exam): void: Adds an exam to the list of exams taken by the student.
-showStudentInfo(): void: Displays detailed information about the student, including name, ID, age, and details of each exam.

V] ClubStaff Class (inherits from Student):

This class represents the staff members of each club of the university. As any club's staff members are also students enrolled in that university, this class inherits from Student.

1)Properties:
-All the properties of a Student.
-role (String): Role of the student in the club (e.g "President", "Logistics Manager"...).

2)Constructor:

-ClubStaff(String name, int age, int ID, String role): Initializes a new club staff member with the given name, age, ID, and role.

3)Methods:
-All the methods of a Student
-showStaffInfo(): void: Displays detailed information about the club staff member, including name, ID, age, details of each exam, and the role in the club.

VI] Exam Class:

This class represents the different exams taken by the students.

1)Properties:

-subject (String): Subject of the exam.
-grade (float): Grade obtained in the exam.
-date (String): Date of the exam (given in a "DD/MM/YYYY" format)

2)Constructor:

-Exam(String subject, float grade, String date): Initializes a new exam with the given subject, grade, and date.

3)Methods:
-Accessors
-showExam(): void: Displays detailed information about the exam, including subject, grade, and date.

VII] Club Class:

What's a university without its clubs? This class represents the different clubs in the establishment, and includes information their staff members and all the events they organized.

1)Properties:

-name (String): Name of the club.
-domain (String): Domain or focus area of the club. (e.g. "Competitive Programming", "Cyber-security"...)
-staff (ArrayList<ClubStaff>): List of staff members.
-members (ArrayList<Student>): List of regular club members (who are students)
-events (ArrayList<Event>): List of events organized by the club.

2)Constructor:

-Club(String name, String domain): Initializes a new club with the given name and domain.

3)Methods:

-Accessors
-addStaff(ClubStaff clubStaff): void: Adds a staff member to the club.
-addMember(Student student): void: Adds a regular member to the club.
-addEvent(Event event): void: Adds an event to the list of events organized by the club.
-showClubInfo(): void: Displays information about the club, including name, domain, details of each staff member, and details of each event (if any).

VIII] Event Class:

A class representing the different events organised in the university. An event could be organised by a club, or by another entity related to the university (including the university itself)

1)Properties:

-name (String): Name of the event.
-theme (String): Theme or topic of the event.
-date (String): Date of the event.
-organiser (String): Organizing entity or individual for the event.

2)Constructor:

-Event(String name, String theme, String date, String organiser): Initializes a new event with the given name, theme, date, and organiser.

3)Methods:

-Accessors
-Mutators
-showEvent(): void: Displays detailed information about the event, including name, theme, date, and organiser.

IX] Staff Class (Abstract):

The staff working in the university. As the term "staff" is way too broad considering how a uni's staff is divided and organized, I opted to make this an abstract class and to create other classes inheriting from it to show the distribution of the staff in the establishment.

1)Properties

-name (String): Name of the staff member.
-id (int): ID of the staff member.
-age (int): Age of the staff member.

2)Constructor:

-Staff(String name, int id, int age): Initializes a new staff member with the given name, ID, and age.

3)Methods:

-Accessors
-showStaff(): void: Displays basic information about the staff member, including name, ID, and age.

X] AdministrationStaff Class (inherits from Staff):

The administrative staff running the university. As they are staff members, they inherit from the abstract class Staff.

1)Properties:

-department (String): Department in which the administrative staff works.

2)Constructor:

-AdministrationStaff(String name, int id, int age, String department): Initializes a new administrative staff member with the given name, ID, age, and department.

3)Methods:
-Accessor (returns the department)
-showStaff(): void: Overrides the showStaff() method to display additional information about the administrative staff, including the department.

XI] CleaningStaff Class (inherits from Staff):

The unsung heroes of any establishment, the ones keeping everything clean and shiny. As they are staff members, they inherit from the abstract class Staff.

1)Properties:

-area (String): Area assigned to the cleaning staff.

2)Constructor:

-CleaningStaff(String name, int id, int age, String area): Initializes a new cleaning staff member with the given name, ID, age, and assigned area.

3)Methods:

-showStaff(): void: Overrides the showStaff() method to display additional information about the cleaning staff, including the assigned area.

XII] Guard Class (inherits from Staff):

The guards of the university, keeping order and protecting the students and personnel in case of danger. As they are staff members, they inherit from the abstract class Staff.

1)Properties:

-WorkingTime (String): Working time assigned to the guard (Daytime, nighttime...)

2)Constructor:

-Guard(String name, int ID, int age, String workingTime): Initializes a new guard with the given name, ID, age, and working time.

3)Methods:

-showGuard(): void: Displays detailed information about the guard, including the working time.

XIII] Classroom

-A class which represents the different classrooms in a university.

XIV] Group
-The groups of each branch. Each student belongs to a group.


