public class ElectricCar extends Car {
    private final int chargingTime;

    public ElectricCar(String name, int seats, String color, int chargingTime) {
        super(name, seats, color);
        this.chargingTime = chargingTime;
    }

    public int getChargingTime() {
        return chargingTime;
    }

    @Override
    public void getInfo() {
        System.out.println("Electric car name: " + name + "\nNumber of seats: " + seats + "\nColor: " + color + "\nCharging time: " + chargingTime);
    }
}
