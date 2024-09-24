public class Vehicle {
    private String registrationNumber;
    private String brand;

    public Vehicle(String registrationNumber, String brand) {
        this.registrationNumber = registrationNumber;
        this.brand = brand;
    }
    public String getRegistrationNumber() {
        return registrationNumber;
    }
    public String getBrand() {
        return brand;
    }
}

class Car extends Vehicle {
    private int numDoors;
    public Car(String registrationNumber, String brand, int numDoors) {
        super(registrationNumber, brand);
        this.numDoors = numDoors;
    }
    public double calculateParkingFee(){
        if (numDoors <=2){
            return 10.0;
        }else if (numDoors <=4){
            return 15.0;
        } else {
            return 20.0;
        }
    }
}
class Motorcycle extends Vehicle {
    private String engineType;
    public Motorcycle(String registrationNumber, String brand, String engineType) {
        super(registrationNumber, brand);
        this.engineType = engineType;
    }
    public String getEngineType() {
        return engineType;
    }
    public double calculateParkingFee(){
        if (engineType.equals("Small")){
            return 5.0;
        } else if (engineType.equals("Medium")) {
            return 10.0;
        }else {
            return 15.0;
        }
    }
}
