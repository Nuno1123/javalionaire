package org.academia.bootcamp.Game;

import org.academia.bootcamp.Sound;
import org.academia.bootcamp.userInput.QuestionInput;
import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Text;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;
import org.academiadecodigo.simplegraphics.mouse.Mouse;
import org.academiadecodigo.simplegraphics.mouse.MouseEvent;
import org.academiadecodigo.simplegraphics.mouse.MouseEventType;
import org.academiadecodigo.simplegraphics.mouse.MouseHandler;
import org.academiadecodigo.simplegraphics.pictures.Picture;

/**
 * Created by dora on 19-04-2016.
 */
public class Game implements MouseHandler, KeyboardHandler {

    private boolean isClicked = false;
    private boolean isRang = false;
    private int clickCounter = 0;
    private Picture pressedBell;
    private String titleText = "";
    private Question question = new Question();
    private Answer answer = new Answer();
    private int level = 1;
    private Text title = new Text(40, 30, titleText);


    //game logic initialization
    public void init() {

        //initializes mouse event
        Mouse mouse = new Mouse(this);
        mouse.addEventListener(MouseEventType.MOUSE_CLICKED);

        //initializes key event
        keySetup();

        //draws each player's bell
        for (int i = 0; i < Bell.bells.length; i++) {
            Bell.bells[i].draw();
        }

        //sets title's color and font size
        title.setColor(Color.YELLOW);
        title.grow(8, 8);

        //draws title, question and answer as empty
        title.draw();
        answer.draw();
        question.draw();
    }

    //sets keys for each player and consequent bell
    public void keySetup() {
        Keyboard k = new Keyboard(this);

        //player 1's key
        KeyboardEvent p1 = new KeyboardEvent();
        p1.setKey(KeyboardEvent.KEY_Q);
        p1.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        k.addEventListener(p1);

        //player 2's key
        KeyboardEvent p2 = new KeyboardEvent();
        p2.setKey(KeyboardEvent.KEY_SPACE);
        p2.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        k.addEventListener(p2);

        //player 3's key
        KeyboardEvent p3 = new KeyboardEvent();
        p3.setKey(KeyboardEvent.KEY_P);
        p3.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        k.addEventListener(p3);
    }


    public void setClicked(boolean clicked) {
        isClicked = clicked;
    }

    //what happens when mouse is clicked
    public void click() {

        //first click
        if (clickCounter < 1) {

            //sets title text to "Level 1:"
            titleText = "Level " + level + ":";
            title.setText(titleText);
        }

        //if the number of click counter is a pair and not the first click
        if (clickCounter % 2 == 0 && clickCounter > 0){

            //increases level number of title
            level++;
            titleText = "Level " + level + ":";
            title.setText(titleText);
        }

        //if there is no more questions and answers to print
        if (clickCounter == (QuestionInput.NUMBERQUESTIONS * 2)) {

            //deletes all bells
            for (int i = 0; i < Bell.bells.length; i++) {

                Bell.bells[i].delete();
            }

            //deletes title and initializes game over
            title.delete();
            EndGame endGame = new EndGame();
        }

        //is the bell has been rang
        if (isRang) {

            //deletes the pressed bell display and sets boolean for ring as false
            pressedBell.delete();
            setRang(false);
        }

        //sets question and answer's text according to click counter and set boolean for click as false
        question.setQuestion(clickCounter);
        answer.setAnswer(clickCounter);
        setClicked(false);
    }


    //if mouse is clicked
    @Override
    public void mouseClicked(MouseEvent mouseEvent) {

        if (!isClicked) {
            isClicked = true;
            click();
            clickCounter++;
        }
    }


    @Override
    public void mouseMoved(MouseEvent mouseEvent) {
    }


    public void setRang(boolean rang) {
        isRang = rang;
    }


    //if a bell key is pressed
    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {

        //if has not been pressed yet and clicker counter is a pair (a question is displayed)
        if (!isRang && (clickCounter%2 != 0)) {

            switch (keyboardEvent.getKey()) {

                //if the Q key has been pressed (player 1)
                case KeyboardEvent.KEY_Q:
                    pressedBell = Bell.ringedDisplay[0];
                    pressedBell.draw();
                    setRang(true);
                    setClicked(false);
                    Sound.play("/resources/pig.wav");
                    break;

                //if the SPACE key has been pressed (player 2)
                case KeyboardEvent.KEY_SPACE:
                    pressedBell = Bell.ringedDisplay[1];
                    pressedBell.draw();
                    setRang(true);
                    setClicked(false);
                    Sound.play("/resources/horse.wav");
                    break;

                //if the P key has been pressed (player 3)
                case KeyboardEvent.KEY_P:
                    pressedBell = Bell.ringedDisplay[2];
                    pressedBell.draw();
                    setRang(true);
                    setClicked(false);
                    Sound.play("/resources/elephant.wav");
                    break;
            }
        }
    }


    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {
    }
}
