public class FactoryTest {
    public static void main(String[] args) {
        CarFactory carFactory = new CarFactory();
        Drivable myFiat = CarFactory.getCar("Fiat");
        myFiat.drive();
        Drivable myBMW =
                CarFactory.getCar("BMW");
        myBMW.drive();

        Drivable myPosche =
                CarFactory.getCar("Porsche");
        myPosche.drive();
    }
}

