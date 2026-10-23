public class Car {
    private String brand;
    private String model;
    private int year;
    private double price;
    private int mileage;
    private String color;
    private boolean isElectric;

    public Car() {
        brand = "Unknown";
        model = "Unknown";
        year = 0;
        price = 0.0;
        mileage = 0;
        color = "Unknown";
        isElectric = false;
    }

    public Car(String brand, String model, int year, double price, int mileage, String color, boolean isElectric) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.price = price;
        this.mileage = mileage;
        this.color = color;
        this.isElectric = isElectric;
    }

    public String getBrand() { return brand; }
    public String getModel() { return model; }
    public int getYear() { return year; }
    public double getPrice() { return price; }
    public int getMileage() { return mileage; }
    public String getColor() { return color; }
    public boolean getIsElectric() { return isElectric; }

    public void setBrand(String brand) { this.brand = brand; }
    public void setModel(String model) { this.model = model; }
    public void setYear(int year) { this.year = year; }
    public void setPrice(double price) { this.price = price; }
    public void setMileage(int mileage) { this.mileage = mileage; }
    public void setColor(String color) { this.color = color; }
    public void setIsElectric(boolean isElectric) { this.isElectric = isElectric; }

    public void displayCarInfo() {
        System.out.println("Car: " + brand + " " + model + " (" + year + ")");
        System.out.println("Price: $" + price + " | Mileage: " + mileage + " km");
    }

    public void checkMaintenance() {
        if (mileage > 50000) {
            System.out.println(brand + " needs major servicing!");
        } else {
            System.out.println(brand + " is in good condition.");
        }
    }
}