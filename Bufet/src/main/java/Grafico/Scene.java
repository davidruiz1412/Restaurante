package Grafico;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Scene extends JPanel{
    public final String RESOURCES = "C:\\Users\\dam\\Desktop\\Restaurante\\Restaurante-main\\Bufet\\src\\main\\resources\\";
    private BufferedImage chef;
    private BufferedImage client;
    private BufferedImage table;

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        try {
            chef = ImageIO.read(new File(RESOURCES + "Chef.png"));
            client = ImageIO.read(new File(RESOURCES + "Client.png"));
            table = ImageIO.read(new File(RESOURCES + "Table.png"));
            g.drawImage(chef,0,1080-chef.getHeight(),this);
            g.drawImage(client,1920-client.getWidth(),1080-chef.getHeight(),this);
            g.drawImage(table,960,1080-table.getHeight(),this);
        } catch (IOException e) {
            System.out.println("Error:" + e.getMessage());
        }

    }
}
