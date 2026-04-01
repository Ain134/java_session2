package access.access1;

public class Car {
    int speed;

    Car(int speed) {
        this.speed = speed;
    }

    void speedUp() {
        if (this.speed >= 100) {
            System.out.println("최고 속력입니다.");
        }
        else {
            this.speed += 10;
        }
    }

    void speedDown() {
        this.speed -= 10;
    }

    void showSpeed() {
        System.out.println("현재 속력: " + this.speed);
    }
}
