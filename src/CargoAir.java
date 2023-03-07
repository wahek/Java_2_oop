public class CargoAir extends Air {
    private final int capacityCargo;

    public CargoAir(String name, String color, double weight, int power, int speed, int maxHigh, int capacityCargo) {
        super(name, color, weight, power, speed, maxHigh);
        this.capacityCargo = capacityCargo;
    }

    public int getCapacityCargo() {
        return capacityCargo;
    }

    public void transportationCargo(int weight, String place) {
        if (this.getAccess()) {
            if (this.capacityCargo >= weight) {
                System.out.println("Авиаперевозка зарегистрирована в:" + place + ".Вес груза: " + weight);
                this.startRout();
            }else System.out.println("Груз слишком велик");
        } else System.out.println("Отмена перевозки, транспорт занят");
    }
}

