package org.academia.bootcamp.Game;

import org.academia.bootcamp.userInput.AnswerInput;
import org.academia.bootcamp.userInput.QuestionInput;
import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Text;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by dora on 24-04-2016.
 */
public class Answer {


    // constructor
    public Answer() {

        //adds 5 lines to answer arraylist of text
        answ.add(textLine1);
        answ.add(textLine2);
        answ.add(textLine3);
        answ.add(textLine4);
        answ.add(textLine5);

        //sets color and font size for every line
        for (int i = 0; i < answ.size(); i++) {

            answ.get(i).grow(8, 8);
            answ.get(i).setColor(Color.WHITE);
        }

    }


    private Text textLine1 = new Text(40, 55, "");
    private Text textLine2 = new Text(40, 80, "");
    private Text textLine3 = new Text(40, 105, "");
    private Text textLine4 = new Text(40, 130, "");
    private Text textLine5 = new Text(40, 155, "");

    //creates an arraylist of text
    private List<Text> answ = new ArrayList<>();


    //creates an array of strings with textlines of every answer
    //array of strings with every line1 from each answer
    private String[] answerLine1 = {
            AnswerInput.A1LINE1,
            AnswerInput.A2LINE1,
            AnswerInput.A3LINE1,
            AnswerInput.A4LINE1,
            AnswerInput.A5LINE1,
            AnswerInput.A6LINE1
    };

    //array of strings with every line2 from each answer
    private String[] answerLine2 = {
            AnswerInput.A1LINE2,
            AnswerInput.A2LINE2,
            AnswerInput.A3LINE2,
            AnswerInput.A4LINE2,
            AnswerInput.A5LINE2,
            AnswerInput.A6LINE2
    };

    //array of strings with every line3 from each answer
    private String[] answerLine3 = {
            AnswerInput.A1LINE3,
            AnswerInput.A2LINE3,
            AnswerInput.A3LINE3,
            AnswerInput.A4LINE3,
            AnswerInput.A5LINE3,
            AnswerInput.A6LINE3
    };

    //array of strings with every line4 from each answer
    private String[] answerLine4 = {
            AnswerInput.A1LINE4,
            AnswerInput.A2LINE4,
            AnswerInput.A3LINE4,
            AnswerInput.A4LINE4,
            AnswerInput.A5LINE4,
            AnswerInput.A6LINE4
    };

    //array of strings with every line5 from each answer
    private String[] answerLine5 = {
            AnswerInput.A1LINE5,
            AnswerInput.A2LINE5,
            AnswerInput.A3LINE5,
            AnswerInput.A4LINE5,
            AnswerInput.A5LINE5,
            AnswerInput.A6LINE5
    };



    //sets every lines of text for the answer that should be displayed at the time
    public void setAnswer(int clickCounter) {

        //if clickerCounter is not a pair and still has answers to print
        if (clickCounter % 2 != 0 && clickCounter < (QuestionInput.NUMBERQUESTIONS * 2)) {

            //if it is the first answer
            if (clickCounter == 1) {
                answ.get(0).setText(answerLine1[clickCounter - 1]);
                answ.get(1).setText(answerLine2[clickCounter - 1]);
                answ.get(2).setText(answerLine3[clickCounter - 1]);
                answ.get(3).setText(answerLine4[clickCounter - 1]);
                answ.get(4).setText(answerLine5[clickCounter - 1]);
            }

            //rest of the answers
            else {
                answ.get(0).setText(answerLine1[(clickCounter-1)/2]);
                answ.get(1).setText(answerLine2[(clickCounter-1)/2]);
                answ.get(2).setText(answerLine3[(clickCounter-1)/2]);
                answ.get(3).setText(answerLine4[(clickCounter-1)/2]);
                answ.get(4).setText(answerLine5[(clickCounter-1)/2]);
            }

        //if a question is displayed
        } else {
            answ.get(0).setText("");
            answ.get(1).setText("");
            answ.get(2).setText("");
            answ.get(3).setText("");
            answ.get(4).setText("");
        }
    }

    //draws answers
    public void draw(){

        for (int i = 0; i < answ.size(); i++) {

            answ.get(i).draw();
        }
    }
}
