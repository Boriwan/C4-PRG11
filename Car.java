public class Car {
    protected final String name;
    protected final int seats;
    protected final String color;

    public Car(String name, int seats, String color) {
        this.name = name;
        this.seats = seats;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public int getSeats() {
        return seats;
    }

    public String getColor() {
        return color;
    }

    public void getInfo() {
        System.out.println("Car name: " + name + "\nNumber of seats: " + seats + "\nColor: " + color);
    }
}
