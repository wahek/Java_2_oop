public class Main {
    public static void main(String[] args) {

        CargoAir cargoAir = new CargoAir("Boing708","white", 21556.13,2048,328, 10000, 2000);
        PassengerAir passengerAir = new PassengerAir("Boing746","grey", 13556.13,1548,458, 10000, 160);
        System.out.println(cargoAir);
        cargoAir.transportationCargo(1000, "Moscow");
        cargoAir.transportationCargo(1000, "China");
        cargoAir.stopRout();
        cargoAir.transportationCargo(2500, "China");
        cargoAir.transportationCargo(500, "Germany");
        System.out.println(passengerAir);
        passengerAir.transportationPassenger(150, "NewYork");
        passengerAir.stopRout();
        passengerAir.transportationPassenger(170, "Montana");
    }
}