public class ElectricCar extends Car {
    private final String chargingTime;

    public ElectricCar(String name, int seats, String color, String chargingTime) {
        super(name, seats, color);
        this.chargingTime = chargingTime;
    }

    // returns the charging time
    public String getChargingTime() {
        return chargingTime;
    }

    // returns all the electric car data
    @Override
    public void getInfo() {
        System.out.println("Electric car name: " + name + "\nNumber of seats: " + seats + "\nColor: " + color + "\nCharging time: " + chargingTime);
    }
}
