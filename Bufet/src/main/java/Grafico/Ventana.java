package Grafico;

import javax.swing.*;
import java.awt.*;

public class Ventana extends JFrame {
    private int frameWidth = 1920 , frameHeight = 1080;
    private Scene scene;

    public Ventana(){
        this.setSize(frameWidth,frameHeight);
        scene = new Scene();
        this.add(scene);
        this.setVisible(true);
    }
}
