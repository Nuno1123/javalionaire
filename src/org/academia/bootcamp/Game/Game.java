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
 * Created by dora on 19-04-2016.
 */
public class Game implements MouseHandler, KeyboardHandler {

    private boolean isClicked = false;
    private boolean isRang = false;
    private boolean nextLevel = false;
    private int clickCounter = 0;
    private Picture pressedBell;

    public void init() {

        //initializes mouse event
        Mouse mouse = new Mouse(this);
        mouse.addEventListener(MouseEventType.MOUSE_CLICKED);

        //initializes key event
        keySetup();

        //pushes questions and answers to an ArrayList
        Level level = new Level();

        //draws bells
        for (int i = 0; i < Bell.bells.length; i++) {
            Bell.bells[i].draw();
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

    public void setClicked(boolean clicked) {
        isClicked = clicked;
    }

    public void click() {

        if (clickCounter < 1) {

            Level.qANDaList.get(0).draw();
        }

        if (clickCounter >= 1 && clickCounter < Level.qANDaList.size()) {

            Level.qANDaList.get(clickCounter - 1).delete();
            Level.qANDaList.get(clickCounter).draw();
        }

        if (clickCounter == Level.qANDaList.size()) {

            for (int i = 0; i < Bell.bells.length; i++) {

                Bell.bells[i].delete();
            }

            Level.qANDaList.get(clickCounter - 1).delete();
            EndGame endGame = new EndGame();
        }

        if (isRang) {
            pressedBell.delete();
            setRang(false);
        }
        setClicked(false);
    }


    public void setNextLevel(boolean nextLevel) {
        this.nextLevel = nextLevel;
    }

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

    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {
        if (!isRang && (clickCounter%2 != 0)) {

            switch (keyboardEvent.getKey()) {

                case KeyboardEvent.KEY_Q:
                    pressedBell = Bell.ringedDisplay[0];
                    pressedBell.draw();
                    setRang(true);
                    setClicked(false);
                    Sound.play("/pig.wav");
                    break;

                case KeyboardEvent.KEY_SPACE:
                    pressedBell = Bell.ringedDisplay[1];
                    pressedBell.draw();
                    setRang(true);
                    setClicked(false);
                    Sound.play("/horse.wav");
                    break;

                case KeyboardEvent.KEY_P:
                    pressedBell = Bell.ringedDisplay[2];
                    pressedBell.draw();
                    setRang(true);
                    setClicked(false);
                    Sound.play("/elephant.wav");
                    break;
            }
        }
    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {

    }
}
