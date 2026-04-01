package clazz.ActorRef2;

public class ActorMain2 {
    public static void main(String[] args) {
        Actor actor1 = new Actor();
        actor1.name = "구교환";
        actor1.age = 40;
        actor1.role = "제인";

        Actor actor2 = new Actor();
        actor2.name = "박정민";
        actor2.age = 35;
        actor2.role = "고택일";

        Actor[] actors = new Actor[2];
        actors[0] = actor1;
        actors[1] = actor2;

        for (Actor actor : actors) {
            System.out.println("이름: " + actor.name + ", 나이: " + actor.age + ", 배역: " + actor.role);
        }
    }
}
