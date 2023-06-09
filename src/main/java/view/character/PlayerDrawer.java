package view.character;

import java.awt.*;
import java.awt.image.BufferedImage;

public abstract class PlayerDrawer {
    public int worldX, worldY, speed;
    public BufferedImage upLeft, upRight, left1, right1, left2, left3, right2, right3, up1, up2;
    public String direction;
    public int spriteCounter = 0;
    public int spriteNum = 1;

    public void update() {
    }

    public void draw(Graphics2D g2d) {
    }
}