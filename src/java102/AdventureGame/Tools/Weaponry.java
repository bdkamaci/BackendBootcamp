package java102.AdventureGame.Tools;

public class Weaponry {
    private int id;
    private String name;
    private int damage;
    private int price;

    public Weaponry(int id, String name, int damage, int price) {
        this.id = id;
        this.name = name;
        this.damage = damage;
        this.price = price;
    }

    public static Weaponry[] weapons(){
        Weaponry[] weaponList = new Weaponry[3];
        weaponList[0] = new Weaponry(1,"Gun", 2, 25);
        weaponList[1] = new Weaponry(2, "Sword", 3, 35);
        weaponList[2] = new Weaponry(3, "Riffle", 7, 45);
        return weaponList;
    }

    public static Weaponry getWeaponObjById(int id) {
        for(Weaponry w : Weaponry.weapons()) {
            if(w.getId() == id) {
                return w;
            }
        }
        return null;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
