package java102.AdventureGame.Zones;

import java102.AdventureGame.Player;
import java102.AdventureGame.Tools.Armor;
import java102.AdventureGame.Tools.Weaponry;

public class ToolStore extends NormalLocation {
    public ToolStore(Player player) {
        super(2, player, "Tool Store");
    }

    @Override
    public boolean onLocation() {
        System.out.println("------- Welcome to the Tool Store! -------");
        boolean showMenu  = true;
        System.out.println();

        while(showMenu) {
            // Listed Weapon
            String[] operations = {"1- Weaponry", "2- Armors", "9- Exit"};
            for (String operation : operations) {
                System.out.println(operation);
            }

            System.out.println();

            System.out.print("What would you like to do: ");
            int selectOperation = scanner.nextInt();
            while(selectOperation < 0 || selectOperation > 3) {
                System.out.println("Invalid selection, re-enter: ");
                selectOperation = scanner.nextInt();
            }
            switch (selectOperation){
                case 1:
                    printWeaponry();
                    buyWeapon();
                    break;
                case 2:
                    printArmor();
                    buyArmor();
                    break;
                case 3:
                    System.out.println("Until next time!");
                    showMenu = false;
                    break;
            }
            System.out.println();
        }
        return true;
    }

    public void printWeaponry() {
        System.out.println();
        System.out.println("------- Weaponry -------");
        System.out.println();

        for(Weaponry w: Weaponry.weapons()) {
            System.out.println(w.getId() + "-" + w.getName() + " <Price: " + w.getPrice() + " , Damage: " + w.getDamage() + ">");
        }
        System.out.println("0- Exit");
    }

    public void buyWeapon() {
        System.out.print("Select a weapon: ");
        int selectWeapon = scanner.nextInt();
        while(selectWeapon < 0 || selectWeapon > Weaponry.weapons().length) {
            System.out.println("Invalid selection, re-enter: ");
            selectWeapon = scanner.nextInt();
        }

        if(selectWeapon != 0) {
            Weaponry selectedWeapon = Weaponry.getWeaponObjById(selectWeapon);
            if(selectedWeapon != null) {
                if(selectedWeapon.getPrice() > this.getPlayer().getCoin()) {
                    System.out.println("Insufficient account balance!");
                } else {
                    // Moment when the purchase takes place
                    System.out.println(selectedWeapon.getName() + "has been bought.");
                    int balance = this.getPlayer().getCoin() - selectedWeapon.getPrice();
                    this.getPlayer().setCoin(balance);
                    System.out.println("Remaining Balance: " + this.getPlayer().getCoin());
                    this.getPlayer().getInventory().setWeapon(selectedWeapon);
                }
            }
        }
    }

    public void printArmor() {
        System.out.println();
        System.out.println("------- Armors -------");
        System.out.println();

        for(Armor a: Armor.armors()) {
            System.out.println(a.getId() + "-" + a.getName() + " <Price: " + a.getPrice() + " , Block: " + a.getBlock() + ">");
        }
        System.out.println("0- Exit");
    }

    public void buyArmor() {
        System.out.print("Select an armor: ");
        int selectArmor = scanner.nextInt();
        while(selectArmor < 1 || selectArmor > Armor.armors().length + 1) {
            System.out.println("Invalid selection, re-enter: ");
            selectArmor = scanner.nextInt();
        }

        if(selectArmor != 0) {
            Armor selectedArmor = Armor.getArmorObjById(selectArmor);
            if(selectedArmor != null) {
                if(selectedArmor.getPrice() > this.getPlayer().getCoin()) {
                    System.out.println("Insufficient account balance!");
                } else {
                    // Moment when the purchase takes place
                    System.out.println(selectedArmor.getName() + " Armor has been bought.");
                    int balance = this.getPlayer().getCoin() - selectedArmor.getPrice();
                    this.getPlayer().setCoin(balance);
                    System.out.println("Remaining Balance: " + this.getPlayer().getCoin());
                    this.getPlayer().getInventory().setArmor(selectedArmor);
                }
            }
        }
    }

}
