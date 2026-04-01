package extend.extend4;

public class CarMain {
    public static void main(String[] args) {
        ElectricCar electricCar = new ElectricCar();
        electricCar.move();
        electricCar.parentMove();
        electricCar.charge();
        electricCar.getCountry();

        GasCar gasCar = new GasCar();
        gasCar.move();
        gasCar.fill();
        gasCar.getCountry();
    }
}
