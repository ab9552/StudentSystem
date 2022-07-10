package students;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class StudentInfo {

    Student newStudent = new Student();
    private ArrayList<Student> students = new ArrayList<>();

    public String addStudent(Student student) {
        this.students.add(student);
        return "Student successfully added!";
    }


    public void createStudent() {
        Scanner scanner = new Scanner(System.in);

        try {

            System.out.println("Enter ID of the student:");
            newStudent.setStudentID(scanner.nextInt());
            System.out.println("Enter name of the student:");
            newStudent.setStudentName(scanner.nextLine());
            newStudent.setStudentName(scanner.nextLine());

            addStudent(newStudent);

            String response = addStudent(newStudent);

            System.out.println(" ");
            System.out.println(response);

        }catch(Exception e){
            System.out.println("Problem occurred while creating a student! " + e);
        }
    }

    public void editStudent() {
        Scanner scanner = new Scanner(System.in);

        try {

            System.out.println("Enter ID of student which info you want to update:");
            int studentID = scanner.nextInt();


            if (Objects.equals(newStudent.getStudentID(), studentID)) {
                System.out.println("Enter the updated name of the student:");
                newStudent.setStudentName(scanner.nextLine());
                newStudent.setStudentName(scanner.nextLine());
                System.out.println(" ");
                System.out.println("Student info updated successfully!");
            } else {
                System.out.println("Incorrect student ID!");
            }


        } catch (Exception e) {
            System.out.println("Problem occurred while editing student info: " + e);
        }
    }


    public String deleteStudent(Student student) {
        this.students.remove(student);
        return "Student deleted successfully!";
    }

    public void removeStudent() {
        Scanner scanner = new Scanner(System.in);

        try {

                System.out.println("Enter ID of the student you want to delete:");
                int studentID = scanner.nextInt();

                if (Objects.equals(newStudent.getStudentID(), studentID)) {

                    deleteStudent(newStudent);

                    String response = deleteStudent(newStudent);

                    System.out.println(" ");
                    System.out.println(response);

                } else {
                    System.out.println("Invalid student ID!");
                }

        }catch (Exception e){
            System.out.println("Problem occurred while deleting student: " + e);
        }

    }

    public void viewStudent() {
        Scanner scanner = new Scanner(System.in);

        try {

            System.out.println("Enter ID of the student that you want to view:");
            int studentID = scanner.nextInt();

            if(Objects.equals(newStudent.getStudentID(), studentID)){
                String output = "Student: \n\t student_id: %d \n\t student_name: %s";
                System.out.println(String.format(output,newStudent.getStudentID(), newStudent.getStudentName()));

            }else {
                System.out.println("Incorrect student ID!");
            }



        }catch (Exception e){
            System.out.println("Problem occurred while viewing student: " + e);
        }
    }
}
