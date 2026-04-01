package poly.poly3;

public class CelebrityMain {
    public static void main(String[] args) {
        Actor actor = new Actor();
        Singer singer = new Singer();
        Youtuber youtuber = new Youtuber();

        actor.introduce();
        singer.introduce();
        youtuber.introduce();
    }
}
