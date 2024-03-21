package java102.AdventureGame.Zones;

import java102.AdventureGame.Player;
import java102.AdventureGame.Obstacles.Zombie;

public class Cave extends BattleLocation {
    public Cave(Player player) {
        super(3, player, "Cave", new Zombie(), "Food", 3);
    }
}
