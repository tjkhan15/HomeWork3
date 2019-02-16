package studentinfodb;

import java.util.Scanner;

public class MainStudent {

    public static void main(String[] args) {

        int x = 0;
        int menuChoice;

        StudentExtends[] students = new StudentExtends[10];
        StudentExtends st = new StudentExtends();

        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("\t\t\t\t\tStudent Record Menu");
            System.out.println("\t\t\t\t\t~~~~~~~~~~~~~~~~~~~");
            System.out.println("\t\t1.Add Student 2.View Students 3.View Courses 4.Calculate GPA 5.DB-Info 6.Exit");
            System.out.println("\t\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("Please, enter your option: ");
            menuChoice = sc.nextInt();

            if (menuChoice == 1) {
                if (x < 10) { //Able to add new student.

                    System.out.println("Enter Student Name: ");
                    st.setStuName(sc.next());

                    System.out.println("Enter Student ID: ");
                    st.setStuID(sc.nextInt());

                    System.out.println("Enter Student Age: ");
                    st.setStuAge(sc.nextInt());

                    System.out.println("Enter Student Gender: ");
                    st.setStuGender(sc.next());

                    // Create the new student using the given inputs
                    StudentExtends s = new StudentExtends(st.getStuName(), st.getStuID(),
                            st.getStuAge(), st.getStuGender());

                    // Put all the input into an array
                    students[x] = s;

                    // Increment x for next student admission
                    x++;

                } else {// Not able to add new student
                    System.out.println("Can't add any more new students---The slot is full");
                }
            } else if (menuChoice == 2) {
                if (students[0] == null) {
                    System.out.println("No student have been registered for the class---please add some new student.");
                }

                for (int i = 0; i < x; i++) {

                    StudentAbstract s = students[i];

                    System.out.println("Student " + (i + 1) + ":" + "\n----------");
                    System.out.println("Student Name: " + s.getStuName() + "\nID: " + s.getStuID()
                            + "\nAge: " + st.getStuAge() + "\nGender: " + s.getStuGender());
                    System.out.println("****************************************");

                }
            }

            else if (menuChoice == 3) {
                System.out.println("Courses offered are: ");
                System.out.println(StudentEnum.Selenium + ", " + StudentEnum.UFT + ", " + StudentEnum.DBA);

            } else if (menuChoice == 4) {

                System.out.println("Enter your Midterm Exam Score: ");
                StudentExtends.midtermExam = sc.nextDouble();

                System.out.println("Enter your Final Exam Score: ");
                StudentExtends.finalExam = sc.nextDouble();

                System.out.println("Your midterm exam score was: " + StudentExtends.midtermExam);
                System.out.println("Your final exam score was: " + StudentExtends.finalExam);

                st.gpaCal();
                if (st.isPassing()) {
                    System.out.println("Congratulations, you have Passed the class");
                } else {
                    System.out.println("Sorry Pal, you have Failed the class");
                }

            } else if (menuChoice == 5) {
                DatabaseLicense dbl = DatabaseLicense.getInstance();
                dbl.databaseFeatures();

            } else if (menuChoice == 6) {
                System.out.println("Good Bye!");

            } else if (menuChoice < 1 || menuChoice > 6) {
                System.out.println("Unrecognized menu choice; please re-enter");
            }

        } while (menuChoice != 6);

        sc.close();

    }

}
