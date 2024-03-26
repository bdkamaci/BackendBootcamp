package java102.PatikaStore;

public class MobilePhone extends Product{
    private String memory;
    private double screenSize;
    private int batteryPower;
    private int ram;
    private String color;

    public MobilePhone(double unitPrice, double discountRate, int stockQuantity, String name, Brand brand, String memory, double screenSize, int batteryPower, int ram, String color) {
        super(unitPrice, discountRate, stockQuantity, name, brand);
        this.memory = memory;
        this.screenSize = screenSize;
        this.batteryPower = batteryPower;
        this.ram = ram;
        this.color = color;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    public int getBatteryPower() {
        return batteryPower;
    }

    public void setBatteryPower(int batteryPower) {
        this.batteryPower = batteryPower;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String getType() {
        return "MobilePhone";
    }
}
