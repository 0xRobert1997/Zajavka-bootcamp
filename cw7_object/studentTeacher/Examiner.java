package Zajavka.zadania.cw7_object.studentTeacher;

public interface Examiner {

    Exam[] createExams(int numberOfStudents);

    void evaluateExams(Exam[] exams);
}
