package chapter8;

/**
 * Created by zhangxuelong on 2017/12/4
 */
public class E10_MethodCalls {
    public static void main(String[] args) {
        TwoMethods x = new Inherited();
        x.m1();
    }
}
class TwoMethods{
    public void m1(){
        System.out.println("Inside m1,calling m2");
        m2();
    }
    public void m2(){
        System.out.println("Inside m2");
    }
}
class Inherited extends TwoMethods{
    public void m2(){
        System.out.println("Inside Inherited.m2");
    }
}
