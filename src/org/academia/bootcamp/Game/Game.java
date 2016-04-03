package org.academia.bootcamp.Game;


import org.academiadecodigo.simplegraphics.mouse.Mouse;
import org.academiadecodigo.simplegraphics.mouse.MouseEvent;
import org.academiadecodigo.simplegraphics.mouse.MouseEventType;
import org.academiadecodigo.simplegraphics.mouse.MouseHandler;
import org.academiadecodigo.simplegraphics.pictures.Picture;

/**
 * Created by Nuno1123 on 08/03/16.
 */
public class Game implements MouseHandler{

    private boolean mouseClicked = false;
    Picture presentation = new Picture(10, 10, "Resources/presentation.jpg");


    public Game() {

        Field.init();
        presentation.draw();

    }


    public void init(){

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
        Question question = new Question();
        presentation.delete();
        question.q1();

    }


    @Override
    public void mouseMoved(MouseEvent mouseEvent) {

    }
}
