package oop.oop1;

public class CarMain {
    public static void main(String[] args) {
        Car car = new Car();

        start(car);
        speedUp(car);
        speedUp(car);
        speedDown(car);
        carStatus(car);
        stop(car);
    }

    public static void start(Car car) {
        System.out.println("시동 킴");
        car.start = true;
    }

    public static void speedUp(Car car) {
        System.out.println("속도 10 증가");
        car.speed += 10;
    }

    public static void speedDown(Car car) {
        System.out.println("속도 10 감소");
        car.speed -= 10;
    }

    public static void carStatus(Car car) {
        System.out.println("[차 상태]");
        System.out.println("start: " + car.start);
        System.out.println("speed: " + car.speed);
    }

    public static void stop(Car car) {
        System.out.println("시동 끔");
        car.start = false;
    }
}
