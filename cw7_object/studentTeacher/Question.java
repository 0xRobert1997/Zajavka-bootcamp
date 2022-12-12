package Zajavka.zadania.cw7_object.studentTeacher;

import java.util.Arrays;

public class Question {
    private final int id;
    private final String content;
    private final String[] possibleAnswers;
    private final int goodAnswerIndex;
    private int givenAnswerIndex;


    public Question(int id, String content, String[] possibleAnswers, int goodAnswerIndex) {
        this.id = id;
        this.content = content;
        this.possibleAnswers = possibleAnswers;
        this.goodAnswerIndex = goodAnswerIndex;
    }

    public String getPossibleAnswers() {
        return Arrays.toString(possibleAnswers);
    }

    public String getPossibleAnswer(int index) {
        return possibleAnswers[index];
    }
    public int getPossibleAnswersSize() {
        return possibleAnswers.length;
    }

    public String getContent() {
        return content;
    }

    public void answer(int index) {
        this.givenAnswerIndex = index;
    }

    boolean isCorrectlyAnswered() {
        System.out.println("Questions: " + id
        + ", content: " + content+ ", goodAnswerIndex: "
        + ", givenAnwserIndex: " + givenAnswerIndex);
        return goodAnswerIndex == givenAnswerIndex;
    }

}
