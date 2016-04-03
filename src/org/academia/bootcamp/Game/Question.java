package org.academia.bootcamp.Game;

import org.academia.bootcamp.Sound;
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
 * Created by codecadet on 09/03/16.
 */
public class Question implements KeyboardHandler {

    private Answer answer;


    Picture player101 = new Picture(60, 225, "Resources/player101.png");
    Picture player102 = new Picture(60, 225, "Resources/player102.png");
    Picture player201 = new Picture(310, 225, "Resources/player201.png");
    Picture player202 = new Picture(310, 225, "Resources/player202.png");
    Picture player301 = new Picture(560, 225, "Resources/player301.png");
    Picture player302 = new Picture(560, 225, "Resources/player302.png");
    Picture question1 = new Picture(10, 10, "Resources/question1.png");


    private boolean player102IsDrawn = false;
    private boolean player202IsDrawn = false;
    private boolean player302IsDrawn = false;

    private boolean ringed = false;

    public Question() {
        answer = new Answer();
        keySetup();

    }

    public boolean isRinged() {
        return ringed;
    }

    public void setRinged(boolean ringed) {
        this.ringed = ringed;
    }

    public void setPlayer102IsDrawn(boolean player102IsDrawn) {
        this.player102IsDrawn = player102IsDrawn;
    }

    public void setPlayer202IsDrawn(boolean player202IsDrawn) {
        this.player202IsDrawn = player202IsDrawn;
    }

    public void setPlayer302IsDrawn(boolean player302IsDrawn) {
        this.player302IsDrawn = player302IsDrawn;
    }

    public void q1(){

        player101.draw();
        player201.draw();
        player301.draw();
        question1.draw();

        if (isRinged()) {
            setRinged(false);
        }
    }

    public void keySetup() {
        Keyboard k = new Keyboard(this);

        KeyboardEvent p1 = new KeyboardEvent();
        p1.setKey(KeyboardEvent.KEY_Q);
        p1.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        k.addEventListener(p1);

        KeyboardEvent p2 = new KeyboardEvent();
        p2.setKey(KeyboardEvent.KEY_SPACE);
        p2.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        k.addEventListener(p2);

        KeyboardEvent p3 = new KeyboardEvent();
        p3.setKey(KeyboardEvent.KEY_P);
        p3.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        k.addEventListener(p3);

    }

    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {

        if (!isRinged()) {
            switch (keyboardEvent.getKey()) {
                case KeyboardEvent.KEY_Q:
                    player102.draw();
                    setRinged(true);
                    setPlayer102IsDrawn(true);
                    new SubMenu();
                    Sound.play("/Resources/pig.wav");
                    break;
                case KeyboardEvent.KEY_SPACE:
                    player202.draw();
                    setPlayer202IsDrawn(true);
                    setRinged(true);
                    new SubMenu();
                    Sound.play("/Resources/horse.wav");
                    break;
                case KeyboardEvent.KEY_P:
                    player302.draw();
                    setRinged(true);
                    setPlayer302IsDrawn(true);
                    new SubMenu();
                    Sound.play("/Resources/elephant.wav");
                    break;
            }
        }
    }



    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {

    }


    private class SubMenu implements MouseHandler {

        private boolean mouseClicked = false;


        public SubMenu() {
            Mouse mouse = new Mouse(this);
            mouse.addEventListener(MouseEventType.MOUSE_CLICKED);
        }

        @Override
        public void mouseClicked(MouseEvent mouseEvent) {
            if (!mouseClicked) {
                click();
                mouseClicked = true;

            }
        }


        private void click(){
            //TODO:add a new class called answer, and method for each answer...answer.a1
            //TODO:add a new method for each question in this class...question.q2


                    question1.delete();
                    if (player102IsDrawn) {
                        player102.delete();
                        setPlayer102IsDrawn(false);
                    }

                    if (player202IsDrawn) {
                        player202.delete();
                    }

                    if (player302IsDrawn) {
                        player302.delete();
                    }


                    answer.a1();
        }


        @Override
        public void mouseMoved(MouseEvent mouseEvent) {

        }
    }

}
