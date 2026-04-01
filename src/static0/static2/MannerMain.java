package static0.static2;

public class MannerMain {
    public static void main(String[] args) {
        Manner manner = new Manner();
        String normalSentence = "좋아";
        String mannerSentence = manner.manner(normalSentence);
        System.out.println(mannerSentence);
    }
}
