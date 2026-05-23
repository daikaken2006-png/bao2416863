package engine;

import vehicle.Car;

public class SimulationEngine {

    private VehicleManager vehicleManager;

    public SimulationEngine() {

        vehicleManager = new VehicleManager();
    }

    public void start() {

        Car car = new Car();

        vehicleManager.addVehicle(car);

        while (true) {

            vehicleManager.updateVehicles();

            try {

                Thread.sleep(1000);
            }
            catch (Exception e) {

                e.printStackTrace();
            }
        }
    }
}