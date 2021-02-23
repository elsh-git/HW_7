public class CarFactory {
    static Drivable getCar(String carBrand) {
        if (carBrand == null) {
            return null;
        }
        if (carBrand.equalsIgnoreCase("Fiat")) {
            return new Fiat();
        } else if (carBrand.equalsIgnoreCase("BMW")) {
            return new BMW();
        } else if (carBrand.equalsIgnoreCase("Porsche")) {
            return new Porsche();
        }
        return null;
    }
}