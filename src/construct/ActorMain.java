package construct;

public class ActorMain {
    public static void main(String[] args) {
        Actor actor1 = new Actor("구교환", 40, "제인");
        Actor actor2 = new Actor("박정민", 35, "고택일");
        Actor actor3 = new Actor("최서구", 35);
        Actor actor4 = new Actor("최서구");

        System.out.println("이름: "+ actor1.name + ", 나이: "+ actor1.age + ", 배역: " +actor1.role);
        System.out.println("이름: "+ actor2.name + ", 나이: "+ actor2.age + ", 배역: " +actor2.role);
        System.out.println("이름: "+ actor3.name + ", 나이: "+ actor3.age + ", 배역: " +actor3.role);
        System.out.println("이름: "+ actor4.name + ", 나이: "+ actor4.age + ", 배역: " +actor4.role);
    }
}
