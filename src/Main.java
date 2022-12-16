import transport.*;

public class Main {
    public static void main(String[] args) {
        PassengerCar firstPassengerCar = new PassengerCar("Kia", "Rio",42.2f);
        System.out.println(firstPassengerCar);

        FreightCar firstFreightCar = new FreightCar("Тонар", "4292",610f, 13.0);
        System.out.println(firstFreightCar);

        Bus firstBus = new Bus("ЛиАЗ", "4292",202f);
        System.out.println(firstBus);
        firstBus.printType();
        firstBus.setCapacity(12);
        firstBus.printType();
    }
}