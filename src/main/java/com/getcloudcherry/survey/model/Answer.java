package com.getcloudcherry.survey.model;

/**
 * Created by riteshdubey on 8/1/16.
 */
public class Answer {
    public String questionId;
    public String questionText;
    public String textInput;
    public int numberInput;

    public Answer(String questionId, String questionText, String textInput) {
        this.questionId = questionId;
        this.questionText = questionText;
        this.textInput = textInput;
    }

    public Answer(String questionId, String questionText, int numberInput) {
        this.questionId = questionId;
        this.questionText = questionText;
        this.numberInput = numberInput;
    }
}
