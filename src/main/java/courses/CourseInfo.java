package courses;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class CourseInfo {

    ArrayList<Course> courses = new ArrayList<>();
    Course newCourse = new Course();

    public String addCourse(Course course){
        this.courses.add(course);
        return "Course successfully added!";
    }

    public String deleteCourse(Course course){
        this.courses.remove(course);
        return "Course deleted successfully!";
    }

    public void createCourse() {
        Scanner scanner = new Scanner(System.in);

        try {

            System.out.println("Enter ID of the course:");
            newCourse.setCourseID(scanner.nextInt());
            System.out.println("Enter name of the course:");
            newCourse.setCourseName(scanner.nextLine());
            newCourse.setCourseName(scanner.nextLine());
            System.out.println("Enter the name of the teacher who teaches this course:");
            newCourse.setCourseTeacher(scanner.nextLine());

            addCourse(newCourse);

            String response = addCourse(newCourse);

            System.out.println(" ");
            System.out.println(response);


        } catch (Exception e) {
            System.out.println("Problem occurred while creating a course! " + e);
        }
    }

    public void editCourse() {
        Scanner scanner = new Scanner(System.in);

        try {

            System.out.println("Enter ID of course which info you want to update:");
            int courseID = scanner.nextInt();


            if (Objects.equals(newCourse.getCourseID(), courseID)) {
                System.out.println("Enter the updated name of the course:");
                newCourse.setCourseName(scanner.nextLine());
                newCourse.setCourseName(scanner.nextLine());

                System.out.println("Enter the updated name of the teacher who teaches this course:");
                newCourse.setCourseTeacher(scanner.nextLine());

                System.out.println(" ");
                System.out.println("Student info updated successfully!");
            } else {
                System.out.println("Incorrect course ID!");
            }


        } catch (Exception e) {
            System.out.println("Problem occurred while editing course info: " + e);
        }
    }

    public void removeCourse() {
        Scanner scanner = new Scanner(System.in);

        try {

                System.out.println("Enter ID of the course you want to delete:");
                int courseID = scanner.nextInt();

                if (Objects.equals(newCourse.getCourseID(), courseID)) {

                    deleteCourse(newCourse);

                    String response = deleteCourse(newCourse);

                    System.out.println(" ");
                    System.out.println(response);

                } else {
                    System.out.println("Invalid course ID!");
                }

        }catch (Exception e){
            System.out.println("Problem occurred while deleting course: " + e);
        }

    }

    public void viewCourse() {
        Scanner scanner = new Scanner(System.in);

        try {

            System.out.println("Enter ID of the course that you want to view:");
            int courseID = scanner.nextInt();

            if(Objects.equals(newCourse.getCourseID(), courseID)){

                String output = "Course: \n\t course_id: %d \n\t course_name: %s \n\t course_teacher_name: %s";
                System.out.println(String.format(output,newCourse.getCourseID(), newCourse.getCourseName(), newCourse.getCourseTeacher()));
            }else {
                System.out.println("Incorrect course ID!");
            }

        }catch (Exception e){
            System.out.println("Problem occurred while viewing course: " + e);
        }
    }
}
