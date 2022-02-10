public class ElectricCar extends Car {
    private final String chargingTime;

    public ElectricCar(String name, int seats, String color, String chargingTime) {
        super(name, seats, color);
        this.chargingTime = chargingTime;
    }

    public String getChargingTime() {
        return chargingTime;
    }

    @Override
    public void getInfo() {
        System.out.println("Electric car name: " + name + "\nNumber of seats: " + seats + "\nColor: " + color + "\nCharging time: " + chargingTime);
    }
}
