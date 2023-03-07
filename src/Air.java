public class Air extends Transport {
    private int speed;
    private int maxHigh;

    public Air(String name, String color, double weight, int power, int speed, int maxHigh) {
        super(name, color, weight, power);
        this.maxHigh = maxHigh;
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public int getMaxHigh() {
        return maxHigh;
    }

//    @Override
//    public String toString() {
//        return
//                "Air{" +
//                "speed=" + speed +
//                ", maxHigh=" + maxHigh +
//                '}';
//    }


    @Override
    public String toString() {
        return super.toString() + "Air{" + "speed=" + speed + ", maxHigh=" + maxHigh+"}";
    }
}


