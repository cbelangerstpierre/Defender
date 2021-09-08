package com.yahoo.cedricbstpierre;

import java.awt.*;
import java.awt.image.BufferedImage;

public class Heart {
    private static final String FILE_CHILD = "heart.png";

    private final BufferedImage image = ImageLoader.load(FILE_CHILD);
    private final Point coordinates = new Point();
    private final Dimension size = new Dimension(30, 30);
    private int lives = 5;

    public Heart() {
        setCoordinates();
    }

    private void setCoordinates() {
        coordinates.setLocation(
        (Game.GAME_WIDTH - size.width) / 2,
        (Game.GAME_HEIGHT - size.height) / 2
        );
    }

    public void draw(Graphics2D g2D) {
        g2D.drawImage(
                image,
                (int) coordinates.getX(),
                (int) coordinates.getY(),
                size.width,
                size.height,
                null);
    }
}
