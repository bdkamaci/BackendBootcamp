package java102.PatikaStore;

import java.util.HashMap;
import java.util.Map;

public class Brand implements Comparable<Brand>{
    private int id;
    private String name;

    public Brand(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public static Map<Integer, Brand> brands() {
        String[] brandNames = {"Apple", "Asus", "Casper", "HP", "Huawei", "Lenovo", "Monster", "Samsung", "Xiaomi"};
        Map<Integer, Brand> brandMap = new HashMap<>();
        for (int i = 0; i < brandNames.length; i++) {
            Brand brand = new Brand(i + 1, brandNames[i]);
            brandMap.put(i + 1, brand);
        }
        return brandMap;
    }


    @Override
    public int compareTo(Brand other) {
        return this.name.compareTo(other.name);
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
}
