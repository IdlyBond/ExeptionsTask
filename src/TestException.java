import java.util.Random;

public class TestException extends RuntimeException {

    private String text;

    public TestException() {
        text = ((Integer)new Random().nextInt(9999999)).toString();
    }

    public String getText() {
        return text;
    }
}
