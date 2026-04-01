package final0.final3;

public class ConstantMain {
    public static void main(String[] args) {
        int num = 5;

        while (true) {
            num++;
            System.out.println(num);
            if (num >= Constant.limit) {
                break;
            }
        }
    }
}
