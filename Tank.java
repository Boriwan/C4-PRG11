public class Tank extends Car {
    private final int ammoCount;
    private final int weakSpots;

    public Tank(String name, int seats, String color, int ammoCount, int weakSpots) {
        super(name, seats, color);
        this.ammoCount = ammoCount;
        this.weakSpots = weakSpots;
    }

    public int getAmmoCount() {
        return ammoCount;
    }

    public int getWeakSpots() {
        return weakSpots;
    }

    @Override
    public void getInfo() {
        System.out.println("Tank name: " + name + "\nNumber of seats: " + seats + "\nColor: " + color + "\nNumber of missiles: " + ammoCount + "\nNumber of weak spots: " + weakSpots);
    }
}
