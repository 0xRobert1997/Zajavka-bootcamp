package Zajavka.zadania.cw7_object.studentTeacher;


import java.util.Random;

public class Student extends Person implements Examinated{

    public Student(final String name, final String surname) {
        super(name, surname);
        System.out.println("Creating student: " + name + " " + surname);
    }

    public void writeExam(final Exam exam) {
        exam.setOwner(this);

        Random rand = new Random();
        Question[] questions = exam.getQuestions();

        for (Question question : questions) {
            int randomAnwserIndex = rand.nextInt(question.getPossibleAnswersSize());
            System.out.println("Student: " + getName() + " " + getSurname()
            + " answering questions: " + question.getContent()
            + ", possible answers: " + question.getPossibleAnswers()
            + ". answered: " + question.getPossibleAnswer(randomAnwserIndex)
            + ", index: [" + randomAnwserIndex + "]"
            );

            question.answer(randomAnwserIndex);
        }
    }


}
