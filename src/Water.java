public class Water extends Transport{
    private final int loadCapacity;
    public Water(String name, String color, double weight, int power, int loadCapacity) {
        super(name, color, weight, power);
        this.loadCapacity = loadCapacity;
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }
}
