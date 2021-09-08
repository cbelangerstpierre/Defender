package com.yahoo.cedricbstpierre;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Enemy {
    public Enemy(Game game) {
        this.game = game;

        try {
            image = ImageIO.read(new File("./imgs", "fireball.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void draw(Graphics2D g2D) {
        g2D.drawImage(image, x, y, 30, 30, null);
    }

    public void move() {


        //game.repaint(x, y, );
    }

    private Game game;
    private BufferedImage image;
    private final int x = (Game.GAME_WIDTH - 30) / 2 - 150;
    private final int y = (Game.GAME_HEIGHT - 30) / 2;
}
