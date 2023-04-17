package ch07_Inheritance.sec06.package2;

import ch07_Inheritance.sec06.package1.A;

//D클래스는 A클래스와 다른패키지에 있지만
//A의 자식 클래스이므로 protected 필드,생성자,메소드 접근 가능
//but, 연산자를 사용해서 생성자 직접 호출 불가
//자식 생성자에서 super()로 A생성자 호출 가능
public class D extends A {
    // 생성자 선언
    public D() {
        // A()생성자 호출
        super();
    }

    // 메소드 선언
    public void method1() {
        // A필드값 변경
        this.field = "value";
        // A메소드 호출
        this.method();
    }

    // 메소드선언
    // 직접 객체 생성해서 사용하는것은 불가
    public void method2() {
        // A a = new A();
        // a.field = "value";
        // a.method();
    }
}
