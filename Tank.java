public class Tank extends Car {
    private final int maxAmmo;
    private final int weakSpots;

    public Tank(String name, int seats, String color, int maxAmmo, int weakSpots) {
        super(name, seats, color);
        this.maxAmmo = maxAmmo;
        this.weakSpots = weakSpots;
    }

    //returns the max ammo capacity
    public int getMaxAmmo() {
        return maxAmmo;
    }

    //returns number of weak spots
    public int getWeakSpots() {
        return weakSpots;
    }

    // returns all the tank data
    @Override
    public void getInfo() {
        System.out.println("Tank name: " + name + "\nNumber of seats: " + seats + "\nColor: " + color + "\nMax ammo capacity: " + maxAmmo + "\nNumber of weak spots: " + weakSpots);
    }
}
