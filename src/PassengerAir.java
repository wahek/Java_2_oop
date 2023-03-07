public class PassengerAir extends Air {
    private final int capacityPassenger;

    public PassengerAir(String name, String color, double weight, int power, int speed, int maxHigh, int capacityPassenger) {
        super(name, color, weight, power, speed, maxHigh);
        this.capacityPassenger = capacityPassenger;

    }

    public int getCapacityPassenger() {
        return capacityPassenger;
    }

    public void transportationPassenger(int people, String place) {
        if (this.getAccess()) {
            if (this.capacityPassenger >= people) {
                System.out.println("Рейс зарегистрирована в:" + place + ".Количество пассажиров: " + people);
                this.startRout();
            } else System.out.println("Недостаточная вместимость");
        } else System.out.println("Отмена рейса, транспорт занят");

    }
}
