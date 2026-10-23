public class Phone {

    private String brand;
    private String model;
    private int storage;
    private double price;
    private int battery;
    private String color;
    private String owner;

    public Phone() {
        brand = "Unknown";
        model = "Unknown";
        storage = 0;
        price = 0.0;
        battery = 0;
        color = "Unknown";
        owner = "Unknown";
    }

    public Phone(String brand, String model, int storage, double price, int battery, String color, String owner) {
        this.brand = brand;
        this.model = model;
        this.storage = storage;
        this.price = price;
        this.battery = battery;
        this.color = color;
        this.owner = owner;
    }

    public String getBrand() { return brand; }
    public String getModel() { return model; }
    public int getStorage() { return storage; }
    public double getPrice() { return price; }
    public int getBattery() { return battery; }
    public String getColor() { return color; }
    public String getOwner() { return owner; }

    public void setBrand(String brand) { this.brand = brand; }
    public void setModel(String model) { this.model = model; }
    public void setStorage(int storage) { this.storage = storage; }
    public void setPrice(double price) { this.price = price; }
    public void setBattery(int battery) { this.battery = battery; }
    public void setColor(String color) { this.color = color; }
    public void setOwner(String owner) { this.owner = owner; }

    public void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Storage: " + storage + "GB");
        System.out.println("Price: " + price);
        System.out.println("Battery: " + battery + "%");
        System.out.println("Color: " + color);
        System.out.println("Owner: " + owner);
    }

    public void checkBattery() {
        if (battery < 20) {
            System.out.println("Battery is low!");
        } else {
            System.out.println("Battery is okay.");
        }
    }
}