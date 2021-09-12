package com.yahoo.cedricbstpierre;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Enemy {
    private static final String FILE_CHILD = "fireball.png";

    private final BufferedImage image = ImageLoader.load(FILE_CHILD);
    private final Game game;
    private final Dimension size = new Dimension(30, 30);

    int x = (Game.GAME_WIDTH - size.width) / 2 - 150;

    int y = (Game.GAME_HEIGHT - size.height) / 2;
    private int velocity = 1;
    public List<Enemy> enemies = new ArrayList<>();

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getVelocity() {
        return velocity;
    }

    public void setVelocity(int velocity) {
        this.velocity = velocity;
    }

    public Enemy(Game game) {
        this.game = game;
        System.out.println(enemies);
    }

    public void draw(Graphics2D g2D) {
        g2D.drawImage(image, x, y, 30, 30, null);
    }

    /*public void createEnemies(int nbToCreates) {
        for (int i = 0; i < nbToCreates; i++) {
            draw(, randomCoordinates())
        }
    }*/

    private Point randomCoordinates() {
        Point coordinates = new Point();
        final int x = (Game.GAME_WIDTH - size.width) / 2 - 150;
        final int y = (Game.GAME_HEIGHT - size.height) / 2;
        return coordinates;
    }

    public void move() {
        /*if (liste[1].equals("x")) {
            x += liste[0] * velocity;
        }
        else {
            y += liste[0] * velocity;
        }

        //game.repaint(x, y, );
        HashMap<Integer, String> directionValues = new HashMap<>();
        directionValues.put(-1, "x");
        directionValues.put(1, "x");
        directionValues.put(-1, "y");
        directionValues.put(1, "y");

        HashMap<String, HashMap<Integer, String>> directions = new HashMap<>();
         */
        setX(getX() + getVelocity());
        game.repaint();
    }
}
