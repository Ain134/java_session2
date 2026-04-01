package construct;

public class ActorMain {
    public static void main(String[] args) {
        Actor actor1 = new Actor("구교환", 40, "제인");
        Actor actor2 = new Actor("박정민", 35, "고택일");
        Actor actor3 = new Actor("손석구", 37);

        Actor[] actors = {actor1, actor2, actor3};
        for (Actor actor : actors) {
            System.out.println("이름: " + actor.name + ", 나이: " + actor.age + ", 배역: " + actor.role);
        }
    }
}
