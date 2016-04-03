package org.academia.bootcamp.Game;

import org.academiadecodigo.simplegraphics.mouse.Mouse;
import org.academiadecodigo.simplegraphics.mouse.MouseEvent;
import org.academiadecodigo.simplegraphics.mouse.MouseEventType;
import org.academiadecodigo.simplegraphics.mouse.MouseHandler;
import org.academiadecodigo.simplegraphics.pictures.Picture;

/**
 * Created by Nuno1123 on 10/03/16.
 */
public class Answer implements MouseHandler{

    Question2 question2;

    private boolean mouseClicked = false;


    Picture answer1 = new Picture(10, 10, "Resources/answer1.png");


    public Answer() {

    }

    public void a1() {
        Mouse mouse = new Mouse(this);
        question2 = new Question2();
        mouse.addEventListener(MouseEventType.MOUSE_CLICKED);
        answer1.draw();
    }


    private void click(){

                answer1.delete();
                question2.q2();

    }

    @Override
    public void mouseClicked(MouseEvent mouseEvent) {
        if (!mouseClicked) {
            click();
            mouseClicked = true;

        }
    }

    @Override
    public void mouseMoved(MouseEvent mouseEvent) {

    }
}
