public class Transport {
    private String name;
    private String color;
    private double weight;
    private int power;
    private boolean access;

    public Transport(String name, String color, double weight, int power) {
        this.name = name;
        this.color = color;
        this.weight = weight;
        this.power = power;
        this.access = true;

    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public double getWeight() {
        return weight;
    }

    public int getPower() {
        return power;
    }
    public boolean getAccess() {
        return access;
    }

    public void startRout() {
        this.access = false;
    }
    public void stopRout() {
        this.access = true;
        System.out.println("Маршрушт завершён");
    }
    @Override
    public String toString() {
        return "Transport{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", weight=" + weight +
                ", power=" + power +
                '}';
    }


}

