package com.example.user.eightball;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by user on 12/12/2016.
 */
public class Answer implements Answerable {

    private ArrayList<String> answers;

    public Answer() {
        this.answers = new ArrayList<String>();
        setupAnswers();
    }

    public Answer(ArrayList<String> answers) {
        this.answers = new ArrayList<String>(answers);
    }



    public ArrayList<String> getAnswers() {
        return new ArrayList<String>(this.answers);
    }

    public void add(String answer) {
        answers.add(answer);
    }

    public int getAnswerCount() {
        return answers.size();
    }

    public String getAnswerAtIndex(int index) {
        return answers.get(index);
    }

    public String getAnswer() {
        Random rand = new Random();
        int listSize = getAnswerCount();
        int index = rand.nextInt(listSize);
        String answer = getAnswerAtIndex(index);
        return answer;
    }

    private void setupAnswers() {
        String[] answersToAdd = {
                "yes!",
                "That would be an economical matter!",
                "You wish!",
                "Definitely not",
                "I think so",
                "Wouldn't you like to know",
                "You don't need to know that",
                "nup"
        };


        for (String answer : answersToAdd) {
            add(answer);
        }
    }
}


