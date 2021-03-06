package org.academia.bootcamp;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.net.URL;

/**
 * Created by codecadet on 09/03/16.
 */
public class Sound {

    public static void play(String string) {

        String pathStr = string;
        // to load from jar

        URL soundURL = Sound.class.getResource(pathStr);
        AudioInputStream inputStream = null;

        try {

            if(soundURL == null){
                pathStr = pathStr.substring(1);
                File file = new File(pathStr);
                soundURL = file.toURI().toURL();

            }

            //System.out.println(soundURL);
            inputStream = AudioSystem.getAudioInputStream(soundURL);
            Clip clip = AudioSystem.getClip();
            clip.open(inputStream);
            clip.start();

        } catch (UnsupportedAudioFileException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (LineUnavailableException e) {
            e.printStackTrace();
        }
    }

}
