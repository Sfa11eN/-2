public class Main {
    public static void main(String[] args) {

        System.out.println("ООП 2");
        Car audi = new Car("Audi Q7");
        Car bmw = new Car("BMW I8");

        Bicycle stels = new Bicycle("Stels");
        Bicycle aspect = new Bicycle("Aspect");

        Truck man = new Truck("Man");
        Truck kamaz = new Truck("Kamaz");

        TransportService[] transports = {
                audi,
                bmw,
                stels,
                aspect,
                man,
                kamaz
        };
        ServiceStation serviceStation = new ServiceStation();
        for (TransportService transport : transports) {
            serviceStation.check(transport);

        }


    }
}