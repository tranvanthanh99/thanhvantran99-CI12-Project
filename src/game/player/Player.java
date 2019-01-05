package game.player;

import game.GameObjectPhysics;
import game.GameWindow;
import game.Settings;
import game.renderer.SingerImageRenderer;
import tklibs.Mathx;
import tklibs.SpriteUtils;

import java.awt.image.BufferedImage;

public class Player extends GameObjectPhysics {
    BufferedImage image;
    float gravity = 0.5f;

    public Player() {
        super();
        this.image = SpriteUtils.loadImage("assets/images/players/player.png");
        this.renderer = new SingerImageRenderer(image);
        this.position.set(100, 100);
    }

    @Override
    public void run() {
        super.run();
        this.fall();
        this.move();

        this.limitPosition();
    }

    private void limitPosition() {
        float x = (float) Mathx.clamp(this.position.x, this.image.getWidth() / 2, Settings.SCREEN_WIDTH - this.image.getWidth() / 2);
        float y = (float) Mathx.clamp(this.position.y, this.image.getHeight() / 2, Settings.SCREEN_HEIGHT - this.image.getHeight() / 2 - 145);
        this.position.set(x , y);
    }

    private void move() {
        if (GameWindow.isUpPress) {
            if (this.position.y == Settings.SCREEN_HEIGHT - this.image.getHeight() / 2 - 145) {
                this.velocity.set(0, -10);
            }
        }
        if (GameWindow.isLeftPress) {
            this.velocity.set(-5, this.velocity.y);
        }
        if (GameWindow.isRightPress) {
            this.velocity.set(5, this.velocity.y);

        }

    }

    private void fall() {
        if (this.position.y < Settings.SCREEN_HEIGHT - this.image.getHeight() / 2 - 145) {
            this.velocity.addThis(0, gravity);
        } else {
            this.velocity.set(0 ,0);
        }
    }
}
