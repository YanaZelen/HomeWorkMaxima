package work10;

public class Kia extends Cars {

    String color;
    double fuelConsumptionPer100km;

    public Kia(String model, String color, int force, boolean autoTransmission, double fuelConsumptionPer100km) {
        this.model = model;
        this.force = force;
        this.autoTransmission = autoTransmission;
        this.fuelConsumptionPer100km = fuelConsumptionPer100km;
    }

    void carDrive() {
        System.out.println("Kia едет");
    }
}
