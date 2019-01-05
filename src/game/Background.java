package game;

import game.renderer.SingerImageRenderer;
import tklibs.SpriteUtils;

import java.awt.image.BufferedImage;

public class Background extends GameObject{
    BufferedImage image;

    public Background() {
        super();
        this.image = SpriteUtils.loadImage("assets/images/background/aaaaaaaaaaaaa.png");
        this.renderer = new SingerImageRenderer(image);
        this.position.set(0, 0);
        this.anchor.set(0, 0);
    }

}
