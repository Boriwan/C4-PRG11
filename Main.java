public class Main {
    public static void main(String[] args) {
        Car car = new Car("Škoda Octavia", 5, "black");
        ElectricCar electricCar = new ElectricCar("Tesla Model S", 5, "red", "10 hours");
        Tank tank = new Tank("T-54", 4, "green", 500, 10);

        car.getInfo();
        System.out.println("");
        electricCar.getInfo();
        System.out.println("");
        tank.getInfo();
    }
}
