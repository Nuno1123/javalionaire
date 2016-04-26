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

    Picture presentation = new Picture(10, 10, "resources/presentation.jpg");


    //constructor
    public Presentation() {

        //initializes field background image
        Field.init();

        //draws the introduction image
        presentation.draw();
    }


    public boolean isMouseClicked() {
        return mouseClicked;
    }


    //initializes mouse event
    public void init(){

        Mouse mouse = new Mouse(this);
        mouse.addEventListener(MouseEventType.MOUSE_CLICKED);


    }

    //if mouse is clicked
    @Override
    public void mouseClicked(MouseEvent mouseEvent) {

        if (!mouseClicked) {

            click();
            mouseClicked = true;
        }
    }

    //what happens when mouse is clicked
    private void click(){

        //deletes the introduction image
        presentation.delete();

        //initializes the game logic
        game.init();
    }


    @Override
    public void mouseMoved(MouseEvent mouseEvent) {
    }
}
