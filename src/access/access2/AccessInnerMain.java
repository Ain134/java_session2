package access.access2;

public class AccessInnerMain {
    public static void main(String[] args) {
        Data data = new Data();

        System.out.println("data.publicData = " + data.publicData);
        data.publicMethod();

        System.out.println("data.defaultData = " + data.defaultData);
        data.defaultMethod();

//        System.out.println("data.privateData = " + data.privateData);
//        data.privateMethod();
    }
}
