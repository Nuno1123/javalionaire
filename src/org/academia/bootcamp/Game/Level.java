package org.academia.bootcamp.Game;

import org.academiadecodigo.simplegraphics.pictures.Picture;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by dora on 19-04-2016.
 */
public class Level {


    public static List<Picture> qANDaList = new ArrayList<>();

    private Picture[] questions = {new Picture(10, 10, "question1.png"),
            new Picture(10, 10, "question2.png"),
            new Picture(10, 10, "question3.png"),
            new Picture(10, 10, "question4.png"),
            new Picture(10, 10, "question5.png"),
            new Picture(10, 10, "question6.png")};

    private Picture[] answers = {new Picture(10, 10, "answer1.png"),
            new Picture(10, 10, "answer2.png"),
            new Picture(10, 10, "answer3.png"),
            new Picture(10, 10, "answer4.png"),
            new Picture(10, 10, "answer5.png"),
            new Picture(10, 10, "answer6.png")};

    public Level() {
        addQandAToList();
    }


    private void addQandAToList(){

        for (int i = 0; i < questions.length ; i++) {

            qANDaList.add(questions[i]);
            qANDaList.add(answers[i]);
        }
    }


}
