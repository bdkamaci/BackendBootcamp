package java102.AdventureGame.Zones;

import java102.AdventureGame.Obstacles.Obstacle;
import java102.AdventureGame.Player;
import java102.AdventureGame.Tools.Armor;
import java102.AdventureGame.Tools.Weaponry;

import java.util.Random;

public abstract class BattleLocation extends Location {
    private Obstacle obstacle;
    private String award;
    private int maxObstacle;
    public Random random = new Random();

    public BattleLocation(int id, Player player, String name, Obstacle obstacle, String award, int maxObstacle) {
        super(id, player, name);
        this.obstacle = obstacle;
        this.award = award;
        this.maxObstacle = maxObstacle;
    }

    @Override
    public boolean onLocation() {
        int obsNumber = this.randomObstacleNumber();

        System.out.println("You are currently at: " + this.getName());
        System.out.println("Attention! Here " + obsNumber + " " + this.getObstacle().getName() + "s live!");
        System.out.print("<F>ight or <R>un: ");
        String selectAction = scanner.nextLine().toUpperCase();
        if (selectAction.equals("F") && combat(obsNumber)) {
            // Fight
            System.out.println("In " + this.getName() + ", you have beaten every obstacle!");
            return true;
        }

        if (this.getPlayer().getHealth() <= 0) {
            System.out.println("You are dead!");
            return false;
        }
        return true;
    }

    public boolean combat(int obstacleNumber) {
        for (int i = 1; i <= obstacleNumber; i++) {
            this.getObstacle().setHealth(this.getObstacle().getDefaultHealth());
            playerStatistics();
            obstacleStatistics(i);

            boolean playerFirst = Math.random() > 0.5;
            boolean playerTurn = playerFirst;

            while (this.getPlayer().getHealth() > 0 && this.getObstacle().getHealth() > 0) {
                System.out.println();
                System.out.println("<F>ight or <R>un");
                String selectCombat = scanner.nextLine().toUpperCase();

                if (playerTurn) {
                    if (selectCombat.equals("F")) {
                        playerHits();
                    } else {
                        return false; // Player choose to run
                    }
                } else {
                    if(this.getObstacle().getHealth() > 0) {
                        obstacleHits();
                    }
                }
                playerTurn = !playerTurn;
            }

            if (this.getPlayer().getHealth() <= 0) {
                System.out.println("You are dead!");
                return false;
            }

            if (this.getObstacle().getHealth() < this.getPlayer().getHealth()) {
                int count = 0;
                System.out.println("You have defeated the enemy!");
                System.out.println("You have gained: " + this.getObstacle().getAward() + " coins.");
                this.getPlayer().setCoin(this.getPlayer().getCoin() + this.getObstacle().getAward());
                System.out.println("Current Coin Balance: " + this.getPlayer().getCoin());

                if(i == obstacleNumber && this.getObstacle().getName().equals("Zombie")) {
                    this.getPlayer().getInventory().setFood(true);
                    count ++;
                    System.out.println("Congrats, you won a meal!");
                    this.getPlayer().getInventory().setFoodCount(count);
                } else if (i == obstacleNumber && this.getObstacle().getName().equals("Vampire")) {
                    this.getPlayer().getInventory().setFireWood(true);
                    count++;
                    System.out.println("Congrats, you earned wood!");
                    this.getPlayer().getInventory().setFireWoodCount(count);
                } else if (i == obstacleNumber && this.getObstacle().getName().equals("Bear")) {
                    this.getPlayer().getInventory().setWater(true);
                    count++;
                    System.out.println("Congrats, you have won water!");
                    this.getPlayer().getInventory().setWaterCount(count);
                } else if (i == obstacleNumber && this.getObstacle().getName().equals("Snake")) {
                    getSnakeLoot();
                }
            }
        }
        return true;
    }

    public void playerHits() {
        System.out.println(this.getPlayer().getName() + " hit!");
        this.getObstacle().setHealth(this.obstacle.getHealth() - this.getPlayer().getTotalDamage());
        afterHit();
    }

