package Zajavka.zadania.cw7_object.studentTeacher;

public class Excercises {

    public static void main(String[] args) {

        exercise4();
    }

    private static void exercise4() {

        Examiner teacher = new Teacher("Nauczyciel", "Nauczycielski");

        Examinated[] students = new Student[] {
                new Student("Rafal", "Rafalski"),
                new Student("Roman", "Romanski"),
                new Student("Michal", "Michalski")
        };
        System.out.println();

        Exam[] exams = teacher.createExams(students.length);

        for (int i = 0; i < students.length; i++) {
            students[i].writeExam(exams[i]);
        }
        System.out.println();

        teacher.evaluateExams(exams);
    }
}
