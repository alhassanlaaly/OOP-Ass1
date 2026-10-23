public class Main {
    public static void main(String[] args) {
        
        Car myCar = new Car();
        myCar.setBrand("Toyota");
        myCar.setModel("Camry");
        myCar.setYear(2022);
        myCar.setPrice(30000.0);
        myCar.setMileage(12000);
        myCar.setColor("Blue");
        myCar.setIsElectric(false);

        System.out.println("Car Details");
        myCar.displayCarInfo();
        myCar.checkMaintenance();

        Phone myPhone = new Phone("Apple", "iPhone 14", 256, 799.0, 95, "Silver", true);

        System.out.println("\nPhone Details");
        myPhone.displayPhoneInfo();
        myPhone.checkBatteryStatus();

        System.out.println("\nPrice Comparison (If-Else)");
        if (myCar.getPrice() > myPhone.getPrice()) {
            System.out.println("The car is more expensive than the phone.");
        } else {
            System.out.println("The phone is more expensive than the car.");
        }

        System.out.println("\nColor Check (Switch)");
        switch (myPhone.getColor()) {
            case "Black":
                System.out.println("Classic black color.");
                break;
            case "Silver":
                System.out.println("Modern silver color.");
                break;
            default:
                System.out.println("Other color.");
                break;
        }

        System.out.println("\nMileage Simulation (For Loop)");
        int currentMileage = myCar.getMileage();
        for (int i = 1; i <= 2; i++) {
            currentMileage += 5000;
            myCar.setMileage(currentMileage); 
            System.out.println("After trip " + i + ", mileage is: " + myCar.getMileage());
        }

        System.out.println("\nPrice Reduction (While Loop)");
        double phonePrice = myPhone.getPrice();
        while (phonePrice > 750.0) {
            phonePrice -= 20.0;
            myPhone.setPrice(phonePrice); 
            System.out.println("Discount applied! New phone price: $" + myPhone.getPrice());
        }
    }
}