public class Car {
    protected final String name;
    protected final int seats;
    protected final String color;

    public Car(String name, int seats, String color) {
        this.name = name;
        this.seats = seats;
        this.color = color;
    }

    // returns the name
    public String getName() {
        return name;
    }

    // returns the number of seats
    public int getSeats() {
        return seats;
    }

    // returns the color
    public String getColor() {
        return color;
    }

    // returns all the car data
    public void getInfo() {
        System.out.println("Car name: " + name + "\nNumber of seats: " + seats + "\nColor: " + color);
    }
}
