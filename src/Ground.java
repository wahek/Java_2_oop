public class Ground extends Transport{
    private final int countWheel;
    public Ground(String name, String color, double weight, int power, int countWheel) {
        super(name, color, weight, power);
        this.countWheel = countWheel;

    }

    public int getCountWheel() {
        return countWheel;
    }
}
