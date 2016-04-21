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

    private Picture[] questions = {
            new Picture(10, 10, "resources/question1.png"),
            new Picture(10, 10, "resources/question2.png"),
            new Picture(10, 10, "resources/question3.png"),
            new Picture(10, 10, "resources/question4.png"),
            new Picture(10, 10, "resources/question5.png"),
            new Picture(10, 10, "resources/question6.png")};

    private Picture[] answers = {
            new Picture(10, 10, "resources/answer1.png"),
            new Picture(10, 10, "resources/answer2.png"),
            new Picture(10, 10, "resources/answer3.png"),
            new Picture(10, 10, "resources/answer4.png"),
            new Picture(10, 10, "resources/answer5.png"),
            new Picture(10, 10, "resources/answer6.png")};

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
