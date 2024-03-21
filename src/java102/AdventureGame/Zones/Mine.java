package java102.AdventureGame.Zones;

import java102.AdventureGame.Obstacles.Obstacle;
import java102.AdventureGame.Obstacles.Snake;
import java102.AdventureGame.Player;

public class Mine extends BattleLocation{
    public Mine(Player player) {
        super(6, player, "Mine", new Snake(), "Loot", 5);
    }
}
