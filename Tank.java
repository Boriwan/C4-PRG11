public class Tank extends Car {
    private final int missilesCount;
    private final int weakSpots;

    public Tank(String name, int seats, String color, int missilesCount, int weakSpots) {
        super(name, seats, color);
        this.missilesCount = missilesCount;
        this.weakSpots = weakSpots;
    }

    public int getMissilesCount() {
        return missilesCount;
    }

    public int getWeakSpots() {
        return weakSpots;
    }

    @Override
    public void getInfo() {
        System.out.println("Tank name: " + name + "\nNumber of seats: " + seats + "\nColor: " + color + "\nNumber of missiles: " + missilesCount + "\nNumber of weak spots: " + weakSpots);
    }
}
