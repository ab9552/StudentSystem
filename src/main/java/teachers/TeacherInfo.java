package teachers;

import teachers.Teacher;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class TeacherInfo {

    ArrayList<Teacher> teachers = new ArrayList<>();
    Teacher newTeacher = new Teacher();

    public String addTeacher(Teacher teacher) {
        this.teachers.add(teacher);
        return "Teacher successfully added!";
    }

    public String deleteTeacher(Teacher teacher) {
        this.teachers.remove(teacher);
        return "Teacher deleted successfully!";
    }

    public void createTeacher() {
        Scanner scanner = new Scanner(System.in);

        try {

            System.out.println("Enter ID of the teacher:");
            newTeacher.setTeacherID(scanner.nextInt());
            System.out.println("Enter name of the teacher:");
            newTeacher.setTeacherName(scanner.nextLine());
            newTeacher.setTeacherName(scanner.nextLine());

            addTeacher(newTeacher);

            String response = addTeacher(newTeacher);

            System.out.println(" ");
            System.out.println(response);


        } catch (Exception e) {
            System.out.println("Problem occurred while creating a teacher! " + e);
        }
    }

    public void editTeacher() {
        Scanner scanner = new Scanner(System.in);

        try {

            System.out.println("Enter ID of teacher which info you want to update:");
            int teacherID = scanner.nextInt();


            if (Objects.equals(newTeacher.getTeacherID(), teacherID)) {
                System.out.println("Enter the updated name of the teacher:");
                newTeacher.setTeacherName(scanner.nextLine());
                newTeacher.setTeacherName(scanner.nextLine());
                System.out.println(" ");
                System.out.println("Teacher info updated successfully!");
            } else {
                System.out.println("Incorrect teacher ID!");
            }


        } catch (Exception e) {
            System.out.println("Problem occurred while editing teacher info: " + e);
        }
    }

    public void removeTeacher() {
        Scanner scanner = new Scanner(System.in);

        try {

                System.out.println("Enter ID of the teacher you want to delete:");
                int teacherID = scanner.nextInt();

                if (Objects.equals(newTeacher.getTeacherID(), teacherID)) {

                    deleteTeacher(newTeacher);

                    String response = deleteTeacher(newTeacher);

                    System.out.println(" ");
                    System.out.println(response);

                } else {
                    System.out.println("Invalid teacher ID!");
                }

        }catch (Exception e){
            System.out.println("Problem occurred while deleting teacher: " + e);
        }

    }

    public void viewTeacher() {
        Scanner scanner = new Scanner(System.in);

        try {

            System.out.println("Enter ID of the teacher that you want to view:");
            int teacherID = scanner.nextInt();

            if(Objects.equals(newTeacher.getTeacherID(), teacherID)){
                String output = "Teacher: \n\t teacher_id: %d \n\t teacher_name: %s";
                System.out.println(String.format(output,newTeacher.getTeacherID(), newTeacher.getTeacherName()));
            }else {
                System.out.println("Incorrect teacher ID!");
            }

        }catch (Exception e){
            System.out.println("Problem occurred while viewing teacher: " + e);
        }
    }
}
