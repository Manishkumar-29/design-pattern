package creationalPatterns.factory;

public class Client {
    private Vehicle pVehicle;
     public Client(VehicleFactory vehicleFactory){
         pVehicle = vehicleFactory.createVehicle();
     }
     public Vehicle getVehicle(){
         return pVehicle;
     }
}
