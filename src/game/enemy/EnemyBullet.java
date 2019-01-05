package game.enemy;

import game.FrameCounter;
import game.GameObject;
import game.GameObjectPhysics;
import game.renderer.Animation;
import tklibs.SpriteUtils;

import java.awt.image.BufferedImage;
import java.util.ArrayList;

public class EnemyBullet extends GameObjectPhysics {

    public EnemyBullet() {
        super();
        this.createRenderer();
        this.velocity.set(-3, 0);

    }

    private void createRenderer() {
        ArrayList<BufferedImage> images = new ArrayList<>();
        images.add(SpriteUtils.loadImage("assets/images/enemies/bullet1.png"));
        images.add(SpriteUtils.loadImage("assets/images/enemies/bullet2.png"));
        images.add(SpriteUtils.loadImage("assets/images/enemies/bullet3.png"));
        images.add(SpriteUtils.loadImage("assets/images/enemies/bullet4.png"));

        this.renderer = new Animation(images);
    }

    @Override
    public void run() {
        super.run();
    }

}
