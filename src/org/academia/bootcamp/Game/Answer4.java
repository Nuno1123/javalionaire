package org.academia.bootcamp.Game;

import org.academiadecodigo.simplegraphics.mouse.Mouse;
import org.academiadecodigo.simplegraphics.mouse.MouseEvent;
import org.academiadecodigo.simplegraphics.mouse.MouseEventType;
import org.academiadecodigo.simplegraphics.mouse.MouseHandler;
import org.academiadecodigo.simplegraphics.pictures.Picture;

/**
 * Created by Nuno1123 on 10/03/16.
 */
public class Answer4 implements MouseHandler{

    Question5 question5;

    private boolean mouseClicked = false;

    Picture answer4 = new Picture(10, 10, "Resources/answer4.png");


    public Answer4() {

    }

    public void a4(){
        Mouse mouse = new Mouse(this);
        mouse.addEventListener(MouseEventType.MOUSE_CLICKED);

        question5 = new Question5();
        answer4.draw();
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

                answer4.delete();
                question5.q5();

    }
}
