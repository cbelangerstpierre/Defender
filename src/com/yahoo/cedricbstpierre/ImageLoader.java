package com.yahoo.cedricbstpierre;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ImageLoader {
    private static final String FILE_PARENT = "./imgs";

    public static BufferedImage load(String fileChild) {
        try {
            return ImageIO.read(new File(FILE_PARENT, fileChild));
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
