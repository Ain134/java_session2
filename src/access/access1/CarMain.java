package access.access1;

public class CarMain {
    public static void main(String[] args) {
        Car car = new Car(90);

        car.speedUp();
        car.speedUp();
        car.showSpeed();
        car.speedDown();

        System.out.println("속도 제한을 모르는 개발자가 필드 직접 수정");
        car.speed = 1000;
        car.showSpeed();
    }
}
