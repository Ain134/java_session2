package poly.poly2;

public class PolyMain {
    public static void main(String[] args) {
        Parent poly = new Child(); //부모는 자식을 품을 수 있다(다형적 창조)
        poly.method();
    }
}
