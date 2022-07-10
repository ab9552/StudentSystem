import courses.CourseInfo;
import exams.ExamInfo;
import students.StudentInfo;
import teachers.TeacherInfo;

public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to our service!");
        System.out.println("______________________");

        School school = new School(new StudentInfo(), new TeacherInfo(), new CourseInfo(), new ExamInfo());
        school.userMenu();




    }
}
