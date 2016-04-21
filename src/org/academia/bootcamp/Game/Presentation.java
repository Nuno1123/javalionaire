package org.academia.bootcamp.Game;


import org.academiadecodigo.simplegraphics.mouse.Mouse;
import org.academiadecodigo.simplegraphics.mouse.MouseEvent;
import org.academiadecodigo.simplegraphics.mouse.MouseEventType;
import org.academiadecodigo.simplegraphics.mouse.MouseHandler;
import org.academiadecodigo.simplegraphics.pictures.Picture;

/**
 * Created by dora on 19-04-2016.
 */
public class Presentation implements MouseHandler {

    private Game game = new Game();

    private boolean mouseClicked = false;
    Picture presentation = new Picture(10, 10, "presentation.jpg");


    public Presentation() {

        Field.init();
        presentation.draw();

    }


    public boolean isMouseClicked() {
        return mouseClicked;
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
        presentation.delete();
        game.init();
    }


    @Override
    public void mouseMoved(MouseEvent mouseEvent) {

    }
}
