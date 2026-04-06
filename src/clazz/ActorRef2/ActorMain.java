package clazz.ActorRef2;

import clazz.ActorRef2.Actor;

public class ActorMain {
    public static void main(String[] args) {
        Actor actor1 = new Actor();
        Actor actor2 = new Actor();

        actor1.name = "구교환";
        actor1.age = 40;
        actor1.role = "제인";

        actor2.name = "박정민";
        actor2.age = 35;
        actor2.role = "고택일";

        System.out.println("이름: "+ actor1.name + ", 나이: "+ actor1.age + ", 배역: " +actor1.role);
        System.out.println("이름: "+ actor2.name + ", 나이: "+ actor2.age + ", 배역: " +actor2.role);

        System.out.println(actor1);
        System.out.println(actor2);

        Actor[] actors = new Actor[2];
        actors[0] = actor1;
        actors[1] = actor2;
        for (Actor actor : actors) {
            System.out.println("이름: "+ actor1.name + ", 나이: "+ actor1.age + ", 배역: " +actor1.role);
        }



    }
}
