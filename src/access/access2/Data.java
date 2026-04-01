package access.access2;

public class Data {
    public int publicData = 10;
    int defaultData = 20;
    private int privateDate = 30;

    public void publicMethod() {
        System.out.println("publicMethod 호출");
    }

    void defaultMethod() {
        System.out.println("defaultMethod 호출");
    }

    private void privateMethod() {
        System.out.println("privateMethod 호출");
    }

    //내부 호출 메서드
    public void innerAccess() {
        System.out.println("publicData: " + publicData);
        System.out.println("defaultData: " + defaultData);
        System.out.println("privateData: " + privateDate);

        publicMethod();
        defaultMethod();
        privateMethod();
    }
}
