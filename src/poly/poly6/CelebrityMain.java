package poly.poly6;

public class CelebrityMain {
    public static void main(String[] args) {
        Actor actor = new Actor();
        Singer singer = new Singer();
        Youtuber youtuber = new Youtuber();

        Celebrity[] celebrities = {actor, singer, youtuber};

        for (Celebrity celebrity : celebrities) {
            celebrity.introduce();
        }
    }
}
