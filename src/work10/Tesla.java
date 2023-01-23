package work10;

public class Tesla extends Cars {

    double electricityConsumptionPer100km;

    public Tesla(String model, int force, boolean autoTransmission, double electricityConsumptionPer100km) {
        this.model = model;
        this.force = force;
        this.autoTransmission = autoTransmission;
        this.electricityConsumptionPer100km = electricityConsumptionPer100km;
    }

    void carDrive() {
        System.out.println("Tesla едет");
    }

    void carChangeGear(boolean gear) {
        if (gear) {
            System.out.println("Машина едет вперед");
        } else {
            System.out.println("Машина едет назад");
        }

    }
}
