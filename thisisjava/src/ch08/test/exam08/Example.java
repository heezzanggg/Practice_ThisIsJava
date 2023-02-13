package ch08.test.exam08;

public class Example {
    public static void action(A a){
        a.method1(); 
//        if(a instanceof C c){
//            c.method2();
//        }

        if(a instanceof C){
            C c = (C) a;
            c.method2();
        }
    }

    public static void main(String[] args){
        action(new B());
        //A a = new B();
        action(new C());
        //A a = new C();
    }
}
