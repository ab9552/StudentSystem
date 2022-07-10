import courses.CourseInfo;
import exams.ExamInfo;
import students.StudentInfo;
import teachers.TeacherInfo;

import java.util.*;

public class School {

    private StudentInfo studentInfo;
    private TeacherInfo teacherInfo;
    private CourseInfo courseInfo;
    private ExamInfo examInfo;

    public School(StudentInfo studentInfo, TeacherInfo teacherInfo, CourseInfo courseInfo, ExamInfo examInfo){
        this.studentInfo = studentInfo;
        this.teacherInfo = teacherInfo;
        this.courseInfo = courseInfo;
        this.examInfo = examInfo;
    }


        public void userMenu () {
            Scanner scanner = new Scanner(System.in);

            try {

                boolean quit = false;
                int choice = 0;

                System.out.println("What would you like to do?");

                while (!quit) {

                    printOptions();

                    choice = scanner.nextInt();

                    switch (choice) {
                        case 0:
                            printOptions();
                            break;
                        case 1:
                            studentInfo.createStudent();
                            break;
                        case 2:
                            studentInfo.viewStudent();
                            break;
                        case 3:
                            studentInfo.editStudent();
                            break;
                        case 4:
                            studentInfo.removeStudent();
                            break;
                        case 5:
                            teacherInfo.createTeacher();
                            break;
                        case 6:
                            teacherInfo.viewTeacher();
                            break;
                        case 7:
                            teacherInfo.editTeacher();
                            break;
                        case 8:
                            teacherInfo.removeTeacher();
                            break;
                        case 9:
                            courseInfo.createCourse();
                            break;
                        case 10:
                            courseInfo.viewCourse();
                            break;
                        case 11:
                            courseInfo.editCourse();
                            break;
                        case 12:
                            courseInfo.removeCourse();
                            break;
                        case 13:
                            examInfo.createExamResults();
                            break;
                        case 14:
                            examInfo.viewExamResults();
                            break;
                        case 15:
                            examInfo.editExamResults();
                            break;
                        case 16:
                            quit = true;
                            System.out.println("Goodbye!");
                            System.exit(0);
                            break;
                    }
                }

            } catch (Exception e) {
                System.out.println("Problem occurred in the user menu! " + e);

            }
        }


        public void printOptions () {

            System.out.println("\nPress");
            System.out.println("\t 0 - To print choice options");

            System.out.println("\t 1 - To add a new student");
            System.out.println("\t 2 - To view a student");
            System.out.println("\t 3 - To update student's info");
            System.out.println("\t 4 - To delete student");

            System.out.println("\t 5 - To add a new teacher");
            System.out.println("\t 6 - To view a teacher");
            System.out.println("\t 7 - To update teacher's info");
            System.out.println("\t 8 - To delete teacher");

            System.out.println("\t 9 - To add a new course");
            System.out.println("\t 10 - To view course");
            System.out.println("\t 11 - To update course info");
            System.out.println("\t 12 - To delete course");

            System.out.println("\t 13 - To add a new exam results");
            System.out.println("\t 14 - To view exam results");
            System.out.println("\t 15 - To edit exam results");


            System.out.println("\t 16 - To log out");
        }
}






