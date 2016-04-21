package org.academia.bootcamp.Game;

        import org.academiadecodigo.simplegraphics.pictures.Picture;

/**
 * Created by Nuno1123 on 08/03/16.
 */


public final class Field {

    public static int width;
    public static int height;

    //This class is not supposed to be instantiated
    private Field() {
    }

    /**
     * Initializes the Background
     *
     * @param
     * @param
     */
    public static void init() {

        // Create the GUI
        Picture pic = new Picture(10, 10, "resources/javalionaire_background.jpg");

        pic.draw();

        // Set field size
        Field.width = pic.getWidth();

        Field.height = pic.getHeight();


    }
}


