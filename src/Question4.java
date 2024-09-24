public class Question4 {
    public static void main(String[] args) {
        Car car1 = new Car("KA-01-HB-1234","Toyota",4);
        Motorcycle motorcycle1 = new Motorcycle("KA-01-HB-5678","Honda","medium");

        double carParkingFee = car1.calculateParkingFee();
        double motorcycleParkingFee = motorcycle1.calculateParkingFee();

        System.out.println("Car Parking Fee: " + carParkingFee);
        System.out.println("Motorcycle Parking Fee: " + motorcycleParkingFee);
    }
}
