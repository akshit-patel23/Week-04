package reflection.advance.loggingproxy;

public class DynamicProxy implements Greeting{
    @Override
    public void greet(){
        System.out.println("Hello dev!");
    }
}
