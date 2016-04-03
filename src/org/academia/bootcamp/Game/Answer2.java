package org.academia.bootcamp.Game;

import org.academiadecodigo.simplegraphics.mouse.Mouse;
import org.academiadecodigo.simplegraphics.mouse.MouseEvent;
import org.academiadecodigo.simplegraphics.mouse.MouseEventType;
import org.academiadecodigo.simplegraphics.mouse.MouseHandler;
import org.academiadecodigo.simplegraphics.pictures.Picture;

/**
 * Created by Nuno1123 on 10/03/16.
 */
public class Answer2 implements MouseHandler{

    Question3 question3;

    private boolean mouseClicked = false;

    Picture answer2 = new Picture(10, 10, "Resources/answer2.png");

    public Answer2() {

    }


    public void a2(){
        Mouse mouse = new Mouse(this);

        mouse.addEventListener(MouseEventType.MOUSE_CLICKED);

        question3 = new Question3();
        answer2.draw();

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

    private void click(){


                answer2.delete();
                question3.q3();

    }
}
