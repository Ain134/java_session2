package extend.extend4;

public class ElectricCar extends Car {

    @Override
    public void move() {
        System.out.println("전기차가 빠르게 이동을 합니다.");
    }

    public void parentMove() {
        super.move();
    }

    public void charge() {
        System.out.println("전기를 충전합니다.");
    }

    public void getCountry() {
        System.out.println("제조국: " + super.country);
    }
}
