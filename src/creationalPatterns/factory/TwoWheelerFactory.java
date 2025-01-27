package creationalPatterns.factory;

public class TwoWheelerFactory implements VehicleFactory {
    @Override
    public Vehicle createVehicle() {
        return new TwoWheeler();
    }
}
