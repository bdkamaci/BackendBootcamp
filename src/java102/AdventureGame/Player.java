package java102.AdventureGame;

import java102.AdventureGame.Characters.Archer;
import java102.AdventureGame.Characters.GameCharacter;
import java102.AdventureGame.Characters.Knight;
import java102.AdventureGame.Characters.Samurai;
import java102.AdventureGame.Tools.Inventory;

import java.util.Scanner;

public class Player {
    private int damage;
    private int health;
    private int defaultHealth;
    private int coin;
    private String name;
    private String characterName;
    private Scanner scanner = new Scanner(System.in);
    private Inventory inventory;

    public Player(String name) {
        this.name = name;
        this.inventory = new Inventory();
    }

    public void selectCharacter() {

        GameCharacter[] characterList = {new Samurai(), new Archer(), new Knight()};
        System.out.println("-------- Characters --------");
        System.out.println("==========================================================================");

        for (GameCharacter gameCharacter : characterList) {
            System.out.println("Id: " + gameCharacter.getId() +
                    "\t Character: " + gameCharacter.getName() +
                    "\t\t Damage: " + gameCharacter.getDamage() +
                    "\t\t Health: " + gameCharacter.getHealth() +
                    "\t\t Coin: " + gameCharacter.getMoney());
        }

        System.out.println("==========================================================================");

        System.out.print("Please select your character: ");
        int selectCharacter = scanner.nextInt();
        switch (selectCharacter){
            case 1:
                initPlayer(new Samurai());
                break;
            case 2:
                initPlayer(new Archer());
                break;
            case 3:
                initPlayer(new Knight());
                break;
            default:
                initPlayer(new Samurai());
        }
    }

    public void initPlayer(GameCharacter gameCharacter) {
        this.setDamage(gameCharacter.getDamage());
        this.setHealth(gameCharacter.getHealth());
        this.setDefaultHealth(gameCharacter.getHealth());
        this.setCoin(gameCharacter.getMoney());
        this.setCharacterName(gameCharacter.getName());
    }

    public void printInfo() {
        System.out.println("==========================================================================");
        System.out.println("Weapon: " + this.getInventory().getWeapon().getName() +
                ", Armor: " + this.getInventory().getArmor().getName() +
                ", Block: " + this.getInventory().getArmor().getBlock() +
                ", Damage: " + this.getTotalDamage() +
                ", Health: " + this.getHealth() +
                ", Coin Balance: " + this.getCoin() +
                ", Food: " + this.getInventory().getFoodCount() +
                ", FireWood: " + this.getInventory().getFireWoodCount() +
                ", Water: " + this.getInventory().getWaterCount());
        System.out.println("==========================================================================");
    }

    public int getTotalDamage(){
        return damage + this.getInventory().getWeapon().getDamage();
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        if(health < 0) {
            health = 0;
        }
        this.health = health;
    }

    public int getCoin() {
        return coin;
    }

    public void setCoin(int coin) {
        this.coin = coin;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCharacterName() {
        return characterName;
    }

    public void setCharacterName(String characterName) {
        this.characterName = characterName;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public int getDefaultHealth() {
        return defaultHealth;
    }

    public void setDefaultHealth(int defaultHealth) {
        this.defaultHealth = defaultHealth;
    }
}
