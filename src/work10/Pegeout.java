package work10;

public class Pegeout extends Cars {

    String bodyType;
    double fuelConsumptionPer100km;

    public Pegeout(String model, String bodyType, int force, boolean autoTransmission, double fuelConsumptionPer100km) {
        this.model = model;
        this.force = force;
        this.autoTransmission = autoTransmission;
        this.fuelConsumptionPer100km = fuelConsumptionPer100km;
    }

    void carDrive() {
        System.out.println("Pegeout едет");
    }
}
