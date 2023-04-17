package ch09_NestedClassAndAnonymousObject.sec04_localClass.exam02;

public class AExample {
    public static void main(String[] args) {
        // A객체 생성
        A a = new A();

        // A메소드 호출
        a.useB();
        // B-생성자 실행
        // 1
        // B-method1 실행
        // 2
        // B-method2 실행
    }
}
