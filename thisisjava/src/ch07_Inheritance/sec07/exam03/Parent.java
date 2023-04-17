package ch07_Inheritance.sec07.exam03;

//부모타입을 캐스팅연산자로 강제타입변환 통해 자식타입으로 변환 가능
//but, 자식 객체가 부모타입으로 자동 변환 된 후 다시 자식타입으로 변환할 때 강제 타입변환 사용가능
//(모든 부모타입 객체를 자식 타입으로 강제 변환 할 수 있는게 아님!)
public class Parent {
    // 필드선언
    public String field1;

    // 메소드 선언
    public void method1() {
        System.out.println("Parent-method1()");
    }

    // 메소드 선언
    public void method2() {
        System.out.println("Parent-method2()");
    }
}
