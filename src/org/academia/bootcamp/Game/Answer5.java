package org.academia.bootcamp.Game;

import org.academiadecodigo.simplegraphics.mouse.Mouse;
import org.academiadecodigo.simplegraphics.mouse.MouseEvent;
import org.academiadecodigo.simplegraphics.mouse.MouseEventType;
import org.academiadecodigo.simplegraphics.mouse.MouseHandler;
import org.academiadecodigo.simplegraphics.pictures.Picture;

/**
 * Created by Nuno1123 on 10/03/16.
 */
public class Answer5 implements MouseHandler{

    Question6 question6;

    private boolean mouseClicked = false;

    Picture answer5 = new Picture(10, 10, "Resources/answer5.png");


    public Answer5() {

    }


    public void a5(){
        Mouse mouse = new Mouse(this);
        mouse.addEventListener(MouseEventType.MOUSE_CLICKED);

        question6 = new Question6();
        answer5.draw();
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

                answer5.delete();
                question6.q6();

    }
}
