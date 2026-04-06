package poly.poly4;

public class CelebrityMain {
    public static void main(String[] args) {
        Celebrity[] celebirties = new Celebrity[3];

        Celebrity celebrity1 = new Actor();
        Celebrity celebrity2 = new Singer();
        Celebrity celebrity3 = new Youtuber();

        Celebrity[] celebrities = {celebrity1, celebrity2, celebrity3};

        for (Celebrity celebrity : celebrities) {
            celebrity.introduce();



        }



    }
}
