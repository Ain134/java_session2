package extend.extend4;

public class GasCar extends Car {

    public void fill() {
        System.out.println("가스를 주유합니다.");
    }

    public void getCountry() {
        System.out.println("제조국: " + super.country);
    }
}