    public void obstacleHits() {
        System.out.println(this.getObstacle().getName() + " has hit " + this.getPlayer().getName() + "!");
        int obstacleDamage = this.getObstacle().getDamage() - this.getPlayer().getInventory().getArmor().getBlock();
        if (obstacleDamage < 0) {
            obstacleDamage = 0;
        }
        this.getPlayer().setHealth(this.getPlayer().getHealth() - obstacleDamage);
        afterHit();
    }

    public void afterHit() {
        System.out.println("Health: " + this.getPlayer().getHealth());
        System.out.println(this.getObstacle().getName() + " Health: " + this.getObstacle().getHealth());
        System.out.println("=============================");
    }

    public void playerStatistics() {
        System.out.println("Player Statistics");
        System.out.println("============================");
        System.out.println("Health: " + this.getPlayer().getHealth());
        System.out.println("Weapon: " + this.getPlayer().getInventory().getWeapon().getName());
        System.out.println("Armor: " + this.getPlayer().getInventory().getArmor().getName());
        System.out.println("Damage: " + this.getPlayer().getTotalDamage());
        System.out.println("Block: " + this.getPlayer().getInventory().getArmor().getBlock());
        System.out.println("Coin Balance: " + this.getPlayer().getCoin());
        System.out.println();
    }

    public void obstacleStatistics(int i) {
        System.out.println(i + ". " + this.getObstacle().getName() + " Statistics");
        System.out.println("============================");
        System.out.println("Health: " + this.getObstacle().getHealth());
        System.out.println("Damage: " + this.getObstacle().getDamage());
        System.out.println("Award: " + this.getObstacle().getAward());
        System.out.println();
    }

    public int randomObstacleNumber(){
        return random.nextInt(this.getMaxObstacle()) + 1;
    }

    public void getSnakeLoot() {
        int randomNum = random.nextInt(100);
        if (randomNum <= 15) {
            weaponRate();
        } else if (randomNum <= 30) {
            armorRate();
        } else if (randomNum <= 55) {
            moneyRate();
        } else {
            System.out.println("You haven't gained anything.");
        }
    }

    public void weaponRate() {
        int randomNumber = random.nextInt(1, 101);
        if(randomNumber <= 50) {
            System.out.println("You have won a gun.");
            this.getPlayer().getInventory().setWeapon(Weaponry.getWeaponObjById(1));
        } else if (randomNumber <= 80) {
            System.out.println("You have won a sword.");
            this.getPlayer().getInventory().setWeapon(Weaponry.getWeaponObjById(2));
        } else if (randomNumber <= 100) {
            System.out.println("You have won a riffle.");
            this.getPlayer().getInventory().setWeapon(Weaponry.getWeaponObjById(3));
        }
    }

    public void armorRate() {
        int randomNumber = random.nextInt(1, 101);
        if(randomNumber <= 50) {
            System.out.println("You have won a light armor.");
            this.getPlayer().getInventory().setArmor(Armor.getArmorObjById(1));
        } else if (randomNumber <= 80) {
            System.out.println("You have won a medium armor.");
            this.getPlayer().getInventory().setArmor(Armor.getArmorObjById(2));
        } else if (randomNumber <= 100) {
            System.out.println("You have won a heavy armor.");
            this.getPlayer().getInventory().setArmor(Armor.getArmorObjById(3));
        }
    }

    public void moneyRate() {
        int randomNumber = random.nextInt(1, 101);
        int money = 0;
        if(randomNumber <= 50) {
            money = 1;
            System.out.println("You have won 1 coin.");
            this.getPlayer().setCoin(getPlayer().getCoin() + money);
        } else if (randomNumber <= 80) {
            money = 5;
            System.out.println("You have won 5 coins.");
            this.getPlayer().setCoin(getPlayer().getCoin() + money);
        } else if (randomNumber <= 100) {
            money = 10;
            System.out.println("You have won 10 coins.");
            this.getPlayer().setCoin(getPlayer().getCoin() + money);
        }
    }

    public Obstacle getObstacle() {
        return obstacle;
    }

    public void setObstacle(Obstacle obstacle) {
        this.obstacle = obstacle;
    }

    public String getAward() {
        return award;
    }

    public void setAward(String award) {
        this.award = award;
    }

    public int getMaxObstacle() {
        return maxObstacle;
    }

    public void setMaxObstacle(int maxObstacle) {
        this.maxObstacle = maxObstacle;
    }
}
