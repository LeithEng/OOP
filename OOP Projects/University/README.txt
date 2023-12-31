# University Simulation Project Documentation

In this document, you'll find you'll find detailed information about the structure, classes and functionalities included in this project. The objective of this project is to simulate a university and its different structures and "parts".
I] Branch class

This class represents the different branches in a university. Each branch has a teacher presiding it.


II] Teacher class

This class represents the various teachers working in the establishment


III] Course class

This class represents the different courses in each branch's curriculum.


IV] Student Class:

This class represents the students enrolled in the university.


V] ClubStaff Class (inherits from Student):

This class represents the staff members of each club of the university. As any club's staff members are also students enrolled in that university, this class inherits from Student.


VI] Exam Class:

This class represents the different exams taken by the students.


VII] Club Class:

What's a university without its clubs? This class represents the different clubs in the establishment, and includes information their staff members and all the events they organized.


VIII] Event Class:

A class representing the different events organised in the university. An event could be organised by a club, or by another entity related to the university (including the university itself)

IX] Staff Class (Abstract):

The staff working in the university. As the term "staff" is way too broad considering how a uni's staff is divided and organized, I opted to make this an abstract class and to create other classes inheriting from it to show the distribution of the staff in the establishment.


X] AdministrationStaff Class (inherits from Staff):

The administrative staff running the university. As they are staff members, they inherit from the abstract class Staff.


XI] CleaningStaff Class (inherits from Staff):

The ones keeping everything clean and shiny. As they are staff members, they inherit from the abstract class Staff.

1)Properties:


XII] Guard Class (inherits from Staff):

The guards of the university, keeping order and protecting the students and personnel in case of danger. As they are staff members, they inherit from the abstract class Staff.


XIII] Classroom

-A class which represents the different classrooms in a university.

XIV] Group
-The groups of each branch. Each student belongs to a group.


