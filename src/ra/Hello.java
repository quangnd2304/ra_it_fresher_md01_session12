package ra;

public class Hello implements SayHello{
    public Hello(String content) {
    }

    @Override
    public void display(String content) {
        System.out.println(content);
    }
}
