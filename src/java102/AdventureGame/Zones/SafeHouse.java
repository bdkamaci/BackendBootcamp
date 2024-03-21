package java102.AdventureGame.Zones;

import java102.AdventureGame.Player;

public class SafeHouse extends NormalLocation {
    public SafeHouse(Player player) {
        super(1, player, "Safe House");
    }

    @Override
    public boolean onLocation() {
        System.out.println("You are in the Safe House.");
        System.out.println("Your health has been renewed!");
        this.getPlayer().setHealth(this.getPlayer().getDefaultHealth());
        System.out.println();

        if(getPlayer().getInventory().getFoodCount() == 1 && getPlayer().getInventory().getWaterCount() == 1 && getPlayer().getInventory().getFireWoodCount() == 1) {
            System.out.println("You have won the game!");
        } else {
            System.out.println("To win the game, you need to collect rewards from all regions and return to the safe house!");
        }
        return true;
    }
}
