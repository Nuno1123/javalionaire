package org.academia.bootcamp.Game;

import org.academiadecodigo.simplegraphics.mouse.Mouse;
import org.academiadecodigo.simplegraphics.mouse.MouseEvent;
import org.academiadecodigo.simplegraphics.mouse.MouseEventType;
import org.academiadecodigo.simplegraphics.mouse.MouseHandler;
import org.academiadecodigo.simplegraphics.pictures.Picture;

/**
 * Created by Nuno1123 on 10/03/16.
 */
public class Answer3 implements MouseHandler{

    Question4 question4;

    private boolean mouseClicked = false;


    Picture answer3 = new Picture(10, 10, "Resources/answer3.png");

    public Answer3() {

    }

    public void a3(){
        Mouse mouse = new Mouse(this);
        mouse.addEventListener(MouseEventType.MOUSE_CLICKED);

        question4 = new Question4();
        answer3.draw();

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

                answer3.delete();
                question4.q4();

    }
}
