package java102.AdventureGame.Zones;

import java102.AdventureGame.Player;
import java102.AdventureGame.Obstacles.Vampire;

public class Forest extends BattleLocation {
    public Forest(Player player) {
        super(4, player, "Forest", new Vampire(), "Firewood", 3);
    }
}
