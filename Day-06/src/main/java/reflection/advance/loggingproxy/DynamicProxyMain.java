package reflection.advance.loggingproxy;

import java.lang.reflect.Proxy;

public class DynamicProxyMain {
    public static void main(String[] args) {
Greeting hello =new DynamicProxy();
Greeting instance=(Greeting) Proxy.newProxyInstance(//only for interface jisme ho wrna byte byddy jaise tools use honge
DynamicProxy.class.getClassLoader(), //class load krega jo is class ke object ko load krne ke liye bhi use hogi
        new Class[]{Greeting.class},//to store interfaces in array
        new CustomInvoke(hello)//use to call method

);
instance.greet();
    }
}
