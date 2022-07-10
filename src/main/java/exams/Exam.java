package exams;

public class Exam {

    private int examID;
    private String studentNameThatTookExam;
    private String courseNameInWitchExamWasTaken;
    private int examScore;

    public int getExamID() {
        return examID;
    }

    public void setExamID(int examID) {
        this.examID = examID;
    }

    public String getStudentNameThatTookExam() {
        return studentNameThatTookExam;
    }

    public void setStudentNameThatTookExam(String studentNameThatTookExam) {
        this.studentNameThatTookExam = studentNameThatTookExam;
    }

    public String getCourseNameInWitchExamWasTaken() {
        return courseNameInWitchExamWasTaken;
    }

    public void setCourseNameInWitchExamWasTaken(String courseNameInWitchExamWasTaken) {
        this.courseNameInWitchExamWasTaken = courseNameInWitchExamWasTaken;
    }

    public int getExamScore() {
        return examScore;
    }

    public void setExamScore(int examScore) {
        this.examScore = examScore;
    }
}
