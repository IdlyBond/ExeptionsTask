public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        try {
            main.thrower();
        } catch (TestException e){
            System.out.println(e.getText());
        }


    }

    private void thrower() {
        throw new TestException();
    }
}
