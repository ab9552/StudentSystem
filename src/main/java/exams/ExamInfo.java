package exams;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class ExamInfo {

    ArrayList<Exam> exams = new ArrayList<>();
    Exam newExam = new Exam();

    public String addExamResults(Exam exam){
        this.exams.add(exam);
        return "Exam results successfully added!";
    }


    public void createExamResults() {
        Scanner scanner = new Scanner(System.in);

        try {

            System.out.println("Enter ID of the exam results:");
            newExam.setExamID(scanner.nextInt());
            System.out.println("Enter name of the student that took exam:");
            newExam.setStudentNameThatTookExam(scanner.nextLine());
            newExam.setStudentNameThatTookExam(scanner.nextLine());
            System.out.println("Enter the name of the course in which the exam was taken:");
            newExam.setCourseNameInWitchExamWasTaken(scanner.nextLine());
            System.out.println("Enter the exam score:");
            newExam.setExamScore(scanner.nextInt());

            addExamResults(newExam);

            String response = addExamResults(newExam);

            System.out.println(" ");
            System.out.println(response);


        } catch (Exception e) {
            System.out.println("Problem occurred while adding exam results! " + e);
        }
    }

    public void viewExamResults() {
        Scanner scanner = new Scanner(System.in);

        try {

            System.out.println("Enter ID of the exam results that you want to view:");
            int examID = scanner.nextInt();

            if(Objects.equals(newExam.getExamID(), examID)){

                String output = "Exam results: \n\t exam_id: %d \n\t student_name_that_took_exam: %s \n\t" +
                        " course_name_in_which_exam_was_taken: %s \n\t exam_score: %d";
                System.out.println(String.format(output,newExam.getExamID(), newExam.getStudentNameThatTookExam(),
                        newExam.getCourseNameInWitchExamWasTaken(), newExam.getExamScore()));
            }else {
                System.out.println("Incorrect exam results ID!");
            }

        }catch (Exception e){
            System.out.println("Problem occurred while viewing exam results: " + e);
        }
    }

    public void editExamResults() {
        Scanner scanner = new Scanner(System.in);

        try {

            System.out.println("Enter ID of exam results which info you want to update:");
            int examID = scanner.nextInt();

            if (Objects.equals(newExam.getExamID(), examID)) {
                System.out.println("Enter the updated name of the student who took exam:");
                newExam.setStudentNameThatTookExam(scanner.nextLine());
                newExam.setStudentNameThatTookExam(scanner.nextLine());

                System.out.println("Enter the updated name of the course in which exam was taken:");
                newExam.setCourseNameInWitchExamWasTaken(scanner.nextLine());

                System.out.println("Enter updated exam score:");
                newExam.setExamScore(scanner.nextInt());

                System.out.println(" ");
                System.out.println("Exam result info updated successfully!");
            } else {
                System.out.println("Incorrect exam results ID!");
            }


        } catch (Exception e) {
            System.out.println("Problem occurred while editing exam results info: " + e);
        }
    }


}
