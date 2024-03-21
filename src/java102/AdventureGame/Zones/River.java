package java102.AdventureGame.Zones;

import java102.AdventureGame.Obstacles.Bear;
import java102.AdventureGame.Player;

public class River extends BattleLocation {
    public River(Player player) {
        super(5, player, "River", new Bear(), "Water", 3);
    }
}
