package java102.AdventureGame.Tools;

public class Inventory {
    private Weaponry weapon;
    private Armor armor;
    private boolean water;
    private int waterCount;
    private boolean food;
    private int foodCount;
    private boolean fireWood;
    private int fireWoodCount;

    public Inventory() {
        this.weapon = new Weaponry(-1, "Fist", 0, 0);
        this.armor = new Armor(-1, "None", 0, 0);
    }

    public Weaponry getWeapon() {
        return weapon;
    }

    public void setWeapon(Weaponry weapon) {
        this.weapon = weapon;
    }

    public Armor getArmor() {
        return armor;
    }

    public void setArmor(Armor armor) {
        this.armor = armor;
    }

    public boolean isWater() {
        return water;
    }

    public void setWater(boolean water) {
        this.water = water;
    }

    public int getWaterCount() {
        return waterCount;
    }

    public void setWaterCount(int waterCount) {
        this.waterCount = waterCount;
    }

    public boolean isFood() {
        return food;
    }

    public void setFood(boolean food) {
        this.food = food;
    }

    public int getFoodCount() {
        return foodCount;
    }

    public void setFoodCount(int foodCount) {
        this.foodCount = foodCount;
    }

    public boolean isFireWood() {
        return fireWood;
    }

    public void setFireWood(boolean fireWood) {
        this.fireWood = fireWood;
    }

    public int getFireWoodCount() {
        return fireWoodCount;
    }

    public void setFireWoodCount(int fireWoodCount) {
        this.fireWoodCount = fireWoodCount;
    }
}
