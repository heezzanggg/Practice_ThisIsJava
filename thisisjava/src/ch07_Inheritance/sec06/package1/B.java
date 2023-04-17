package ch07_Inheritance.sec06.package1;

public class B {
    // 메소드선언
    public void method() {
        A a = new A();
        a.field = "value";
        a.method();
    }
    // 클래스A의 필드,생성자,메소드 사용 가능
    // 같은 패키지내이므로
}
