package game.enemy;

import game.FrameCounter;
import game.GameObject;
import game.GameObjectPhysics;
import game.Settings;
import game.renderer.SingerImageRenderer;
import tklibs.SpriteUtils;

import java.awt.image.BufferedImage;

public class Enemy extends GameObjectPhysics {
    BufferedImage image;
    FrameCounter fireCounter;


    public Enemy() {
        super();
        this.image = SpriteUtils.loadImage("assets/images/players/aaaaaaaa.png");
        this.renderer = new SingerImageRenderer(image);
        this.position.set(600, Settings.SCREEN_HEIGHT - this.image.getHeight() / 2 - 145);
        this.fireCounter = new FrameCounter(20);

    }

    @Override
    public void run() {
        super.run();
        this.fire();
    }

    private void fire() {
        if (fireCounter.run()) {
            EnemyBullet bullet = GameObject.recycle(EnemyBullet.class);
            bullet.position.set(this.position.x, this.position.y );
            this.fireCounter.reset();
        }
    }
}
