package org.academia.bootcamp.Game;

import org.academia.bootcamp.userInput.QuestionInput;
import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Text;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by dora on 23-04-2016.
 */
public class Question {

    //constructor
    public Question() {

        //adds 5 lines to question arraylist of tex
        quest.add(textLine1);
        quest.add(textLine2);
        quest.add(textLine3);
        quest.add(textLine4);
        quest.add(textLine5);

        //sets color and font size for every line
        for(int i = 0; i<quest.size();i++) {

            quest.get(i).grow(8, 8);
            quest.get(i).setColor(Color.WHITE);
        }
    }



    private Text textLine1 = new Text(40, 55, "");
    private Text textLine2 = new Text(40, 80, "");
    private Text textLine3 = new Text(40, 105, "");
    private Text textLine4 = new Text(40, 130, "");
    private Text textLine5 = new Text(40, 155, "");

    //creates an arraylist of text
    private List<Text> quest = new ArrayList<>();

    //creates an array of strings with textlines of every question
    //array of strings with every line1 from each question
    private String[] questionLine1 = {
            QuestionInput.Q1LINE1,
            QuestionInput.Q2LINE1,
            QuestionInput.Q3LINE1,
            QuestionInput.Q4LINE1,
            QuestionInput.Q5LINE1,
            QuestionInput.Q6LINE1
    };

    //array of strings with every line2 from each question
    private String[] questionLine2 = {
            QuestionInput.Q1LINE2,
            QuestionInput.Q2LINE2,
            QuestionInput.Q3LINE2,
            QuestionInput.Q4LINE2,
            QuestionInput.Q5LINE2,
            QuestionInput.Q6LINE2
    };

    //array of strings with every line3 from each question
    private String[] questionLine3 = {
            QuestionInput.Q1LINE3,
            QuestionInput.Q2LINE3,
            QuestionInput.Q3LINE3,
            QuestionInput.Q4LINE3,
            QuestionInput.Q5LINE3,
            QuestionInput.Q6LINE3
    };

    //array of strings with every line4 from each question
    private String[] questionLine4 = {
            QuestionInput.Q1LINE4,
            QuestionInput.Q2LINE4,
            QuestionInput.Q3LINE4,
            QuestionInput.Q4LINE4,
            QuestionInput.Q5LINE4,
            QuestionInput.Q6LINE4
    };

    //array of strings with every line5 from each question
    private String[] questionLine5 = {
            QuestionInput.Q1LINE5,
            QuestionInput.Q2LINE5,
            QuestionInput.Q3LINE5,
            QuestionInput.Q4LINE5,
            QuestionInput.Q5LINE5,
            QuestionInput.Q6LINE5
    };



    //sets every lines of text for the question that should be displayed at the time
    public void setQuestion(int clickCounter){

        //if clickerCounter is a pair and still has questions to print
        if (clickCounter %2 == 0 && clickCounter < (QuestionInput.NUMBERQUESTIONS *2)) {

            //if it is the first question
            if (clickCounter == 0){
                quest.get(0).setText(questionLine1[clickCounter]);
                quest.get(1).setText(questionLine2[clickCounter]);
                quest.get(2).setText(questionLine3[clickCounter]);
                quest.get(3).setText(questionLine4[clickCounter]);
                quest.get(4).setText(questionLine5[clickCounter]);
            }

            //rest of the questions
            else {
                quest.get(0).setText(questionLine1[clickCounter/2]);
                quest.get(1).setText(questionLine2[clickCounter/2]);
                quest.get(2).setText(questionLine3[clickCounter/2]);
                quest.get(3).setText(questionLine4[clickCounter/2]);
                quest.get(4).setText(questionLine5[clickCounter/2]);
            }

        //if an answer is displayed
        } else {
            quest.get(0).setText("");
            quest.get(1).setText("");
            quest.get(2).setText("");
            quest.get(3).setText("");
            quest.get(4).setText("");
        }
    }

    //drays questions
    public void draw(){

        for(int i = 0; i<quest.size();i++) {

            quest.get(i).draw();
        }
    }
}
