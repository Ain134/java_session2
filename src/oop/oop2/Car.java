package oop.oop2;

public class Car {
    int speed;
    boolean start;

    public void start() {
        System.out.println("시동 킴");
        start = true;
    }

    public void speedUp() {
        System.out.println("속도 10 증가");
        speed += 10;
    }

    public void speedDown() {
        System.out.println("속도 10 감소");
        speed -= 10;
    }

    public void status() {
        System.out.println("[차 상태]");
        System.out.println("speed: " + speed);
        System.out.println("start: " + start);
    }

    public void stop() {
        System.out.println("시동 끔");
        start = false;
    }
}
