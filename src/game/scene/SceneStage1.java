package game.scene;

import game.Background;
import game.GameObject;
import game.enemy.Enemy;
import game.player.Player;


public class SceneStage1 extends Scence{
    @Override
    void init() {
        GameObject.recycle(Background.class);
        GameObject.recycle(Player.class);
        GameObject.recycle(Enemy.class);
//        GameObject.recycle(HitPoint.class);

    }

    @Override
    void clear() {
        GameObject.clearAll();
    }
}
