package org.academia.bootcamp.Game;

import org.academiadecodigo.simplegraphics.pictures.Picture;

/**
 * Created by dora on 19-04-2016.
 */
public class Bell {


    //Array of pictures with bells for each player
    public static Picture[] bells = {
            new Picture(60, 225, "resources/player101.png"),
            new Picture(310, 225, "resources/player201.png"),
            new Picture(560, 225, "resources/player301.png")};

    //Array of pictures with the ringed bell, or activated bell
    public static Picture[] ringedDisplay = {
            new Picture(60, 225, "resources/player102.png"),
            new Picture(310, 225, "resources/player202.png"),
            new Picture(560, 225, "resources/player302.png")};
}
