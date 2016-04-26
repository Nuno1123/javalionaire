package org.academia.bootcamp.Game;

import org.academiadecodigo.simplegraphics.pictures.Picture;

/**
 * Created by Nuno1123 on 10/03/16.
 */
public class EndGame{


    Picture endGame = new Picture(10, 10, "resources/endGame.png");


    //constructor
    public EndGame() {

        //draws the game over image
        endGame.draw();
    }

}
